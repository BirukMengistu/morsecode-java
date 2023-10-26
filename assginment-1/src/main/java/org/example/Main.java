package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to convert to Morse code: ");
        String text = scanner.nextLine();

        MorseCode morseCode = new MorseCode();
        String convertedText = morseCode.textToMorseCode(text);

        System.out.println("Text: " + text);
        System.out.println("Morse Code: " + convertedText);
        scanner.close();
    }


}