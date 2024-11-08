package week1;

public class Exercises {
    public static void main(String[] args) {
        Car carInOtherClass2 = new Car("Toyota", " ", 2015);
        System.out.println(carInOtherClass2.brand);
        System.out.println(carInOtherClass2.model);
        System.out.println(carInOtherClass2.year);

        Book bookInOtherClass1 = new Book("Red", " ", 2015);
        System.out.println(bookInOtherClass1.title);
        System.out.println(bookInOtherClass1.author);
        System.out.println(bookInOtherClass1.yearPublished);

    }

}
