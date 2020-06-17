package ua.lviv.lgs.salary;

public abstract class Worker implements Salary
{
	private int moneyPerUnitTime;
	private String unitTime;
	
	Worker(int moneyPerUnitTime, String unitTime)
	{
		this.moneyPerUnitTime = moneyPerUnitTime;
		this.unitTime = unitTime;
	}

	public String getUnitTime() {
		return unitTime;
	}

	public void setUnitTime(String unitTime) {
		this.unitTime = unitTime;
	}

	public int getMoneyPerUnitTime() {
		return moneyPerUnitTime;
	}

	public void setMoneyPerTime(int moneyPerUnitTime) {
		this.moneyPerUnitTime = moneyPerUnitTime;
	}

	@Override
	public int salary(int time, int moneyPerUnitTime) 
	{
		return time * moneyPerUnitTime;
	}
	
	public int salary(int time) 
	{
		return time * moneyPerUnitTime;
	}
}
