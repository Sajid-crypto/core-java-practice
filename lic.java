import java.util.Scanner;
 public class lic{
	 public static void main(String[] args){
		 System.out.println("enter your age to check eligiblity for DL");
		 Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		if(a>18){
			System.out.println("you are eligible for DL");
		}else{
			System.out.println("you are not eligible for DL");
		}
		 
	 }
 }