package foro2;

/*
    Ocupamos Herencia: 
    Estamos heredando todos los atributos y metodos de la clase Dispositivo
*/
public class Desktop extends Dispositivo {
    private String memoria;
    private String tarjetaGrafica;
    private String tamanioTorre;
    private String capacidadDiscoDuro;

    public Desktop() {
    }

    public Desktop(String memoria, String tarjetaGrafica, String tamanioTorre, String capacidadDiscoDuro) {
        this.memoria = memoria;
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamanioTorre = tamanioTorre;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getTamanioTorre() {
        return tamanioTorre;
    }

    public void setTamanioTorre(String tamanioTorre) {
        this.tamanioTorre = tamanioTorre;
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
        sb.append("Tarjeta Grafica: ").append(this.getTarjetaGrafica()).append("\n");
        sb.append("Tamanio Torre: ").append(this.getTamanioTorre()).append("\n");
        sb.append("Capacidad Disco Duro: ").append(this.getCapacidadDiscoDuro()).append("\n");
        return sb.toString();
    }
    
}
