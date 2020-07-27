package sg.edu.rp.webservices.c302p10firstprototype;

public class toDoItem {
    private String date;
    private String title;

    public toDoItem(String date, String title) {
        this.date = date;
        this.title = title;
    }
    public toDoItem() {}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
