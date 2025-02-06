import java.util.Scanner;
class Complex {
    private int real;
    private int img;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part:");
        real = sc.nextInt();
        System.out.println("Enter imaginary part:");
        img = sc.nextInt();
    }
    public void display() {
        System.out.println(real + (img >= 0 ? " + " : " - ") + Math.abs(img) + "i");
    }
    public Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.img = this.img + c.img;
        return result;
    }
    public Complex subtract(Complex c) {
        Complex result = new Complex();
        result.real = this.real - c.real;
        result.img = this.img - c.img;
        return result;
    }
}
public class ComplexDemo {
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();
        System.out.println("Enter first complex number:");
        obj1.input();
        System.out.println("Enter second complex number:");
        obj2.input();
        System.out.println("\nFirst Complex Number:");
        obj1.display();
        System.out.println("Second Complex Number:");
        obj2.display();
        Complex sum = obj1.add(obj2);
        System.out.println("\nAddition Result:");
        sum.display();
        Complex diff = obj1.subtract(obj2);
        System.out.println("Subtraction Result:");
        diff.display();
    }
}
