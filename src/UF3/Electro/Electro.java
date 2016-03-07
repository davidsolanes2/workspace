package UF3.Electro;

/**
 * Created by david on 3/03/16.
 */
public class Electro {

    private String articulo;
    private double precio=100.0;
    private String color="blanco";
    private char consumo='F';
    private double peso=5.0;

    //constructor vacio
    public Electro() {}

    private String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //constructor con todos los atributos
    public Electro(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    //constructor con precio y peso
    public Electro(int precio, int peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico() {
        if(this.consumo != 'A' && this.consumo !='B' && this.consumo !='C' && this.consumo !='D'
                && this.consumo !='E' && this.consumo !='F') {
            this.consumo = 'F';
        }
    }
    //upercase

    public void comprobarColor() {
        if (!this.color.equals("blanco") && !this.color.equals("negro") && !this.color.equals("rojo")
                && !this.color.equals("azul") && !this.color.equals("gris")) {
            this.color = "blanco";
        }
    }



}
