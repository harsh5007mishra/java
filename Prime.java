import java.util.Scanner;
public class Prime{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int input1= sc.nextInt( );
 int f=0;
for(int i=1; i<= input1; i++){
if( input1%i==0) f++;
}
if(f==2){
System.out.println(2);}
else{
System.out.println(1);}	
}
}