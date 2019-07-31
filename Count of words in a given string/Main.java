#include<stdio.h>

int main()
{
  //Type your code here
  int i,count=0;
  char arr[100];
  scanf("%[^\n]s",arr);
  for(i=0;arr[i]!='\0';i++){
  if(arr[i]==' '){
  count++;}
  }
  count++;
  printf("%d",count);
}