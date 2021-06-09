import java.util.*;
public class Ejercicio16 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el primer numero");
		int n1 = sc.nextInt();
		if (n1  > 0){
		System.out.println("el número es: Positivo ");
		}
		if (n1 < 0){
		System.out.println("el número es: Negativo ");
		}
		if (n1 == 0){
		System.out.println("el mayor es: Nulo " );
		}
	}
}
