package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
    private final Validation validation = new Validation();

    public RandomNumber() {
    }

    public List<Integer> getRandomNumbers(){
        List<Integer> computer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            computer.add(Randoms.pickNumberInRange(1, 9));
        }
        validation.isNumberDuplicate(computer);
        return computer;
    }
}
