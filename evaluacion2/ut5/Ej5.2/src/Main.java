public class Main {
    public static void main(String[] args) {
        int trabajadores = 15;
        double [] [] horasTrabajadas = new double[15][7];
        final String[] DIAS = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < trabajadores; i++) {
            for (int j = 0; j < 7; j++) {
                horasTrabajadas[i] [j] = (int) (Math.random() * (12 - 8 + 1)) + 8;
            }
        }

        double[] media = new double[7];
        for (int i = 0; i < 7; i++) {
            double horas = 0;
            for (int j = 0; j < trabajadores; j++) {
                horas += horasTrabajadas[j][i];
            }
            media[i] = horas;
        }

        for (int i = 0; i < media.length; i++) {
            System.out.println("El dia " + DIAS[i] + " los trabajadores hicieron una media de " + media[i] + "h trabajadas");
        }
    }
}