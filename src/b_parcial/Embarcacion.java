package b_parcial;

public abstract class Embarcacion {
    private Double precioBase;
    private Double adicional;
    private Double eslora;
    private Capitan capitan;
    private Integer anioFabricacion;

    public Embarcacion(Double precioBase, Double adicional, Double eslora, Capitan capitan, Integer anioFabricacion) {
        this.precioBase = precioBase;
        this.adicional = adicional;
        this.eslora = eslora;
        this.capitan = capitan;
        this.anioFabricacion = anioFabricacion;
    }

    public Double calcularAlquiler() {
        Double alquiler = precioBase;
        if (anioFabricacion > 2020) {
            alquiler += adicional;
        }
        return alquiler;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
