package MainProgram.SearchStudentDataUseCase;

import MainProgram.SearchStudentDataUseCase.Bean.MajorBean;
import MainProgram.SearchStudentDataUseCase.Bean.SearchStudentDataManageMent;

public class RunSearchStudentData {

	public static void main(String[] args) {
		String studentID = "5304106319";

		SearchStudentDataManageMent searchMng = new SearchStudentDataManageMent();
		MajorBean major = searchMng.findStudentByStudentID(studentID);

		if (major != null) {
			System.out.println("���ʻ�Шӵ�ǹѡ�֡�� :\t" + major.getEducationLevel().getStudent().getStudentID());
			System.out.println("���� - ���ʡ�� :\t" + major.getEducationLevel().getStudent().getAntecedent() + " "
					+ major.getEducationLevel().getStudent().getFirstName() + "  " + major.getEducationLevel().getStudent().getLastName());
			System.out.println("�Ң��Ԫ� :\t\t" + major.getMajorName());
			System.out.println("�дѺ����֡�� :\t" + major.getEducationLevel().getEducationalBackground() + " "
					+ major.getEducationLevel().getEducationLevel());
		} else {
			System.out.println("Not StudentId in DataBase");
		}
	}

}
