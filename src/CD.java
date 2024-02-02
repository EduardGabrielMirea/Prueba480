public class CD implements Disco {
    //He creado los campos nombre, capacidad"Almacenamiento" y contenido del cd,
    // ya que seran las salidas de esta clase.
    private String nombreD;
    private String marcaD;
    private int capacidadD;
    private String tipoD;

    //He creado su constructor.
    public CD(String nombreD, String marcaD, int capacidadD, String tipoD) {
        this.nombreD = nombreD;
        this.marcaD = marcaD;
        this.capacidadD = capacidadD;
        this.tipoD = tipoD;
    }

    //Getters and Setters.
    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getMarcaD() {
        return marcaD;
    }

    public void setMarcaD(String marcaD) {
        this.marcaD = marcaD;
    }

    public int getCapacidadD() {
        return capacidadD;
    }

    public void setCapacidadD(int capacidadD) {
        this.capacidadD = capacidadD;
    }

    public String getTipoD() {
        return tipoD;
    }

    public void setTipoD(String tipoD) {
        this.tipoD = tipoD;
    }

    //Metodos. Uso la inteferfaz Disco para poder implementar los metedos girar, escribir y leer.
    @Override
    public void girar() {
        System.out.println("1- El CD está girando.");
    }

    @Override
    public void escribirDatos(String contenido) {
        System.out.println("2- Escribiendo datos en el CD...");
        this.tipoD = contenido;
    }

    @Override
    public String leerDatos() {
        return this.tipoD;
    }

    //Este es el llamado toString que sirve para imprimir los campos de la clase cd.

    @Override
    public String obtenerInformacion() {
        return "Nombre: " + this.nombreD + ", Marca: " +this.marcaD + ", Capacidad: " + this.capacidadD +"MB";
    }

}
