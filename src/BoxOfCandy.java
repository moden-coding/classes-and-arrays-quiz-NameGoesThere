import java.util.Arrays;

/**
 * Represents a 2-D rectangular box of candy.
 * Row 0 is the TOP row; column 0 is the LEFT-MOST column.
 *
 * Students must complete the two methods marked TODO.
 */
public class BoxOfCandy {

    /** Rectangular array of Candy objects (null indicates an empty slot). */
    private final Candy[][] box;
    /* ----------------------------------------------------------------------
       STUDENTS:  Implement the two methods below exactly as specified by
                  the Google Doc.
       ------------------------------------------------------------------ */

    /**
     * Moves one Candy (if any) within column {@code col} so that row 0 of
     * that column becomes non-empty.
     *
     * @param col the column to fix (0-based index)
     * @return {@code true} if row 0 ends up containing a Candy,
     *         {@code false} otherwise
     */
    public boolean moveCandyToFirstRow(int col) {
        // TODO — write your solution here
        return false;   // placeholder so template compiles
    }

    /**
     * Removes and returns the first Candy (in the required traversal order)
     * whose flavor equals {@code flavor}.
     * Traversal order: bottom row to top row; within each row, left to right.
     *
     * @param flavor the desired flavor
     * @return the removed Candy, or {@code null} if no such Candy exists
     */
    public Candy removeNextByFlavor(String flavor) {
        // TODO — write your solution here
        return null;    // placeholder so template compiles
    }

    /* ----------------------------------------------------------------------
       Optional helper: pretty-prints the box; useful for debugging tests.
       Students may use but need not modify this.

       
       ------------------------------------------------------------------ */



    

    /**
     * Precondition: <code>contents</code> is rectangular and has at least
     * one row and one column.
     * A defensive copy is made so external changes do not affect the box.
     */
    public BoxOfCandy(Candy[][] contents) {
        box = new Candy[contents.length][contents[0].length];
        for (int r = 0; r < contents.length; r++) {
            System.arraycopy(contents[r], 0, box[r], 0, contents[0].length);
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Candy[] row : box) {
            sb.append(Arrays.toString(
                    Arrays.stream(row)
                          .map(c -> c == null ? "." : c.getFlavor().substring(0, 1))
                          .toArray()))
              .append(System.lineSeparator());
        }
        return sb.toString();
    }
}
