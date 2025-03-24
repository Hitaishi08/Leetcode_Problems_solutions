class Solution {
    public int[] pse(int[] arr,boolean pse){
        int[] result = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        if(pse){
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }

            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }}else{
            for(int i = n-1;i>=0;i--){
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }

                result[i] = st.isEmpty() ? n : st.peek();
                st.push(i);
            }
        }

        return result;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] pse = pse(arr,true);
        int[] nse = pse(arr,false);

        long total = 0;
        int MOD = 1_000_000_007;

        for(int i = 0;i<n;i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            total = (total + (left * right % MOD) * arr[i] % MOD) % MOD;
        }

        return (int)total;
    }
}