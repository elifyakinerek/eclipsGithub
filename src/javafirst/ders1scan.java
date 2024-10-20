package javafirst;

import java.util.Scanner;

public class ders1scan {
	public static void main(String[]args)
	
  { Scanner input=new Scanner(System.in);
  int number1;
  int number2;
  int sum;
  int cıkarma;
  int carpma;
  int bolme;
  System.out.print("enter first number:");
  number1=input.nextInt();
  System.out.print("enter second number:");
  number2=input.nextInt();
  sum= number1+number2;
  System.out.printf("sum is %d\n",sum);
  cıkarma= number1-number2;
  System.out.printf("cıkarma is %d\n",cıkarma);
  carpma=number1*number2;
  System.out.printf("carpma is %d\n",carpma);
  bolme=number1/number2;
  System.out.printf("bolme is %d\n",bolme);
  
  int besbasamakli;
  int basamak1;
  int basamak2;
  int basamak3;
  int basamak4;
  int basamak5;
  System.out.print("5 basamakli sayiyi giriniz: ");
  besbasamakli=input.nextInt();
  basamak1=besbasamakli%10;
  System.out.printf("birinci basamak:%d\n",basamak1);
  basamak2=besbasamakli%100/10;
  System.out.printf("ikinci basamak:%d\n",basamak2);
  basamak3=besbasamakli%1000/100;
  System.out.printf("ucuncu basamak:%d\n",basamak3);
  basamak4=besbasamakli%10000/1000;
  System.out.printf("dorduncu basamak:%d\n",basamak4);
  basamak5=besbasamakli/10000;
  System.out.printf("besinci basamak:%d\n",basamak5);
  
  
  
  
  
  float bmi;
  
  
  
  int boy;
  int kilo;
  System.out.print("kilonuzu giriniz:");
  kilo=input.nextInt();
  System.out.printf("boyunuzu giriniz:");
  boy=input.nextInt();
  bmi=(float)kilo/boy*boy;
  if (bmi<=18.5)
	  System.out.printf("zayif kategorisindesiniz.\n");
  if(bmi<=24.9 && bmi>18.5)
	  System.out.printf("normal kategorisindesiniz\n");
  if(bmi<=29.9 && bmi>24.9)
	  System.out.printf("sisman kategorisindesiniz\n");
  if(bmi>=30)
	  System.out.printf("obez kategorisindesiniz\n");
  
  int yaricap;
  double pi;
  double alan;
  pi=3.14 ;
  System.out.printf("yaricapi giriniz: \n");
  yaricap=input.nextInt();
  alan=(double)pi* yaricap * yaricap;
  System.out.printf("dairenizin alani %d:",alan);
  
  
  
  
  
  
  
  
  
  }
	

}
