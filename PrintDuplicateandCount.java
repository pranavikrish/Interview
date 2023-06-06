//print and count dublicate elements
public class PrintDuplicateandCount
{
public static void main(String args[])
{
String s="ZARKAPRS";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i++)
{
c[i]=s.charAt(i);
//System.out.print(c[i]);
}
for(int i=0;i<c.length;i++)
{
int count=0;
for(int j=i+1;j<c.length;j++)
{
if(c[i]==c[j])
{
count=count+1;
System.out.println(c[i]+" has "+count+" duplicates");
}
}
}

}
}
