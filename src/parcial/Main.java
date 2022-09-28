package parcial;

public class Main {
    public static void main(String[] args) {
        Capitan cosmeFulanito = new Capitan("cosme", "fulanito", "mp22");
        Yate yate1 = new Yate(200.0, 100.0,20.0, cosmeFulanito,2022,7);
        Velero velero = new Velero(200.0, 100.0, 20.0, cosmeFulanito,2022, 5);
        Yate yate2 = new Yate(200.0, 100.0,20.0, cosmeFulanito,2022,6);

        System.out.println(yate1.compararCamarotes(yate2));
        //System.out.println(velero.calcularAlquiler());
        System.out.println(velero.esGrande());

    }
}
