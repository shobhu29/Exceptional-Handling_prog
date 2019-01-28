public class Nested {
	public static void main(String[] args) {
		
		int a=8;
		int b=0;
		try{ 
			
			int c=a/b;
			System.out.println(c);
			try{
					int ar[] = new int[-4];
					System.out.println(ar[2]);
				
				}catch(NegativeArraySizeException ne){
						
						System.out.println("negative array size");
						System.out.println(ne.getMessage());
					 	
						}
			
		}catch(ArithmeticException ae){
				System.out.println("zero division error");
				System.out.println(ae.getMessage());
					try	{
						String str = null;
						int len = str.length();
						
						}catch(NullPointerException ne){
							
							System.out.println("null pointer exception found");
							System.out.println(ne.getMessage());
						}
			}			
		
		finally{
				System.out.println("finally executed");
					try{
						
						int ar1[]=new int[4];
						System.out.println(ar1[5]);
						
						}catch(ArrayIndexOutOfBoundsException ai){
							
							System.out.println("array index out of bound");	
							System.out.println(ai.getMessage());
							
						}
				}
		}
}
