import java.util.Scanner;
public class NoOfPrimesInRange{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int input1= sc.nextInt( );
int input2= sc.nextInt( );
 	int count = 0;
    for(int i=input1; i<=input2; i++){
        if(isPrime(i)){
            count++;
        }
    }
   System.out.println(count);
    }
    private static boolean isPrime(int n){
    if(n<2) return false;
    if(n==2) return true;
    if(n%2==0) return false;
    for(int i=3; i*i<=n; i+=2){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}