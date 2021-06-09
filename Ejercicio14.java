import java.util.*;
public class Ejercicio14 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el divisor");
		int divisor = sc.nextInt();
	System.out.println("Ingrese el dividendo");
		int dividendo = sc.nextInt();
		if (divisor != 0){
		System.out.println("Se puede dividir");
		}else{
		System.out.println("No se puede dividir");
		}
	}
}
