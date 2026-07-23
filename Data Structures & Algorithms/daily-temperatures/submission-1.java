class Solution {
    public int[] dailyTemperatures(int[] temps) {
        
        int [] result = new int[temps.length];

        int i=0;
        int j=i+1;
        while(i!=temps.length){
            // System.out.println(temps[i]+" "+temps[j]+ Arrays.toString(result));
            if(temps[j]>temps[i]){
                result[i]=j-i;
                i++;
                j=i;
            }
            else{
                j++;
                if(j==temps.length){
                    result[i]=0;
                    i++;
                    j=i;
                }
            }
        }
        return result;
    }
}
