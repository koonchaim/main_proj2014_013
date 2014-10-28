package MainProgram.LoginUseCase.Bean;

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
		return loginBean;
	}
}
