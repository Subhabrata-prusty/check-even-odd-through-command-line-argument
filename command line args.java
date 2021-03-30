public class Oak
{
	public static void main(String[] args) {
		if (args.length>0) {
			System.err.println("the argumants no. is "+args.length);
			
			for(int i=0;i<=args.length;i++){
				int num=Integer.parseInt(args[i]);
			
				if (num%2==0){
					System.err.println(num+"is even no.");
				}
				

			
			else{
				System.err.println(num+"is odd");
			}
		}
	}
		else
		{
			System.err.println("there is no arguments.");
		}
			
		}
		
			
		}
	
