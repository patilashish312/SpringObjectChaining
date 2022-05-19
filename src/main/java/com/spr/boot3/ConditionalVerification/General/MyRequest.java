package com.spr.boot3.ConditionalVerification.General;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@JsonInclude
@Data
public class MyRequest {

	@JsonProperty
	int id;
	@JsonProperty
	String name;
	@JsonProperty
	String requestType;

}
