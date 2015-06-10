package tugas;

/**
 * Created by bima on 6/10/2015.
 */
public class jenisTahu {
    private String tahuKuning;
    private String tahuSumedang;
    private String tahuTakwa;
    private asalTahu asal;

    public jenisTahu(String tahuKuning, String tahuSumedang, String tahuTakwa, asalTahu asal) {
        this.tahuKuning = tahuKuning;
        this.tahuSumedang = tahuSumedang;
        this.tahuTakwa = tahuTakwa;
        this.asal = asal;
    }

    public String getTahuKuning() {
        return tahuKuning;
    }

    public void setTahuKuning(String tahuKuning) {
        this.tahuKuning = tahuKuning;
    }

    public String getTahuSumedang() {
        return tahuSumedang;
    }

    public void setTahuSumedang(String tahuSumedang) {
        this.tahuSumedang = tahuSumedang;
    }

    public String getTahuTakwa() {
        return tahuTakwa;
    }

    public void setTahuTakwa(String tahuTakwa) {
        this.tahuTakwa = tahuTakwa;
    }

    public asalTahu getAsal() {
        return asal;
    }

    public void setAsal(asalTahu asal) {
        this.asal = asal;
    }

    @Override
    public String toString() {
        return "jenisTahu{" +
                "tahuKuning='" + tahuKuning + '\'' +
                ", tahuSumedang='" + tahuSumedang + '\'' +
                ", tahuTakwa='" + tahuTakwa + '\'' +
                ", asal=" + asal +
                '}';
    }
}
