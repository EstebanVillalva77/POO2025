package electrodomesticos;

public class Lavadora implements Electrodomestico {
	boolean encendido;
	boolean enjuagarRopa;

	public Lavadora() {
		this.encendido = false;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		if(!encendido) {
			encendido = true;
			System.out.println("La lavadora se esta prendiendo...");
		} else {
			System.out.println("La lavadora ya estaba encendida");
		}
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		if(encendido) {
			encendido = false;
			System.out.println("La lavadora se esta apagando..");
		} else {
			System.out.println("La lavadora ya estaba apagada");
		}
	}
	public void enjuagar() {
		if(!enjuagarRopa) {
			enjuagarRopa = true;
			System.out.println("La lavadora esta enjuagando");
		}
			
	}
	
}
