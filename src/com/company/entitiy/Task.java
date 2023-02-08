package com.company.entitiy;


import java.util.UUID;

public class Task {
    private String url;
    private UUID ID = UUID.randomUUID();

    private TaskBody taskBody;

    public Task(String url, UUID ID, TaskBody taskBody) {
        this.url = url;
        this.ID = ID;
        this.taskBody = taskBody;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public TaskBody getTaskBody() {
        return taskBody;
    }

    public void setTaskBody(TaskBody taskBody) {
        this.taskBody = taskBody;
    }
}
