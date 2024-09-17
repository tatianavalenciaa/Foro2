package foro2;

/*
    Ocupamos Herencia: 
    Estamos heredando todos los atributos y metodos de la clase Dispositivo
*/
public class Laptop extends Dispositivo {
    private String memoria;
    private String tamanioPantalla;
    private String capacidadDiscoDuro;

    public Laptop() {
    }

    public Laptop(String memoria, String tamanioPantalla, String capacidadDiscoDuro) {
        this.memoria = memoria;
        this.tamanioPantalla = tamanioPantalla;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(String tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(String capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(super.getFabricante()).append("\n");
        sb.append("Modelo: ").append(super.getModelo()).append("\n");
        sb.append("Microprocesador: ").append(super.getMicroprocesador()).append("\n");
        sb.append("Memoria: ").append(this.getMemoria()).append("\n");
        sb.append("Tamanio Pantalla: ").append(this.getTamanioPantalla()).append("\n");
        sb.append("Capacidad Disco Duro: ").append(this.getCapacidadDiscoDuro()).append("\n");
        return sb.toString();
    }
    
}
