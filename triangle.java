import java.util.Scanner;
	public class triangle{
		public static void main(String[] args){
			int n=1;
			int r=4;
			for(int i=1;i<=r;i++){
				for(int s=1;s<=r;s++){
				    System.out.print(" ");
				}
				for(int j=1;j<=(2*i-1);j++){
				        if(n<=9){
				        System.out.print(n+" ");
						n++;
					}
				}
				System.out.println(); 
			}
	    }
    }
	