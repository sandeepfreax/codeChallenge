package techgig.practise.compete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNoInArray {
    public static void main(String[] st) {
        getCombination(20).keySet().forEach(x -> System.out.println(x));
    }

    private static boolean getPrimeList(List<Integer> list, int pivot) {
        boolean isFlag = true;

        return isFlag;
    }

    private static Map<Integer, Integer> getCombination(int num){
        List<Integer> list = getPrimeNo(num);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); i++){
            int x = list.get(i);
            for(int j = 0; j < list.size(); j++){
                int y = list.get(j);
                if(x + y == num){
                    map.put(x, y);
                }
            }
        }
        return map;
    }

    private static boolean isListPrime(List<Integer> list) {
        return list.stream().filter(PrimeNoInArray::isNonPrime).collect(Collectors.toList()).size() > 0;
    }

    private static List<Integer> getPrimeNo(int num) {
        return IntStream.rangeClosed(2, num).filter(PrimeNoInArray::isPrime).boxed().collect(Collectors.toList());
    }

    private static boolean isNonPrime(int num) {
        return !isPrime(num);
    }

    private static boolean isPrime(int num) {
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
