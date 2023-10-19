class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer > map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hset=new HashSet<>(map.values());

        return hset.size() == map.size();
    }
}
