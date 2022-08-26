public class Familia{
    //Atributos
    private String apellido;
    private int miembros;
    private int NiñosPequeños;
    private int NiñosGrandes;
    private int Mascotas;

    //Constructor

    public Familia(){
        apellido = "Cordón";
        miembros = 4;
        NiñosPequeños = 0;
        NiñosGrandes = 0;
        Mascotas = 3;
    }

    public Familia(String apellido, int miembros, int NiñosPequeños, int NiñosGrandes, int Mascotas){
        this.apellido = apellido;
        this.miembros = miembros;
        this.NiñosPequeños = NiñosPequeños;
        this.NiñosGrandes = NiñosGrandes;
        this.Mascotas = Mascotas;
    }

    //Getters y Setters

    /**
     * @return String return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return int return the miembros
     */
    public int getMiembros() {
        return miembros;
    }

    /**
     * @param miembros the miembros to set
     */
    public void setMiembros(int miembros) {
        this.miembros = miembros;
    }

    /**
     * @return int return the NiñosPequeños
     */
    public int getNiñosPequeños() {
        return NiñosPequeños;
    }

    /**
     * @param NiñosPequeños the NiñosPequeños to set
     */
    public void setNiñosPequeños(int NiñosPequeños) {
        this.NiñosPequeños = NiñosPequeños;
    }

    /**
     * @return int return the NiñosGrandes
     */
    public int getNiñosGrandes() {
        return NiñosGrandes;
    }

    /**
     * @param NiñosGrandes the NiñosGrandes to set
     */
    public void setNiñosGrandes(int NiñosGrandes) {
        this.NiñosGrandes = NiñosGrandes;
    }

    /**
     * @return int return the Mascotas
     */
    public int getMascotas() {
        return Mascotas;
    }

    /**
     * @param Mascotas the Mascotas to set
     */
    public void setMascotas(int Mascotas) {
        this.Mascotas = Mascotas;
    }

}