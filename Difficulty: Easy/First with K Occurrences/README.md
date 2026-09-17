<h2><a href="https://www.geeksforgeeks.org/problems/first-come-first-serve1328/1">First with K Occurrences</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an array </span><strong style="font-size: 18px;">arr[]</strong><span style="font-size: 18px;"> representing user IDs in chronological order of their occurrences,&nbsp;and an integer </span><strong style="font-size: 18px;">k</strong><span style="font-size: 18px;">, find the </span><strong style="font-size: 18px;">first user</strong><span style="font-size: 18px;"> whose ID occurs exactly </span><strong style="font-size: 18px;">k times</strong><span style="font-size: 18px;"> in the array.</span></p>
<p><span style="font-size: 18px;">If no such user exists, return <strong>-1</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">arr[] = [1, 7, 4, 3, 4, 8, 7], k = 2
</span><strong style="font-size: 18px;">Output:</strong><span style="font-size: 18px;"> 7
</span><strong style="font-size: 18px;">Explanation</strong><span style="font-size: 18px;">: Both 7 and 4 occur exactly 2 times. Since 7 appears before 4 in the array, 7 is the required answer.  </span></span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [4, 1, 6, 1, 6, 4], k = 1 
<strong>Output:</strong> -1 
<strong>Explanation</strong>: Every element occurs 2 times, so no element occurs exactly 1 time.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>6</sup><br>1 ≤ arr[i] ≤ 10<sup>6</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Hash</code>&nbsp;