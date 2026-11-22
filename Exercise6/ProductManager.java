public class ProductManager {

    public void urunBilgileriniGoster(Product product) {
        System.out.println("Ürün: " + product.getName());
        System.out.println("Fiyat: " + product.getPrice());
        System.out.println("Stok: " + product.getStock());
        System.out.println("------------------------");
    }

    public void satisYap(Product product, int adet) {
        if (adet > 0) {
            if (product.getStock() >= adet) {
                int yeniStok = product.getStock() - adet;
                product.setStock(yeniStok);
                System.out.println(adet + " adet " + product.getName() + " satıldı.");
            } else {
                System.out.println("Yetersiz stok!");
            }
        } else {
            System.out.println("Hata: Adet 0'dan büyük olmalıdır!");
        }
    }

    public void stokEkle(Product product, int adet) {
        if (adet > 0) {
            int yeniStok = product.getStock() + adet;
            product.setStock(yeniStok);
            System.out.println(adet + " adet " + product.getName() + " stoka eklendi.");
            System.out.println("Güncel stok: " + product.getStock());
        } else {
            System.out.println("Hata: Adet 0'dan büyük olmalıdır!");
        }
    }
}
