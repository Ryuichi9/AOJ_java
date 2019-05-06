/**
 * AOJ 0513 Shuffle The Cards
 */

import java.util.Scanner;

public class ShuffleTheCards{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        //デッキ枚数読み込み
        int n = scn.nextInt();
        //デッキ作成
        int[] deck = makeDeck(n);

        //試行回数読み込み
        int m = scn.nextInt();

        for(int i = 0;i<m;i++){
            int k = scn.nextInt();
            if(k == 0){
                deck = riffleShuffle(deck, n);
            }
            else{
                  deck = shuffleK(deck, k);
            }
        }
        for(int j = 0;j<n*2;j++){
            System.out.println(deck[j]);
        }

    }
    //デッキ作成関数
    public static int[] makeDeck(int n){
        int[] deck = new int[n*2];
        for(int i = 0; i < n * 2;i++){
            deck[i] = i+1;
        }
        return deck;
    }

    //Shuffle k
    public static int[] shuffleK(int[] deck,int k){
        int[] A = new int[k];
        int[] B = new int[deck.length-k];

        for(int i = 0;i<k;i++){
            A[i] = deck[i];
        }
        for(int j = k;j<deck.length;j++){
            B[j-k] = deck[j];
        }

        int[] shuffledDeck = new int[deck.length];

        for(int l = 0;l<B.length;l++){
            shuffledDeck[l] = B[l];
        }
        for(int m = 0;m<A.length;m++){
            shuffledDeck[B.length + m] = A[m];
        }

        return shuffledDeck;
    }

    //Riffle Shuffle
    public static int[] riffleShuffle(int[] deck,int n){
        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0;i<n;i++){
            A[i] = deck[i];
        }
        for(int j = n; j < 2 * n;j++){
            B[j-n] = deck[j];
        }

        int[] shuffledDeck = new int[deck.length];

        for(int l = 0;l < n;l++){
            shuffledDeck[2*l]= A[l];
            shuffledDeck[2*l+1]= B[l];
        }

        return shuffledDeck;
    }
}