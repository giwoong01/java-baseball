package baseball.domain;

import java.util.List;

// 숫자 비교 클래스
public class NumberCompare {

    // 스트라이크 횟수
    public int countStrike(List<Integer> computerNumber, List<Integer> playerNumber) {
        int strike = 0;
        for (int i = 0; i < playerNumber.size(); i++) {
            if (computerNumber.get(i) == playerNumber.get(i)) {
                strike += 1;
            }
        }

        return strike;
    }

    // 위치 상관없이 숫자가 같은지 확인
    public int equalNumber(List<Integer> computerNumber, List<Integer> playerNumber) {
        int equalNumber = 0;
        for (int i = 0; i < playerNumber.size(); i++) {
            if (computerNumber.contains(playerNumber.get(i))) {
                equalNumber += 1;
            }
        }

        return equalNumber;
    }


}
