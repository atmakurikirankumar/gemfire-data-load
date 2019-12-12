package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.belk.brd.model.BrdModelList;

@RestController
public class RegionLoadDataController {

	@Autowired
	private MyRepo myRepo;

	@PostMapping(value = "/data/addAll")
	public ResponseEntity<BrdModelList> addAll(@RequestBody BrdModelList brdData) {
		this.myRepo.saveAll(brdData.getBrdModels());
		System.out.println("Saved all ");
		return new ResponseEntity<BrdModelList>(brdData, HttpStatus.OK);
	}

}
