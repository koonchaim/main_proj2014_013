package MainProgram.SearchStudentDataUseCase.Bean;

public class SearchStudentDataManageMent {

	public MajorBean findStudentByStudentID(String studentID) {

		MajorBean major = new MajorBean();
		StudentBean student = new StudentBean("5304106319", "���", "���ѵ��", "���ͧ���");
		EducationLevelBean educationLevel = new EducationLevelBean(2, "���", student);
		major.setMajorName("Ἱ��ԪҪ�ҧ���Ǩ");
		major.setEducationLevel(educationLevel);

		if (studentID.equals(major.getEducationLevel().getStudent().getStudentID())) {
			return major;
		} else {
			major = null;
		}

		return major;
	}

}
