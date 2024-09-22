package ee.ivkhkdev;

public class Author {
    private String name;

    public Author(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Автора имя не пустое");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Автора имя не пустое");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
