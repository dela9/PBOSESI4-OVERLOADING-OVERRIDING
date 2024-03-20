class Bentuk {
    public void gambar() {
        System.out.println("Menggambar sebuah bentuk");
    }
}

class Lingkaran extends Bentuk {
    // Overriding metode gambar dalam subclass Lingkaran
    public void gambar() {
        System.out.println("Menggambar sebuah lingkaran");
    }

    // Metode overload gambar dengan parameter tambahan dalam subclass Lingkaran
    public void gambar(int radius) {
        System.out.println("Menggambar sebuah lingkaran dengan jari-jari " + radius);
    }
}

public class Utama {
    public static void main(String[] args) {
        Bentuk bentuk = new Bentuk();
        Bentuk lingkaran1 = new Lingkaran();
        Lingkaran lingkaran2 = new Lingkaran();

        bentuk.gambar();         
        lingkaran1.gambar();       
        lingkaran2.gambar(5);     
    }
}

