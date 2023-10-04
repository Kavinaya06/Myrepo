package abstraction;

public interface drawable {
float PI=3.14f;
void calculate();
static int square(int a)
{
	return a*a;
}
default void cube(int a)
{
	System.out.println("the cube of a number is: "+a*a*a);
}
void print();
}
