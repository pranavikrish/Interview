public class MeanMedianModeRange 
{

int a[]= {9,1,1,6,7,5,8,3,3,6,6,6,6};

public void mean()
{
	int sum=0;
	int average;
	for(int i=0;i<a.length;i++)
	{
	sum=sum+a[i];
	}
	average=sum/a.length;
	System.out.println("Mean or Average of given Array: " +average);
}

public void median()
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	if(a.length%2==0)
	{
        System.out.println("Median of an array : " +a[a.length/2-1]);
        System.out.println("Median of an array : " +a[a.length/2]);
	}
	else
	{
		System.out.println("Median of an array : " +a[a.length/2-1]);
	}
	}

public void mode()
{
	//int a[]= {9,1,1,6,7,6,8,6};
	int count,maxcount=0,maxvalue=0;
	for(int i=0;i<a.length;i++)
	{
		count=0;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count = count + 1;
			}
		}
		if(count > maxcount)
		{
			maxcount = count;
			maxvalue = a[i];
		}
	}
	System.out.println("The mode in a given array is: "+maxvalue);
}

public void range()
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int range = a[a.length-1] - a[0];
	System.out.println("Range in the given array is : "+range);
}
public static void main(String[] args) {
	MeanMedianModeRange m=new MeanMedianModeRange();
	m.mean();
	m.median();
	m.mode();
	m.range();
}
}
