package racingcar;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;

public class View {

	private static final String INPUT_TEXT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUT_TRY_COUNT = "시도할 횟수는 몇 회인가요?";
	private static final String RESULT_TEXT = "최종 우승자 : ";

	public void printStart() {
		System.out.println(INPUT_TEXT);
	}

	public String getInputText() {
		return Console.readLine();
	}

	public void printTryCount() {
		System.out.println(INPUT_TRY_COUNT);
	}

	public Integer getInputCount() {
		return Integer.parseInt(Console.readLine());
	}

	public void printResult(List<String> winners) {
		System.out.println(RESULT_TEXT + String.join(", ", winners));
	}

}
