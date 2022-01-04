package com.HeraizenAssignmentNo3.QuestionNo5;

public class DbConnection {
	private static DbConnection obj = null;
	

	public static DbConnection getObject() {
		
		 if (obj == null) {
	            obj = new DbConnection();

	        }
		 else {
			 throw new IllegalArgumentException("Object already created");
		 }
	return obj;
	}
	private DbConnection() {
		System.out.println("In constructor");
	}
}
