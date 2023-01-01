public class TresNumeros {
    private int numero1;
    private int numero2;
    private int numero3;

    public TresNumeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getMaximo() {
        int max = this.numero1;

        if (max < this.numero2) {
            max = this.numero2;
        }

        if (max < this.numero3) {
            max = this.numero3;
        }

        return max;
    }

    public int getMinimo() {
        int min = numero1;

        if (min > this.numero2) {
            min = this.numero2;
        }

        if (min > this.numero3) {
            min = this.numero3;
        }
        return min;
    }

    public boolean sonIguales() {
        if (numero1 == numero2 && numero3 == numero2) {
            return true;
        } else {
            return false;
        }
    }

    public int cuantosPares() {
        int cuantos = 0;

        if (esPar(numero1)) {
            cuantos++;
        }

        if (esPar(numero2)) {
            cuantos++;
        }

        if (esPar(numero3)) {
            cuantos++;
        }

        return cuantos;
    }

    public boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int cuantosAcabanEn7() {
        int cuantos = 0;

        if (acaba7(numero1)) {
            cuantos++;
        }

        if (acaba7(numero2)) {
            cuantos++;
        }

        if (acaba7(numero3)) {
            cuantos++;
        }

        return cuantos;
    }

    public boolean acaba7(int numero) {
        if (numero % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    public int getMedio(){
        int distinto = 0;
        int min = getMinimo();
        int max = getMaximo();
        if (numero1 != max){
            if (numero1 != min){
                distinto = numero1;
            }
        }

        if (numero2 != max){
            if (numero2 != min){
                distinto = numero2;
            }
        }

        if (numero3 != max){
            if (numero3 != min){
                distinto = numero3;
            }
        }

        if (numero1 == numero2 || numero1 == numero3) {
            distinto = numero1;
        } else if (numero2 == numero3) {
            distinto = numero2;
        }

        return distinto;
    }

    public void ordenar() {
        int min = getMinimo();
        int distinto = getMedio();
        int max = getMaximo();

        numero1 = min;
        numero2 = distinto;
        numero3 = max;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer().append("numero1=").append(numero1).append(", numero2=").append(numero2).append(", numero3=").append(numero3);
        return sb.toString();
    }
}