import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number");
 int num = sc.nextInt();
 boolean isprime=true;
 for(int i=2;i<num;i++) {
	 if(num%i==0) {
		 isprime = false;
		 break;
		 }
 }
 if(isprime) {
	 System.out.println(num+"is a prime number");
 }else {
	 System.out.println(num+"is not a prime number");
 }
 
	}

}
