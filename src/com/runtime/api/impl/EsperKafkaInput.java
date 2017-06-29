package com.runtime.api.impl;

import com.runtime.api.Input;

public class EsperKafkaInput implements Input {
	
	private String inputTopic;
	private String groupId;
	
	public EsperKafkaInput(String inputTopic, String groupId) {
		this.groupId = groupId;
		this.inputTopic = inputTopic;
	}

	public String getInputTopic() {
		return inputTopic;
	}

	public String getGroupId() {
		return groupId;
	}

}
