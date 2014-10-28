package MainProgram.ViewProfileTeacherUseCase.Bean;


public class MajorBean {
	private String majorName;

	public MajorBean(String majorName) {
		super();
		this.majorName = majorName;
	}

	public MajorBean() {
		super();
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

}
