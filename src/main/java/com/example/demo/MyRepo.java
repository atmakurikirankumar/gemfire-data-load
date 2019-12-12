package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.belk.brd.model.BrdModel;

public interface MyRepo extends CrudRepository<BrdModel, String> {

}
