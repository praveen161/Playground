#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,min;
  scanf("%d%d",&a,&b);
  min=(a>b)?a:b;
  while(1){
  if(min%a==0 && min%b==0)
  {
   printf("%d", min);
   break;
  }
    ++min;
  }
  return 0;
}