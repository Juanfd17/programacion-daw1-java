public class Inventario {
    private Prenda[] prendas = new Prenda[10];
    private int contador = 0;
    public void agregarPrendas(Prenda prenda){
        this.prendas[contador] = prenda;
        contador++;

        if (prenda instanceof Camiseta) {
            System.out.printf("Se ha añadido una camiseta");
        }
    }

    public String monstrarPrendas(){
        final StringBuilder sb = new StringBuilder();
        for (Prenda prenda:prendas) {
            if (!(prenda == null)){
                sb.append("-------------\n");
                sb.append(prenda);
                sb.append("-------------\n");
            }
        }
        return sb.toString();
    }

    public int comparador(Prenda prenda1, Prenda prenda2){

        if(prenda1.getClass() != prenda2.getClass()){
            return -1;
        }

        if (prenda1.equals(prenda2)){
            return 1;
        }

        return 0;
    }
}
