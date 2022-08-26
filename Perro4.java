public class Perro4{
    //Atributos
    private String nombre;
    private int edad;
    private String tamaño;
    private int salud;
    private String color;
    private String raza;
    //private String RazaPeligrosa;
    //private boolean EsRazaPeligrosa;

    //Constructor

    public Perro4(){
        nombre = "Luisita";
        edad = 7;
        tamaño = "mediano";
        salud = 90;
        color = "tricolor";
        raza = "beagle";
        //RazaPeligrosa = "no";
        //EsRazaPeligrosa = false;
    }

    public Perro4(String nombre, int edad, String tamaño, int salud, String color, String raza /*String RazaPeligrosa, boolean EsRazaPeligrosa*/){
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño = tamaño;
        this.salud = salud;
        this.color = color;
        this.raza = raza;
        //this.RazaPeligrosa = RazaPeligrosa;
        //this.EsRazaPeligrosa = EsRazaPeligrosa;
        }

    //Getters y Setters

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return int return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return String return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return int return the salud
     */
    public int getSalud() {
        return salud;
    }

    /**
     * @param salud the salud to set
     */
    public void setSalud(int salud) {
        this.salud = salud;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return String return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /*/**
     * @return String return the RazaPeligrosa
     */
    /*public String getRazaPeligrosa() {
        return RazaPeligrosa;
    }

    /**
     * @param RazaPeligrosa the RazaPeligrosa to set
     */
    /*public void setRazaPeligrosa(String RazaPeligrosa) {
        this.RazaPeligrosa = RazaPeligrosa;
    }

    /**
     * @return boolean return the EsRazaPeligrosa
     */
    /*public boolean isEsRazaPeligrosa() {
        return EsRazaPeligrosa;
    }

    /**
     * @param EsRazaPeligrosa the EsRazaPeligrosa to set
     */
    /*public void setEsRazaPeligrosa(boolean EsRazaPeligrosa) {
        this.EsRazaPeligrosa = EsRazaPeligrosa;
    }*/

}