public class MultiplesOfSevenRecursion {
	static void print(int n)
	{
		if(n<=100)
		
		{
			if(n%7==0)
			System.out.println(n);
			print(n+1);
		}
		
	}
	public static void main(String[] args) {
	print(1);

	}

}



