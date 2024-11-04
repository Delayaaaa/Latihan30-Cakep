/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programtunjangan;

/**
 * NAMA  : DELA MELATI PUSPA
 * PRODI : SISTEM INFORMASI
 * NIM   : 23176038
 * Deskripsi Program : Program ini menampilkan sebuah pertanyaan yang harus dijawab.
 */
import java.util.Scanner;

public class Cakep {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String CYAN = "\033[36m";

    public static void main(String[] args) {
        // Menampilkan pertanyaan
        try (Scanner input = new Scanner(System.in)) {
            // Menampilkan pertanyaan
            System.out.print(RED + "Kamu " + GREEN + "ngerjain sendiri " + YELLOW + "latihan 17 " + BLUE + "sampe " + CYAN + "latihan 30 ini? \n" + RESET);
            System.out.print("Jawab " + CYAN + "(Yoi/Enggak) : " + RESET);
            String jawaban = input.nextLine().toLowerCase();
            
            // Memeriksa jawaban dan menampilkan respon
            switch (jawaban) {
                case "yoi" -> {
                    System.out.println(BLUE + "Cakep Bener." + RESET);
                    System.out.println(GREEN + "Good Job" + RESET);
                }
                case "enggak" -> {
                    System.out.println(RED + "Tetep cakep sih." + RESET);
                    System.out.println(CYAN + "Sing penting paham konsep nya yee." + RESET);
                    System.out.println("Keep the code works dude");
                }
                default -> System.out.println(RED + "Jawaban tidak valid." + RESET);
            }
        }
    }
}
