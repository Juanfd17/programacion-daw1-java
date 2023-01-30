public class Granja {
    Animal[] animales;
    int contador;

    public Granja(int capacidadGranja) {
        this.animales = new Animal[capacidadGranja];
        this.contador = 0;
    }

    public void addAnimal(Animal animal) {
        if (this.contador < this.animales.length) {
            this.animales[contador] = animal;
            contador++;
        }
    }

    public void mostrarAnimales() {
        for (int i = 0; i < contador; i++) {
            System.out.println(animales[i]);
        }
    }

    public Animal getAnimal(int i) {
        if (!(animales[i] == null)) {
            return animales[i];
        }
        return null;
    }

    public int cuantosPerros() {
        int cantidad = 0;
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public void borrarGatos() {
        for (int i = 0; i < contador; i++) {
            if (animales[i] instanceof Gato) {
                contador--;
                for (int j = i; j < contador; j++) {
                    animales[j] = animales[j + 1];
                }
                i--;
            }
        }
    }
}
