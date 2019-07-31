#include<stdio.h>
int main()
{
  //type your code here
  char a;
  scanf("%c",&a);
  if(a=='a' || a=='A' || a=='b' || a=='B' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U'){
  printf("Vowel");
  }else{
  printf("Consonant");
  }
  return 0;
}