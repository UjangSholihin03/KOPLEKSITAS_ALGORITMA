import java.util.Scanner;

public class PangkatDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        double bilangan = input.nextDouble();
        
        double hasilPangkatDua = hitungPangkatDua(bilangan);
        
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah " + hasilPangkatDua);
    }
    
    public static double hitungPangkatDua(double x) {
        return x * x;
    }
}