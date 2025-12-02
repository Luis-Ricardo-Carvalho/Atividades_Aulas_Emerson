package model.br;

import model.Employee;

public class ManagerBR extends Employee {

	public ManagerBR() {
		super("Gerente", "R$");
	}

	@Override
	public double calculateSalary() {
		// Lógica de cálculo de salário de gerentes
		// brasileiros
		return 20000;
	}

}
