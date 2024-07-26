package calculator;

public class Operator {
    private int a;
    private int b;
    public Operator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    public double operate(){
        return 0.0;
    }
}
