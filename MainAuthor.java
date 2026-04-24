/*
 * Nama : Rudhi Mulya Putra
 * NIM  : 2501083003
 */
package com.mycompany.praktek23042026;

/**
 *
 * @author dhiii
 */
public class MainAuthor {
    public static void main(String[] args) {
        Author Rin =  new Author("Rudhi Mulya Putra","rudhi@gmail.com",'m');
        System.out.println(Rin);

        Rin.setEmail("rudhi@gmail.com");
        System.out.println(Rin);
        System.out.println("name is: " + Rin.getName());
        System.out.println("gender is: " + Rin.getGender());
        System.out.println("gmail is: " + Rin.getEmail());
    }
    
}
