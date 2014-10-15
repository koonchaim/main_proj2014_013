package MainProgram.SearchStudentDataUseCase.Bean;

public class StudentBean extends PersonBean {
	private String studentID;

	public StudentBean() {

	}

	public StudentBean(String studentID, String antecedent, String firstName, String lastName) {
		super(antecedent, firstName, lastName);
		this.studentID = studentID;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

}
