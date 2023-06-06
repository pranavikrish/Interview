//program using Abstract class and interface
public class AbstractandInterFace  
{
public static void main(String args[])    
{
AbstractInterface AIF= new AbstractInterface();
        AIF.add();
        AIF.sub();
        AIF.multiply();
        AIF.divide();
}
} 
//abstract class contains normal methods and alteast 1 abstract method
abstract class Abstract    
{
int add()     
    {
    int a=9,b=3;
    int c=a+b;
    System.out.println("adding a+b is "+c);
    return c;
    }
abstract void sub();
}
// interface class contains abstract methods only 
interface InterFace   
{
    int multiply();
    void divide();
}
//class AbstractInterface get properties from abstract class and interface

class AbstractInterface extends Abstract implements InterFace 
{
    int a=9;
    int b=3;
void sub()
    {
    int c=a-b;
    System.out.println("subtracting a-b is "+c);
    }
public int multiply()   
    {
    int c=a*b;
    System.out.println("multiplying a*b is "+c);
    return c;
    }
public void divide()    
    {
    int c=a/b;
    System.out.println("divide a/b is "+c);
    }
}
