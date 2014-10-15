package MainProgram.SearchStudentDataUseCase.Bean;

public class SearchStudentDataManageMent {

	public MajorBean findStudentByStudentID(String studentID) {

		MajorBean major = new MajorBean();
		StudentBean student = new StudentBean("5304106319", "นาย", "นพรัตน์", "เมืองแก้ว");
		EducationLevelBean educationLevel = new EducationLevelBean(2, "ปวส", student);
		major.setMajorName("แผนกวิชาช่างสำรวจ");
		major.setEducationLevel(educationLevel);

		if (studentID.equals(major.getEducationLevel().getStudent().getStudentID())) {
			return major;
		} else {
			major = null;
		}

		return major;
	}

}
