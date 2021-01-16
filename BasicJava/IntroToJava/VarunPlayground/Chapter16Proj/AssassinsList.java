package VarunPlayground.Chapter16Proj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AssassinsList extends NameLinkedList {
    private String[] graveyard = new String[0];
    public AssassinsList() {
        super();
    }
    public AssassinsList(NameNode header) {
        super(header);
    }
    public AssassinsList(File f) {
        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                super.addAtEnd(new NameNode(s));
                if(!sc.hasNextLine()) {
                    super.getIndex(super.size-1).next=super.header;
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Failed to find file");
        }
    }
    @Override
    public String toString() {
        NameNode copy = super.header;
            String ret_val = "[";
            ret_val += copy.data + ", ";
            copy = copy.next;
            while(copy != super.header) {
                ret_val += copy.data + ", ";
                copy = copy.next;
            }
            return ret_val.substring(0, ret_val.length()-2) + "]";
    }
    @Override
    public void addAtEnd(NameNode n) {
        if(size == 0) {
            header = n;
            header.next = header;
        } else {
            NameNode copy = header;
            copy = copy.next;
            while(copy.next != header) {
                copy = copy.next;
            }
            copy.next = n;
            n.next = super.header;
        }
        super.size++;
    }
    @Override
    public NameNode removeIndex(int index) {
        NameNode dead = super.removeIndex(index);
        graveyard = Arrays.copyOf(graveyard, graveyard.length+1);
        graveyard[graveyard.length-1] = dead.data;
        return dead;
    }
    public void printGraveyard() {
        System.out.println(Arrays.toString(graveyard));
    }
    @Override
    public NameNode removeName(String name) {
        NameNode copy = header;
        if(header.data.equals(name)) {
            return removeIndex(0);
        }
        while(copy.next != super.header) {
            if(copy.next.data.equals(name)) {
                NameNode n = copy.next;
                copy.next = copy.next.next;
                super.size--;
                return n;
            }
            copy = copy.next;
        }
        throw new NoSuchElementException();
    }
    
}
