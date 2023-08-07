package com.Demo.TaskTracker;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    Connection conn = null ;
    public TaskRepository()
    {

        String url = "jdbc:postgresql://localhost:5432/taskdb";
        String Username = "postgres";
        String Password = "Password";

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,Username,Password);
        } catch (Exception e) {System.out.println(e);}
    }

    public List<Task> getTasks() {

        List <Task> tasks = new ArrayList<>();
        String sql = "SELECT * FROM task ";
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Task T = new Task();
                T.setId(rs.getString(1));
                T.setTitle(rs.getString(2));
                T.setDescription(rs.getString(3));
                T.setDuedate(rs.getDate(4));

                tasks.add(T);
            }
        }catch(Exception e){System.out.println(e);}

        return tasks;
    }

    public Task getTasks(String id) {
        String sql = "SELECT * FROM task WHERE id='" + id+"'";
        Task T = null;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                T = new Task();
                T.setId(rs.getString(1));
                T.setTitle(rs.getString(2));
                T.setDescription(rs.getString(3));
                T.setDuedate(rs.getDate(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return T;
    }


    public void create(Task id)
    {
        String sql = "INSERT INTO TASK VALUES (?,?,?,?)";

        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,id.getId());
            st.setString(2,id.getTitle());
            st.setString(3,id.getDescription());
            st.setDate(4,id.getDuedate());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Task> Delete(String id) {
        String sql = "DELETE FROM task WHERE id='" + id+"'";

        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return getTasks();
    }
    public void update(String id) {
        String sql = "UPDATE task SET title = ?,description = ?, duedate = ? WHERE id='"+id+"';";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,getTasks(id).getTitle());
            st.setString(2,getTasks(id).getDescription());
            st.setDate(3,getTasks(id).getDuedate());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
