package com.portfolio.backend;

import com.portfolio.backend.model.Project;
import com.portfolio.backend.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProjectRepository repository) {
        return args -> {
            // Clears existing data to prevent duplicates on restart
            repository.deleteAll();

            // Project 1: From Resume (Minor Project)
            repository.save(new Project(
                    "Employee Management System",
                    "An enterprise desktop pipeline providing role-based admin workflows to safely handle, store, and modify complex employee databases and attendance metrics.",
                    "Java, Swing, MySQL, OOP",
                    "https://github.com/achalporwal"
            ));

            // Project 2: From Resume (Major Project)
            repository.save(new Project(
                    "Face Recognition Attendance Based System",
                    "An automated computer-vision framework that captures, processes, and matches facial matrices with database structures to log student attendance seamlessly.",
                    "Python, OpenCV, NumPy, MySQL",
                    "https://github.com/achalporwal"
            ));

            // Project 3: Field Office Data Automation Vibe
            repository.save(new Project(
                    "Automated Commercial Data Aggregator",
                    "A robust script environment designed to auto-fetch, compile, and clean structural datasets from multiple decentralized field endpoints into structured sheets.",
                    "Python, Pandas, OpenPyXL, Excel Scripting",
                    "https://github.com/achalporwal"
            ));

            // Project 4: High End Java Backend
            repository.save(new Project(
                    "High-Throughput RESTful Service Gateway",
                    "A production-grade cloud backend system featuring custom token filter configurations and connection pooling to serve frontend applications with sub-millisecond response rates.",
                    "Java, Spring Boot, Spring Data JPA, PostgreSQL",
                    "https://github.com/achalporwal"
            ));

            // Project 5: SQL/Analytics
            repository.save(new Project(
                    "Commercial Revenue Leakage Analytical Platform",
                    "Advanced relational model designing complex analytical window functions and procedures to parse grid logs and reveal patterns of commercial losses.",
                    "SQL, MySQL Server, Advanced Query Optimization",
                    "https://github.com/achalporwal"
            ));

            // Project 6: Excel Automation Vibe
            repository.save(new Project(
                    "Dynamic Macro-Driven Executive Dashboard",
                    "An automated reporting engine utilizing advanced analytical formulas and macro structures to auto-generate complex management summaries from raw data logs.",
                    "Advanced Excel, VBA, Pivot Arrays, Power Query",
                    "https://github.com/achalporwal"
            ));

            // Project 7: Low level Systems (C Based)
            repository.save(new Project(
                    "Memory-Efficient Algorithmic Cache Simulator",
                    "A low-level system-oriented utility written to simulate and optimize complex multi-way associative processor memory architectures.",
                    "C, Pointers, Memory Allocation, Data Structures",
                    "https://github.com/achalporwal"
            ));

            // Project 8: Python Web Automation
            repository.save(new Project(
                    "Distributed Web Portal Scraping Engine",
                    "A concurrent scraping network using asynchronous drivers to parse data structures across heavy corporate portals without triggering connection blocks.",
                    "Python, Selenium, BeautifulSoup, Asyncio",
                    "https://github.com/achalporwal"
            ));

            // Project 9: Full Stack Cloud
            repository.save(new Project(
                    "Cloud-Native Scalable SaaS Ledger Dashboard",
                    "A reactive modular dashboard tracking secure asset transactions, complete with containerization and continuous integration configurations.",
                    "React.js, Spring Boot, Docker, AWS Core",
                    "https://github.com/achalporwal"
            ));

            // Project 10: Pure C++ Optimization
            repository.save(new Project(
                    "Network Topology Shortest Path Engine",
                    "A custom implementation of heavy graph traversal algorithms optimized to locate operational path safety layouts in multi-node communication setups.",
                    "C++, Graph Structures, OOP Design Patterns",
                    "https://github.com/achalporwal"
            ));
            //Project 11: Electricity Billing System
            repository.save(new Project(
                  "MPWZ Electricity Billing System",
                  "An enterprise-grade full-stack web utility featuring an automated MPWZ slab-based math calculation engine, normalized MySQL database ledger integration, secure REST endpoints, and high-performance inline PDF receipt generation streamed dynamically to a custom React dashboard.",  
                  "Java 26, Spring Boot, React.js, MySQL, OpenPDF Engine, Tailwind CSS",
                  "https://github.com/achalporwal/electricity-billing-system"
            ));.

            System.out.println(">> Database successfully refreshed with 10 high-tier technical projects! <<");
        };
    }
}
