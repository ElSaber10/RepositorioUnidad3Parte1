import java.util.*;
public class Ejercicio10 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double pi= 3.141516;
	System.out.println("Ingrese el radio");
		int radio = sc.nextInt();
	System.out.println("Ingrese la altura");
		int altura = sc.nextInt();
	System.out.println(" El volumen es  " + (2*pi*radio*radio*altura));
	}
}
