#include<stdio.h>
int main()
{
	//type your code here
  int a=0,i;
  char arr[70];
  scanf("%[^\n]",arr);
  for(i=0;arr[i]!='\0';i++){
    if(i>20){
    printf("Invalid Input");
    break;}
  if(arr[i]==arr[i+1]){
  a++;
  }
    else{
    printf("%c%d",arr[i],a+1);
      a=0;
    }
  }
}