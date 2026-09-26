class Solution {
    public int peakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Agar mid wala element apne aage wale element se chota hai,
            // iska matlab hum uphill ja rahe hain aur peak RIGHT side mein hai.
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } 
            // Agar mid bada ya barabar hai, toh peak mid khud ho sakta hai ya LEFT side mein hai.
            else {
                right = mid;
            }
        }

        // Loop khatam hone par left aur right dono peak index par hi rukenge.
        return left;
    }
}
