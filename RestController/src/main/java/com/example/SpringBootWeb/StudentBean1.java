package com.example.SpringBootWeb; 

public class StudentBean1 {
    private int roll;
    private String name;
    private Float mark;
    public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getMark() {
		return mark;
	}
	public void setMark(Float mark) {
		this.mark = mark;
	}
	public StudentBean1(int roll, String name, Float mark) {
		super();
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}
	
}