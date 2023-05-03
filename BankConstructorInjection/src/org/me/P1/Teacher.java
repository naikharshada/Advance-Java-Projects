package org.me.P1;

public class Teacher {
	private FullName fn;
	private int tid;
	private double salary;
	public FullName getFn() {
		return fn;
	}
	public void setFn(FullName fn) {
		this.fn = fn;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Teacher(FullName fn, int tid, double salary) {
		super();
		this.fn = fn;
		this.tid = tid;
		this.salary = salary;
	}
	
	public void display()
	{
	System.out.println("Name: "+this.fn);
	System.out.println("Id: "+this.tid);
	System.out.println("salary: "+this.salary);
	}
	
}
