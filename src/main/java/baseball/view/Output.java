package baseball.view;

public class Output {
    private static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_NUMBERS_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RE_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static final String NOTHING = "낫싱";
    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String THREE_STRIKE = "3스트라이크";


    public void inputNumberMessage() {
        System.out.print(INPUT_NUMBERS_MESSAGE);
    }

    public void gameStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public void gameEndMessage() {
        System.out.println(GAME_END_MESSAGE);
    }

    public void gameReMessage() {
        System.out.println(RE_GAME_MESSAGE);
    }

    public String nothing() {
        return NOTHING;
    }
    public String strike() {
        return STRIKE;
    }
    public String ball() {
        return BALL;
    }
    public String threeStrike() {
        return THREE_STRIKE;
    }
}
