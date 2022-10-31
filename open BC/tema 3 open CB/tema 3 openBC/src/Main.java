public class Main {
    static int sumaDe3(int numero1, int numero2, int numero3){
    return numero1 + numero2 + numero3;
    }
    public static void main(String[] args) {
        int resultado;
        resultado = sumaDe3(6, 5, 9);
        System.out.println("la suma es " + resultado);
        Coche miCoche = new Coche();
        System.out.println("puertas del coche: " + miCoche.puertas);
        miCoche.sumarPuerta();
        System.out.println("puertas del coche ahora: " + miCoche.puertas);
    }
}
class Coche{
    int puertas=4;
    public void sumarPuerta(){
        this.puertas++;
    }
}