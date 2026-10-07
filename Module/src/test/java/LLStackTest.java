import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LLStackTest {
    LLStack example1 = new LLStack(new Node("1", new Node("2", null)));
    LLStack example2 = LLStack.empty_stack();
    @Test
    void push(){
        example2.push("2");
        example2.push("1");
        assertTrue(new LLStack(new Node("1", new Node("2", null))).equals(example2));
    }
    @Test
    void pop(){
        example1.pop();
        example2.push("2");
        example2.push("1");
        example2.pop();
        assertEquals(example1, example2);
    }
    @Test
    void size(){
        example1.push("1");
        assertEquals(3, example1.size());
    }
    @Test
    void peek(){
        assertEquals("1", example1.peek());
    }

}