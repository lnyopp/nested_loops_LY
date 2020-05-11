
// Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)? Answer in a comment.
// it is variable c in the outerloop.

// Change the order of the loops so that the "c" loop is on the inside and the "n" loop is on the outside. How does the output change?
// instead of repeating each letter 3 times at the same time, then going to the next. ABCDE is repeated 3 times.

// Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? (Then change it back to print().)
// each of the statements is now printed on its own line, instead of a space inbetween. - the pattern is now vertical.

// Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change?
// there is now a space each time the pattern repeats. there are now 3 blocks.

public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.print(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.println(a + "-" + b + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}