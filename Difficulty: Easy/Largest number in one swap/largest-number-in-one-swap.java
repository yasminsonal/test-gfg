class Solution {
    public String largestSwap(String s) {
        // code here
         char[] numChar = s.toCharArray();
        int n = numChar.length;
        int[] lastIndexOfDigits = new int[10];
        for (int i=0; i<10; i++) {
            lastIndexOfDigits[i] = -1;
        }
        for (int i=0; i<n; i++) {
            lastIndexOfDigits[numChar[i]-'0'] = i;
        }
        for (int i=0; i<n; i++) {
            int currentDigit = numChar[i]-'0';
            int possibleSwapIndex = -1;
            for (int j=currentDigit+1; j<10; j++) {
                if (lastIndexOfDigits[j] > i) {
                    possibleSwapIndex = lastIndexOfDigits[j];
                }
            }
            if (possibleSwapIndex != -1) {
                char temp = numChar[i];
                numChar[i] = numChar[possibleSwapIndex];
                numChar[possibleSwapIndex] = temp;
                break;
            }
        }
        return String.valueOf(numChar);
    }
}