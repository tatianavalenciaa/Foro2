package foro2;

/*
    Para este ejercicio, ocuparemos Herencia.
    Esta es la clase Padre.
    Todos los hijos de esta clase, tendran acceso a sus atributos y metodos
*/
public class Dispositivo {
    private String fabricante;
    private String modelo;
    private String microprocesador;

    public Dispositivo() {
    }

    public Dispositivo(String fabricante, String modelo, String microprocesador) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMicroprocesador() {
        return microprocesador;
    }

    public void setMicroprocesador(String microprocesador) {
        this.microprocesador = microprocesador;
    }

}
