package com.portfolio.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(columnDefinition = "TEXt")
    private String description;
    private String technologies;
    private String githubLink;

    // Khali Constructor (Hibernate ke liye zaroori hai)
    public Project() {}

    // Constructor data insert karne ke liye
    public Project(String title, String description, String technologies, String githubLink) {
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.githubLink = githubLink;
    }

    // Getters and Setters (Isse data access hota hai)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getTechnologies() { return technologies; }
    public void setTechnologies(String technologies) { this.technologies = technologies; }

    public String getGithubLink() { return githubLink; }
    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }
}
