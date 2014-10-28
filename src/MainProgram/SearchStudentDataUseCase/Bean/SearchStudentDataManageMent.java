package MainProgram.SearchStudentDataUseCase.Bean;

public class SearchStudentDataManageMent {

	public MajorBean findStudentByStudentID(String studentID) {
		MajorBean major = new MajorBean();
		return major;
	}

	public Integer ListPresent(String studentID) {
		Integer present = null;
		return present;
	}

	public Integer ListLack(String studentID) {
		Integer lack = null;
		return lack;
	}

	public Integer ListSickLeave(String studentID) {
		Integer stickLeave = null;
		return stickLeave;
	}

	public Integer ListPersonalLeave(String studentID) {
		Integer persinalLeave = null;
		return persinalLeave;
	}

	public Integer ListLate(String studentID) {
		Integer late = null;
		return late;
	}
}
