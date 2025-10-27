package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Judge {
	public List<String> findWinners(String[] carNames, List<Integer> carMoveCounts) {
		int maxDistance = findMaxDistance(carMoveCounts);
		return findCarsWithMaxDistance(carNames, carMoveCounts, maxDistance);
	}

	private int findMaxDistance(List<Integer> carMoveCounts) {
		return carMoveCounts.stream()
			.mapToInt(Integer::intValue)
			.max()
			.orElseThrow(() -> new IllegalArgumentException("자동차 이동 기록이 없습니다."));
	}

	private List<String> findCarsWithMaxDistance(String[] carNames, List<Integer> carMoveCounts, int maxDistance) {
		List<String> winners = new ArrayList<>();
		for (int i = 0; i < carNames.length; i++) {
			if (carMoveCounts.get(i) == maxDistance) {
				winners.add(carNames[i]);
			}
		}
		return winners;
	}
}
