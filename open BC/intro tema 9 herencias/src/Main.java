public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona();
        juan.setEdad(25);
        juan.setNombre("juan");
        juan.setTelefono("5436842535");
        System.out.println("Nombre: "+juan.getNombre());
        System.out.println("Edad: "+juan.getEdad());
        System.out.println("Telefono: "+juan.getTelefono());
        Cliente pedro = new Cliente();
        pedro.setEdad(24);
        pedro.setNombre("pedro");
        pedro.setTelefono("5436842536");
        pedro.setCredito(5000);
        System.out.println("Nombre: "+pedro.getNombre());
        System.out.println("Edad: "+pedro.getEdad());
        System.out.println("Telefono: "+pedro.getTelefono());
        System.out.println("Credito: "+pedro.getCredito()+" pesos");
        Trabajador hugo = new Trabajador();
        hugo.setEdad(26);
        hugo.setNombre("hugo");
        hugo.setTelefono("5436842537");
        hugo.setSalario(15000);
        System.out.println("Nombre: "+hugo.getNombre());
        System.out.println("Edad: "+hugo.getEdad());
        System.out.println("Telefono: "+hugo.getTelefono());
        System.out.println("Salario: "+hugo.getSalario()+" pesos");
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
class Cliente extends Persona{
    private int credito;
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
    }
}
class Trabajador extends Persona{
    private int salario;
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return this.salario;
    }
}