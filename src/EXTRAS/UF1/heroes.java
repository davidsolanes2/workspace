package EXTRAS.UF1;

/**
 * Created by david on 7/01/16.
 */
public class heroes {

    //Atributos de la clase heroes
    private String nombre;
    private String habilidad;
    private int nivel;
    private String amigo;

    //Constructores
    public heroes() {}  //vacio

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getAmigo() {
        return amigo;
    }
    public void setAmigo(String amigo) {
        this.amigo = amigo;
    }


    public heroes(String nombre, String habilidad, int nivel, String amigo) {  //por parametros
            this.nombre = nombre;
            this.habilidad = habilidad;
            this.nivel = nivel;
            this.amigo = amigo;
        }


}


