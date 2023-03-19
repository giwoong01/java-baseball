package baseball.domain;

public class BaseballGame {

    public BaseballGame() {

    }

    public void start() {
        ComputerNumber computerNumber = new ComputerNumber();
        computerNumber.randomNumber();
    }
}
