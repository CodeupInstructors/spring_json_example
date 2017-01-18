package com.zgulde;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
 * all the methods in this controller will return json becuase of
 * the @RestController annotation
 */
@RestController
public class JsonController {
    @GetMapping("/computers/{id}")
    public Computer showAComputer(@PathVariable long id) {
        // here you could use the id to pull something from
        // the database instead of returning a hardcoded object
        return new Computer(
            "lenovo",
            "8gb",
            "linux"
        );
    }

    @GetMapping("/computers")
    public List<Computer> showComputers() {
        return Arrays.asList(
            new Computer("apple", "8gb", "Mac os"),
            new Computer("dell", "2gb", "Chrome OS"),
            new Computer("hp", "16gb", "Windows")
        );
    }

    /*
     * this method will expect a json body to be submitted that has
     * all the attributes of a computer object
     */
    @PostMapping("/computers")
    public Computer createComputer(@ModelAttribute Computer computer) {
        // here we could do something useful with the submission
        // instead of just returning it back
        return computer;
    }
}











