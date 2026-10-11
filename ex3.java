public class ex3 {

    public static void main(String[] args) {

        int mesafe = 0;
        double toplamGelir = 0;

        for (int i = 1; i <= 10; i++) {

            mesafe = mesafe + 5;
            double ucret = 0;

            if (mesafe <= 10) {
                ucret = 50;
            } else if (mesafe >= 11 && mesafe <= 30) {
                ucret = 80;
            } else if (mesafe > 30) {
                ucret = 120;
            }

            if (i % 3 == 0) {
                ucret = ucret + 20;
            }

            if (mesafe >= 40) {
                double indirim = ucret * 10 / 100;
                ucret = ucret - indirim;
            }

            toplamGelir = toplamGelir + ucret;

            System.out.println(i + ". Teslimat - Mesafe: " + mesafe + " km - Ücret: " + ucret + " TL");
        }

        System.out.println("Toplam Gelir: " + toplamGelir + " TL");
    }
}
