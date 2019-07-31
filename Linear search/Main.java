#include<stdio.h>
int main()
{
  //Type your code here
  int n,b,i,c=1;;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
  scanf("%d",&b);
  for(i=0;i<n;i++){
  if(arr[i] == b){
  printf("%d",i+1);
  c=0;}
  }if(c==1){
  printf("%d isn't present in the array.",b);
  }
  return 0;
}