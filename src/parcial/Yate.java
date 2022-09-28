package parcial;

public class Yate extends Embarcacion implements Comparar2{
    private Integer camarote;

    public Yate(Double precioBase, Double adicional, Double eslora, Capitan capitan, Integer anioFabricacion, Integer camarote) {
        super(precioBase, adicional, eslora, capitan, anioFabricacion);
        this.camarote = camarote;
    }


    @Override
    public Boolean compararCamarotes(Yate o) {
        Integer yateA = this.camarote;
        Integer yateB = o.getCamarote();
        return yateA>yateB;
    }

    public Integer getCamarote() {
        return camarote;
    }

    public void setCamarote(Integer camarote) {
        this.camarote = camarote;
    }
}
