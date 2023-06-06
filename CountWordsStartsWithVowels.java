public class CountWordsStartsWithVowels
{
public static void main(String args[])
{
String s="Java is a high level class-based object oriented programming language that is designed to have as few implementation dependencies as possible.";
String a[]=s.split(" ");
int count=0;
for(int i=0;i<a.length;i++)
{
if(a[i].startsWith("a")||a[i].startsWith("e")||a[i].startsWith("i")||a[i].startsWith("o")||a[i].startsWith("u"))
{
count=count+1;

}
}
System.out.println("in the given sentence "+count+" words starts with vowels");

}
}
