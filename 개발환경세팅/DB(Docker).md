SQLP(SQL Professional) 자격증은 이론뿐만 아니라 **실행 계획을 확인하고 SQL을 직접 튜닝해보는 실무 능력**이 핵심입니다. 이를 위해 가장 효율적인 방법은 도커(Docker)를 이용해 오라클(Oracle) 환경을 구축하는 것입니다.

SQLP 시험 대비를 위한 가장 빠르고 깔끔한 도커 인스턴스 생성 가이드를 정리해 드립니다.

---
#### homebrew를 이용해 docker 설치

brew update
brew upgrade


    

---

## 2. 오라클 이미지 선택 및 컨테이너 생성

SQLP는 주로 오라클 데이터베이스를 기준으로 출제됩니다. 연습용으로 가장 가볍고 표준적인 **Oracle Express Edition (XE)** 이미지를 사용합니다.

### 실행 명령어 (Terminal/CMD 입력)

아래 명령어를 복사하여 실행하세요. (비밀번호 `oracle` 부분은 원하시는 대로 수정 가능합니다.)

Bash

```
docker run -d --name sqlp-db \
  -p 1521:1521 \
  -e ORACLE_PASSWORD=oracle \
  gvenzl/oracle-xe
```

**[옵션 설명]**

- `-d`: 백그라운드에서 실행 (데몬 모드).
    
- `--name sqlp-db`: 컨테이너 이름을 `sqlp-db`로 설정.
    
- `-p 1521:1521`: 호스트의 1521 포트와 컨테이너의 1521 포트를 연결.
    
- `-e ORACLE_PASSWORD=oracle`: 관리자(`SYS`, `SYSTEM`) 계정의 비밀번호를 설정.
    

---

## 3. 컨테이너 상태 확인 및 접속

이미지 다운로드와 초기 설정에는 약 1~3분 정도 소요됩니다.

1. **컨테이너 실행 상태 확인:**
    
    Bash
    
    ```
    docker ps
    ```
    
    `STATUS`가 `Up (healthy)`로 표시되면 정상입니다.
    
2. **도커 내부 SQL*Plus 접속:**
    
    Bash
    
    ```
    docker exec -it sqlp-db sqlplus system/oracle
    ```
    

---

## 4. SQLP 실습을 위한 환경 설정 (중요)

SQLP 공부를 위해서는 실행 계획을 보고 튜닝을 연습할 수 있는 권한과 데이터가 필요합니다.

### 실습용 계정 생성

SQL*Plus에 접속한 상태에서 아래 명령어를 입력하세요.

SQL

```
-- 대소문자 구분 없이 접속 가능하도록 설정 (선택)
ALTER SYSTEM SET SEC_CASE_SENSITIVE_LOGON = FALSE;

-- 실습용 유저 생성
CREATE USER sqlp_user IDENTIFIED BY pass123;
GRANT CONNECT, RESOURCE, DBA TO sqlp_user;
```

### 접속 정보 정리

외부 툴(SQL Developer, DBeaver 등)을 사용할 때 아래 정보를 입력하세요.

- **Connection Type:** Basic
    
- **Hostname:** localhost
    
- **Port:** 1521
    
- **SID:** `XE` (또는 Service Name: `XE`)
    
- **Username:** sqlp_user
    
- **Password:** pass123
    

---

## 5. SQLP 공부를 위한 팁

- **실행 계획 확인:** SQL Developer에서 `F10`을 누르거나, SQL*Plus에서 `SET AUTOTRACE ON`을 활용해 실행 계획과 통계 정보를 확인하는 습관을 들이세요.
    
- **데이터 덤프 활용:** 시험 교재(예: SQL 전문가 가이드)에 나오는 예제 테이블들을 직접 `CREATE TABLE` 하고 데이터를 넣어보며 인덱스 스캔 방향이나 조인 원리를 시각화해보는 것이 좋습니다.
    
- **컨테이너 관리:** 공부를 멈출 때는 `docker stop sqlp-db`, 다시 시작할 때는 `docker start sqlp-db`를 입력하면 데이터가 그대로 유지됩니다.