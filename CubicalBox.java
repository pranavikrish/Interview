public class CubicalBox 
{

	public static void main(String[] args) 
{
		//all dimensions in centimeter
		double cubesize=20;
		double length=200;
		double breath=150;
		double height=100;
double volumeofcube=(cubesize*cubesize*cubesize);
double volumeofRectangle=length*breath*height;
System.out.println("volume of cube is "+volumeofcube);
System.out.println("volume of Rectangle is "+volumeofRectangle);
System.out.println("number of cubes contain in a Rectangular container is "+(volumeofRectangle)/(volumeofcube));


	}

}
