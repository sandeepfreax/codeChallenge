package hackerearth.practise.compete;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PermutationAndCombination {

    public int solution(int N) {
        long result = 0L;
        String str = N + "";
        List<String> list = Arrays.stream(str.split("")).filter(x -> !x.equals("0")).sorted().collect(Collectors.toList());
        Map<String, Integer> valMap = new HashMap<String, Integer>();
        list.forEach(x -> {
            if(valMap.containsKey(x)){
                int value = valMap.get(x);
                valMap.put(x, value+1);
            }else {
                valMap.put(x, 1);
            }
        });
        long num = getFactorialValue(list.size());
        long den = valMap.values().stream().mapToLong(x -> getFactorialValue(x)).reduce(1, (x, y) -> x*y);
        return (int)(num/den);
    }

    private long getFactorialValue(int N) {
        long product = 1;
        for(int i = 1; i <= N; i++)
            product *= i;
        return product;
    }


    public static void main(String[] st) {
        (new PermutationAndCombination()).solution(1213);
    }
}
