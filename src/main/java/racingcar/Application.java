package racingcar;

public class Application {
	public static void main(String[] args) {

		try {
			View view = new View();
			InputParser inputParser = new InputParser();
			Race race = new Race();

			// 자동차 이름 입력 및 검증
			view.printStart();
			String inputText = view.getInputText();
			String[] inputs = inputParser.parseInput(inputText);
			Validator.validateCarNameLength(inputs);

			// 시도 횟수 입력 및 검증
			view.printTryCount();
			Integer inputCount = view.getInputCount();
			Validator.validateTryCount(inputCount);

			// 결과 출력
			view.printResult();
			race.startGame(inputs, inputCount);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

			return;
		}

	}
}
