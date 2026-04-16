class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        Stack<int[]> st = new Stack();  // [temp, index]

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temperatures[i] > st.peek()[0]){
                int[] prev = st.pop();
                res[prev[1]] = i - prev[1];
            }

            int[] temp = new int[2];
            temp[0] = temperatures[i];
            temp[1] = i;
            st.push(temp);
        }




        
        return res;


        




    }
}
