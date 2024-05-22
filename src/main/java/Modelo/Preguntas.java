package Modelo;

public class Preguntas {
    private String descripcion;
    private boolean valorCorrecto;

    public Preguntas(String descripcion, boolean valorCorrecto) {
        this.descripcion = descripcion;
        this.valorCorrecto = valorCorrecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isValorCorrecto() {
        return valorCorrecto;
    }

    public void setValorCorrecto(boolean valorCorrecto) {
        this.valorCorrecto = valorCorrecto;
    }
}

