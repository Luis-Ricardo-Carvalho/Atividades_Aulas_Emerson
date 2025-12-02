package model.us;

import model.Employee;

public class ProgrammerUS extends Employee {

	public ProgrammerUS() {
		super("Programmer", "US$");
	}

	@Override
	public double calculateSalary() {
		// Lógica de cálculo de salário de programador
		// americano
		return 200000/12;
	}

}
