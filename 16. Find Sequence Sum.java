    // Complete the getSequenceSum function below.
    static long getSequenceSum(int i, int j, int k) {
        long sum =0;
        for(int s=i; s<=j; s++){
          sum+=s;  
        }
        for(int t=j-1; t>=k; t--){
          sum+=t;  
        }
      return sum;
    }
