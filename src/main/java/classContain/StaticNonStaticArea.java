package classContain;

public class StaticNonStaticArea {

	public static void main(String[] args) {
		methodTwo() ;
		StaticNonStaticArea snsa=new StaticNonStaticArea();
		snsa.methodOne();
	}

	public void methodOne() {
		System.out.println("methodOne instance area");
	
		}
	public static void methodTwo() {		
	
		System.out.println("method two static area");
	}

	{
		{System.out.println(" instance block");}
		
	}
	static
	{System.out.println(" static block---TEP---");}
	
}







































