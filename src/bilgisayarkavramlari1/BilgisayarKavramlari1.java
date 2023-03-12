/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari1;

import java.util.Scanner;

/**
 *
 * @author maytemur Java serisi 15-16-17ncı video -Java 16 - Kullanıcıdan sayı
 * okumak ve If else Part 2
 */
public class BilgisayarKavramlari1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lütfen notunuzu giriniz");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i >= 90) {
            System.out.println("Notunuz AA");
        } else if (i >= 80) {
            System.out.println("Notunuz BB");
        } else if (i >= 70) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Notunuz F");
        }
    }
}
