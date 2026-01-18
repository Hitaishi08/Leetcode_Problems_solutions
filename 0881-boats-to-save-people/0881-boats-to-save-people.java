class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0,j = people.length - 1;
        Arrays.sort(people);
        int cnt = 0;
        while(i <= j){
            if(i == j)i++;
            else if(people[i] + people[j] <= limit)i++;
            j--;
            cnt++;
        }

        return cnt;
    }
}