package com.example.demo;

public class calculatorService {

	public String calculator(String n1, String n2, String op)
	{
		int result;

		int input1 = Integer.parseInt(n1);
		int input2 = Integer.parseInt(n2);

		switch (op) 
		{
		case "PLUS":
			result = input1 + input2;
			System.out.println(n1 + " + " + n2 + " = " + result);
			
			return Integer.toString(result);

		case "MINUS":
			result = input1 - input2;
			System.out.println(n1 + " - " + n2 + " = " + result);
			
			return Integer.toString(result);

		case "TIMES":
			result = input1 * input2;
			System.out.println(n1 + " * " + n2 + " = " + result);
			
			return Integer.toString(result);

		case "DIVIDE":
			
			if (input1 == 0 || input2 == 0) 
			{result = 0;}
			else
			{ result = input1 / input1; }
			
			System.out.println(n1 + " / " + n2 + " = " + result);
			
			return Integer.toString(result);

		default:
			System.out.println("Invalid operator!");
			
			return "Invalid operator!";
		}
	}

	private String calcDescription() {
		String info = "\" http://localhost:8080/calc?n1=[input1]&n2=[input2]&op=[operator] \""
				+ "\r\n"
				+ "The method /calc [GET] takes in three parameters."
				+ " Input number1, Input number2 and an operator(PLUS, MINUS, TIMES, DIVIDE).";
		return info;
	}

	public String description() {
		return calcDescription();
	}
	
	/*
	@RequestMapping(method = RequestMethod.GET, value = "/sum2")
	public String calculation2(String input) {

		System.out.println(input);

		String operators[] = input.split("[0-9]");
		String operands[] = input.split("[+-]");

		int sum = Integer.parseInt(operands[0]);

		for (int i = 1; i < operands.length; i++) {
			if (operators[i].equals("+")) {
				sum += Integer.parseInt(operands[i]);
			} else if (operators[i].equals("-")) {
				sum -= Integer.parseInt(operands[i]);
			}
		}

		System.out.println(sum);

		String result = Integer.toString(sum);
		return "Result: " + result;
	}
	 */
}
