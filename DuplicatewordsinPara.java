public class DuplicatewordsinPara
{
public static void main(String args[])
{
String s="String is a final class in java . String can’t be a parent class or we can’t create child class for String class . All final class are read only . we can access but we can’t modify . All properties are exposed as methods so length() is also a method .";
String x[]=s.split(" ");

for(int i=0;i<x.length;i++)
{
int count=0;
for(int j=i+1;j<x.length;j++)
{
if(x[i].equals(x[j]))
{
count=count+1;
}
}
if(count>=1)
System.out.println(x[i]+" had "+count+" duplicates");

}


}
}
