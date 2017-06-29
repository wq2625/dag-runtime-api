package com.dag.api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DAG {
	
	private String name;
	
	private Map<String, Vertex> vertices;
	private Set<Edge> edges;
	
	private DAG(String name) {
		this.name = name;
		vertices = new HashMap<String, Vertex>();
		edges = new HashSet<Edge>();
	}
	
	public static DAG create(String name) {
		return new DAG(name);
	}
	
	public void addVertex(Vertex vertex) {
		if(vertices.containsKey(vertex.getVertexName()))
			throw new IllegalStateException(
			        "Vertex " + vertex.getVertexName() + " already defined!");
		vertices.put(vertex.getVertexName(), vertex);
	}
	
	public void addEdge(Edge edge) {
		if(!vertices.containsKey(edge.getInputVertex().getVertexName()))
			throw new IllegalArgumentException(
			        "Input vertex " + edge.getInputVertex() + " doesn't exist!");
		
		if(!vertices.containsKey(edge.getOutputVertex().getVertexName()))
			throw new IllegalArgumentException(
			        "Output vertex " + edge.getOutputVertex() + " doesn't exist!");
		
		if(edges.contains(edge))
			throw new IllegalArgumentException(
			        "Edge " + edge + " already defined!");
		
		edge.getInputVertex().addOutputEdge(edge);
		edge.getOutputVertex().addInputEdge(edge);
		
		edges.add(edge);
		
	}

	public String getName() {
		return name;
	}
	
	public Vertex getVertex(String name) {
		return vertices.get(name);
	}
	
	public Set<Vertex> getVertices() {
		Set<Vertex> vs = new HashSet<Vertex>();
		for(String name : vertices.keySet()){
			vs.add(vertices.get(name));
		}
		return vs;
	}
	
	public String convertToJson() {
		
		String dagJson = "";
		
		
		
		return dagJson;
		
	}

}
