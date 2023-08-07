package com.Demo.TaskTracker;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.sql.Date;

@XmlRootElement
public class Task {
    private String id;
    private String title;
    private String description;
    private Date duedate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", Description='" + description + '\'' +
                ", DueDate='" + duedate + '\'' +
                '}';
    }
}
