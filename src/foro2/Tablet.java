package foro2;

/*
    Ocupamos Herencia: 
    Estamos heredando todos los atributos y metodos de la clase Dispositivo
*/
public class Tablet extends Dispositivo {
    private String tamanioDiagonalPantalla;
    private String capacitivaResistiva;
    private String tamanioMemoriaNand;
    private String sistemaOperativo;

    public Tablet() {
    }

    public Tablet(String tamanioDiagonalPantalla, String capacitivaResistiva, String tamanioMemoriaNand, String sistemaOperativo) {
        this.tamanioDiagonalPantalla = tamanioDiagonalPantalla;
        this.capacitivaResistiva = capacitivaResistiva;
        this.tamanioMemoriaNand = tamanioMemoriaNand;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTamanioDiagonalPantalla() {
        return tamanioDiagonalPantalla;
    }

    public void setTamanioDiagonalPantalla(String tamanioDiagonalPantalla) {
        this.tamanioDiagonalPantalla = tamanioDiagonalPantalla;
    }

    public String getCapacitivaResistiva() {
        return capacitivaResistiva;
    }

    public void setCapacitivaResistiva(String capacitivaResistiva) {
        this.capacitivaResistiva = capacitivaResistiva;
    }

    public String getTamanioMemoriaNand() {
        return tamanioMemoriaNand;
    }

    public void setTamanioMemoriaNand(String tamanioMemoriaNand) {
        this.tamanioMemoriaNand = tamanioMemoriaNand;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(super.getFabricante()).append("\n");
        sb.append("Modelo: ").append(super.getModelo()).append("\n");
        sb.append("Microprocesador: ").append(super.getMicroprocesador()).append("\n");
        sb.append("Tamanio Diagonal Pantalla: ").append(this.getTamanioDiagonalPantalla()).append("\n");
        sb.append("Capacitiva/Resistiva: ").append(this.getCapacitivaResistiva()).append("\n");
        sb.append("Tamanio Memoria NAND: ").append(this.getTamanioMemoriaNand()).append("\n");
        sb.append("Sistema Operativo: ").append(this.getSistemaOperativo()).append("\n");
        return sb.toString();
    }
    
}
