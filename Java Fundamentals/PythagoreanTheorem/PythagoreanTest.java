// Pythagorean Theorem (continued...)

/* ● Create a PythagoreanTest file that will instantiate a new 
Pythagorean object and call the calculateHypotenuse method. */

public class PythagoreanTest{
    public static void main(String[] args){
        Pythagorean result = new Pythagorean();             //Calls back on Pythagorean.java
        double output = result.calculateHypotenuse(3,4);    //Subs in for legA and legB
        System.out.println(output);
    }
}