public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.setEdad(25);
        juan.setNombre("juan");
        juan.setTelefono("5436842535");
        System.out.println("Edad: "+juan.getEdad());
        System.out.println("nombre: "+juan.getNombre());
        System.out.println("Telefono: "+juan.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}