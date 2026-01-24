import java.util.Scanner;
public class Fibonacci{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int input1= sc.nextInt( );
 if(input1<=2)
System.out.println(input1-1);
int a = 0;
int b = 1;
int next = 0;
for(int i=3; i<=input1; i++){
next = a+b;
a = b;
b = next;
}
System.out.println(next);
}
}