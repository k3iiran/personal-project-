package Bank;

public class NationwideMain{
	public void NetSalary(int Salary,int Absentis) throws AbsentiesException{ 
		float Tax=0, Net=0;
		if(Absentis>5) {
			AbsentiesException e4=new AbsentiesException();
			throw e4;
		}
		Tax=Salary*21/100;
		Net=Salary-Tax;
		System.out.println("Net salary is"+Net);
	}
}
