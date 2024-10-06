public class TabletaGrafica {
    private String serial;
    private String marca;
    private float tamaño;
    private float precio;
    private String almacenamiento;
    private float peso;

    public TabletaGrafica(String serial, String marca, float tamaño, float precio, String almacenamiento, float peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }

    // Getters y Setters
    public String getSerial() { return serial; }
    public String getMarca() { return marca; }
    public float getTamaño() { return tamaño; }
    public float getPrecio() { return precio; }
    public String getAlmacenamiento() { return almacenamiento; }
    public float getPeso() { return peso; }
}
