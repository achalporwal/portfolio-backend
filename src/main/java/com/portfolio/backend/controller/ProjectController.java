package com.portfolio.backend.controller;

import com.portfolio.backend.model.Project;
import com.portfolio.backend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Yeh line zaroori hai taki React bina kisi error ke backend se connect ho sake
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    // Saare projects ko frontend par bhejne ke liye GET API
    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Naya project add karne ke liye POST API (future ke liye)
    @PostMapping("/projects")
    public Project createProject(@RequestBody Project project) {
        return projectRepository.save(project);
    }
}