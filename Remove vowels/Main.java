#include<stdio.h>
int isvowel(char c){
  if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
  return 1;
  }
  else{
  return 0;
  }
}
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  
  //Type your code here
  int i;
  for(i=0;str[i]!='\0';i++){
    if(!isvowel(str[i])){
    printf("%c", str[i]);
    }
  }
  
  return 0;
}