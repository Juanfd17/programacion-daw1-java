public class Main {
    public static void main(String[] args) {
        String[] plantilla = {
                "vsd,Manuel,Garc�a,55,Fisioterapeuta,si",
                "wlp,Luis,Su�rez,29,Nutricionista,B",
                "pnd,Mar�a,L�pez,35,M�dico,6",
                "plr,Alberto,L�pez,47,Fisioterapeuta,no",
                "rmz,Andrea,Rodr�guez,26,Nutricionista,A",
                "htq,Arturo,Vel�zquez,32,Fisioterapeuta,no"
        };
        EquipoMedico equipoMedico = new EquipoMedico(plantilla);

        equipoMedico.trabajar("vsd",Dias.LUNES,Turnos.MANANA);
        equipoMedico.trabajar("vsd",Dias.MARTES,Turnos.TARDE);
        equipoMedico.trabajar("vsd",Dias.MARTES,Turnos.NOCHE);
        equipoMedico.trabajar("vsd",Dias.MIERCOLES,Turnos.TARDE);
        equipoMedico.trabajar("vsd",Dias.JUEVES,Turnos.TARDE);
        equipoMedico.trabajar("vsd",Dias.JUEVES,Turnos.NOCHE);
        equipoMedico.trabajar("vsd",Dias.SABADO,Turnos.NOCHE);
        equipoMedico.trabajar("vsd",Dias.DOMINGO,Turnos.TARDE);

        equipoMedico.trabajar("wlp",Dias.LUNES,Turnos.TARDE);
        equipoMedico.trabajar("wlp",Dias.LUNES,Turnos.NOCHE);


        System.out.println(equipoMedico.horasSemana("vsd"));
        System.out.println(equipoMedico.matrizEmpleado("vsd"));
        System.out.println(equipoMedico.horarioSemanal());
    }
}