<h2><a href="https://www.geeksforgeeks.org/problems/easy-string2212/1">Compress String</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given a string <strong>s</strong>, compress it by replacing each group of consecutive identical characters with the lowercase character followed by its frequency. </span></p>
<ul>
<li><span style="font-size: 14pt;">Uppercase and lowercase versions of the same letter are treated as identical. </span></li>
<li><span style="font-size: 14pt;">If the same character appears again after a different character, it forms a new group.</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "aaABBb"
<strong>Output:</strong> "a3b3"
<strong>Explanation</strong>: Treating uppercase and lowercase letters as the same, the string becomes "aaabbb". Thus, 'a' appears 3 times consecutively, followed by 'b' appearing 3 times.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: s = "aaacca"
<strong>Output:</strong> "a3c2a1"
<strong>Explanation</strong>: The first three 'a' characters form one group, followed by two 'c' characters. The last 'a' forms a separate group since it is not consecutive with the first one.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |s| ≤ 10<sup>5<br></sup></span><span style="font-size: 18px;">s contains only lowercase and uppercase characters.</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Stack</code>&nbsp;