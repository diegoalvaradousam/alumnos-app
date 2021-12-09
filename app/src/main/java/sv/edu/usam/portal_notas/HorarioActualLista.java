package sv.edu.usam.portal_notas;

public class HorarioActualLista {
    private String id, horaInicio, horaFin,dia,id_materia,id_ciclo;

    public HorarioActualLista(String id,String horaInicio,String horaFin,String dia, String id_materia,  String id_ciclo){
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
        this.id_materia = id_materia;
        this.id_ciclo = id_ciclo;
    }

    public String getid() {return id;}
    public String getHoraInicio() {return horaInicio;}
    public String gethoraFin() {return horaFin;}
    public String getdia() {return dia;}
    public String getid_materia() {return id_materia;}
    public String getid_ciclo() {return id_ciclo;}

}
