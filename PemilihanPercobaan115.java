import java.util.Scanner;
public class PemilihanPercobaan115 {
public static void main(String[] args) {

Scanner input15 = new Scanner(System.in);
int angka;
System.out.print("Masukkan Angka:   ");
angka = input15.nextInt();

String hasil = (angka % 2 ==0) ? "Bilangan Genap" : "Bilangan Ganjil";
System.out.println(hasil);

input15.close();
}
}