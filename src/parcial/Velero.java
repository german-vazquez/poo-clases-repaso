package parcial;

public class Velero extends Embarcacion{
    private Integer mastil;

    public Velero(Double precioBase, Double adicional, Double eslora, Capitan capitan, Integer anioFabricacion, Integer mastil) {
        super(precioBase, adicional, eslora, capitan, anioFabricacion);
        this.mastil = mastil;
    }

    public Boolean esGrande(){
        return mastil>4;
    }


}
