package Praktikum2;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika m1 = new Matematika();
        int HasilPertambahan = m1.pertambahan(20,10);
        int HasilPengurangan = m1.pengurangan(10,5);
        int HasilPerkalian = m1.perkalian(10,3);
        int HasilPembagian = m1.pembagian(21,2);
        
        System.out.println("Pertambahan 20 + 10 = "+ HasilPertambahan);
        System.out.println("Pengurangan 10 - 5 = "+ HasilPengurangan);
        System.out.println("Perkalian 10 * 3 = "+ HasilPerkalian);
        System.out.println("Pembagian 21 / 2 = "+ HasilPembagian);
    }
    
}
