package IT.API3.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/string")

public class StringController {
    @GetMapping("/{string1}/{string2}")
    public String concatenate(@PathVariable String string1, @PathVariable String string2) {
        String unione = string1 + string2;
        return unione;

    }
    @GetMapping("/{string1}")
    public String concatenate(@PathVariable(required = true) String string1) {
        return string1;

    }
}