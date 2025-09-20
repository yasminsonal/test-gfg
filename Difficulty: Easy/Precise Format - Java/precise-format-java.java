class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        
        ArrayList<Float>list = new ArrayList<>();
        list.add(a/b);
        float rounded=(float)Math.round(a/b*1000)/1000;
        list.add(rounded);
        return list;
 



    }
}