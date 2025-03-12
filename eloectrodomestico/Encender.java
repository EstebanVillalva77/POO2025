package electrodomesticos;
import java.util.ArrayList;
import java.util.Scanner;
public class Encender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico television = new Television();
		Electrodomestico lavadora = new Lavadora();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();
		
		
		
		
		System.out.println("Que quiere gestionar?? PRESIONAR 1 o 2\n1-Television 2-Lavadora");
		String eleccion = sc.nextLine();
		
		if(eleccion.equals("1")) {
			System.out.println("Que es lo que que quiere hacer??\n1- Encender 2- Apagar");
			eleccion = sc.nextLine();
			if(eleccion.equals("1")) {
				television.encender();
			} else if(eleccion.equals("2")) {
				television.apagar();
			}
			
		} else if(eleccion.equals("2")) {
			System.out.println("Que es lo que que quiere hacer??\n1- Encender 2- Apagar");
			eleccion = sc.nextLine();
			if(eleccion.equals("1")) {
				lavadora.encender();
			} else if(eleccion.equals("2")) {
				lavadora.apagar();
			}
		}
	}

}
