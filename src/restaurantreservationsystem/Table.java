/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreservationsystem;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Table {
    private int NumperOfSeats;
    private int NumperOfTable;
    private boolean Empty;
    private boolean Smoking;
//constructor
    public Table(int NumperOfSeats, boolean Smoking) {
        this.NumperOfSeats = NumperOfSeats;
        this.Empty = true;
        this.Smoking = Smoking;
        
    }

    public boolean isSmoking() {
        return Smoking;
    }

    public void setSmoking(boolean Smoking) {
        this.Smoking = Smoking;
    }

    public int getNumperOfSeats() {
        return NumperOfSeats;
    }

    public void setNumperOfSeats(int NumperOfSeats) {
        this.NumperOfSeats = NumperOfSeats;
    }

    public int getNumperOfTable() {
        return NumperOfTable;
    }

    public void setNumperOfTable(int NumperOfTable) {
        this.NumperOfTable = NumperOfTable;
    }

    public boolean isEmpty() {
        return Empty;
    }

    public void setEmpty(boolean Empty) {
        this.Empty = Empty;
    }
    public Table SelectTable(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numper of seats");
        int a= sc.nextInt();
        System.out.println("enter true if it in smoking area and false if it is not");
        boolean b= sc.nextBoolean();
        Table c = new Table(a,b);
      
        
    return c;}
    

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
    }*/
    
}
