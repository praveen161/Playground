#include<stdio.h>
#include<stdlib.h>
int main()
{
  	//type your code here
  int a,b,i;
  scanf("%d",&a);
  int arr[a];
  for(i=0;i<a;i++){
  scanf("%d",&arr[i]);
  }
  b=arr[0];
  for(i=0;i<a;i++){
  if(b<arr[i]){
  b=arr[i];}
  }
  printf("%d",b);
}