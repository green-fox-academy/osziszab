package com.greenfoxacedemy.connectiontosql.Model;

import javax.persistence.*;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    @ManyToOne
    private Assignee assignee;

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
        this.assignee = new Assignee();
    }

    public Todo() {
        this.urgent = false;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
