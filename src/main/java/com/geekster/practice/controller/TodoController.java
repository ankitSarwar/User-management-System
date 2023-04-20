package com.geekster.practice.controller;

import com.geekster.practice.models.ToDo;
import com.geekster.practice.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoServices todoServices;

    @GetMapping(value="/getAllUser")
    public List<ToDo> getAllUser()
    {
        return todoServices.getAllTodos();
    }

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody ToDo todo){
        return todoServices.addMyuser(todo);
    }

    @RequestMapping(value="/getUser/{userid}",method=RequestMethod.GET) //get specific todo by id
    public ToDo getUser(@PathVariable int userid){
        return todoServices.getUserBasedOnId(userid); //http://localhost:8082/getUser/3
    }

    @DeleteMapping(value="/deleteUser/{userid}") //http://localhost:8082/deleteUser/2
    public String deleteTodoById(@PathVariable int userid)
    {
        return todoServices.removeUserId(userid);
    }

    @PutMapping(value = "/updateTodoById/{userid}/{address}")  //http://localhost:8082/updateTodoById/3/maharastra
    public String updateTodoStatusById(@PathVariable int userid, @PathVariable String address)
    {
        return todoServices.updateTodoStatusByUser(userid,address);
    }

}
