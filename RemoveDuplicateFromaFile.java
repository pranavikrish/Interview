import java.io.*;
public class RemoveDuplicateFromaFile
{
public static void main(String args[])
{
try
{
    //reading a file and copy the content from the file
    FileReader fr=new FileReader("/home/rajesh/Documents/Input1.txt");
    String fileContent="";
    int i;
while((i=fr.read())!=-1)
    {
      fileContent=fileContent+((char)i);
    }
    System.out.println("Content in the file is ");
    System.out.println(fileContent);
String a[]= fileContent.split(" ");//Split the string into string array
//removing duplicate from the string array
for(i=0;i<a.length;i++)
  {
  for(int j=i+1;j<a.length;j++)
    {
     if(a[i].equals(a[j]))
     a[j]="";
    }
  }
//converting the String array to string
String duplicateRemovedContent="";
    for(i=0;i<a.length;i++)
    {
      duplicateRemovedContent=duplicateRemovedContent+a[i]+" ";
    }5
    System.out.println("After removing duplitace the content is ");
    System.out.println(duplicateRemovedContent);
//after removing the duplicates content write the content in the same file
    FileWriter fw=new FileWriter("/home/rajesh/Documents/Input1.txt");
    fw.write(duplicateRemovedContent);
    fw.close();
    System.out.println("removing duplicate content from a file is done successfully");
}
catch(Exception e)
    {
      e.printStackTrace();
    }

}
}
