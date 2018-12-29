import java.util.Random;

public class Vault {
	int code = new Random().nextInt(1000000);

	boolean tryCode(int guess) {
		if (guess == code) {
			return true;
		} else {
			return false;
		}
	}
}