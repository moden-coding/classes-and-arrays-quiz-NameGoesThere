/**
 * A single piece of candy that has a flavor.
 * This class is intentionally tiny – on the real exam you only needed getFlavor.
 */
public class Candy {

    private final String flavor;   // e.g. "cherry", "orange", "lemon"

    /**
     * Constructs a Candy object with the given flavor.
     * @param flavor non-null String describing the flavor
     */
    public Candy(String flavor) {
        if (flavor == null) {
            throw new IllegalArgumentException("flavor must not be null");
        }
        this.flavor = flavor;
    }

    /**
     * @return the flavor of this piece of candy
     */
    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return flavor;
    }
}
