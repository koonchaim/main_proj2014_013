package MainProgram.SearchStudentDataUseCase.Bean;

public class PersonBean {
	private String antecedent;
	private String firstName;
	private String lastName;

	public PersonBean() {

	}

	public PersonBean(String antecedent, String firstName, String lastName) {
		this.antecedent = antecedent;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// get/set/toString
	public String getAntecedent() {
		return antecedent;
	}

	public void setAntecedent(String antecedent) {
		this.antecedent = antecedent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
