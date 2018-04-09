package com.in28minutes.springboot.web.springbootfirstwebapplication.service;

import com.in28minutes.springboot.web.springbootfirstwebapplication.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", new Date(), false));
        todos.add(new Todo(2, "in28Minutes", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "in28Minutes", "Learn Hibernate", new Date(),false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = todos.stream().filter(todo -> todo.getUser().equals(user)).collect(Collectors.toList());
        return filteredTodos;
    }

    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
        todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public Todo retrieveTodo(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().orElse(null);
    }

    public void updateTodo(Todo todo){
        IntStream.range(0, todos.size()).filter(i -> todo.getId() == todos.get(i).getId()).forEachOrdered(i -> todos.set(i, todo));
    }



}
