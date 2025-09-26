public class App {
    public static void main(String[] args) {
        Author authorOne = new Author("Лев", "Толстой");
        Author authorTwo = new Author("Михаил", "Булгаков");
        Book bookOne = new Book("\"Война и мир\"", 1867, authorOne);
        Book bookTwo = new Book("\"Мастер и Маргарита\"", 1987, authorTwo);

        System.out.println("Книга 1");
        System.out.println("Название: " + bookOne.getName() + ", год публикации " + bookOne.getAge());
        System.out.println("Автор: " + bookOne.getAuthor().getNameAuthor() + " " + bookOne.getAuthor().getSurnameAuthor());
        System.out.println();
        System.out.println("Книга 2");
        System.out.println("Название: " + bookTwo.getName() + ", год публикации " + bookTwo.getAge());
        System.out.println("Автор: " + bookTwo.getAuthor().getNameAuthor() + " " + bookTwo.getAuthor().getSurnameAuthor());


    }
}
