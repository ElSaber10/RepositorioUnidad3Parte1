import java.util.*;
public class Ejercicio11 {
	public static void main(String[] args){
	int n1;
	System.out.println("Ingrese un numero en metros");
	Scanner sc = new Scanner(System.in);
	n1 = sc.nextInt();
	System.out.println("Conversion a centimetros " +(n1/100));
	System.out.println("Conversion a pies " +(n1/3.28084));
	System.out.println("Conversion a yardas " +(n1/1.09361));
	System.out.println("Conversion a pulgadas " +(n1/39.3701));
	}
}
