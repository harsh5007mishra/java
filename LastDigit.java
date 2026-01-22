import java.util.Scanner;
public class LastDigit{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt( );
n = Math.abs(n);
int mod = n%10;
System.out.println(mod);
}
}