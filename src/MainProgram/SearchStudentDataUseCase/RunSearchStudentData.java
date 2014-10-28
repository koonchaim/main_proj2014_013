package MainProgram.SearchStudentDataUseCase;

import MainProgram.SearchStudentDataUseCase.Bean.MajorBean;
import MainProgram.SearchStudentDataUseCase.Bean.SearchStudentDataManageMent;

public class RunSearchStudentData {

	public static void main(String[] args) {
		String studentID = "5304106319";

		SearchStudentDataManageMent searchMng = new SearchStudentDataManageMent();
		if (studentID != null) {
			MajorBean major = searchMng.findStudentByStudentID(studentID);
			// แสดงจำนวนมาเข้าแถว
			int present = searchMng.ListPresent(studentID);
			// แสดงจำนวนขาดเข้าแถว
			int lack = searchMng.ListLack(studentID);
			// แสดงจำนวนลาป่วยเข้าแถว
			int sickLeave = searchMng.ListSickLeave(studentID);
			// แสดงจำนวนลากิจเข้าแถว
			int personalLeave = searchMng.ListPersonalLeave(studentID);
			// แสดงจำนวนมาสายเข้าแถว
			int late = searchMng.ListLate(studentID);
			int calLate = late / 2;
			int lackLate = lack + calLate;
		} else {
			System.out.println("No Data");
		}

	}

}
