class Penjumlahan {
    // Metode overload untuk menjumlahkan dua bilangan bulat
    public int jumlah(int a, int b) {
        return a + b;
    }

    // Metode overload untuk menjumlahkan dua bilangan pecahan
    public double jumlah(double a, double b) {
        return a + b;
    }
}

public class Utama {
    public static void main(String[] args) {
        Penjumlahan penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan dua bilangan bulat: " + penjumlahan.jumlah(5, 7));
        System.out.println("Penjumlahan dua bilangan pecahan: " + penjumlahan.jumlah(3.5, 6.2));
    }
}

