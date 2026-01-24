import java.util.Scanner;
public class Factorial{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int input1= sc.nextInt( );
 int f=1;
while(input1>0){
f *= input1;
input1 -= 1;}
System.out.println(f);
}
}