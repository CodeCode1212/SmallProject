public class WelcomeScreen {
	public static WelcomeScreen screen = new WelcomeScreen();
	public void MainScreen() {
		String SignInScreen = """
				Welcome to our page!
				> Already have an account? -> Press 1 to Log in
				> New member? -> Press 2 to Register
				> 3. Exit
				""";
		System.out.println(SignInScreen);
	}
		
}
