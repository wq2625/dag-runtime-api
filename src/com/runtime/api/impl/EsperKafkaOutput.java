package com.runtime.api.impl;

import com.runtime.api.Output;

public class EsperKafkaOutput implements Output {
	
	private String outputTopic;
	
	public EsperKafkaOutput(String outputTopic) {
		this.outputTopic = outputTopic;
	}
	
	public String getOutputTopic() {
		return outputTopic;
	}

}
