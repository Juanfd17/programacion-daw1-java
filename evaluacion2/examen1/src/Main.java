public class Main {
    public static void main(String[] args) {
    Academia a = new Academia(5);

        Cursos t1 = new Teoricos("t1", 62,12,true);
        Cursos p1 = new Practico("p1", 42,8, "sede1");
        Cursos m1 = new Mixtos("m1", 62,14,7,8);
        Cursos m2 = new Mixtos("m2", 32,10,4,6);

        System.out.println(a.anadirCurso(t1));
        System.out.println(a.anadirCurso(t1));
        System.out.println(a.anadirCurso(m1));
        System.out.println(a.anadirCurso(m2));

        a.cursosPorHoras();

        a.cursosBaratosB();
    }
}