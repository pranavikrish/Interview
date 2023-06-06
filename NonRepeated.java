import java.util.*;
public class NonRepeated
{
//1. To find the first non-repeated element in an ArrayList 
public void firstnonRepeated()
    {
    ArrayList<Integer> al=new ArrayList<>();
      {
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(1);
        al.add(3);
        System.out.println("Elements in an arraylist :"+ al);
int nonRepeatedElement=0;
for(int i=0;i<al.size();i++)
    {
        int count=0;
      for(int j=0;j<al.size();j++)
        {
        if(al.get(i) == al.get(j))
          {
          count = count+1;
          }
        }
if(count==1)
{           
 System.out.println("First non repeated element in an arraylist is "+ al.get(i));
break;
}

    }

      }
    }
public static void main(String args[])
{
NonRepeated a=new NonRepeated();
	a.firstnonRepeated();
	
}
}
