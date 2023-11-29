import Rectangle.Rettangolo;
public class Es1 {

    public static void printRettangolo(Rettangolo rectangle){
        System.out.println("Area " + rectangle.getArea());
        System.out.println("Perimetro " + rectangle.getPerimeter());
    }

    public static void print2Rettangolo(Rettangolo rect1, Rettangolo rect2){
        System.out.println("Primo rettangolo");
        printRettangolo(rect1);
        System.out.println("Secondo rettangolo");
        printRettangolo(rect2);
        System.out.println("Somma rettangoli");
        System.out.println("Area " + (rect1.getArea() + rect2.getArea()));
        System.out.println("Perimetro " + (rect1.getPerimeter() + rect2.getPerimeter()));
    }


    public static void main(String[] args) {
        Rettangolo rect1 = new Rettangolo(15, 8);
        Rettangolo rect2 = new Rettangolo(20, 12);
        printRettangolo(rect1);
        print2Rettangolo(rect1, rect2);
    }
}