package samples;

import java.util.List;

public class Calculation {

    public CalculationResult calculate(List<Integer> values) {
        return CalculationResult.error(List.of("Hibás érték"));
    }
}
