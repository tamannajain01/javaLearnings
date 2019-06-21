import java.math.BigDecimal;

public class Employee {
	
	//INSTANCE VARIABLES
	private String name;
	private BigDecimal salary;
	
	//CONSTRUCTORS
	Employee(String name,BigDecimal salary){
		this.name=StringUtil.titleCase(name);
		this.salary=salary;
	}
	
	//METHODS
	public String print() {
		return "Name :"+name+"\nSalary :"+Formatting.currencyFormat(salary)+"\nHRA :"+
				Formatting.currencyFormat(hra())+"\nDA :"+Formatting.currencyFormat(da())+
				"\nTA :"+Formatting.currencyFormat(ta())+"\nPF :"+
				Formatting.currencyFormat(pf())+"\nGross Salary :"+
				Formatting.currencyFormat(gs())+"\nTax :"+Formatting.currencyFormat(tax())+
				"\nNet Salary :"+Formatting.currencyFormat(netSalary());	
	}
	private BigDecimal hra() {
		BigDecimal hraValue=BigDecimal.valueOf(0.3);
		return salary.multiply(hraValue);
	}
	private BigDecimal da() {
		BigDecimal daValue=BigDecimal.valueOf(0.2);
		return salary.multiply(daValue);
	}
	private BigDecimal ta() {
		BigDecimal taValue=BigDecimal.valueOf(0.1);
		return salary.multiply(taValue);
	}
	private BigDecimal pf() {
		BigDecimal pfValue=BigDecimal.valueOf(0.05);
		return salary.multiply(pfValue);
	}
	private BigDecimal gs() {
		return salary.add(hra()).add(da()).add(ta()).subtract(pf());
	}
	private BigDecimal tax() {
		BigDecimal taxValue=BigDecimal.valueOf(0.1);
		return taxValue.multiply(gs());
	}
	private BigDecimal netSalary() {
		return gs().subtract(tax());
	}
}
