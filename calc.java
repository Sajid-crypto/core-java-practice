import java.util.Scanner;
	public class calc{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first operand ");
			 float a=sc.nextInt();
			 System.out.println("choose your operator:\n");
			char c=sc.next().charAt(0);
			float d;
			System.out.println("Enter secoond operand ");
			float b=sc.nextInt();
			
			switch(c){
				case '+':
				d=a+b;  
				System.out.println(+d);
				break;
				case '-':
				d=a-b;
				System.out.println(d);
				break;
				case '*':
				d=a*b;
				System.out.println(d);
				break;
				case '/':
				d=a/b;
				System.out.println(d);
				break;
				default:
			System.out.println("invallid operation ");
				break;
			}
			
		}
	}