/*Structure of a Complex Number
class Complex {
    public int real;
    public int img;
};
*/

class Solution {
    
    public Complex add(Complex c1, Complex c2) {
        // code here
        Complex res = new Complex();
        res.real = c1.real+c2.real;
        res.img = c1.img+c2.img;
        return res;
    }
}