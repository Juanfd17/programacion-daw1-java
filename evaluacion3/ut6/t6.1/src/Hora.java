public class Hora {
    private int h;
    private int m;
    private int s;

    public Hora(int h, int m, int s) throws HoraExcepcion {
        if (h < 0 || h > 23){
            throw new HoraExcepcion(h, 'h');
        }

        if (m < 0 || m > 59){
            throw new HoraExcepcion(m, 'm');
        }

        if (s < 0 || s > 59){
            throw new HoraExcepcion(s, 's');
        }

        this.h = h;
        this.m = m;
        this.s = s;
    }
}