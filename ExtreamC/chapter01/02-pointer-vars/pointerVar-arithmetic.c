#include <stdio.h>

int main(int argc, char** argv) {
  int var = 1;

  int* int_ptr = NULL; // 포인터를 널로 만들기
  int_ptr = &var;

  char* char_ptr = NULL;
  char_ptr = (char*)&var;

  printf("Before arithmetic : int_ptr: %u, char_ptr: %u\n",
      (unsigned int)int_ptr, (unsigned int)char_ptr);

  int_ptr++; // 일반적으로 산술연산 간격은 4바이트
  char_ptr++; // 1바이트의 산술연산 간격

  printf("After arithmetic: int_ptr: %u, char_ptr: %u\n",
      (unsigned int)int_ptr, (unsigned int)char_ptr);

  return 0;
}
