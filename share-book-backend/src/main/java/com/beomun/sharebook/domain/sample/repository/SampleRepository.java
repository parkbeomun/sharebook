package com.beomun.sharebook.domain.sample.repository;

import com.beomun.sharebook.domain.sample.entity.Sample;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SampleRepository extends CrudRepository<Sample, Long> {

    List<Sample> findAll();
    Sample findById(String id);
}
