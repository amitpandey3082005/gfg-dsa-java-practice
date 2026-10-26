import java.util.ArrayList;

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> row = new ArrayList<>();

        long currentElement = 1; // because long has higherrange which preents integer overflow 
        row.add((int) currentElement); // type cast int to float 

        for (int i = 1; i < n; i++) {
            // Formula: Prev * (n - i) / i
            currentElement = currentElement * (n - i) / i;
            row.add((int) currentElement);
        }

        return row;
    }
}
