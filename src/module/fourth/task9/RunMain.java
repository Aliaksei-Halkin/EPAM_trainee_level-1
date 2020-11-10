package module.fourth.task9;

/**
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * <p>
 * Найти и вывести:
 * <p>
 * a) список книг заданного автора;
 * <p>
 * b) список книг, выпущенных заданным издательством;
 * <p>
 * c) список книг, выпущенных после заданного года.
 */
public class RunMain {

    public static void main(String[] args) {


        BookService bookService = new BookService();

        Book[] books = {new Book(1, "Java Methods of Programming", "Blinov I.N. Romanchik V.S", "Four quarters", 2013,
                600, 200, "plastic"),
                new Book(1, "Java by Epam", "Blinov I.N. Romanchik V.S ", "Four quarters", 2020,
                        600, 200, "plastic"),
                new Book(1, "Core Java Volume 1: Fundamentals, 11th  Edition", "Horstmann C.S.",
                        "Dialectika", 2019,500, 100, "plastic"),
                new Book(1, "Core Java Volume 2: Fundamentals, 11th  Edition", "Horstmann C.S.",
                        "Dialectika", 2019, 500, 100, "plastic")
        };
        bookService.print(books);
        bookService.printBookOfAuthor(books,"Blinov");
        bookService.printBookOfPublishing(books,"Dialectika");
        bookService.printBooksAfterYear(books,2015);

    }

}
