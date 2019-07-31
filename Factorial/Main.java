#include<stdio.h>
int main()
{
	//your code here
  long int n,a=1;
  scanf("%ld",&n);
  for(int i=1;i<=n;i++){
  a*=i;
  }
  printf("%ld",a);
}