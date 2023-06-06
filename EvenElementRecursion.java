public class EvenElementRecursion {

		static void print(int n)
		{
			if(n<=100)
			{
				
				System.out.println(n);
				print(n+2);
			}
		}
		public static void main(String[] args) {
		print(0);

		}
	}


