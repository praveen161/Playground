#include <stdio.h>
int main() {
	//Type your code
  int i,s;
  scanf("%d", &i);
  while(i>=100){
       i=i/10; 
  }
       s=i%10;
  printf("%d", s);
	return 0;
}