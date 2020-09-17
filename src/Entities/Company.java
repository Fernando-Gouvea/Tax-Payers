package Entities;

public class Company extends TaxPayer {
	
	private Integer numberOfemployee;
	
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfemployee) {
		super(name, anualIncome);
		this.numberOfemployee = numberOfemployee;
	}

	public Integer getNumberOfemployee() {
		return numberOfemployee;
	}

	public void setNumberOfemployee(Integer numberOfemployee) {
		this.numberOfemployee = numberOfemployee;
	}

	@Override
	public Double tax() {
		if (numberOfemployee>10){
			return getAnualIncome() * 0.14;
		}
		else return getAnualIncome() * 0.16;
	}

}

