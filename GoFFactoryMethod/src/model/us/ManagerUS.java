package model.us;

import model.Employee;

public class ManagerUS extends Employee {

	public ManagerUS() {
		super("Manager", "US$");
	}

	@Override
	public double calculateSalary() {
		// Imagine aqui um lógica de cálculo de salário
		// mensal de gerentes americanos
		return 300000/12;
	}

}
