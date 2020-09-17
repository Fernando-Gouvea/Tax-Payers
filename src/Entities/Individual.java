package Entities;

public class Individual extends TaxPayer{
	
	private Double health;
			

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double health) {
		super(name, anualIncome);
		this.health = health;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}
	
	@Override
	public Double tax() {
		if (getAnualIncome()<20000){
			return getAnualIncome() * 0.15 - health * 0.5;
		}
		else return getAnualIncome() * 0.25 - health * 0.5;
				
			
			
		}
	}

	


