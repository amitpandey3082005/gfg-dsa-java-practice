class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        // creating Array List to store Missing and Repaeting element 
        ArrayList<Integer>list = new ArrayList<>();
        
        // sorting array to find repeating element 
        int repeat =0;
        Arrays.sort(arr);
        int m=0,n=1;
        while(m<arr.length && n<arr.length){
            if(arr[m]==arr[n]){
                list.add(arr[m]);
                repeat = arr[m];
            }
            m++;n++;
        }
        
        // trying to calculate missing element 
        int elesum=0,totalSum=0;
        
        for(int i=1;i<=n;i++){
            totalSum+=i;
        }
        
        for(int i=0;i<arr.length;i++){
            elesum+=arr[i];
        }
        // missing element = totalSum-eleSum+repeating 
        list.add(totalSum-elesum+repeat);
        
        return list;
    }
}
