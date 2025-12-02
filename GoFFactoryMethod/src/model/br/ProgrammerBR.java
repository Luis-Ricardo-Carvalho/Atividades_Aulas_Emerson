package model.br;

import model.Employee;

public class ProgrammerBR extends Employee{

	public ProgrammerBR() {
		super("Programador", "R$");
	}

	@Override
	public double calculateSalary() {
		// Lógica de cálculo de salário para
		// programadores brasileiros
		return 30000;
	}

}
