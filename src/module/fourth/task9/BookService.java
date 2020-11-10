package module.fourth.task9;

import java.util.Objects;

public class BookService {
    public void print(Book[] books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void printBookOfAuthor(Book[] books, String author) {
        System.out.println("Search on author:");
        for (Book book : books) {
            String[] str = book.getAuthor().split(" ");
            for (String st : str) {
                if (Objects.equals(st, author)) {
                    System.out.println(book.toString());
                }
            }
        }
    }

    public void printBookOfPublishing(Book[] books, String publishing) {
        System.out.println("Search on publishing:");
        for (Book book : books) {
            if (Objects.equals(book.getPublishing(), publishing)) {
                System.out.println(book.toString());
            }

        }
    }

    public void printBooksAfterYear(Book[] books, int year) {
        System.out.println("Search after year " + year);
        for (Book book : books) {
            if (book.getYear()>= year) {
                System.out.println(book.toString());
            }
        }

    }

}
