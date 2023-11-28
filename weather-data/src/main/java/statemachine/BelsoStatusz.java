package statemachine;

// TELJESULT -> LEJART (nem lehet), lejarat
// FOLYAMAT -> LEJART (lehet)
public enum BelsoStatusz {

    TELJESULT {

    }, FOLYAMAT {
        @Override
        public BelsoStatusz lejarat() {
            return LEJART;
        }
    }, LEJART {

    };

    public BelsoStatusz lejarat() {
        throw new IllegalArgumentException("Nem lehet áttenni");
    }
}
