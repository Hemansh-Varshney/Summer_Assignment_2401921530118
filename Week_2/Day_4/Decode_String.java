class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> nums = new Stack<>();

        String ans = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                nums.push(num);
                st.push(ans);

                ans = "";
                num = 0;
            } 
            else if (ch == ']') {
                int count = nums.pop();
                String prev = st.pop();

                String temp = "";

                while (count-- > 0) {
                    temp += ans;
                }

                ans = prev + temp;
            } 
            else {
                ans += ch;
            }
        }

        return ans;
    }
}
