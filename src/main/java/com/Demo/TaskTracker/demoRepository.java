package com.Demo.TaskTracker;

import java.util.ArrayList;
import java.util.List;

public class demoRepository {
    private static final Task T0 = new Task();
    List<Task> Tasks;

    public demoRepository()
    {

        Tasks = new ArrayList<>();

        Task T1 = new Task();
        T1.setId("Hello");
        T1.setTitle("Hello World");
        T1.setDescription("Print HelloWorld");

        Task T2 = new Task();
        T2.setId("102");
        T2.setTitle("Hello World");
        T2.setDescription("Print HelloWorld");

        Tasks.add(T1);
        Tasks.add(T2);
    }

    public List<Task> getTasks() {

        return Tasks;
    }

    public Task getTasks(String id) {
        for (Task a : Tasks){
            if(id.equalsIgnoreCase(a.getId())) return a;
        }
        return T0;
    }


    public void create(Task id)
    {
        id = new Task();
        Tasks.add(id);
    }
}
