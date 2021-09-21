#include <stdio.h>
int main(){
  int n;
  scanf("%d",&n);
  if(n>=86){
    printf("A\n");
  }else if(n>=61){
    printf("B\n");
  }else if(n>=36){
    printf("C\n");
  }else if(n>=1){
    printf("D\n");
  }else if(n>=0){
    printf("E\n");
  }
}
