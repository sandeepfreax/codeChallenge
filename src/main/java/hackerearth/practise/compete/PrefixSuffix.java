package hackerearth.practise.compete;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSuffix {
    public int solution(String s) {
        int result = 1;
        List<String> prefix = new ArrayList<String>();
        List<String> suffix = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++){
            prefix.add(s.substring(0, i));
        }
        for(int i = s.length() -1; i > 0; i--){
            suffix.add(s.substring(i, s.length()));
        }
        List<String> common = prefix.stream().filter(suffix::contains).collect(Collectors.toList());
        if(common.size() > 0){
            result = common.stream().max(Comparator.comparingInt(String::length)).get().length();
        }
        return result;
    }

    public static void main(String st[]) {
        (new PrefixSuffix()).solution("codility");
    }
}
