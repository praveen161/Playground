#include<stdio.h>
int main()
{
  //Type your code here
  int i=0,j=1,k,n,x;
  scanf("%d",&n);
  printf("%d %d ", i,j);
  for(x=3;x<=n;x++){
  k=i+j;
  i=j;
  j=k;
  printf("%d ",k);
  }
  return 0;
}