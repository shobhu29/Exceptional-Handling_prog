
public class ExcProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=null;
		try{
			if(str.equals("shobhit"))
			{
				System.out.println("No exception");
					
			}
		}catch(NullPointerException ne){
			System.out.println("found a nullpointer exception");
		}
		
		finally{
			
			
			System.out.println("finally executed");
		}
		
		

	}

}
