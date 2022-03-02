package org.launchcode.ToDoList.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Integer Id;

    private String taskName;

    public Task() {

    }

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public Integer getId() {
        return Id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
