class Book{
    String title;
    double price;

    Book(String title,double price){
        this.title=title;   // when parameters and variable names are same then use the keyword-(this)
        this.price=price;
    }

    void display(){
        System.out.println("Title : "+title+" --> "+"Price : "+"₹"+price);
    }

    public static void main(String[] arg){
        Book obj = new Book("DSA with Python",694);
        Book obj1 = new Book("Java Programming",499);
        Book obj2 = new Book("C++ for Beginners",450);

        System.out.println("------------ Book Details ------------");

        obj.display();
        obj1.display();
        obj2.display();

        System.out.println("--------------------------------------");
    }
}