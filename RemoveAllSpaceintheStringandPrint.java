public class RemoveAllSpaceintheStringandPrint 
{
//7. Remove all spaces in the given String and print it without any space 
public static void main(String args[])
{
String s="I am Learning java";
String a="";
char c[]=new char[s.length()];
//converting string into character	
for(int i=0;i<c.length;i++)
    {
    c[i]=s.charAt(i);
    }
//removing space and convert char into string
for(int i=0;i<c.length;i++)
    {
    if(c[i]!=' ')
    a=a+c[i];
    }
System.out.println(a);

}
}
