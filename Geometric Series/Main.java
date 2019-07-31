#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int i,c;
  scanf("%d",&i);
  if(i%2==0){
    c=pow(3,i/2-1);
  }
  else{
  	c=pow(2,i/2);
  }
  printf("%d", c);
  return 0;
}