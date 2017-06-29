package com.runtime.api.impl;

import com.runtime.api.Processor;

public class EsperKafkaProcessor implements Processor {
	
	private String eventType;
	private String epl;
	
	private StringBuilder eventProps;
	private StringBuilder propClasses;
	
	public EsperKafkaProcessor() {
		eventType = "";
		epl = "";
		
		eventProps = new StringBuilder();
		propClasses = new StringBuilder();
	}
	
	public void addEventProp(String propName, String propClass) {
		
		eventProps.append(propName).append(" ");
		propClasses.append(propClass).append(" ");
		
	}

	public String getEventType() {
		return eventType;
	}

	public String getEpl() {
		return epl;
	}

	public String getEventProps() {
		return eventProps.toString();
	}
	
	public String getPropClasses() {
		return propClasses.toString();
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public void setEpl(String epl) {
		this.epl = epl;
	}
	
	

}
