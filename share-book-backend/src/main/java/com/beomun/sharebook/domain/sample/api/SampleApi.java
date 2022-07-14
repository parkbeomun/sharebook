package com.beomun.sharebook.domain.sample.api;

import com.beomun.sharebook.domain.sample.service.SampleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleApi {

    private SampleService sampleService;

    public SampleApi(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/")
    public String sample () {
        return "sample API";
    }
}
