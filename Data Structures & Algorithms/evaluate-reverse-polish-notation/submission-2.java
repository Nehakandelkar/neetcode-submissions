class Solution {
    public int evalRPN(String[] tokens) {
        
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();

        int res = 0;

        for(int i=0; i<n; i++){
            if(tokens[i].matches("-?\\d+")){
                st.push(Integer.parseInt(tokens[i]));

            }

            else{
                int a = st.pop();
                int b = st.pop();

                if(tokens[i].equals("+")){
                    res = a+b;
                    st.push(res);
                }
                if(tokens[i].equals("-")){
                    res = b-a;
                    st.push(res);
                }
                if(tokens[i].equals("*")){
                    res = a*b;
                    st.push(res);
                }
                if(tokens[i].equals("/")){
                    res = b/a;
                    st.push(res);
                }
            }


        }

        return st.pop();



    }
}
