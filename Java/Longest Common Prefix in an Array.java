
class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        StringBuilder sb = new StringBuilder();
        int min = arr[0].length();
        for(int i=0; i<n; i++) min = Math.min(min,arr[i].length());
        boolean flag = true;
        int j = 0;
        while(j<min){
            for(int i=1; i<n; i++){
                if(arr[i-1].charAt(j)!=arr[i].charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag==false) break;
            sb.append(arr[0].charAt(j++));
        }
        if(sb.length()==0) return "-1";
        return sb.toString();
    }
}