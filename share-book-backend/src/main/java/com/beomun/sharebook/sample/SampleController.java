package com.beomun.sharebook.sample;

import com.beomun.sharebook.domain.book.entity.Book;
import com.beomun.sharebook.sample.entity.People;
import com.beomun.sharebook.sample.service.PeopleService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@RestController
public class SampleController {

    private PeopleService peopleService;

    public SampleController(PeopleService peopleService){
        this.peopleService = peopleService;
    }

    @GetMapping("/sample")
    public Object test () {
        Map<String,Object> sampleMap = new HashMap<>();
        sampleMap.put("name","beomun");
        sampleMap.put("age","34");

        return sampleMap;
    }

    @GetMapping("/people")
    @ResponseBody
    public List<People> peopleList () {
        this.peopleService.peopleSampleSave();
        return this.peopleService.getPeopleList();
    }

    @GetMapping("/people/{id}")
    @ResponseBody
    public Optional<People> peopleList (@PathVariable("id") String id) {
        return this.peopleService.getPeople(Long.parseLong(id));
    }

}
