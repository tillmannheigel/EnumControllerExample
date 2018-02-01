package de.tillmannheigel.examples.EnumInController.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController public class ExampleController {

    @RequestMapping("/example")
    public String example(
            @RequestParam String parameter) {
        return parameter;
    }
}
