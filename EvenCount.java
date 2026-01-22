import java.util.Scanner;
public class EvenCount{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int Ecount = 0;
int n1 = sc.nextInt( );
int n2 = sc.nextInt( );
int n3 = sc.nextInt( );
int n4 = sc.nextInt( );
int n5 = sc.nextInt( );
if(n1%2==0) Ecount++;
if(n2%2==0) Ecount++;
if(n3%2==0) Ecount++;
if(n4%2==0) Ecount++;
if(n5%2==0) Ecount++;
System.out.println(Ecount);
}
}