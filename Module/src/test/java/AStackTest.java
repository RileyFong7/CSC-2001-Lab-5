import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AStackTest {
    AStack example1 = AStack.empty_stack();
    AStack example2 = AStack.empty_stack();
    @Test
    void push(){
        example1.push("1");
        example1.push("2");
        example1.push("3");
        assertTrue(new AStack(new String[] {"1", "2", "3"}, 3).equalElts(example1));
    }
    @Test
    void pop(){
        example1.push("1");
        example1.push("2");
        example1.push("3");
        example2.push("1");
        example2.push("2");
        example1.pop();
        example1.pop();
        example2.pop();
        assertEquals(example1, example2);
    }
    @Test
    void size(){
        example1.push("1");
        example1.push("2");
        example1.push("3");
        assertEquals(3, example1.size());
    }
    @Test
    void peek(){
        example1.push("1");
        example1.push("2");
        example1.push("3");
        assertEquals("3", example1.peek());
    }

}