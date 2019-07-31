#include<stdio.h>
int main()
{
  //type your code here
  int i=0,a,j,bin[32];
  scanf("%d",&a);
  while(a!=0){
  bin[i]=a%8;
  a=a/8;
  i++;
  }
  for(j=i-1;j>=0;j--){
  printf("%d",bin[j]);
  }
  return 0;
}