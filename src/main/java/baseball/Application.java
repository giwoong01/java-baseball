package baseball;

import baseball.domain.BaseballGame;
import baseball.domain.BaseballReferee;
import baseball.view.Input;
import baseball.view.Output;

public class Application {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame(new Input(), new Output(), new BaseballReferee());
        baseballGame.start();
    }
}
