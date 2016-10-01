
/**
 * Created by kho on 1.10.2016.
 */
public class Materjal {
    public static void main(String[] args) {
        int vanus=25; //See on integer. Integer on taisarvuline number.
        System.out.println("Minu vanus on " + vanus);

        String lause = "Minu vanus on ";
        System.out.println(lause + vanus); //Teine voimalus liita lause ja number

        String Lause1 = "Mina olen ";
        String Lause2 = "Kerli";
        String Tervelause = Jutt(Lause1, Lause2);

        System.out.println(Tervelause);
        System.out.println(Tekst(3, "Manni", "neljavarviline"));
        System.out.println(Tekst(24, "Joonas", "valge"));
        System.out.println("Keskmine on " + Keskmine(6, 8, 12, 4, 9, 300)); //Keskmine on k2sunimi
    }

    public static String Jutt (String a, String b){
        String Lause =  a+b;
        return Lause; // Vastus mille meetod tagastab. Lihtsustatuna voib kasutada return a+b.

    }

    public static String Tekst(int vanus, String nimi, String varv){
        return "Meie kodus elab " + nimi +". Ta on " + vanus + " aastat vana. Ta on " + varv + ".";

    }
    public static double Keskmine(int a, int b, int c, int d, int e, int f){
        double summa = a+b+c+d+e+f;
        double keskarv = summa/6;
        return keskarv;

    }
}
