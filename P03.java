// 12S23010-Tiffani Rumiris Br Butar-Butar
class P03 {
 import java.util.*;
import java.lang.Math;

public class P03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] deskripsiTugas = new String[10];
        String[] kodeMataKuliah = new String[10];
        String[] namaMataKuliah = new String[10];
        String[] pengampu = new String[10];
        String[] deadline = new String[10];
        String[] formatPenamaanTugas = new String[10];
        String[] status = new String[10];
        String[] rekomendasi = new String[10];
        double[] tingkatKesulitan = new double[10], hariHinggaDeadline = new double[10], prioritas = new double[10];
        int i;

        i = 0;
        for (i = 0; i <= 9; i++) {
            deskripsiTugas[i] = input.nextLine();
            if (deskripsiTugas[i].equals("---")) {
            } else {
                kodeMataKuliah[i] = input.nextLine();
                namaMataKuliah[i] = input.nextLine();
                pengampu[i] = input.nextLine();
                deadline[i] = input.nextLine();
                formatPenamaanTugas[i] = input.nextLine();
                tingkatKesulitan[i] = Double.parseDouble(input.nextLine());
                hariHinggaDeadline[i] = Double.parseDouble(input.nextLine());
                status[i] = input.nextLine();
            }
        }
        prioritas = tingkatKesulitan * (1.0 / hariHinggaDeadline);
        if (prioritas > 3) {
            rekomendasi = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                rekomendasi = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    rekomendasi = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("Prioritas: " + toFixed(prioritas,2));
        System.out.println(deskripsiTugas + "|" + kodeMataKuliah + "|" + namaMataKuliah + "|" + pengampu + "|" + deadline + "|" + formatPenamaanTugas + "|" + status + "|" + rekomendasi);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
   
}
