package Algorism;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public String Solution(String str) {

        String[] result = new String[str.length()];

        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");

        for (int i = 0; i < str.length(); i++) {
            Matcher matcher = pattern.matcher(str.substring(i, i+1));
            if(matcher.find() == true) {
                result[str.length()-i-1] = str.substring(i, i+1);
            }
            else{
                result[i] = str.substring(i, i+1);
            }
        }

        String arrayToString = Arrays.toString(result);
        System.out.println(arrayToString);
        return  arrayToString;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner s = new Scanner(System.in);
        String str = s.next(); // 문자열은 그냥 next하면 되는것같음
        T.Solution(str);
    }
}
