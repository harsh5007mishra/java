import java.util.Scanner;
public class AllDigitsCount{
public static void main(String[ ] args){
Scanner sc = new Scanner(System.in);
int input1= sc.nextInt( );
	 int count = 0;
    if(input1 == 0){
        count = 1;
    }else{
        input1 = Math.abs(input1);
        while(input1>0){
            count++;
            input1 = input1/10;
        }
    }
   System.out.println(count);
	}
}