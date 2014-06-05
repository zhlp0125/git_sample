package git_sample;

public class test {
	public static void main(String[] args) {
		System.out.println("Main method.[master].");
		System.out.println("Run method.[branch1]-->[branch2]-->[merge to branch1]");
	}

	public void run() {
		System.out.println("Run method.[master].");

	}
}
