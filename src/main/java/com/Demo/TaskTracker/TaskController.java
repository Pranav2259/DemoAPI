package com.Demo.TaskTracker;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
@XmlRootElement
@Path("task")
public class TaskController {
    TaskRepository Reppo = new TaskRepository();
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Task> getTasks() {
        System.out.println("GET All tasks API is Called.....");

        return Reppo.getTasks();
    }
   @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Task getTasks(@PathParam("id") String  id) {
        System.out.println("GET A Particular tasks with ID "+id+" API is Called.....");

        return Reppo.getTasks(id);
    }

    @POST
    @Path("newtask")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Task createTask(Task id){
        System.out.println(id);
        Reppo.create(id);

        return id;
    }

    @DELETE
    @Path("delete/{id}")
    public List<Task> delete(@PathParam("id") String id){
        System.out.println(id);
        return Reppo.Delete(id);
    }

    @PUT
    @Path("update/{id}")
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Task update(@PathParam("id") String id){
        System.out.println(id);
        Reppo.update(id);

        return Reppo.getTasks(id);}

}