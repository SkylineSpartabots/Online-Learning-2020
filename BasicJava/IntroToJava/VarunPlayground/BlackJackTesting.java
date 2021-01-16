package VarunPlayground;

import java.util.Random;
import java.util.Scanner;

public class BlackJackTesting {
    public static void main(String[] args) {
        String[] num = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suit = {"Spades", "Hearts", "Clubs", "Diamonds"};
        int[] add = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        Random rand = new Random();
        int totalP = 0;
        int totalC = 0;

        int rand1 = rand.nextInt(num.length);
        int rand2 = rand.nextInt(num.length);
        String numOut1 = num[rand1];
        String suitOut1 = suit[rand.nextInt(suit.length)];
        String numOut2 = num[rand2];
        String suitOut2 = suit[rand.nextInt(suit.length)];
        System.out.println("Your initial cards are: \n" + numOut1 + " of " + suitOut1 + "\n" + numOut2 + " of " + suitOut2);
        totalP += add[rand1];
        if(totalP > 10 && rand2 == 0){
            add[0] = 1;
        }
        totalP += add[rand2];
        System.out.println("\nYour total card value is: " + totalP);
        boolean less = true;
        boolean want = true;
        boolean exact = false;
        while(less && want && !exact){
            if(totalP > 10){
                add[0] = 1;
            }
            System.out.println("\nEnter \"y\" or \"yes\" if you want another card, \"n\" or \"no\" if you do not want another card");
            Scanner input = new Scanner(System.in);
            String readIn = input.nextLine();
            if(readIn.equals("y") || readIn.equals("yes")){
                int randX = rand.nextInt(num.length);
                System.out.println("\nYour next card is: " + num[randX] + " of " + suit[rand.nextInt(suit.length)]);
                totalP += add[randX];
                System.out.println("\nYour total card value is: " + totalP);
                if(totalP > 21 && add[rand1] == 11){
                    totalP -= 10;
                    add[rand1] = 1;
                }else if(totalP > 21 && add[rand2] == 11){
                    totalP -= 10;
                    add[rand2] = 1;
                }else if(totalP > 21 && add[randX] == 11){
                    totalP -= 10;
                    add[randX] = 1;
                }
            }else if(readIn.equals("n") || readIn.equals("no")){
                want = false;
                break;
            }else{
                System.out.println("\nInvalid input");
            }

            if(totalP > 21){
                less = false;
                break;
            }else if(totalP == 21){
                exact = true;
                break;
            }
        }
        boolean comp = true;
        int rand3 = rand.nextInt(num.length);
        int rand4 = rand.nextInt(num.length);
        String numOut3 = num[rand3];
        String suitOut3 = suit[rand.nextInt(suit.length)];
        String numOut4 = num[rand4];
        String suitOut4 = suit[rand.nextInt(suit.length)];
        if(!want){
            System.out.println("\nSince you did not want any more cards, your final value is: " + totalP + ". Now it's the computer's turn if it can gain a value higher.");
        }
        if(exact){
            System.out.println("\nCongrats! Your total value is 21, now it's the computer's turn to see if it can get to exactly 21 as well.");
        }
        if(!less){
            System.out.println("\nUnfortunately, you lost the game because your total value exceeded 21.");
            comp = false;
        }
        if(comp){
            boolean higher = false;
            boolean compExact = false;
            boolean compOver = false;
            System.out.println("\nThe computer's initial cards are: \n" + numOut3 + " of " + suitOut3 + "\n" + numOut4 + " of " + suitOut4);
            totalC += add[rand3];
            if(totalC > 10 && rand4 == 0){
                add[0] = 1;
            }
            totalC += add[rand4];
            System.out.println("\nThe computer's total value is: " + totalC);
            while(!higher && !compExact && !compOver){
                if(totalC > totalP){
                    higher = true;
                    break;
                }
                if(totalC > 10){
                    add[0] = 1;
                }
                int randY = rand.nextInt(num.length);
                System.out.println("\nThe computer's next card is: " + num[randY] + " of " + suit[rand.nextInt(suit.length)]);
                totalC += add[randY];
                System.out.println("\nThe computer's total value is: " + totalC);
                if(totalC > 21 && add[rand3] == 11){
                    totalC -= 10;
                    add[rand3] = 1;
                }else if(totalC > 21 && add[rand4] == 11){
                    totalC -= 10;
                    add[rand4] = 1;
                }else if(totalC > 21 && add[randY] == 11){
                    totalC -= 10;
                    add[randY] = 1;
                }
                if(totalC == 21){
                    compExact = true;
                    break;
                }else if(totalC > 21){
                    compOver = true;
                    break;
                }
            }
            if(exact && compExact){
                System.out.println("\nYou tied with the computer! Both of you got 21!");
            }
            if(compOver){
                System.out.println("\nCongrats! You won because the computer's value exceeded 21.");
            }
            if(higher){
                System.out.println("\nSorry you lost the game because the computer's value exceeded your value.");
            }
        }
    }
}
