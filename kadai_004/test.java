package problem8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class test {

    public static void main(String[] args) {

        String data_str = "あいうえおかきくけこ";
        int strLen = dataLen(data_str);
        String strResult = String.format("長さは%dです", strLen);
        System.out.println(strResult);
        Function<String,Integer> func = 

        
    }

    public static List<Object> dataLen(String str) {
        int len = str.length();
        len = len + 10;
        System.out.println(len);

        List<String> list = new ArrayList<>();
        return list;
    }

}
