package GradingSystem;

import java.util.Scanner;

public class GradeP {

    public static void main(String[] args){
        int hit, i;
        float totalNilai = 0, percentage;
        Scanner Masuk;
        Masuk = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Subjek Pelajaran : ");
        hit = Masuk.nextInt();

        System.out.println("Masukkan Nilai dari "+ hit + "Subjek Pelajaran");
        for(i = 0; i < hit; i++){
            totalNilai += Masuk.nextInt();
        }
        System.out.println("Total Nilai : " + totalNilai);
        percentage = (totalNilai / (hit*100)) * 100;

        switch ((int) percentage / 10){
            case 9 :
                System.out.println("Grade : A+ ");
                break;
            
            case 8 :
                System.out.println("Grade : A");
                break;
            
            case 7 :
                System.out.println("Grade : B+");
                break;
            
            case 6 :
                System.out.println("Grade : B");
                break;
            
            case 5 :
                System.out.println("Grade : C");
                break;
            
            case 4 :
                System.out.println("Grade : C-");
                break;
            default :
                System.out.println("Grade : D");
                break;
        }
    }
    
}
