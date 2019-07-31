#include<stdio.h>
int main()
{
  //Type your code here
    int a,b,c,d;
  scanf("%d%d%d",&a,&b,&c);
  if(a==0){
  printf("Invalid");
  return;
  }
  d=b*b-4*a*c;
  double sqrt_val = sqrt(abs(d));
  if(d>0){
  printf("root1 = %.2f  root2 = %.2f", (double)(-b+sqrt_val)/(2*a), (double) (-b -sqrt_val)/(2*a));
  }
  else if(d==0){
  printf("root1 = %.2f  root2 = %.2f", (double)-b/(2*a) , (double)-b/(2*a));
  }
  else{
  printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi", -(double)b / (2*a),sqrt_val /(2*a)
            ,-(double)b / (2*a), sqrt_val/(2*a));}
    return 0;
}