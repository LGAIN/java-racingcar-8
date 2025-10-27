package racingcar;

public class Validator {

	private static final String NAME_ERROR = "잘못된 이름입니다.";
	private static final String NAME_EMPTY_ERROR = "이름이 비어있습니다.";
	private static final String NAME_LENGTH_ERROR = "이름은 1자 이상 5자 이하로만 가능합니다.";
	private static final String TRY_COUNT_ERROR = "1 이상의 값을 입력해주세요.";

	public static void validateCarNameLength(String[] carName) {
		if (carName.length == 0) {
			throw new IllegalArgumentException(NAME_EMPTY_ERROR);
		}

		for (String name : carName) {
			if (name.isEmpty() || name.length() > 5) {
				throw new IllegalArgumentException(NAME_LENGTH_ERROR);
			}
		}
	}

	public static void validateTryCount(int tryCount) {
		if (tryCount < 1) {
			throw new IllegalArgumentException(TRY_COUNT_ERROR);
		}
	}
}
