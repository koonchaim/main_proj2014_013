package MainProgram.LoginUseCase;

import MainProgram.LoginUseCase.Bean.LoginBean;
import MainProgram.LoginUseCase.Bean.LoginManageMent;

public class RunLogin {

	public static void main(String[] args) {
		String username = "admin";
		String password = "123456";

		LoginManageMent loginMng = new LoginManageMent();
		LoginBean loginBean = new LoginBean(username, password);
		loginBean = loginMng.vertifyLogin(loginBean);

		if (loginBean != null) {
			if (loginBean.getStatus().equals("Admin")) {
				System.out.println("Login Pass");
				System.out.println("userStatus : " + loginBean.getStatus());
			} else {
				System.out.println("Login Pass");
				System.out.println("userStatus : " + loginBean.getStatus());
			}
		} else {
			System.out.println("Login False");
		}
	}

}
