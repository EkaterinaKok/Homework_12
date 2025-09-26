public class Book {
    private String name;
    private int age;
    private Author author;


    public Book(String name, int age, Author author) {
        this.name = name;
        this.age = age;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
