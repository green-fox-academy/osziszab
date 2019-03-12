package com.greenfoxacedemy.connectiontosql.Controller;

import com.greenfoxacedemy.connectiontosql.Model.Todo;
import com.greenfoxacedemy.connectiontosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) String text) {
        List<Todo> list = new ArrayList<>();
        todoRepository.findAll().forEach(list::add);

        if (text != null && text.equalsIgnoreCase("true")) {
            List<Todo> onlyFalse = list.stream()
                    .filter(e -> !e.isDone())
                    .collect(Collectors.toList());
            model.addAttribute("todos", onlyFalse);
        } else {
            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todoList";
    }

    @GetMapping(value = "/add")
    public String addTodo(Model model) {
        model.addAttribute("todo", new Todo());
        return "createTodo";
    }

    @PostMapping(value = "/add")
    public String addTodo(Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/";
    }

    @GetMapping(value = "/{id}/update")
    public String deleteTodo(@PathVariable("id") long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/";
    }
    @GetMapping(value = "/{id}/update")
    public String showUpdateView(@PathVariable("id") Long id, Model model){
        model.addAttribute("todo", todoRepository.findById(id).orElseThrow(NullPointerException::new));
        return "update";
    }

    @PostMapping(value = "/{id}/update")
    public String updateTodo(@PathVariable Long id,Todo todo){
        Todo todoToUpdate = todoRepository.findById(id).get();
        todoToUpdate.setTitle(todo.getTitle());
        todoToUpdate.setDone(todo.isDone());
        todoToUpdate.setUrgent(todo.isUrgent());
        todoRepository.save(todoToUpdate);
        return "redirect:/todo/";
    }

}
