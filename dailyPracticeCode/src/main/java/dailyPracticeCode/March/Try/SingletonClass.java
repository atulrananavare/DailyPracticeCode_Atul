package dailyPracticeCode.March.Try;

public class SingletonClass {

	private static SingletonClass singleton;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (singleton == null) {
			singleton = new SingletonClass();
		}
		return singleton;

	}

	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		SingletonClass s3 = SingletonClass.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
