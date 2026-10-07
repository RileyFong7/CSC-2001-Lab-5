import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //LLStack LLexample1 = new LLStack(new Node("1", new Node("2", null)));
    LLStack LLexample2 = LLStack.empty_stack();
    //LLStack LLexample3 = new LLStack(new Node("1", new Node("2", null)));
    AStack Aexample1 = AStack.empty_stack();


    @Test
    void LLpushpop() {
        long duration = 0;
        long n = 1;
        long count = 0;
        long targetduration = 100;
        while (duration < targetduration) {
            long startTime = System.nanoTime();
            while (count < n) {
                LLexample2.push("1");
                count++;
                //IO.println("pushed");
            }
            //IO.println(count);
            for (int i = 0; i < count - 1; i++) {
                LLexample2.pop();
                //IO.println("popped");
            }
            long endTime = System.nanoTime();
            duration = duration + ((endTime - startTime) / 1000000);  //divide by 1000000 to get milliseconds.
            n *= 2;
            count = 0;
        }
        IO.println(duration + " milliseconds: ~" + n / 2 + " items pushed and popped.");
        IO.println("calling push and pop took " + duration + " milliseconds.\n");
    }

    @Test
    void Apush() {
        long duration = 0;
        long n = 1;
        long count = 0;
        long targetduration = 100;
        while (duration < targetduration) {
            long startTime = System.nanoTime();
            while (count < n) {
                Aexample1.push("1");
                count++;
                //IO.println("pushed");
            }
            //IO.println(count);
            for (int i = 0; i < count - 1; i++) {
                Aexample1.pop();
                //IO.println("popped");
            }
            long endTime = System.nanoTime();
            duration = duration + ((endTime - startTime) / 1000000);  //divide by 1000000 to get milliseconds.
            n *= 2;
            count = 0;
        }
        IO.println(duration + " milliseconds: ~" + n / 2 + " items pushed and popped.");
        IO.println("calling push and pop took " + duration + " milliseconds.\n");
    }
}