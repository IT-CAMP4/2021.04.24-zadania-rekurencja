package pl.camp.it;

public class Word {
    public static void main(String[] args) {
        String word = "janusz";
        String result = reverseWord2(word);

        System.out.println("Słowo: " + word);
        System.out.println("Wynik: " + result);
    }

    public static String reverseWord(String word) {
        if(word.length() == 1) {
            return word;
        }
        return word.charAt(word.length()-1) + reverseWord(word.substring(0, word.length()-1));
    }

    public static String reverseWord2(String word) {
        String resultPart = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            resultPart = resultPart + word.charAt(i);
        }
        return resultPart;
    }
}
