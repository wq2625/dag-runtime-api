package com.dag.api.client;

import com.dag.api.DAG;
import com.dag.api.Edge;
import com.dag.api.Vertex;
import com.runtime.api.Input;
import com.runtime.api.Output;
import com.runtime.api.Processor;
import com.runtime.api.impl.EsperKafkaInput;
import com.runtime.api.impl.EsperKafkaOutput;
import com.runtime.api.impl.EsperKafkaProcessor;

public class DAGClient {
	
	private DAG dag;
	
	public void generateTestDAG() {
		
		Vertex vertex1 = Vertex.create("vertex1");
		Vertex vertex2 = Vertex.create("vertex2");
		
		dag.addVertex(vertex1);
		dag.addVertex(vertex2);
		
		Edge edge1 = Edge.create(vertex1, vertex2);

		dag.addEdge(edge1);
		
		EsperKafkaProcessor processor1 = new EsperKafkaProcessor();
		processor1.setEventType("person_event");
		processor1.setEpl("select * from person_event");
		
		dag.getVertex("vertex1").setProcessor(processor1);
		
		EsperKafkaProcessor processor2 = new EsperKafkaProcessor();
		processor2.setEventType("person_event");
		processor2.setEpl("select * from person_event");
		
		dag.getVertex("vertex2").setProcessor(processor2);
		
	}

}
