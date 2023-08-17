public class Book{
    private String title;
    private String author;
    private String ISBN;
    private boolean availability;


    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;

    }

    public String getISBN(){
        return ISBN;

    }
    public boolean getAvailibilty(){
        return availability;
    }


    public void setTitle(String title){-
        this.title = title;

    }

    public void setAuthor( String author){
        this.author = author;

    }
    public void setISBN( String ISBN){
        this.ISBN= ISBN;

    }
    public void setAvailability(boolean availability){
        this.availability = availability;
    }

}