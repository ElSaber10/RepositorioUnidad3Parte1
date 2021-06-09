import java.util.*;
public class Ejercicio9 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese la palabra A");
	String A = sc.nextLine();
	System.out.println("Ingrese la palabra B");
	String B = sc.nextLine();
	String auxiliar;
	auxiliar = A;
	A = B;
	B = auxiliar;
	System.out.println("Valor de A " + A + " Valor de B " + B);
	}
}
