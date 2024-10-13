import java.util.*;
	public class gr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("choose your language\n for English press '1'\n for hindi press '2'\n for french press '3'"); 
		int num =sc.nextInt();
		if(num==1){
			System.out.println("Hello");
		}else if(num==2){
			System.out.println("Namaste");
		}else if(num==3){
			System.out.println("Bonjour");
		}else{
				System.out.println("invalid");
		}
	}
	}