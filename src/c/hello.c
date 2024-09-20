#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>

int myReturn(int number) {
  /*number++;*/
  return number++;
}

int main(){
  //printf("Hello, World!");
  int number = 9;
  printf("%d", myReturn(number));

  return 0;
}
