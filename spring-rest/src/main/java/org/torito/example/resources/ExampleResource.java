package org.torito.example.resources;

/**
 * Created by issac on 17/02/16.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.torito.example.model.Example;

@RestController
@RequestMapping("/test")
public class ExampleResource {

    @RequestMapping("/resource")
    public String getResource() {
        return "hello world";
    }
}