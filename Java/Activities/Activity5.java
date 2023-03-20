package Activities;

abstract class Book
{
    //Method
    String bookTitle;
    abstract void setTitle(String str);
    //Method
    String getitle()
    {
        return bookTitle;
    }

}

class MyBook extends Book {
    public void setTitle(String s) {
        bookTitle = s;
    }
}

public class Activity5 {

    public static void main(String []args) {
        String title = "Harry Potter";
        Book newBook = new MyBook();
        newBook.setTitle(title);

        //Print result
        System.out.println("The title is: " + newBook.getitle());
    }
}