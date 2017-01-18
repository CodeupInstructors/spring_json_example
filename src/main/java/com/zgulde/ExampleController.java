package com.zgulde;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/*
 * This controller works like all the other controllers
 * we have seen, but we can annotate specific methods to return
 * json.
 */
@Controller
public class ExampleController {
    @GetMapping("/machines/{id}")
    public @ResponseBody Computer showAComputer(@PathVariable long id) {
        return new Computer(
            "lenovo",
            "8gb",
            "linux"
        );
    }

    @GetMapping("/machines")
    public @ResponseBody List<Computer> showComputers() {
        return Arrays.asList(
            new Computer("apple", "8gb", "Mac os"),
            new Computer("dell", "2gb", "Chrome OS"),
            new Computer("hp", "16gb", "Windows")
        );
    }
}
