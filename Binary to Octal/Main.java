#include<stdio.h>
#include<math.h>

int main()
{
  //Type your code here
  int i,j,sum=0,d=0,arr[10];
  scanf("%d", &i);
  while(i!=0){
    j=i%10;
    i=i/10;
    if(j==1){
    sum=sum+pow(2,d);
    }
    d++;
  } 
  i=0;
  while(sum!=0){
    arr[i]=sum%8;
    sum=sum/8;
    i++;
  }
  for(j=i-1;j>=0;j--){
    printf("%d", arr[j]);
  }
  //printf("%d", sum);
}