/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek23042026;

/**
 *
 * @author dhiii
 */
public class MainBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author Rin = new Author("Rudhi Mulya Putra", "rudhi@gmail.com",'m');
        System.out.println(Rin);
        
        Book dummyBook = new Book("Algoritma dan pemograman", Rin, 9800, 99);
        System.out.println(dummyBook);
        
        dummyBook.setPrice(120000);
        dummyBook.getQty(88);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author's is: " + dummyBook.getAuthor());
        System.out.println("author's name is: " + dummyBook.getAuthor().getEmail());
        System.out.println("author's email is: " + dummyBook.getAuthor().getGender());
        
        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee", "peter@nowhere.com",'m'),19.99, 8);
        System.out.println(moreDummyBook);
        
    }
    
}
