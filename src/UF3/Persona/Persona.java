package UF3.Persona;

/**
 * Created by david on 29/02/16.
 */
public class Persona {
    private String nombre;
    private String dni;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() { return dni;}

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public Persona (String nombre, int edad, char sexo, double peso, double altura){
        this.nombre=nombre;
        setEdad(edad);
        generaDni();
        this.sexo=sexo;
        comprobarSexo();
        this.altura=altura;

    }

    public Persona (String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }

    public void generaDni() {
        int x = (int)(999999999*Math.random()+1000000000);
        char letra = calculaLetra(x);
        this.dni = Integer.toString(x) + letra;
    }

    public char calculaLetra(int dni) {
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        char letra = juegoCaracteres.charAt(modulo);
        return 1;
    }

    public void comprobarSexo() {
        if(this.sexo != 'M' && this.sexo !='H') {
            this.sexo = 'H';
        }
    }

    public int calculaIMC() {
        double imc = this.peso / (this.altura * this.altura);
        if (imc <= 22 && imc >= 18) {
            return 0;
        }
        else if (imc > 22) {
            return 1;
        }
        else if (imc < 18) {
            return -1;
        }
        return 0;
    }

}
