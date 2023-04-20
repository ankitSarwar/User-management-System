package com.geekster.practice.services;

import com.geekster.practice.models.ToDo;
import com.geekster.practice.repository.TodoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServices {

    @Autowired
    TodoDao todoDao;

    public List<ToDo> getAllTodos()
    {
        return todoDao.getTodosFromDataSource();
    }

    public String addMyuser(ToDo todo)
    {
        boolean insertionStatus = todoDao.save(todo);//in our case...always true
        if(insertionStatus)
        {
            return "Todo added successfully!!!!!";
        }
        else
        {
            return "Failed!!!!!....Todo Not possible..Database error";//in case of database error ...will see later

        }
    }


    public ToDo getUserBasedOnId(int id)
    {
        List<ToDo> todoListRightNow =  todoDao.getTodosFromDataSource();

        for(ToDo todo : todoListRightNow)
        {
            if(todo.getUserId()==id)
            {
                return todo;// multiple IDs may exist
            }
        }

        return null;
    }

    public String removeUserId(int Userid){

        List<ToDo> list=todoDao.getTodosFromDataSource();
        boolean isRemove=false;
        String ans;
        if(Userid!=0){

            for(ToDo todo:list){
                if(todo.getUserId()==Userid){
                    isRemove=todoDao.remove(todo);
                    if(isRemove){
                        ans = "Todo with Userid: " + Userid + " was deleted!!!";
                    }else{
                        ans="Todo with Userid: " + Userid + " was not deleted!!!....Database error...!!!!!";
                    }
                    return ans;
                }

                return "this  Userid Not exist!!!!!!";
            }

        }

        return "Invalid Id ....Cannot accept Null ID!!";
    }

    public String updateTodoStatusByUser(int userid,String address){
        boolean ans=false;
        ans=todoDao.update(userid,address);
        if(ans){
            return "address was updated!!!";
        }else{
            return "address was not.... updated!!!!";
        }
    }

}


