import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String str=s.substring(0,2);
        String time=s.substring(s.length()-2,s.length());
        StringBuilder sb=new StringBuilder();
        int h=Integer.valueOf(str);
        if(h<12 && time.contains("PM"))
        {
            sb.append(h+12).append(":");
        }
        else if(h==12 && time.contains("AM"))
        {
            sb.append("00:");
        }
        else{
            return s.substring(0,s.length()-2);
        }
        return sb.append(s.substring(3,s.length()-2)).toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
