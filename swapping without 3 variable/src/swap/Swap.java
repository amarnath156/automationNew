package swap;

public class Swap {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b=  11;
		
		System.out.println("before the swapping:\na=" + a + "\nb=" + b );
		
		a= a+b;
		b= a-b;
		a= a-b;
		 
		System.out.println("after the swapping:\na=" + a + "\nb=" + b );
		
		

	}

}
