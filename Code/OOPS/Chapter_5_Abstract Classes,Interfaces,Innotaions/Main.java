class Main{
	public static void main(String[] args) {
		SmartBulb bulb = new SmartBulb();
		contractor contact = new contractor("hello",32,13);
		bulb.checkPower();
		bulb.turnOn();
		contact.calculateSalary();
	}
}