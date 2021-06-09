import java.util.*;
public class Ejercicio18 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		int num1 = 0,u = 0,c = 0,d = 0,m = 0;
		if (num1  <= 9999){
		System.out.println("Bienvenido ingrese si numero");
		num1 = sc.nextInt();
		if (num1 > 999){
		m = num1/1000;
		}
		if (num1 > 99){
		 c = num1/100;
		}
		if (num1 > 99){
		 d = num1/10;
		}
		if (num1 > 1){
		 u = num1/1;
		}
		System.out.println("El numero es " + m);
		System.out.println("El numero es " +c);
		System.out.println("El numero es " + d);
		System.out.println("El numero es " + u);
		}
	}
}
