package model;

public class Task {
    private String title;
    private String description;
    private Boolean state;

    public Task(String title, String description, Boolean state) {
        this.title = title;
        this.description = description;
        this.state = state;
    }

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
