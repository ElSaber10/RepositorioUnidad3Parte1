import java.util.*;
import java.util.Random;
public class Ejercicio7 {
	public static void main(String[] args){
	int numero = (int)(Math.random()*50+10);
	System.out.println(numero);
	int disminucion = numero - (15*numero/100);
	System.out.println("El número Disminuido al 15% es: " + disminucion);
	}
}
