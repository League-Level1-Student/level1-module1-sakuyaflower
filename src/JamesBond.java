
public class JamesBond {
	Vault vault = new Vault();

	int findCode() {
		for (int i = 0; i < 1000000; i++) {
			if (vault.tryCode(i) == true) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		JamesBond Bond = new JamesBond();
		int code = Bond.findCode();
		System.out.println(code);
	}
}
