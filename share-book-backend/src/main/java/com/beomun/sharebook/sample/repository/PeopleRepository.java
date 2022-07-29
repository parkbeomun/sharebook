package com.beomun.sharebook.sample.repository;

import com.beomun.sharebook.sample.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {
}
