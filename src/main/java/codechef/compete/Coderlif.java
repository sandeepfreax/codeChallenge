package codechef.compete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Coderlif {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCases; i++){
            if(Arrays.stream(br.readLine().split("0")).filter(x -> x.trim().length() > 9).count() > 0){
                System.out.println("#coderlifematters");
            }else{
                System.out.println("#allcodersarefun");
            }
        }
    }
}
