package com.hellokoding.auth.entity;

public enum Gender {
	


	MALE("Male"),
	FEMALE("Female"),
	OTHER("Other");

	private final String name;       

    private Gender(String s) {
        name = s;
    }


    public String toString() {
       return this.name;
    }
	
}
