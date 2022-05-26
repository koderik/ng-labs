
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hrli
 */
public class Spelet21 {

    static Kortlek lek = new Kortlek();
    static int poäng = 0;
    static int poäng2 = 0;
    static Kort[] spelarkort = new Kort[11];
    static int dpoäng = 0;
    static int dpoäng2 = 0;
    static Kort[] dealerkort = new Kort[11];
    static int count = 0;
    static int countD = 0;
    static boolean fortsätt = true;

    public static void main(String[] args) {

        lek.blanda();
        
        playerStart();
        dealerStart();
        playerPlay();
        dealerPlay();

        if (poäng2 > poäng && poäng2 < 22) {
            poäng = poäng2;
        }
        System.out.println("Du fick " + poäng + " poäng");
        if (dpoäng2 > dpoäng && dpoäng2 < 22) {
            dpoäng = dpoäng2;
        }
        System.out.println("Dealer fick " + dpoäng + " poäng");
        if (poäng == dpoäng) {
            System.out.println("Dealer vann");
        }
        else if (poäng>dpoäng && poäng <= 21) {
            System.out.println("Du vann");
        }
        else if(poäng<=21 && dpoäng>21){
            System.out.println("Dealer vann");
        }
        else
            System.out.println("Dealern vann");

    }

    private static void dealerStart() {
        for (int a = 0; a < 2; a++) {
            Kort k = lek.geKort();
            dealerkort[countD] = k;
            countD++;
            

            if (k.getValör() > 1 && k.getValör() < 11) {
                dpoäng += k.getValör();
                dpoäng2 += k.getValör();
            }
            if (k.getValör() > 10) {
                dpoäng += 10;
                dpoäng2 += 10;
            }
            if (k.getValör() == 1) {
                dpoäng += 1;
                dpoäng2 += 11;
            }
            if (dpoäng2 == 21 || dpoäng == 21) {
                System.out.println("Dealer fick 21");

            }
        }System.out.println("Dealer fick " + dealerkort[0]);

    }
    private static void dealerPlay(){
        while (dpoäng<=17) {
            if (dpoäng2 == 21 || dpoäng == 21) {
                    
                    fortsätt = false;
                    break;
                }

                Kort k = lek.geKort();
                dealerkort[countD] = k;
                countD++;
                

                if (k.getValör() > 1 && k.getValör() < 11) {
                    dpoäng += k.getValör();
                    dpoäng2 += k.getValör();
                }
                if (k.getValör() > 10) {
                    dpoäng += 10;
                    dpoäng2 += 10;
                }
                if (k.getValör() == 1) {
                    dpoäng += 1;
                    dpoäng2 += 11;
                }

                

                if (dpoäng >= 22) {
                    
                    fortsätt = false;
                    break;
                }

            }

        }
    
    private static void playerPlay() {
        Scanner in = new Scanner(System.in);
        while (fortsätt) {
            if (poäng < 22 || poäng2 < 22) {
                System.out.print("Du har ");
                for (int s = count - 1; s >= 0; s--) {
                    if (s == 0) {
                        System.out.print(spelarkort[s] + " ");
                    } else {
                        System.out.print(spelarkort[s] + ", ");
                    }

                }
                if (poäng2 == 21 || poäng == 21) {
                    System.out.println("Du fick 21");
                    fortsätt = false;
                    break;
                }
                System.out.println(poäng + " " + poäng2);
                System.out.println("Vill du ha ett till kort?");
                String val = in.next();
                if (val.equalsIgnoreCase("nej")) {
                    fortsätt = false;
                    break;

                }

                Kort k = lek.geKort();
                spelarkort[count] = k;
                count++;
                System.out.println("Du fick " + k);

                if (k.getValör() > 1 && k.getValör() < 11) {
                    poäng += k.getValör();
                    poäng2 += k.getValör();
                }
                if (k.getValör() > 10) {
                    poäng += 10;
                    poäng2 += 10;
                }
                if (k.getValör() == 1) {
                    poäng += 1;
                    poäng2 += 11;
                }

                

                if (poäng >= 22) {
                    System.out.println("Du blev tjock");
                    fortsätt = false;
                    break;
                }

            }

        }
    }

    private static void playerStart() {
        for (int i = 0; i < 2; i++) {
            Kort k = lek.geKort();
            spelarkort[count] = k;
            count++;
            System.out.println("Du fick " + k);

            if (k.getValör() > 1 && k.getValör() < 11) {
                poäng += k.getValör();
                poäng2 += k.getValör();
            }
            if (k.getValör() > 10) {
                poäng += 10;
                poäng2 += 10;
            }
            if (k.getValör() == 1) {
                poäng += 1;
                poäng2 += 11;
            }
            if (poäng2 == 21 || poäng == 21) {
                System.out.println("Du fick 21");
                break;
            }
        }
    }
}
