class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
    
    for (String s : strs) {
        // Sort the string to create a key
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        
        // If key doesn't exist, create new list
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        
        // Add string to its group
        map.get(key).add(s);
    }
    
    return new ArrayList<>(map.values());
    }
}