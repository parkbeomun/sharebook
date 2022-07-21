package com.beomun.sharebook.sample;

import com.beomun.sharebook.domain.book.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public Object test () {
        Map<String,Object> sampleMap = new HashMap<>();
        sampleMap.put("name","beomun");
        sampleMap.put("age","34");

        return sampleMap;
    }
}
