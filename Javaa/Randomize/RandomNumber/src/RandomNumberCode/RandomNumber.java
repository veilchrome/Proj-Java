package RandomNumber;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

    /*
    **
    @owner veilchrome
    ****
    */

    public static void main(String[] args){
        Random angkaRandom = new Random();
        Scanner input = new Scanner(System.in);

        boolean jawaban = true;
        while(jawaban){
            int hasilAngka = 1+angkaRandom.nextInt(9);
            char hasilAlphabet = (char) (angkaRandom.nextInt(16)+'A');
            System.out.println(" Angka ========= Alphabet");
            System.out.println("===================================================");
            System.out.println(" == "+hasilAngka+" ========== "+hasilAlphabet+" == ");
            System.out.println("===================================================");
            System.out.println("--------------------------");
            System.out.println("|Mau Acak Bilangan lagi ?  |");
            System.out.println("|Ketik 'T'       = berhenti|");
            System.out.println("|Ketik Sembarang = lanjut  |");
            System.out.println("--------------------------");
            System.out.println(">>");
            String answer = input.next();
            if("T".equals(answer) || "t".equals(answer)){
                answer = "false";
                jawaban = Boolean.valueOf(answer);
            }
            System.out.println("\n\n");
        }
    }
}
