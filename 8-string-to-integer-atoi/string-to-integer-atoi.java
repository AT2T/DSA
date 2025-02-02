class Solution {
    public int myAtoi(String s) {
    	int sign = 1;
    	Stack<Integer> stack = new Stack<>();
    	for(int i = 0; i < s.length(); i++) {
    		char ch = s.charAt(i);
    		if(stack.isEmpty() && (ch == '-')) {
    			sign = -1;
    			stack.push(0);
    		}
            else if(stack.isEmpty() && (ch == '+'))
            {
                stack.push(0);
            }
    		else if(stack.isEmpty() && ch == ' ') {
    			continue;
    		}
    		else if(ch >= '0' && ch <= '9') {
    			stack.push(ch-'0');
    		}
    		else {
    			break;
    		}
    	}
    	
    	int length = stack.size();
        long result = 0;
    	for(Integer i : stack)
        {
            result = result * 10 + i;
            if(result > Integer.MAX_VALUE)
            {
                if(sign == 1)
                {
                   return Integer.MAX_VALUE;
                }
                return Integer.MIN_VALUE;
            }
        }
        return (int)(result * sign);
    }
}