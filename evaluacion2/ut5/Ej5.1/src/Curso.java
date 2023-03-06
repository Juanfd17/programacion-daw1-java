public class Curso {
    private static final int MAX_ESTUDIANTES = 20;
    private static final int MAX_ASIGNATURAS = 6;
    private int [] [] notas;

    public Curso(){
        notas = new int[20][6];
        inicializar();
    }

    private void inicializar(){
        for (int i = 0; i < MAX_ESTUDIANTES; i++) {
            for (int j = 0; j < MAX_ASIGNATURAS; j++) {
                notas[i][j] =  (int) (Math.random() * 10 + 1);
            }
        }
    }

    public double[] calcularMedias(){
        double[] media = new double[MAX_ASIGNATURAS];
        for (int i = 0; i < MAX_ASIGNATURAS; i++) {
            double nota = 0;
            for (int j = 0; j < MAX_ESTUDIANTES; j++) {
                nota += notas[j][i];
            }
            media[i] = nota / MAX_ESTUDIANTES;
        }

        return media;
    }
}
