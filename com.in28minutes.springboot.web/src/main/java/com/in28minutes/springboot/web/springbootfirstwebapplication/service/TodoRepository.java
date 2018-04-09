package com.in28minutes.springboot.web.springbootfirstwebapplication.service;

import com.in28minutes.springboot.web.springbootfirstwebapplication.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByUser(String user);
    //service.retrieveTodos(name)
    //service.deleteTodo(id);
    //service.retrieveTodo(id)
    //service.updateTodo(todo)
    //service.addTodo(getLoggedInUserName(model), todo.getDesc(), todo.getTargetDate(),false);
}

