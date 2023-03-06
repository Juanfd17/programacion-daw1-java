public class DiaSemana {
int dia;
String nombre;
    public DiaSemana(Dias dia) {
        this.dia = dia.getNumero();
        this.nombre = dia.getNombre();
    }

    public int getDia() {
        return dia;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean finde(){
        boolean finde;
        if (getDia() > 6){
            finde = true;
        } else {
            finde = false;
        }

        return finde;
    }
}
