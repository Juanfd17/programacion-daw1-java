public class Main {
    public static void main(String[] args) {
        DiaSemana.imprimirDias();
        System.out.println(DiaSemana.nombreCompleto(2));
        System.out.println(DiaSemana.numeroDia("Lunes"));
        System.out.println(DiaSemana.DOMINGO.lavoral());
        System.out.println(DiaSemana.JUEVES.lavoral());
        imprimirArray(DiaSemana.laborales());
    }

    public static void imprimirArray(DiaSemana[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}