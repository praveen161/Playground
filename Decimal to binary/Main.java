#include<stdio.h>
int main()
{
  //Type your code here
  int a,bin[32];
  scanf("%d",&a);
  int i=0,j;
  while(a>0){
    bin[i] = a%2;
    a/=2;
    i++;
  }
  for(j=i;j>=0;j--){
  printf("%d",bin[j]);
  }
  return 0;
}