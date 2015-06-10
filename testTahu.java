package tugas;

/**
 * Created by bima on 6/10/2015.
 */
public class testTahu {

    public static void main(String[] args) {

        asalTahu tahu = new asalTahu("Kediri",20000.0);
        System.out.println(tahu.toString());
        jenisTahu Kuning = new jenisTahu("Tahu Kediri","Tahu Sumedang","Tahu Kediri",tahu);
        System.out.println(Kuning.toString());
    }
}
