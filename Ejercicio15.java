import java.util.*;
public class Ejercicio15 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el primer numero");
		int n1 = sc.nextInt();
	System.out.println("Ingrese el segundo numero");
		int n2 = sc.nextInt();
	System.out.println("Ingrese el segundo numero");
		int n3 = sc.nextInt();
		if (n1  > n2 && n1  > n3){
		System.out.println("el mayor es:  " + n1);
		}
		if (n2  > n1 && n2  > n3){
		System.out.println("el mayor es:  " + n2);
		}
		if (n3 > n1 && n3  > n2){
		System.out.println("el mayor es:  " + n3);
		}else{
		System.out.println("Ninguno es mayor");
		}
	}
}
