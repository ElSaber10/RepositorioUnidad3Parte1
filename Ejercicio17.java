import java.util.*;
public class Ejercicio17 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el primer lado");
		int n1 = sc.nextInt();
	System.out.println("Ingrese el segundo lado");
		int n2 = sc.nextInt();
	System.out.println("Ingrese el tercer lado");
		int n3 = sc.nextInt();
		if (n1 == n2){
			if (n2  == n3){
			System.out.println("Equilatero ");
			}else {
			System.out.println("Isoceles ");
			}
		}
		if (n3 == n2){
			if (n1  == n3){
			System.out.println("Equilatero ");
			}else {
			System.out.println("Isoceles ");
			}
		}
		if (n3 != n1 && n2 != n1){
		System.out.println("Escaleno ");
		}
	}
}
