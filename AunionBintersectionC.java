//program A union B intersection C
public class AunionBintersectionC
{
public static void main(String args[]){
int a[] = { 7,4,1,8,9};
int b[] = { 9,3,4,6,7};
int c[] ={ 11,3,1,2,5};
// Merge two array 
	    int x[] = new int[a.length+b.length];
	    for(int i=0 ; i <a.length;i++)
	   {
	        x[i]=a[i];
	    }
	     for(int i=0 ; i <b.length;i++)
	    {
	        x[i+a.length] = b[i];
	    }    
// To remove duplicates 
	    for(int i=0 ; i <x.length;i++)
	    {
	        for(int j = i+1; j<x.length;j++)
	        {
	            if(x[i]==x[j])
	                x[j]=' ';
	        }
	    }
//xnc, x= aub
	     for(int i=0 ; i <x.length;i++)
	    {
	        for(int j = 0; j<c.length;j++)
	        {
	            if(x[i]==c[j])
	           	System.out.println(c[j]);
	        }
	    }
}
}
