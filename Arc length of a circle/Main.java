#include<stdio.h>
int main()
{
  float ra,an,ci;
  scanf("%f%f", &ra,&an);
  ci=2*3.14*ra * (an/360);
  printf("%.2f",ci);
}