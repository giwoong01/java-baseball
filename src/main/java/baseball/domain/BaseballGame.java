package baseball.domain;

import baseball.view.Input;
import baseball.view.Output;

public class BaseballGame {

    private final Input input;
    private final Output output;
    private final BaseballReferee baseballReferee;

    public BaseballGame(Input input, Output output, BaseballReferee baseballReferee) {
        this.input = input;
        this.output = output;
        this.baseballReferee = baseballReferee;
    }

    public void start() {
        output.gameStartMessage();
        boolean again = true;

        while (again) {
            baseballReferee.numberReferee();
            again = input.reGame();
        }

    }


}
