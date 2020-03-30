package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String [] arr= str.split("");
        String result ="";
         for ( int i=0;i<arr.length;i++){
             if(indexToCapitalize==i){
                 arr[i]=arr[i].toUpperCase();
             }
             result+=arr[i];
         }


        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {


            return characterToCheckFor .equals(baseString.charAt(indexOfString));

    }

    public static String[] getAllSubStrings(String string) {
        String result ="";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
               result += string.substring(i,j) + ","; }


        }String[] res =result.split(",");
       res= Arrays.stream(res).distinct().toArray(String[]::new);

        return res;
    }

    public static Integer getNumberOfSubStrings(String input){
        return   getAllSubStrings(input).length;
    }
}
