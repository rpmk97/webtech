class CalculatorDemo {
	
	public static void main(String[]  args) {
		Calculator calculator = new Calculator();

		calculator.sum(12,4);
		calculator.sum(20,10,2);
		calculator.sum(6,20,10,2);
		calculator.sum(10,45,78,6,20,10,2);
		calculator.sum(10,10L);
		calculator.sum(50L,10);
	}
}
