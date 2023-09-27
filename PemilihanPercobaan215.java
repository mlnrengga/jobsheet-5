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

if (total > 80 && total <= 100) {
    System.out.println( "Nilai Anda Adalah A");
} else if (total > 73 && total <= 80) {
    System.out.println( "Nilai Anda Adalah B+");  
} else if (total > 65 && total <= 73) {
    System.out.println( "Nilai Anda Adalah B");
} else if (total > 60 && total <= 65) {
    System.out.println( "Nilai Anda Adalah C+");
} else if (total > 50 && total <= 60) {
    System.out.println( "Nilai Anda Adalah C");
} else if (total > 39 && total <= 50) {
    System.out.println( "Nilai Anda Adalah D");
} else if (total <= 39) {
    System.out.println( "Nilai Anda Adalah E");
}


input15.close();
}   
}
