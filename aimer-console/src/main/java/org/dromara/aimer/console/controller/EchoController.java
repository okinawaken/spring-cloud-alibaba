package org.dromara.aimer.console.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {
    @RequestMapping(value = "/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return str;
    }
}