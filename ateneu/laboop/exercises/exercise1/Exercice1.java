package ateneu.laboop.exercises.exercise1;

import static ateneu.utils.Output.*;

import ateneu.Calculator;

public class Exercice1 {

	public Exercice1() {
		this.questionA();
		this.questionB();
	}
	
	public void questionA()
	{
		writeQuestion("A", "Revisão: Reproduza o programa do exemplo OlaAteneu.");
		output("Bem-vindo à faculdade Ateneu, Aluno.");
		end();
	}
	
	public void questionB() 
	{
		writeQuestion("B", "Calcule a soma , subtração, multiplicação e divisão de dois valores inteiros e apresente o resultado.");
		
		Integer firstNumber = 5;
		Integer secondNumber = 2;
		
		Calculator calc = new Calculator();
		calc.setNumbers(firstNumber, secondNumber);
		
		// perform a sum...
		output(String.format("the sum of %s and %s is: %s", firstNumber, secondNumber, calc.sum()));
		
		// perform a subtraction...
		output(String.format("the subtraction between %s and %s is: %s", firstNumber, secondNumber, calc.sub()));
		
		// perform a multiplication...
		output(String.format("the multiplication between %s and %s is: %s", firstNumber, secondNumber, calc.multiply()));
		
		// perform a division...
		output(String.format("the division between %s and %s is: %s", firstNumber, secondNumber, calc.divide()));
		
		end();
	}
	
	

}
