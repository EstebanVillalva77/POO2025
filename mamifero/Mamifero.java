package proyecto;

public abstract class Mamifero extends Animal implements Comportamiento {
    
    protected String nombre;
    protected int patas;
    protected int edad;
    protected String tipoAlimentacion;
    protected boolean esDomestico;
    
    // Constructor de Mamifero
    public Mamifero(String nombre, int patas, int edad, String tipoAlimentacion, boolean esDomestico) {
        // Llamada al constructor de la clase Animal (super)
        super(nombre, edad, tipoAlimentacion);  // Pasamos nombre, edad y tipoAlimentacion al constructor de Animal
        this.patas = patas;
        this.esDomestico = esDomestico;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    // Métodos abstractos de la interfaz Comportamiento serán implementados por las clases hijas.
    @Override
    public abstract void alimentarse();

    @Override
    public abstract void desplazarse();

    @Override
    public abstract void descansar();
}
