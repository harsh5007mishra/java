import java.util.Scanner;
public class NthPrime{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int input1= sc.nextInt( );
int count = 0;
int num = 1;
while(count<input1){
num++;
if(isPrime(num)) count++;
}
System.out.println(num);
}
static boolean isPrime(int input1){
if(input1<=1)
return false;
for(int i=2; i*i<=input1; i++){
if(input1%i==0)
return false;
}
return true;
}
}