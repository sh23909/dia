


public class dia {
	public static void main(String [] args){
		int n=1;
		int m=3;
		int a=1;
		int b=3;
	
		while (n<6){
			
			for(int j=b;j>0;j--){
				System.out.print(" ");
				
				
			}
			for(int i=1;i<=n;i++){
				System.out.print("*");
			}
			System.out.println();
			n+=2;
			b--;
		}
		while(m>0){
			for(int i=a;i>=0;i--){
				System.out.print(" ");
			}
			for(int j=m;j>0;j--){
				System.out.print("*");
			}
			
			
			System.out.println();
			a++;
			m-=2;
			
		}
	}

}
