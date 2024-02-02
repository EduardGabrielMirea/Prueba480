public class DiscoDuro implements Disco{

    //La clase DD tiene los mismos campos que la CD, devido a que ambos van a necesitar las mismas entradas.
    private String nombreDD;
    private String marcaDD;
    private int capacidadDD;
    private String tipoDD;
    public static final int MAX_VELOCIDAD_GIRATORIA = 7200; // RPM es la velocidad maxima de lectura de un disco duro.

    //Constructor.
    public DiscoDuro(String nombreDD, String marcaDD, int capacidadDD, String tipoDD) {
        this.nombreDD = nombreDD;
        this.marcaDD = marcaDD;
        this.capacidadDD = capacidadDD;
        this.tipoDD = tipoDD;
    }

    //Getters and Setters.

    public String getNombreDD() {
        return nombreDD;
    }
    public void setNombreDD(String nombreDD) {
        this.nombreDD = nombreDD;
    }

    public String getMarcaDD() {
        return marcaDD;
    }

    public void setMarcaDD(String marcaDD) {
        this.marcaDD = marcaDD;
    }

    public int getCapacidadDD() {
        return capacidadDD;
    }

    public void setCapacidadDD(int capacidadDD) {
        this.capacidadDD = capacidadDD;
    }

    public String getTipoDD() {
        return tipoDD;
    }

    public void setTipoDD(String tipoDD) {
        this.tipoDD = tipoDD;
    }

    //Metodos. Usando la interfaz Disco.
    @Override
    public void girar() {
        System.out.println("1- El disco duro está girando.");
    }

    @Override
    public void escribirDatos(String contenido) {
        System.out.println("2- Escribiendo datos en el disco duro...");
        this.tipoDD = contenido;
    }

    @Override
    public String leerDatos() {
        return this.tipoDD;
    }

    @Override
    public String obtenerInformacion() {
        return "Nombre: " + this.nombreDD +", Marca: " +this.marcaDD+ ", Capacidad: " + this.capacidadDD +"MB";
    }
//Velocidad maxima.
    public int getVelocidadGiratoria() {
        return MAX_VELOCIDAD_GIRATORIA;
    }
}
