public class Main {
    public static void main(String[] args) {
        char caracter = 'f';
        switch ((caracter == 'y' || caracter == 'Y') ? 1 : (caracter == 'n' || caracter == 'N') ? 2 : 3){
            case 1:
                System.out.println("Afirmativo");
                break;
            case 2:
                System.out.println("Negativo");
                break;
            case 3:
                System.out.println("Entrada incorrecta.");
        }
        Ejercicio2();
    }

    public static void Ejercicio2(){
        int numero1 = 2;
        int numero2 = 3;
        double resultado = 0;
        char letra = 'd';

        if (letra == 's' || letra == 'S'){
            resultado = numero1 + numero2;
        } else if (letra == 'r' || letra == 'R') {
            resultado = numero1 - numero2;
        } else if (letra == 'm' || letra == 'M') {
            resultado = numero1 * numero2;
        } else if (letra == 'd' || letra == 'D') {
            if (numero2 == 0){
                System.out.println("No se puede dividir entre 0");
            }else {
                resultado = (double)numero1 / numero2;
            }
        }else {
            System.out.println("Entrada incorrecta");
        }
        System.out.println(resultado);


    }
}