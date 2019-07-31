#include<stdio.h>
int main()
{
	//type your code here
  int i;
  scanf("%d",&i);
  if(i%2==0){
    printf("%d",(i-1)/2);
  }
  else{
    i=i-1;
    printf("%d",i);
  }
	
}