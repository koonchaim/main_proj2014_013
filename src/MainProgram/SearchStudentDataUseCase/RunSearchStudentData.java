package MainProgram.SearchStudentDataUseCase;

import MainProgram.SearchStudentDataUseCase.Bean.MajorBean;
import MainProgram.SearchStudentDataUseCase.Bean.SearchStudentDataManageMent;

public class RunSearchStudentData {

	public static void main(String[] args) {
		String studentID = "5304106319";

		SearchStudentDataManageMent searchMng = new SearchStudentDataManageMent();
		if (studentID != null) {
			MajorBean major = searchMng.findStudentByStudentID(studentID);
			// �ʴ��ӹǹ�������
			int present = searchMng.ListPresent(studentID);
			// �ʴ��ӹǹ�Ҵ�����
			int lack = searchMng.ListLack(studentID);
			// �ʴ��ӹǹ�һ��������
			int sickLeave = searchMng.ListSickLeave(studentID);
			// �ʴ��ӹǹ�ҡԨ�����
			int personalLeave = searchMng.ListPersonalLeave(studentID);
			// �ʴ��ӹǹ����������
			int late = searchMng.ListLate(studentID);
			int calLate = late / 2;
			int lackLate = lack + calLate;
		} else {
			System.out.println("No Data");
		}

	}

}
