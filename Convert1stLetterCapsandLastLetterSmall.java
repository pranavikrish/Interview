public class Convert1stLetterCapsandLastLetterSmall
{
public static void main(String args[])
{
String s="java is a high leveL class baseD object oriented programminG language";
String output="";
char a[]=s.toCharArray();

//converting 1st letter caps and last letter small
for(int i=0;i<a.length-1;i++)
{

if(i==0 && a[i]>='a' && a[i]<='z')
a[i]=(char)(a[i]-32);

else if(a[i]==' ' && a[i+1]>='a' && a[i+1]<='z')
a[i+1]=(char)(a[i+1]-32);

else if(a[i+1]==' ' && a[i]>='A' && a[i]<='Z')
a[i]=(char)(a[i]+32);

}
for(int i=0; i<a.length;i++)
{
output=output+a[i];
}
System.out.print(output);


}

}
