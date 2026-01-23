import java.util.Scanner;
public class OddCount{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int Ocount = 0;
int n1 = sc.nextInt( );
int n2 = sc.nextInt( );
int n3 = sc.nextInt( );
int n4 = sc.nextInt( );
int n5 = sc.nextInt( );
if(n1%2!=0) Ocount++;
if(n2%2!=0) Ocount++;
if(n3%2!=0) Ocount++;
if(n4%2!=0) Ocount++;
if(n5%2!=0) Ocount++;
System.out.println(Ocount);
}
}