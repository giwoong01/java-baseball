package baseball.domain;

import baseball.view.Input;
import baseball.view.Output;

import java.util.List;

public class BaseballReferee {
    private final Input input;
    private final Output output;
    private final NumberCompare numberCompare;
    private final ComputerNumber computerNumber;

    private static final int ZERO = 0;


    public BaseballReferee() {
        this.input = new Input();
        this.output = new Output();
        this.numberCompare = new NumberCompare();
        this.computerNumber = new ComputerNumber();
    }

    public String referee(List<Integer> computerNumber, List<Integer> playerNumber) {
        int total = numberCompare.equalNumber(computerNumber, playerNumber);
        int strike = numberCompare.countStrike(computerNumber, playerNumber);
        int ball = total - strike;

        if (total == ZERO) {
            return output.nothing();
        } else if (strike == ZERO) {
            return ball + output.ball();
        } else if (ball == ZERO) {
            return strike + output.strike();
        } else {
            return ball + output.ball() + " " + strike + output.strike();
        }

    }

    public void numberReferee() {
        List<Integer> randomNumber = computerNumber.randomNumber();
        String result = "";
        while (!result.equals(output.threeStrike())) {
            result = referee(randomNumber, input.playerNumber());
            System.out.println(result);
        }
    }

}
