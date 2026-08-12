class Solution {
    public String minWindow(String s, String t) {
        int[] wMap = new int[128];
        int[] tMap = new int[128];
        int matched = 0;

        int i = 0;
        String ans = "";
        int minLen = Integer.MAX_VALUE;
        int required =0;
        for (Character c : t.toCharArray()) {
            if(tMap[c]==0){
                required++;
            }
            tMap[c]++;
        }
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            wMap[c]++;
            if (wMap[c] == tMap[c]) {
                matched++;
            }
            while (matched == required) {
                if (minLen > (j - i + 1)) {

                    ans = s.substring(i, j + 1);
                    minLen = j - i + 1;

                }

                wMap[s.charAt(i)]--;

                if (wMap[s.charAt(i)] < tMap[s.charAt(i)]) {

                    matched--;
                }
                i++;
            }
        }
        return ans;
    }
}