# Git
# Github
- 깃헙에 룰셋 이란게 생김
	- 개인 학습 깃허브지만, 메인브랜치에 머지할 때는 항상 PR을 보내도록 설정함
		- Settings 진입
		- Rulesets 메뉴 : 왼쪽 사이드바에서 Code and automation > Rules > Rulesets
		- 새 규칙 생성 : 오른쪽 상단의 New ruleset 버튼을 누르고, New branch ruleset을 선택
		- 기본 정보 입력
			- Ruleset Name : Main PR Only
			- Enforcement status : Active
		- 대상 브랜치 지정 ( Target btaches):
			- Add target 버튼 클릭 -> include default branch 선택(보통은 main)
		- PR 강제 규칙 체크
			- 아래로 내려가 **Branch rules** 섹션에서 **Require a pull request before merging** 항목을 찾아 체크하세요.
			- _(선택)_ 혼자 작업하신다면 바로 아래 `Required approvals` 숫자는 `0`으로 두어도 됩니다. (PR만 생성되면 바로 머지 가능하게 하려는 목적)
		- **관리자 예외 제거 (본인도 막는 핵심)**:
			- 설정 화면 상단이나 하단에 **Bypass list**라는 섹션이 있습니다. 여기에 본인 계정이나 'Repository Admin'이 들어가 있다면 **반드시 삭제하거나 아무도 없게 설정**해야 합니다. 그래야 본인도 규칙의 적용을 받습니다.