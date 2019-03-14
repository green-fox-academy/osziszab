package com.greenfoxacedemy.connectiontosql.Controller;

import com.greenfoxacedemy.connectiontosql.Model.Assignee;
import com.greenfoxacedemy.connectiontosql.Model.Todo;
import com.greenfoxacedemy.connectiontosql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @GetMapping(value = "/Assignees")
    public String listAssignees(Model model) {
        model.addAttribute("assigness", assigneeRepository.findAll());
        model.addAttribute("assigners", new Assignee());
        return "assigner";
    }

    @PostMapping(value = "/addAssigner")
    public String addAssigner(Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/Assignees";
    }
}
