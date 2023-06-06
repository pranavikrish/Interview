//find given string is palindrome are not
public class Palindrome
{
public static void main(String args[])
{
String original="madam";
String reverse="";
for(int i=original.length()-1; i>=0; i--)
{
reverse=reverse+original.charAt(i);
}
System.out.println(reverse);

if(original.equals(reverse))
System.out.println("Palindrome");
else
System.out.println(" Not a Palindrome");
}
}
