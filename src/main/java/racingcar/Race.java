package racingcar;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Race {

	public List<Integer> startGame(String[] carNames, int tryCount) {
		List<Integer> carMoveCounts = initializeMoveCounts(carNames.length);

		System.out.println("실행 결과");

		for (int round = 0; round < carMoveCounts.size(); round++) {
			moveCars(carMoveCounts);
			printResult(carNames, carMoveCounts);
			System.out.println();
		}

		return carMoveCounts;
	}

	private List<Integer> initializeMoveCounts(int carCount) {
		List<Integer> moveCounts = new ArrayList<>();
		for (int i = 0; i < carCount; i++) {
			moveCounts.add(0);
		}
		return moveCounts;
	}

	private static void moveCars(List<Integer> carMoveCounts) {
		for (int i = 0; i < carMoveCounts.size(); i++) {
			if (canMove()) {
				carMoveCounts.set(i, carMoveCounts.get(i) + 1);
			}
		}
	}

	private static boolean canMove() {
		int randomResult = Randoms.pickNumberInRange(0, 9);
		return randomResult >= 4;
	}

	private static void printResult(String[] carNames, List<Integer> carMoveCounts) {
		for (int index = 0; index < carNames.length; index++) {
			System.out.println(carNames[index] + " : " + repeatDash(carMoveCounts.get(index)));
		}
	}

	private static String repeatDash(int count) {
		return "-".repeat(count);
	}

}
