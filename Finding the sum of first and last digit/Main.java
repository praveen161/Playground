#include <stdio.h>
int main() {
	//Type your code
  int i,f,l;
  scanf("%d",&i);
  l=i%10;
  while(i>0){
  f=i%10;
  i=i/10;
  }
  printf("%d", f+l);
	return 0;
}