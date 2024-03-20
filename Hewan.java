class Hewan {
    
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
   
    public void bersuara() {
        System.out.println("Kucing bersuara miaw miaw");
    }
}

public class Utama {
    public static void main(String[] args) {
        Hewan = new Hewan();
        Hewan Kucing = new Kucing();

        Hewan.bersuara(); // Memanggil metode bersuara dari Hewan
        Kucing.bersuara();    // Memanggil metode bersuara yang dioverride dari Kucing
    }
}


