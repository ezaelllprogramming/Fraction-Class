public class FractionDriver extends Fraction {
 
    public static void main (String[] args) {
     
        Fraction myFraction = new Fraction();
        Fraction yourFraction = new Fraction(1,0);
        //System.out.println(myFraction.num);
        //System.out.println(yourFraction.num);
       
        Fraction f1 = new Fraction(myFraction);
        Fraction f2 = new Fraction(f1);
        System.out.println(f2);
       
        f2.setNum(3);
       
        Fraction ans = Fraction.multiply(f1,f2);
        f1.multiply(f2);
        System.out.println();
       
        Fraction ans = Fraction.divide(f1,f2);
        f1.divide(f2);
        System.out.println();
       
        Fraction ans = Fraction.add(f1,f2);
        f1.add(f2);
        System.out.println();
       
        Fraction ans = Fraction.subtract(f1,f2);
        f1.subtract(f2);
        System.out.println();
       
    }
       
    //String ans = str.substring(0,2);
    //f1 = f1.setNum(5)
   
}


