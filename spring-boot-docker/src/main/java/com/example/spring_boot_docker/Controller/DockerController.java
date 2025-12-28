package com.example.spring_boot_docker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {


    @GetMapping("/docker")
    public  String getDocker(){
        return "Docker is running";
    }
}
