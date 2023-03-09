public enum DiaSemana {
    LUNES(1, "Lunes"), MARTES(2, "Martes"), MIERCOLES(3, "Miercoles"), JUEVES(4, "Jueves"), VIERNES(5, "Viernes"), SAVADO(6, "Sabado"), DOMINGO(7, "Domingo");
    int nDia;
    String nomDia;

    private DiaSemana(int nDia, String nomDia) {
        this.nDia = nDia;
        this.nomDia = nomDia;
    }

    public int getnDia() {
        return nDia;
    }

    public String getNomDia() {
        return nomDia;
    }

    public static void imprimirDias(){
        for (DiaSemana dia: DiaSemana.values()) {
            System.out.println(dia);
        }
    }

    public static String nombreCompleto(int dia){
        for (DiaSemana diaSemana: DiaSemana.values()) {
            if (diaSemana.nDia == dia){
                return diaSemana.getNomDia();
            }
        }

        return "No dia Semana";
    }

    public static int numeroDia(String dia){
        for (DiaSemana diaSemana: DiaSemana.values()) {
            if (diaSemana.getNomDia().equalsIgnoreCase(dia)){
                return diaSemana.nDia;
            }
        }

        return -1;
    }

    public boolean lavoral(){
        return getnDia() < 6;
    }

    public static DiaSemana[] laborales(){
        DiaSemana[] laborables = new DiaSemana[values().length];
        int contador = 0;
        for (DiaSemana dia: DiaSemana.values()) {
            if (dia.lavoral()){
                laborables[contador] = dia;
                contador++;
            }
        }
        return laborables;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nDia);
        sb.append(": ").append(nomDia);
        return sb.toString();
    }
}
