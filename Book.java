/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek23042026;

/**
 *
 * @author dhiii
 */
public class Book {
    //the private instance variables
    private final String name;
    private final Author author;
    private double price;
    private int qty;
    
    /** Constructs a Book instance with the given author */
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public String toString(){
        return"'"+name+"'by"+author;
    }

    void getQty(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
