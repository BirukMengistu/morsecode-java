package org.example;
import java.util.HashMap;
import java.util.Scanner;

class MorseCode {
    private HashMap<Character, String> morseCodeMap;

    public MorseCode() {
        morseCodeMap = new HashMap<>();
        morseCodeMap.put('a', ".-");
        morseCodeMap.put('b', "-...");
        morseCodeMap.put('c',  "-.-");
        morseCodeMap.put('d',  "-..");
        morseCodeMap.put('e',    ".");
        morseCodeMap.put('f', "..-.");
        morseCodeMap.put('g',  "--.");
        morseCodeMap.put('h', "....");
        morseCodeMap.put('i',   "..");
        morseCodeMap.put('j', ".---");
        morseCodeMap.put('k',   "-.");
        morseCodeMap.put('l', ".-..");
        morseCodeMap.put('m',   "--");
        morseCodeMap.put('n',   "-.");
        morseCodeMap.put('o',  "---");
        morseCodeMap.put('p', ".--.");
        morseCodeMap.put('q', "--.-");
        morseCodeMap.put('r', ".-.");
        morseCodeMap.put('s',  "...");
        morseCodeMap.put('t',   "-");
        morseCodeMap.put('u',  "..-");
        morseCodeMap.put('v', "...-");
        morseCodeMap.put('w',  ".--");
        morseCodeMap.put('x', "-..-");
        morseCodeMap.put('y', "-.--");
        morseCodeMap.put('z', "--..");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2',"..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
        // Add the rest of the Morse code mappings...
    }
    String result= "";
    public String textToMorseCode(String input) {

         char[] text = input.toLowerCase().toCharArray();
        System.out.print(text);
        for (char currentChar : text) {
            if (morseCodeMap.containsKey(currentChar)) {
               result =result.concat(morseCodeMap.get(currentChar));
            } else if (currentChar == ' ') {
                result =result.concat(" ");
            }
        }

        return result;
    }


}
