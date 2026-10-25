<h2><a href="https://www.geeksforgeeks.org/problems/reversing-the-columns-of-a-matrix-1587115621/1">Reversing the columns of a Matrix</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a matrix of size <strong>n x m</strong>, reverse the order of its columns in-place so that the last column becomes the first, the second-last becomes the second, and so on.</span></p><p><strong><span style="font-size: 18px;">Examples:</span></strong></p><pre><span style="font-size: 18px;"><strong>Input: </strong>n = 4, m = 3, matrix[][] = [[1, 2, 3], [5, 6, 7], [11, 10, 9], [13, 14, 15]]
<strong>Output: </strong>[[3, 2, 1], [7, 6, 5], [9, 10, 11], [15, 14, 13]]
<strong>Explanation: </strong>Array after exchanging columns:
              [[3, 2, 1],
               [7, 6, 5],
               [9, 10, 11],
               [15, 14, 13]]</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>n = 2, m = 5, matrix[][] = [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]
<strong>Output:</strong> [[5, 4, 3, 2, 1], [10, 9, 8, 7, 6]]
<strong>Explanation: </strong>After reversing the column of matrix
                [[5, 4, 3, 2, 1]
                 [10, 9, 8, 7, 6]]</span></pre><p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n, m ≤ 100<br>0 ≤ matrix[i][j] ≤ 1000</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Matrix</code>&nbsp;