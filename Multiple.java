import java.util.Scanner;
public class Multiple{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt( );
n1 = Math.abs(n1);
int n2 = sc.nextInt( );
n2 = Math.abs(n2);
if(n1==0 || n2==0){
System.out.println(3);}
else if(n1%n2==0){
System.out.println(2);}
else{
System.out.println(1);}
}
}