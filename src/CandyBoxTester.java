/**
 * CandyBoxTester
 * --------------
 * A simple driver that calls the two rubric methods
 *   – moveCandyToFirstRow
 *   – removeNextByFlavor
 * and prints the results so you can verify behavior quickly. 
 * 
 * DO NOT MODIFY ANYTHING IN THIS FILE! 
 */
public class CandyBoxTester {
    public static void main(String[] args) {

        /* ---------- (a) moveCandyToFirstRow tests ---------- */
        BoxOfCandy box1 = makeSampleBox();
        System.out.println("=== moveCandyToFirstRow tests ===");
        System.out.println("Start:\n" + box1);

        System.out.println("A) col 1   top already occupied → expect true, no change");
        System.out.println("   returned: " + box1.moveCandyToFirstRow(1));
        System.out.println(box1);

        System.out.println("B) col 0   top empty, candy below → expect true, candy moves up");
        System.out.println("   returned: " + box1.moveCandyToFirstRow(0));
        System.out.println(box1);

        System.out.println("C) col 3   entire column empty → expect false");
        System.out.println("   returned: " + box1.moveCandyToFirstRow(3));
        System.out.println(box1);

        /* ---------- (b) removeNextByFlavor tests ---------- */
        BoxOfCandy box2 = makeSampleBox();
        System.out.println("=== removeNextByFlavor tests ===");
        System.out.println("Start:\n" + box2);

        System.out.println("D) remove \"cherry\"  → expect row 1 col 0 removed");
        Candy removed = box2.removeNextByFlavor("cherry");
        System.out.println("   returned: " + removed);
        System.out.println(box2);

        System.out.println("E) remove \"orange\"  → expect bottom-row (row 2 col 1) removed");
        removed = box2.removeNextByFlavor("orange");
        System.out.println("   returned: " + removed);
        System.out.println(box2);

        System.out.println("F) remove \"strawberry\" (not present) → expect null");
        removed = box2.removeNextByFlavor("strawberry");
        System.out.println("   returned: " + removed);
        System.out.println(box2);
    }



     /** Builds the 3×4 sample box used in every test. */
    private static BoxOfCandy makeSampleBox() {
        Candy[][] flavors = {
                { null,      new Candy("orange"), null,    null  },
                { new Candy("cherry"),  null,     null,    null  },
                { null,      new Candy("orange"), new Candy("lemon"), null  }
        };
        return new BoxOfCandy(flavors);
    }
}
