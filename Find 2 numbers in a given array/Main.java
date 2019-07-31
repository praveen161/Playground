#include<stdio.h>
int main()
{
  	//type your code here
  int a,b,c,i,b1=-1,c1=-1;
  scanf("%d",&a);
  int arr[a];
  for(i=0;i<a;i++){
  scanf("%d",&arr[i]);
  }
  scanf("%d%d",&b,&c);
  for(i=0;i<a;i++){
    if(b==arr[i]){
    b1=i;}
    if(c==arr[i]){
    c1=i;}
  }
  printf("Element 1 index = %d \nElement 2 index = %d", b1,c1);
}