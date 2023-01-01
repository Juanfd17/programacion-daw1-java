public class Coche {
    int tamanioRuedas;
    String color;
    String marca;
    int potencia;
    String modelo;
    boolean esIgual;


    //contructor a medida
    Coche(String modelo, String marca, String color, int potencia, int tamanioRuedas) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.potencia = potencia;
        this.tamanioRuedas = tamanioRuedas;
    }
    //el this se utiliza para que llame al marca color... que esta creado arriba. Pero no me agas mucho caso que no me entere bien

    //constuctor a medida con menos cosas las cosas que faltan las ponemos por defecto
    Coche(String elModelo, String laMarca) {
        marca = laMarca;
        modelo = elModelo;
    }

    //contructor por defecto
    Coche() {

    }

    //se pueden poner tantos costructores como quieras

    //si usas el contrustor por defecto tienes que añadir las variables a parte
    void inicializarAtributos(String modelo, String marca, String color, int potencia, int tamanioRuedas) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.potencia = potencia;
        this.tamanioRuedas = tamanioRuedas;
    }

    //imprime los detalles
    void imprimeCaracteristicas() {
        System.out.println("--------------------");
        if (marca != null) {
            System.out.println("Marca: " + marca);
        }
        if (modelo != null) {
            System.out.println("Modelo: " + modelo);
        }
        if (color != null) {
            System.out.println("Color: " + color);
        }
        if (potencia != 0) {
            System.out.println("Potencia: " + potencia);
        }
        if (tamanioRuedas != 0) {
            System.out.println("Tamaño de las ruedas: " + tamanioRuedas);
        }
    }

    boolean esIgual(String modelo, String marca, String color, int potencia, int tamanioRuedas) {
        return (this.marca.equals(marca) &&
                this.potencia == potencia &&
                this.color.equals(color) &&
                this.modelo.equals(modelo) &&
                this.tamanioRuedas == tamanioRuedas); //this es coche1 y tamanioRuedas es coche
    }

    boolean esIgual1(Coche loquequieras) {
        return (this.marca.equals(loquequieras.marca) &&
                this.potencia == loquequieras.potencia &&
                this.color.equals(loquequieras.color) &&
                this.modelo.equals(loquequieras.modelo) &&
                this.tamanioRuedas == loquequieras.tamanioRuedas);
    }
}
