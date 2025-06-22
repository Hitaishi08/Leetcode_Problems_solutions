class Solution {
    public int findCircleNum(int[][] arr) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(arr[i][j] == 1){
                    if(map.containsKey(i)){
                        map.get(i).add(j);
                    }else{
                        List<Integer> list = new ArrayList<>();
                        list.add(j);
                        map.put(i,list);
                    }
                }
            }
        }

        int[] visit = new int[n];

        int ans=0;
        for(int i = 0;i<n;i++){
            if(visit[i] != 1){
                ans++;
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                visit[i] = 1;
                while(!queue.isEmpty()){
                    int node = queue.poll();
                    List<Integer> list = new ArrayList<>(map.get(node));

                    for(int j = 0;j<list.size();j++){
                        if(visit[list.get(j)]!= 1){
                            queue.offer(list.get(j));
                           visit[list.get(j)] = 1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}