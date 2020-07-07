package sign_in_selenium_test;

public class UserNameLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spotifySignInTest driverobj = new spotifySignInTest();
		driverobj.invokeBrowser();
		for(int i = 0; i < 10; i++) {
			driverobj.signIn();
			driverobj.clearForm();
		}
	}

}