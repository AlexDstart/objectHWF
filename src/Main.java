public class Main {
    public static void main(String[] args) {


        Author author1 = new Author("Федор", "Достоевский");
        Author author2 = new Author("Рэй", "Бредбери");
        Book book1 = new Book("Преступление и наказание", author1, 1886);
        System.out.println(book1);
        Book book2=new Book("Марсианские хроники",author2,1950);
        System.out.println(book2);
        //Меняем год издания
        book1.setPublished(2001);
        book2.setPublished(1990);
        System.out.println(book1);
        System.out.println(book2);


    }
}


