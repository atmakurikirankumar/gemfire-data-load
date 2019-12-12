package com.belk.brd.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Region("akk_test_region")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BrdModel implements Serializable {

	private static final long serialVersionUID = 4853947921074877680L;

	@JsonProperty(value = "emailId", required = false)
	@Id
	private String emailId;

	@JsonProperty(value = "ecomm_cust_id", required = false)
	private String ecomm_cust_id;

	@JsonProperty(value = "cust_id", required = false)
	private String cust_id;
}
