import java.util.*;
public class Ejercicio12 {
	public static void main(String[] args){
	int n1;
	double F;
	System.out.println("Ingrese la temperatura en Celcius");
	Scanner sc = new Scanner(System.in);
	n1 = sc.nextInt();
	F = (n1 * 9/5)+32;
	System.out.println("Conversion a Fahrenheit " + F);
	}
}
