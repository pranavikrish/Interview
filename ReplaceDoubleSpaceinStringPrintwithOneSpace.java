//8. Replace double spaces in string and print with one space
public class ReplaceDoubleSpaceinStringPrintwithOneSpace 
{
public static void main(String args[])
{
String s="I am  Learning  java";
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
    if(c[i]==' ' && c[i+1]==' ')
    continue;
a=a+c[i];
    }
System.out.println(a);

}
}
