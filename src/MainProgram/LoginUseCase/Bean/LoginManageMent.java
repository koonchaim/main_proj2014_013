package MainProgram.LoginUseCase.Bean;

import java.util.ArrayList;
import java.util.List;

public class LoginManageMent {
	public LoginBean vertifyLogin(LoginBean login) {
		LoginBean loginBean = null;
		try {
			loginBean = findByUsername(login.getUsername(), login.getPassword());
			return loginBean;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return loginBean;
	}

	private LoginBean findByUsername(String username, String password) {
		LoginBean loginBean = new LoginBean();
		List<LoginBean> listLogin = new ArrayList<LoginBean>();
		listLogin.add(new LoginBean("teacher", "123456", "Teacher"));
		listLogin.add(new LoginBean("admin", "123456", "Admin"));
		for (int i = 0; i < listLogin.size(); i++) {
			if (username.equals(listLogin.get(i).getUsername()) && password.equals(listLogin.get(i).getPassword())) {
				LoginBean login = new LoginBean();
				login.setUsername(listLogin.get(i).getUsername());
				login.setPassword(listLogin.get(i).getPassword());
				login.setStatus(listLogin.get(i).getStatus());
				return loginBean = login;
			} else {
				loginBean = null;
			}
		}

		return loginBean;
	}
}
