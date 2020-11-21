package pboif2.pkg10119052.latihan63.gradiengarislurus;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * tipe data Integer
 * 
 */
public class PBOIF210119052Latihan63GradienGarisLurus {

    public static void main(String[] args) {
       Koordinat koordinat1=new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik "
        + "("+koordinat1.getX1()+","+koordinat1.getY1()+") dan "
        + "("+koordinat1.getX2()+","+koordinat1.getY2()+")");
        System.out.println("memiliki gradien sebesar "+koordinat1.hitungGradien());
        
        Koordinat koordinat2=new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik "
        + "("+koordinat2.getX1()+","+koordinat2.getY1()+") dan "
                        + "("+koordinat2.getX2()+","+koordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar "+koordinat2.hitungGradien()); 
    }
    
}
