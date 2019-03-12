package com.greenfoxacademy.tododatabase.Controller;

import com.greenfoxacademy.tododatabase.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    TodoRepository todoRepository;

    @Autowired
    TodoController(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos",todoRepository.findAll());
        return "todolist";
    }
}
