package com.dialogflow.app.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class fulfillmentText {

	@JsonProperty("fulfillmentText")
	private String fulfillmentText ;
	
	@JsonProperty("payload")
	private payload payload;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("payload")
	public payload getPayload() {
		return payload;
	}

	@JsonProperty("payload")
	public void setPayload(payload payload) {
		this.payload = payload;
	}

	@JsonProperty("fulfillmentText")
	public String getfulfillmentText() {
		return fulfillmentText;
	}

	@JsonProperty("fulfillmentText")
	public void setfulfillmentText(String fulfillmentText) {
	 this.fulfillmentText = fulfillmentText;
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
}
