package com.beomun.sharebook.sample.service;

import com.beomun.sharebook.sample.entity.People;
import com.beomun.sharebook.sample.repository.PeopleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PeopleService {

    private PeopleRepository peopleRepository;

    public PeopleService (PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public void peopleSampleSave() {
        peopleRepository.save(People.builder().id(1L).first("park").last("beomun").build());
        peopleRepository.save(People.builder().id(2L).first("kim").last("dohee").build());
    }

    public List<People> getPeopleList () {



        List<People> list = peopleRepository.findAll();
        log.info("List > "+list.toString());
        return list;
    }

    public Optional<People> getPeople (Long id) {
        return peopleRepository.findById(id);
    }

}
