#include <stdio.h>
int main()
{
  	//Your code here  
  int a,b,c=1,i;
  scanf("%d%d",&a,&b);
  if(b>=0){
  for(i=1;i<=b;i++){
  c=c*a;
  }
    printf("%d",c);
  }else{
  printf("Wrong input");
  }
    return 0;
}