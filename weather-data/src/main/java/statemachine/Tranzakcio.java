package statemachine;

public class Tranzakcio {

    private BelsoStatusz belsoStatusz;

    public void lejarat() {
        belsoStatusz = belsoStatusz.lejarat();
    }
}
