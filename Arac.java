public class Arac {
    String marka;
    String model;
    double gunlukUcret;
    boolean kiradaMi;

    public Arac(String marka, String model, double gunlukUcret, boolean kiradaMi) {
        // 4 alanı this.alan = parametre şeklinde ata
    }

    void bilgileriGoster() {
        // marka, model, ücreti yazdır
        // kiradaMi true ise "Kirada", false ise "Müsait" yazdır
    }

    void kirala() {
        // kiradaMi false ise: mesaj yaz, kiradaMi = true
        // değilse: "zaten kirada" mesajı yaz
    }

    void teslimEt() {
        // kirala()'nın tam tersi
    }

    double kiraBedeliHesapla(int gun) {
        // gunlukUcret * gun döndür
        return 0;
    }
}
