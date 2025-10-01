class Solution {
    public int numWaterBottles(int bot, int ex) {
        int total = bot;
        
        while(bot >= ex){
            int rem = bot % ex;
            total += (bot / ex);
            bot = rem + (bot / ex);
        }

        return total;
    }
}