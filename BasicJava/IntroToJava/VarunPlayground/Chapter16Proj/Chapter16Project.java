package VarunPlayground.Chapter16Proj;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

import VarunPlayground.Chapter16Proj.NameLinkedList.NameNode;

public class Chapter16Project {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\shrav\\Desktop\\NamesList.txt");
        AssassinsList a = new AssassinsList(f);
        System.out.println(a.toString());
        while(a.size != 1) {
            System.out.println("Who has been killed?");
            try {
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();
                a.removeName(name);
                System.out.println(a.toString());
            } catch (InputMismatchException ime) {
                System.out.println("Please give valid name");
            }
        }
        System.out.println(a.header.data + " is the winner!");
    }
}
