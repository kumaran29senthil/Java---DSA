class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hset = new HashSet<>();
        char ans = ' ';
        for(char ch:s.toCharArray()){
            if(hset.contains(ch)){
                ans = ch;
                break;
            }
            hset.add(ch);
        }
        return ans;
    }
}
