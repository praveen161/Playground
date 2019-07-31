#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int j=0,i,n,a[10],b=0,num,e;
  scanf("%d",&n);
  e=n;
  while(n>0){
  a[j]=n%10;
    n=n/10;
  j++;
  num=j;}
  //printf("%d",num);
  for(i=0;i<num;i++){
  b=b+pow(a[i],num);
  }if(e==b){
  printf("Armstrong Number");}
  else{
    printf("Not an Armstrong Number");
}
	return 0;
}