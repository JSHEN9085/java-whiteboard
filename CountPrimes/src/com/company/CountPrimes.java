package com.company;
//Count the number of prime numbers less than a non-negative number, n.
//Input: 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

//Time complexity is O(n log logN)
public class CountPrimes{
    public static int countPrimes(int n){
        boolean[] notPrime = new boolean[n]; //make the length of this array same as n
        int count = 0;

        for (int i = 2; i < n; i++){
            if(notPrime[i]){ //if the value at this index is true, jump to the next cycle;
                continue;
            }
            count++;
            for(int j = i; j < n; j = j+i){ // key step of this methods, logic is named as Eratosthenes, starting from 2, we set all the multiple of 2 as true, and then all multiple of 3,
                notPrime[j] = true;
            }
            //after setting all the multiple of 2 and 3, we already mark many integer as not prime in the boolean array, so we could
            //reduce the run time
            //every prime is not the multiple of low value prime, so for every low prime, we can mark their multiple as non-prime; 
        }
        return count;
    }

}





//Time complexity: O(n^2)
//public class CountPrimes {
//    public static int countPrimes(int n) {
//        if (n <= 2){
//            return 0;
//        }
//
//        int count = 0;
//        for (int i = 2; i < n; i++){
//            if(isPrime(i)){
//                System.out.println(i);
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private static boolean isPrime(int n){
//        for (int i = 2; i < n; i++){
//            if(n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//}
