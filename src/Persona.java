public class Persona {

    // VARIABLES

    private int edad;
    private String nombre;
    private String telefono;


    // CONSTRUCTOR
    public Persona(int edad, String nombre, String telefono) {

        if(edad>0) {        this.edad=edad; }

        if(nombre.length()>0) { this.nombre=nombre; }

        if(telefono.length()>0) { this.telefono=telefono; }

    }

    public Persona() {
    }


    // METODOS GETTER Y SETTER

    public void setEdad(int edad) {
        this.edad=edad;
    }

    public int getEdad() {
        return this.edad;
    }


    public void setNombre(String nombre) {
        if(nombre.length()>0) { this.nombre=nombre; }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        if(telefono.length()>0) { this.telefono=telefono; }
    }

    public String getTelefono() {
        return this.telefono;
    }

    // METODOS GETTER Y SETTER FIN

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setNombre("Miguel");
        persona1.setEdad(41);
        persona1.setTelefono("953909090");

        System.out.println("El nombre de persona1 es : " + persona1.getNombre());
        System.out.println("La edad de persona1 es : " + persona1.getEdad());
        System.out.println("El telefono de persona 1 es : " + persona1.getTelefono());

    }

}
