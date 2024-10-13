import java.util.Scanner;
	public class oddeven{
		public static void main(String[] args){
			System.out.println("enter number to check ");
			Scanner sc=new Scanner(System.in);
			int a = sc.nextInt();
				if(a%2==0){
					System.out.println("a is even ");
					
				}else{
					System.out.println("a is odd  ");
					
				}
				if(a>0){
						System.out.println("a is possitive number ");
					}else{
						System.out.println("a is negative number");
					}
		}
		
	}