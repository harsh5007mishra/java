import java.util.Scanner;
public class SecondLastDigit{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt( );
n = Math.abs(n);
if(n<10){
System.out.println(-1);}
int rev = n/10;
int mod = rev%10;
System.out.println(mod);
}
}