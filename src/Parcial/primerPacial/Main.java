package Parcial.primerPacial;

public class Main {
    public static void main(String[] args) {
        //Crear instancias de Athlete
        Athlete athlete1 = new Athlete(1.80, 30, 75.0, 123456789, "Juan");
        Athlete athlete2 = new Athlete(1.70, 25, 65.0, 987654321, "Maria");
        Athlete athlete3 = new Athlete(1.75, 28, 70.0, 456789123, "Carlos");
        Athlete athlete4 = new Athlete(1.98, 18, 70.5, 434444434, "Marianela");
        Athlete athlete5 = new Athlete(1.78, 32, 67.0, 253633455, "Carla");
        Athlete athlete6 = new Athlete(1.50, 55, 80.0, 334343344, "Esperanza");

        //Instancias de NationalTeam
        Athlete[] athletes = {athlete1, athlete2, athlete3,athlete4, athlete5, athlete6};
        NationalTeam nationalTeam = new NationalTeam("Rojo", "España", athletes);

        //Imprimir height y extraWeight de cada atleta en el NationalTeam
        System.out.println("Datos de equipo nacional:");
        for (Athlete athlete : nationalTeam.getAthletes()) {
            System.out.println("Altura de " + athlete.getName() + ": " + athlete.getHeight());
            System.out.println("¿Hay peso extra? de " + athlete.getName() + ": " + athlete.extraWeight(25.0));
        }
        System.out.println();

        //Instancias de Test
        Test test1 = new Test(1, "Test 1", new Athlete[]{athlete1, athlete2});
        Test test2 = new Test(2, "Test 2", new Athlete[]{athlete2, athlete3});
        Test test3 = new Test(3, "Test 3", new Athlete[]{athlete4, athlete6});

        //Instancias de Facility
        Facility facility = new Facility("Maraton", "Rioja 14", "Maraton R14", "Común");

        //Imprimir el nombre del 3er atleta de la 2da Test y cod de la 2da prueba desde Facility
        System.out.println("Desde Instalacion:");
        Athlete[] athletesTest2 = test2.getAthletes();
        if (athletesTest2.length >= 3) {
            System.out.println("Nombre del 3er atleta de la 2da Test: " + athletesTest2[2].getName());
        }
        System.out.println("Código de la 2da prueba: " + test2.getCod());
        System.out.println();
    }
}
