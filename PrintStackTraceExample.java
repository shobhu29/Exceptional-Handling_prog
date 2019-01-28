
public class PrintStackTraceExample {

	public static void main(String[] args) {
		try{
			m1();

			
			}catch(Exception e){
				
				e.printStackTrace();		
			}
		
	}
	public static void m1()
	{
		m2();
	}
	public static void m2()
	{
		m3();	
	} 
	public static void m3()
	{
		throw new ArithmeticException();
		
	}

}
