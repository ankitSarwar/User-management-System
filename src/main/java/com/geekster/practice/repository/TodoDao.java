package com.geekster.practice.repository;

import com.geekster.practice.models.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDao {

    private List<ToDo> TodoList;

    public TodoDao(){
        TodoList=new ArrayList<>();
        TodoList.add(new ToDo(1,"ankit","ankitsarwar039@gmail.com","Maharastra","9370215465"));
    }

    public List<ToDo> getTodosFromDataSource()
    {
        return TodoList;
    }

    public boolean save(ToDo todo){
        TodoList.add(todo);
        return true;
    }

    public boolean remove(ToDo todo) {
        TodoList.remove(todo);
        return true;
    }

    public boolean update(int userid,String address){

        for(ToDo todo:TodoList){
            if(todo.getUserId()==userid){
                remove(todo);
                todo.setAddress(address);
                save(todo);
                return true;
            }
        }
        return false;
    }
}
