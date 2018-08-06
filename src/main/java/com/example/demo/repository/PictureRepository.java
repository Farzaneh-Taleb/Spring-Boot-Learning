package com.example.demo.repository;

import com.example.demo.domain.PictureMapping;
import org.springframework.data.repository.CrudRepository;

public interface PictureRepository extends CrudRepository<PictureMapping, Long> {

}
