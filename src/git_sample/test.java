package git_sample;

public class test {
	public static void main(String[] args) {
		System.out.println("Main method.[master].");
		System.out.println("Run method.[branch1]-->[branch2]-->[merge to branch1]");
		System.out.println("Main method.[master]-->[branch3]");
		System.out.println("Main method.[local]");
		System.out.println("Main method.[remote server]");
		System.out.println("Main method [local before branch10 master]");
		System.out.println("Main method [local branch10]");
		System.out.println("Main method.[remote server]");
		System.out.println("Main method.[remote server before branch10]");
	}

	public void run() {
		System.out.println("Run method.[master].");
		System.out.println("Run method.[master]-->[branch3]");
	}
}
