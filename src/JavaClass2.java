/**
 * Created by mac
 */
public class JavaClass2{
    protected double a, b;

    public JavaClass2(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double plus() {
        return a + b;
    }

    public double minus() {
        return a - b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
