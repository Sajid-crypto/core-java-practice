import java.util.*;
public class alpha{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your alphabet to check either it is vowels or consonant");
		char ch=sc.next().charAt(0);
		
		switch(Character.toLowerCase(ch)){
			case 'a':
			System.out.println(ch + "vowels");
			break;
			case 'e':
		System.out.println(ch+" is vowels");
			break;
			case 'i':
			System.out.println(ch+"vowels");
			break;
			case 'o':
			System.out.println(ch+"vowels");
			break;
			case 'u':
			System.out.println(ch+"vowels");
			break;
			default:
			System.out.println(ch+"Consonant");
			break;
		}
	}
}