public class Main {
    public static void main(String[] args) {
        Casa castilloDisney = new Casa();

        Frigorifico frigorifico = new Frigorifico(5,8,true);
        Cocina cocina = new Cocina(true, frigorifico, 200);
        Bano bano = new Bano(true,50);
        Salon salon = new Salon(true,260);
        Habitacion habitacion1 = new Habitacion(3, 100, 4);
        Bano bano1 = new Bano(true,50);
        habitacion1.setBano(bano1);
        Habitacion habitacion2 = new Habitacion(2, 160,5);

        castilloDisney.setCocina(cocina);
        castilloDisney.setBano(bano);
        castilloDisney.setSalon(salon);
        castilloDisney.setHabitacion1(habitacion1);
        castilloDisney.setHabitacion2(habitacion2);

        System.out.println(castilloDisney);
    }
}