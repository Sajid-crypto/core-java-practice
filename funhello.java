package Hello;
import java.util.Scanner;
public class funhello{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num =sc.nextInt();
		if(num>10){
				System.out.println("Greater then 10");

		}else if(num<10){
			System.out.println("Less then 10");

		}else{
			System.out.println("code is not satisfied");

		}
	}
}