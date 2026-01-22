import java.util.Scanner;
public class SumOfLastDigitOfTwoNum{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt( );
n1 = Math.abs(n1);
int n2 = sc.nextInt( );
n2 = Math.abs(n2);
int rev = n1%10;
int mod = n2%10;
int sum;
sum = rev + mod;
System.out.println(sum);
}
}