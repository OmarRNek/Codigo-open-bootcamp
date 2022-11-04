public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf > 0){
            System.out.println("el numero if es positivo");
        }else if (numeroIf == 0){
            System.out.println("el numero if es 0");
        }else if (numeroIf < 0){
            System.out.println("el numero if es negativo");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("numero while: " + numeroWhile);
            numeroWhile++;
        }
        int numeroDoWhile = 0;
        do {
            System.out.println("numero do while: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroWhile < 3);
        for (int numeroFor = 0 ; numeroFor <= 3 ; numeroFor++){
            System.out.println("numero for: " + numeroFor);
        }
        var estacion = "otoño";
        switch (estacion){
            case "primavera":
                System.out.println("es primavera");
                break;
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("eso no es una estacion del año");
        }
    }
}