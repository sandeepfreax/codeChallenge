package hackerearth.practise.compete;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class PrimeSortNonPrimeSort {
    public static void main(String[] st){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] arr = new Long[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        List<Long> list = Arrays.asList(arr);
        List<Long> primeInt = list.stream().filter(x -> isPrime(x) && x >1).sorted().collect(Collectors.toList());
        List<Long> nonPrimeInt = list.stream().filter(x -> !isPrime(x)).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        primeInt.addAll(nonPrimeInt);
        if(list.contains(1L)){
            primeInt.add(1L);
        }
        String str = primeInt.stream().map(x -> x.toString()).collect(Collectors.joining(" "));
        System.out.println(str);
    }

    private static boolean isPrime(long num) {
        return !LongStream.rangeClosed(2, num/2).anyMatch(i -> num % i == 0);
    }
}
