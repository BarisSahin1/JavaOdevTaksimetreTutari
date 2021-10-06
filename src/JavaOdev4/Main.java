package JavaOdev4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float kilometre,ucret;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Merhaba, taksimetre sistemimize hosgeldiniz.");
        System.out.println("Lutfen gitmek istediginiz mesafeyi yaziniz.");

        kilometre = scanner.nextFloat();

        System.out.println("Taksimetre acilis ucretimiz 10 TL olup minimum ucretimiz 20 TL dir.");

        ucret = (10.0f + kilometre * 2.20f);

        if(ucret < 20 ){
            ucret = 20;
            System.out.println("Minimum ucret kapsamindasiniz ucretiniz :" + ucret);
        }


        System.out.println("Ucretiniz :" + ucret);


    }
}
