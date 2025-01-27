class Solution {
    public int maxDepth(String s) {
        int count=0,max=0;
        for(char i:s.toCharArray()){
            if(i=='(') count++;
            max=Math.max(max,count);
            if(i==')') count--;
        }
        return max;
    }
}