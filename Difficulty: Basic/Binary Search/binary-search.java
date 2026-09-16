class Solution { 
    public boolean binarySearch(int[] arr, int k) { 
        int left = 0, right = arr.length - 1; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; // you can simply find mid but for large test case thi smay be lead Integer overflow error 
            if (arr[mid] == k) { 
                return true; 
            } else if (arr[mid] < k) { 
                left = mid + 1;  
            } else { 
                right = mid - 1; 
            } 
        } 
        return false; 
    } 
}
