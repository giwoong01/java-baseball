package baseball.domain;

// 컴퓨터가 임의의 랜덤숫자 3개 뽑기

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;

public class ComputerNumber {

    public ComputerNumber() {

    }

    public void randomNumber() {
        ArrayList<Integer> computer = new ArrayList<>();

        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
    }
}
