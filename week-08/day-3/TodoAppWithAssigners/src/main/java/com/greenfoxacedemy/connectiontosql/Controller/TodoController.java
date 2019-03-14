package com.greenfoxacedemy.connectiontosql.Controller;

import com.greenfoxacedemy.connectiontosql.Model.Todo;
import com.greenfoxacedemy.connectiontosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
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

    @DeleteMapping(value = "/{id}/delete")
    public String deleteTodo(@PathVariable("id") long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/";
    }

    @GetMapping(value = "/{id}/update")
    public String showUpdateView(@PathVariable("id") Long id, Model model) {
        model.addAttribute("todo", todoRepository.findById(id).orElseThrow(NullPointerException::new));
        return "update";
    }

    @PostMapping(value = "/{id}/update")
    public String updateTodo(@PathVariable Long id, @ModelAttribute Todo todo) {
        Todo todoEdit = todoRepository.findById(id).orElseThrow(NullPointerException::new);
        todoEdit.setTitle(todo.getTitle());
        todoEdit.setDone(todo.isDone());
        todoEdit.setUrgent(todo.isUrgent());
        todoRepository.save(todoEdit);

        return "redirect:/todo/";
    }

    @PostMapping(value = "/search")
    public String searchBy(Model model, @RequestParam("searchField") String serachedText) {
        List<Todo> searchResult = new ArrayList<>();
        todoRepository.findAll().forEach(searchResult::add);
        searchResult = searchResult.stream()
                .filter(s -> s.getTitle().toLowerCase().contains(serachedText.toLowerCase()))
                .sorted(Comparator.comparing(Todo::getId))
                .collect(Collectors.toList());
        model.addAttribute("searchFiled", searchResult);
        return "searchResult";
    }

}
