import java.util.ArrayList;

public class Library {
    ArrayList<Book> list = new ArrayList<>();
    static ArrayList<Book> staticlist = new ArrayList<>();
    public Library(){
        ArrayList<Book> list = new ArrayList<>();
        staticlist = list;
    }
    public void addBook(Book book){
        list.add(book);
        staticlist.add(book);
    }
    public String deleteBook(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                list.remove(i);
                staticlist.remove(i);
                return "";
            }
        }
        return "the is no any book with that name";
    }
    public String searchBookName(String searchName){
        for (int i = 0; i < list.size(); i++) {
            if (searchName.equals(list.get(i).getName())){
                return list.get(i).getName();
            }
        }
        return "there is no such book";
    }
    public String searchBookAuthor(String searchAutor){
        for (int i = 0; i < list.size(); i++) {
            if (searchAutor.equals(list.get(i).getAuthor())){
                return list.get(i).getAuthor();
            }
        }
        return "there is no such book author";
    }

    public void printBooks(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+" "+list.get(i).getAuthor()+" "+list.get(i).getYearOfCreation());
        }
    }
    public static void countBooks(){
        int count = 0;
        for (int i = 0; i < staticlist.size(); i++) {
            count++;
        }
        System.out.println(count);
    }
}
