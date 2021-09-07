package GradingSystem;

import java.util.Scanner;

public class GradeS {
    public static void main(String[] args){
        int hitung, i;
        float totalNilai = 0, percentage, average;
        Scanner masuk;
        masuk = new Scanner(System.in);

        System.out.println("Masukkan Nomor Subjek Pelajaran : ");
        hitung = masuk.nextInt();

        System.out.println("Masukkan Nilai dari " + hitung + " Subjek Pelajaran");
        for(i = 0; i < hitung; i++){
            totalNilai += masuk.nextInt();
        }

        System.out.println("Total Nilai : " + totalNilai);
        percentage = (totalNilai / (hitung*100)) * 100;

        switch ((int) percentage / 10){
            case 9 :
                System.out.println("Grade : A+");
                break;
            case 8 :
            case 7 :
                System.out.println("Grade : A");
                break;
            case 6 :
                System.out.println("Grade : B");
                break;
            case 5 :
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }

    }
}
