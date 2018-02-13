package codechef.compete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Tcqf181a {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfTestCases = Integer.parseInt(br.readLine());
        for(int i = 0; i < noOfTestCases; i++){
            int noOfCards = Integer.parseInt(br.readLine());
            int[] cards1 = new int[noOfCards/2];
            int[] cards2 = new int[noOfCards/2];
            int card1Index = 0;
            int card2Index = 0;
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < noOfCards; j++){
                if(j % 2 == 0){
                    cards1[card1Index++] = Integer.parseInt(input[j]);
                }else{
                    cards2[card2Index++] = Integer.parseInt(input[j]);
                }
            }
            Arrays.stream(cards1).sorted();
            Arrays.stream(cards2).sorted();
            card1Index = 0;
            card2Index = 0;
            for(int j = 0; j < cards1.length; j++){
                if(cards1[j] > cards2[j]){
                    card1Index++;
                }else{
                    card2Index++;
                }
            }
            if(card1Index > card2Index){
                System.out.println("1");
            }else if(card2Index > card1Index){
                System.out.println("2");
            }else{
                System.out.println("draw");
            }
        }
    }
}