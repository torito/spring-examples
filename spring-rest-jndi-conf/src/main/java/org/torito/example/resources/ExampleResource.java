package org.torito.example.resources;

/**
 * Created by issac on 17/02/16.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.torito.example.conf.JndiConfigurator;
import org.torito.example.model.Example;

@RestController
@RequestMapping("/test")
public class ExampleResource {

    @Autowired
    JndiConfigurator config;

    @RequestMapping("/resource")
    public String getResource() {
        String user = config.getConfig("user", "noe");
        return "hello world" + user;
    }
}