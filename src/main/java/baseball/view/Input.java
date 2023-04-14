package baseball.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {

    private final Output output;

    public Input() {
        this.output = new Output();
    }


    // 사용자 숫자 입력
    public List<Integer> playerNumber() {
        output.inputNumberMessage();
        Scanner sc = new Scanner(System.in);
        String inputNumber = sc.next();

        return toList(inputNumber);
    }

    public List<Integer> toList(String inputNumber) {
        return Arrays.stream(inputNumber.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public boolean reGame() {
        output.gameEndMessage();
        output.gameReMessage();
        Scanner sc = new Scanner(System.in);
        String reGameInput = sc.next();

        return reGameInput.equals("1");

    }


}
