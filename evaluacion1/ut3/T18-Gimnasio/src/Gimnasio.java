
/**
 * ENTREGA UT3
 *
 * @Juan Feito Diaz - (aquí pon tu nombre)
 * <p>
 * <p>
 * Un gimnasio oferta clases de yoga, pilates y spinning
 * en sus diferentes salas. En cada sala se realiza una actividad de la misma duración
 * que se repite a lo largo del día un nº de veces. Puede haber salas
 * con la misma actividad pero de duración diferentes (ej. en la sala 1
 * se hace spinning en clases de 40 minutos y en la sala 3 se
 * hace también spinning pero de duración 70 minutos).
 * <p>
 * El precio de las clases depende de su duración.
 * El precio base es 3.0€ y se añade a este precio 0.20€ por cada período completo de 15 minutos.
 * <p>
 * <p>
 * La primera clase comienza siempre a las 10.30 (a.m) y la última no puede acabar después
 * de las 8.30 (p.m). En todas las salas entre clase y clase (incluida la última)
 * hay un descanso de 10 minutos
 * <p>
 * El gimnasio quiere mostrar al usuario el nº de clases que se dan en cada sala con su precio
 * y además quiere efectuar ciertos cálculos dependiendo del nº de personas que se han inscrito
 * a las actividades de las diferentes salas
 */
public class Gimnasio {
    final private int HORA_PRIMERA_CLASE = 10;
    final private int MINUTOS_PRIMERA_CLASE = 30;
    final private int HORA_ULTIMA_CLASE = 8;
    final private int MINUTOS_ULTIMA_CLASE = 30;
    final private int DESCANSO = 10;

    final private double PRECIO_BASE = 3.0;
    final private double PRECIO_15MINUTOS = 0.20;

    final private char YOGA = 'Y';
    final private char PILATES = 'P';
    final private char SPINNING = 'S';
    private String nombre;
    private int yoga;
    private int pilates;
    private int spinning;

    private double totalAcumulado;
    private int salaMaximoSpinning;
    private int inscritosMaximoSpinning;


    /**
     * Constructor  -
     * Recibe un único parámetro, el nombre del gimnasio
     * e inicializa el resto de atributos adecuadamente
     */
    public Gimnasio(String nombre) {
        this.nombre = nombre;
        this.yoga = 0;
        this.pilates = 0;
        this.spinning = 0;
        this.totalAcumulado = 0;
        this.salaMaximoSpinning = 0;
        this.inscritosMaximoSpinning = 0;
    }

    /**
     * Accesor para el nombre del gimnasio
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Mutador para el nombre del gimnasio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * accesor para el importe total acumulado
     * entre todos los inscritos en el gimnasio
     */
    public double getImporteTotal() {
        return this.totalAcumulado;
    }

    /**
     * Este método recibe 4 parámetros:
     * - sala: el nº de sala donde se hace la actividad
     * - tipo: el tipo de actividad, un carácter 'Y' yoga, 'P' pilates 'S' spinning
     * - horas y minutos : duración de la actividad en nº horas y minutos
     * - inscritos: el nº de personas inscritas en esa actividad en la sala
     * <p>
     * Por ej, tarificarClaseEnSala(4, 'P', 1, 5, 15) significa que en la sala 4 se hace
     * pilates, las clases duran 1 hora y  5 minutos y se han inscrito en esta sala 15
     * <p>
     * A partir de esta información el método debe calcular:
     * - total inscritos por tipo de actividad (independientemente de la sala)
     * - la sala y el máximo nº de inscritos en spinning en esa sala
     * <p>
     * Utiliza   una sentencia switch  para analizar el tipo de actividad
     * <p>
     * También el método calculará y mostrará posteriormente la siguiente información:
     * - el precio de la clase en la sala (basándose en su duración). En el ejemplo anterior
     * la clase de pilates duraba 1 hora y 5 minutos . Como el total de minutos
     * de duración es 65 su precio será: 3 + 0,20 *  4 = 3,8 ya que son 4 los períodos completos de
     * 15 minutos que hay
     * - nº de veces que la clase se ofertará en la sala (dependerá de su duración. No olvidar que entre clase
     * y clase siempre hay un descanso)
     * - la hora de finalización de la última clase (hora y minutos) - !!Ver resultados de ejecución!!
     * - el método además irá registrando el importe total que lleva acumulado el gimnasio entre todas
     * las personas inscritas
     */
    public void tarificarClaseEnSala(int sala, char tipo, int horas, int minutos, int inscritos) {
        String clase = tipoClse(tipo,inscritos,sala);

        int minutosTotales = (((HORA_ULTIMA_CLASE + 12) - HORA_PRIMERA_CLASE) * 60) - MINUTOS_PRIMERA_CLASE + MINUTOS_ULTIMA_CLASE;
        int minutosPorClase = (horas * 60) + minutos;
        int numeroClases = minutosTotales / (minutosPorClase + DESCANSO);
        double precio = ((minutosPorClase / 15) * PRECIO_15MINUTOS) + PRECIO_BASE;

        int horasClase = ((minutosPorClase + DESCANSO) * numeroClases) / 60;
        int horaUltimaClase = horasClase + HORA_PRIMERA_CLASE;
        int minutosUltimaClase = (((minutosPorClase + DESCANSO) * numeroClases) - (horasClase * 60)) + MINUTOS_PRIMERA_CLASE;

        if (minutosUltimaClase >= 60) {
            horaUltimaClase++;
            minutosUltimaClase -= 60;
        }

        System.out.println("Sala Nº: " + sala + "\t\t\tActividad: " + clase);
        System.out.println("Longitud: " + minutosPorClase + "min \tDescanso: " + DESCANSO + "min");
        System.out.println("Precio clase: " + precio + "€");
        System.out.println("Clase ofertada en sala: " + numeroClases + " veces al dia");
        System.out.println("La ultima clase termina a las: " + horaUltimaClase + " y " + minutosUltimaClase + " minutos");
        System.out.println("Total inscritos en sala: " + inscritos);

        totalAcumulado += precio * inscritos;
    }

    private String tipoClse(char tipo, int inscritos, int sala) {
        switch (tipo) {
            case YOGA:
                yoga += inscritos;
                return "YOGA";
            case PILATES:
                pilates += inscritos;
                return  "PILATES";
            case SPINNING:
                spinning += inscritos;
                if (inscritos > inscritosMaximoSpinning) {
                    inscritosMaximoSpinning = inscritos;
                    salaMaximoSpinning = sala;
                }
                return  "SPINNING";
        }
        return "No calse";
    }

    /**
     * nº sala en la que hay más inscritos para spinning
     */
    public int getSala() {
        return salaMaximoSpinning;
    }

    /**
     * Devuelve el nombre de la actividad con más inscritos independientemente de la sala
     */
    public String getActividad() {
        if (yoga > pilates && yoga > spinning) {
            return "YOGA";
        }

        if (pilates > spinning) {
            return "PILATES";
        }

        return "SPINNING";
    }

}
