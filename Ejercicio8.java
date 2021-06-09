import java.util.*;
import java.util.Random;
public class Ejercicio8 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese un numero");
	int n1 = sc.nextInt();
	System.out.println("Ingrese un numero");
	int n2 = sc.nextInt();
	System.out.println("Ingrese un numero");
	int n3 = sc.nextInt();
	int promedio = (n1+n2+n3)/3;
	System.out.println("El Promedio es " + promedio);
	}
}
