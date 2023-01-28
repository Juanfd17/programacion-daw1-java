public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("pepe");
        Granja granja1 = new Granja(7);
        Perro perro1 = new Perro("perro1",4,persona1,"Perro1","sentarse");
        Perro perro2 = new Perro("perro2",4,persona1,"Perro2","sentarse");
        Gato gato1 = new Gato("gato1",4,persona1,"gato1","jugar");
        Gato gato2 = new Gato("gato2",4,persona1,"gato2","jugar");
        Vaca vaca1 = new Vaca("vaca1",4,persona1,"vaca1");
        Vaca vaca2 = new Vaca("vaca2",4,persona1,"vaca2");

        granja1.addAnimal(perro1);
        granja1.addAnimal(perro2);
        granja1.addAnimal(gato1);
        granja1.addAnimal(gato2);
        granja1.addAnimal(vaca1);
        granja1.addAnimal(vaca2);

        granja1.mostrarAnimales();

        System.out.println(granja1.cuantosPerros());

        System.out.println("borrar gatos");
        granja1.borrarGatos();
        granja1.mostrarAnimales();
    }
}