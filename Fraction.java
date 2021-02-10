class Fraction {
   
    public int num,den;
   
    public Fraction() {
     
        this.num = 1;
        this.den = 1;
       
    }
   
    public Fraction(int num, int den) {
     
        this.num = num;
        if (den == 0) {
            System.out.println("Error: denominator was zero");
            this.den = 1;
        } else {
            this.den = den;
        }
       
    }
   
    public Fraction(String f) {
        int slashIndex = f.indexOf("/");
        String n = f.substring(0,slashIndex);
        String d = f.substring(slashIndex+1);
        this.num = Integer.parseInt(n);
        int tempd = Integer.parseInt(d);
        if (tempd == 0) {
           
        } else {
         this.den = tempd;  
        }
       
    }
   
    public Fraction(Fraction f) {
        this.num = f.num;
        this.den = f.den;
    }
   
    public int getNum() {
        return this.num;
    }
   
    public int getDen() {
        return this.den;
    }
   
    public double toDouble() {
        return (double) num/den;
    }
   
    public String toString() {
        return this.num + "/" + this.den;
    }
   
    public void setNum(int n) {
        this.num = n;
    }
   
    public void setDen(int d) {
        if (d != 0) this.den = d;
        else System.out.println("Error: Denominator cannot be zero");
    }
   
    public void Fraction multiply(Fraction a) {
     this.num = this.num * this.num;  
     this.den = this.den * this.den;
     //this.reduce();
    }
   
    public void Fraction divide(Fraction a) {
     this.num = this.num / this.num;  
     this.den = this.den / this.den;
     //this.reduce();
    }

    public void Fraction add(Fraction a) {
     this.num = this.num + this.num;  
     this.den = this.den + this.den;
     //this.reduce();
    }
   
    public void Fraction subtract(Fraction a) {
     this.num = this.num - this.num;  
     this.den = this.den - this.den;
     //this.reduce();
    }
   
    public Fraction reduce() {
     int gcf = gcf(this.num, this.den);
     Fraction f = new Fraction(this.num/gcf,this.den/gcf);
     return f;
    }
   
}

//str.substring(start,end)
//str.indexOf("/");
//int x x = Integer.parseInt("2");
