package tugas;

/**
 * Created by bima on 6/10/2015.
 */
public class asalTahu {
    private String kotaTahu;
    private Double hargaTahu;

    public asalTahu(String kotaTahu, Double hargaTahu) {
        this.kotaTahu = kotaTahu;
        this.hargaTahu = hargaTahu;
    }

    public String getKotaTahu() {
        return kotaTahu;
    }

    public void setKotaTahu(String kotaTahu) {
        this.kotaTahu = kotaTahu;
    }

    public Double getHargaTahu() {
        return hargaTahu;
    }

    public void setHargaTahu(Double hargaTahu) {
        this.hargaTahu = hargaTahu;
    }

    @Override
    public String toString() {
        return "asalTahu{" +
                "kotaTahu='" + kotaTahu + '\'' +
                ", hargaTahu=" + hargaTahu +
                '}';
    }
}
