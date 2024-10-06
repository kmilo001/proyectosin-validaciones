public class ComPOrtatil {
    private String serial;
    private String marca;
    private float tamaño;
    private float precio;
    private String sistemaOperativo;
    private String procesador;

    public ComPOrtatil(String serial, String marca, float tamaño, float precio, String sistemaOperativo, String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    public String getSerial() {
        return serial;
    }
    public String getMarca() {
        return marca;
    }
    public float getTamaño() {
        return tamaño;
    }
    public float getPrecio() {
        return precio;
    }
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public String getProcesador() {
        return procesador;
    }
}
