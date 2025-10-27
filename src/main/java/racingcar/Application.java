package racingcar;

import java.util.List;

public class Application {
	public static void main(String[] args) {

		try {
			View view = new View();
			InputParser inputParser = new InputParser();
			Race race = new Race();
			Judge judge = new Judge();

			// 자동차 이름 입력 및 검증
			view.printStart();
			String inputText = view.getInputText();
			String[] inputs = inputParser.parseInput(inputText);
			Validator.validateCarNameLength(inputs);

			// 시도 횟수 입력 및 검증
			view.printTryCount();
			Integer inputCount = view.getInputCount();
			Validator.validateTryCount(inputCount);

			// 경기 진행 및 우승자 판별
			List<Integer> carMoveCounts = race.startGame(inputs, inputCount);
			List<String> winners = judge.findWinners(inputs, carMoveCounts);

			// 결과 출력
			view.printResult(winners);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());

			return;
		}

	}
}
