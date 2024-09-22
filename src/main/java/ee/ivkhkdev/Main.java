package ee.ivkhkdev;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Denis Toom");
        Author author2 = new Author("Zion Williamson");
        Author author3 = new Author("Dmitrij Nakiev");
        Author author4 = new Author("Arsen Markarjan");
        Author author5 = new Author("Jasha lava");

        Book book1 = new Book("Как бросить пить", new Author[]{author1, author2});
        Book book2 = new Book("48 законов власти", new Author[]{author3});
        Book book3 = new Book("Богатый папа,бедный папа", new Author[]{author4, author5});
        Book book4 = new Book("Мальчик спальчик", new Author[]{author1, author3, author5});
        Book book5 = new Book("Самый богатый человек в Вавелоне", new Author[]{author2, author4});

        Book[] books = new Book[]{book1, book2, book3, book4, book5};

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
