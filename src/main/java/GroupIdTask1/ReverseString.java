package GroupIdTask1;

/**
 * Created by sgrostad on 21/06/2017.
 */
public class ReverseString {
    static public String reverse(String text){
        char[] textChr = text.toCharArray();
        StringBuilder retString = new StringBuilder();
        for(int i = textChr.length-1; i>=0; i--) {
            retString.append(textChr[i]);
        }
        return retString.toString();
        // let's comment on another file
    }
}
