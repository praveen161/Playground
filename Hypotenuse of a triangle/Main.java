#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float ad,hy,op;
  scanf("%f%f",&op,&ad);
  hy=sqrt((ad*ad)+(op*op));
  printf("%.2f",hy);
  return 0;
}