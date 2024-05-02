package Parcial.primerPacial;
//requisitos:
//Cada prueba a su vez, debe tener una fecha, hora y fase
public class Campus {
    //Declaración de atributos
    private int phase;
    private String date;
    private String time;

    //Constructor sobrecargado
    public Campus(int phase, String date, String time) {
        this.phase = phase;
        this.date = date;
        this.time = time;
    }
}
