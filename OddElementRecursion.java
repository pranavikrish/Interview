public class OddElementRecursion {

	static void print(int n)
	{
		if(n<=100)
		{
			if(n%2==1)
			System.out.println(n);
			print(n+1);
		}
	}
	public static void main(String[] args) {
	print(1);

	}

	}


