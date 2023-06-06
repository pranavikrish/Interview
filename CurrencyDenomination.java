import java.util.*;
public class CurrencyDenomination
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Amount");
int amount =sc.nextInt();
System.out.println("Currency      Count");
int a[]={2000,500,200,100,50,20,10,5,1};
for(int i=0;i<a.length;i++)
{
    if(amount>=a[i])
    {
     int demonination=amount/a[i];
     amount = amount % a[i];
     System.out.println(a[i]+ "\t\t"+demonination);
    }
}
sc.close();
}
}
