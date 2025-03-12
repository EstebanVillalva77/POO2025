package electrodomesticos;

public class Television implements Electrodomestico {
	private boolean encendido;
	private boolean subirelVolumen;

	public Television() {
		this.encendido = false;
		this.subirelVolumen = false;
	}

	@Override
	public void encender() {
		if(!encendido) {
			encendido = true;
			System.out.println("La television se esta encendiendo...");
		} else {
			System.out.println("La television ya estaba encendida...");
			
		}
	}

	@Override
	public void apagar() {
		if(encendido) {
			encendido = false;
			System.out.println("La television se esta apagando...");
		} else {
			System.out.println("La television sigue apagada");
		}
	}
	public void subirVolumen(){
		if(!subirelVolumen) {
			subirelVolumen = true;
			System.out.println("El volumen de la tele esta subiendo");
		}
	}
	
}
