package com.greenfoxacedemy.connectiontosql.Controller;

import com.greenfoxacedemy.connectiontosql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        return "assigner";
    }
}
