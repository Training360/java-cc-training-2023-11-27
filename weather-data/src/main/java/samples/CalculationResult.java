package samples;

import lombok.Value;

import java.util.List;

@Value
public class CalculationResult {

    private enum CalculationResultType {SUCCESS, SUCCESS_WITH_WARNINGS, ERROR}

    private CalculationResultType success;

    private List<String> errorMessages;

    private List<String> warningMessages;

    // Ez nem lehet negatív
    private int result;

    private CalculationResult(CalculationResultType success, List<String> errorMessages, List<String> warningMessages, int result) {
        if (result < 0) {
            throw new IllegalArgumentException("Result can not be negative: %d".formatted(result));
        }
        this.success = success;
        this.errorMessages = errorMessages;
        this.warningMessages = warningMessages;
        this.result = result;
    }

    public static CalculationResult error(List<String> errorMessages) {
        return new CalculationResult(CalculationResultType.ERROR, errorMessages, List.of(), -1);
    }

    public static CalculationResult successWithWarnings(List<String> warningMessages, int result) {
        return new CalculationResult(CalculationResultType.SUCCESS_WITH_WARNINGS, List.of(), warningMessages, result);
    }

    public static CalculationResult success(int result) {
        return new CalculationResult(CalculationResultType.SUCCESS, List.of(), List.of(), result);
    }
}
