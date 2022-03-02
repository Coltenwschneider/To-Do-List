package org.launchcode.ToDoList.Controllers;

import org.launchcode.ToDoList.models.Task;
import org.launchcode.ToDoList.models.data.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("add-task")
    public String addTask(@RequestParam String taskName) {
        Task newTask = new Task(taskName);
        taskRepository.save(newTask);
        return "redirect:home";
    }

    @GetMapping("home")
    public String getTasks(Model model) {
        List<Task> taskList = (List<Task>) taskRepository.findAll();
        model.addAttribute("taskList", taskList);
        return "home";
    }

}
