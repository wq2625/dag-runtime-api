package com.dag.api;

public class Edge {
	
	private Vertex inputVertex;
	private Vertex outputVertex;
	
	private Edge(Vertex inputVertex, Vertex outputVertex) {
		this.inputVertex = inputVertex;
		this.outputVertex = outputVertex;
	}
	
	public static Edge create(Vertex inputVertex, Vertex outputVertex) {
		return new Edge(inputVertex, outputVertex);
	}

	public Vertex getInputVertex() {
		return inputVertex;
	}

	public Vertex getOutputVertex() {
		return outputVertex;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inputVertex==null) ? 0 : inputVertex.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(obj==null)return false;
		if(this.getClass()!=obj.getClass())return false;
		
		Edge other = (Edge) obj;
		if(inputVertex==null){
			if(other.getInputVertex()!=null)
				return false;
		}else if(!inputVertex.equals(other.getInputVertex()))
			return false;
		
		if(outputVertex==null){
			if(other.getOutputVertex()!=null)
				return false;
		}else if(!outputVertex.equals(other.getOutputVertex()))
			return false;
		
		return true;
	}

}
