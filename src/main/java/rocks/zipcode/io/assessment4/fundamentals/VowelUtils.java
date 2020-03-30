package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String [] vowel = word.split("");
        for (int i=0;i<vowel.length;i++){
            if (isVowel(word.charAt(i))){
                return true;

            }

        }
        return  false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String [] vowel = word.split("");
        for (int i=0;i<vowel.length;i++){
            if (isVowel(word.charAt(i))){
                return i;

            }
        }


        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if(isVowel(word.charAt(0))) {
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {

    if (character.toString().matches("[AaEeIiOoUu]")){
        return true;
    }
        return false;
    }
}
