class Conditions {
	
	public static void main(String[]  args) {
	
		String color = "Green";		
			
		switch(color) {
			
			case "Red" :
				System.out.println("Red is a danger color");
				break;		
			case "Green" :
				System.out.println("Green is always peaceful color");
				break;		
			case "Blue" :
				System.out.println("Blue is cool color");
				break;		
			default :
				System.out.println("Color is white");
		}
	
		//int age = 15;
		//long money = 4000000;	

		/*if(age > 20){
			System.out.println("You are old!!!!");
			if(money > 5000000) {
				System.out.println("You are rich!!!!");
			}
		} else {
			System.out.println("You are young!!!!");
			if(money > 5000000) {
				System.out.println("You are rich!!!!");
			}else {
				System.out.println("You are poor!!!!");
			}
		}*/

		/*if(age > 20 || money > 5000000) {
			System.out.println("You are old and rich!!!!");
		} else {
			System.out.println("You are young and poor!!!!");
		}*/
		
		/*if(age > 20) {
			System.out.println("You are old!!!!");
		} else {
			System.out.println("You are young!!!!");
		}*/
			
	}
}
