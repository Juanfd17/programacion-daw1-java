public class Perro extends Mascota {
    private boolean esPeligroso;


    public Perro(int edad, String raza, String color, String nombre, boolean esPeligroso) {
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
        this.esPeligroso = esPeligroso;
        this.tieneambre = false;
    }

    public Perro(String raza, String color, String nombre) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
        this.edad = 0;
        this.esPeligroso = false;
        this.tieneambre = false;
    }

    public Perro() {
        this.raza = "Pastor aleman";
        this.color = "Azul";
        this.nombre = "Perry";
        this.edad = (int) (Math.random()*19);
        this.esPeligroso = true;
        this.tieneambre = false;
    }

    public void imprimierDetalles(){
        System.out.println("------------------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Raza: " + getRaza());
        System.out.println("Edad: " + getEdad());
        System.out.println("Es peligroso: " + isEsPeligroso());
        System.out.println("Color: " + getColor());
    }

    public void comer(){
        this.tieneambre = false;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }
}
