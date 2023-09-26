import java.util.Scanner;
public class PemilihanPercobaan215 {
public static void main(String[] args) {
    Scanner input15 = new Scanner(System.in);
System.out.print("Nilai UAS     :");
float uas = input15.nextFloat();
System.out.print("Nilai UTS     :");
float uts = input15.nextFloat();
System.out.print("Nilai Quiz    :");
float quiz = input15.nextFloat();
System.out.print("Nilai Tugas   :");
float tugas = input15.nextFloat();

float total = (uas*0.4F)+(uts*0.3F)+(quiz*0.1F)+(tugas*0.2F);
String message = total < 65 ? "Remidi" : "Tidak Remidi";
System.out.println("Nilai Akhir = " + total + " Sehingga " + message);
input15.close();
}   
}
