public class Book {
    private String name;
    private String author;
    private int yearOfCreation;

    public Book(String name, String author, int yearOfCreation) {
        if (name != null){
            this.name = name;
        }else {
            this.name = "none";
        }
        if (author != null){
            this.author = author;
        }else {
            this.author = "none";
        }
        if (yearOfCreation > 0){
            this.yearOfCreation = yearOfCreation;
        }else{
            this.yearOfCreation = 0;
        }
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }else {
            this.name = "none";
        }
    }

    public void setAuthor(String author) {
        if (author != null){
            this.author = author;
        }else {
            this.author = "none";
        }
    }

    public void setYearOfCreation(int yearOfCreation) {
        if (yearOfCreation > 0){
            this.yearOfCreation = yearOfCreation;
        }else{
            this.yearOfCreation = 0;
        }
    }
}
