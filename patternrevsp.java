import java.util.*;
	public class patternrevsp{
		public static void main(String[] args){
			int a=5;
			for(int i=a;i>=1;i--){
				for(int j=1;j<i;j++)
				{
					System.out.println("");
				}
				for(int j=0;j<=a-i;j++){
					System.out.print("*");
				
				}
				System.out.println();
			}
		}
	}