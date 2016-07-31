package com.innova.practice.programmingQuestions;

public class CommandLine {
	/*
	 * public void commandLine1()
	 * { Scanner sc = new Scanner(System.in);
	 * while(sc.hasNext()){ System.out.println(sc.next()); sc.close(); } }
	 */
	public static void main(String[] args) {
		// Taking input from command line.
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("sum of the args passed" + sum);
	}
}
