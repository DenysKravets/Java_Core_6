package ua.lviv.lgs.salary;

public class Main 
{
	public static void main(String[] args) 
	{
		HourPayWorker worker1 = new HourPayWorker(60);
		MonthlyPayWorker worker2 = new MonthlyPayWorker(10000);
		
		int time = 78;
		System.out.println("worker1 salary for " + time + " " + worker1.getUnitTime() + " equals " + worker1.salary(time));
		time = 3;
		System.out.println("worker2 salary for " + time + " " + worker2.getUnitTime() + " equals " + worker2.salary(time));
	}
}
