class Solution{
  public:
    
    string longestCommonPrefix (string arr[], int N)
    {
        // your code here
        int len = arr[0].length();
        string str = "";
        
        for(int i=0; i<N; i++){
            len = arr[i].length()<len?arr[i].length():len;
        }
        
        int j = 0;
        bool flag = true;
        
        while(j<len){
            
            for(int i=1; i<N; i++){
                if(arr[i-1][j]!=arr[i][j]) {
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
            str = str + arr[0][j++];
        }
        if(str.length()==0) return "-1";
        return str;
    }
};