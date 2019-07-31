#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long int a;
  int i,j=1,sum=0;
  scanf("%ld",&a);
  while(a>0){
  i=a%10;
  sum=sum+i*j;
  a=a/10;
  j=j*2;
  }
  printf("%d",sum);
  return 0;
}