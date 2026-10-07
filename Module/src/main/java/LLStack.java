public class LLStack {
    Node head;
    public LLStack(Node head){
        this.head = head;
    }
    public boolean equals(Object o) {
        switch (o) {
            case LLStack stack:
                return this.head.equals(stack.head);
            case null, default:
                return o == null;
        }
    }
    public static LLStack empty_stack(){
        return new LLStack(new Node(null, null));
    }
    public void push(String string){
        if (this.head.first() == null){
            this.head = new Node(string, null);
        }
        else{
            this.head = new Node(string, this.head);

        }
    }
    public String pop(){
        if (this.head.first() == null){
            throw new IllegalStateException("Cannot pop from an empty stack");
        }
        String dead = this.head.first();
        this.head = this.head.rest();
        return dead;
    }
    public String peek(){
        if (this.head.first() == null){
            throw new ArrayIndexOutOfBoundsException("Stack cannot be empty.");
        }else {
            return this.head.first();
        }
    }
    public int size(){
        return Node.size(this.head);
    }
    public boolean is_empty(){
        return (this.head.first() == null);
    }
    public static void main(){

        LLStack example1 = new LLStack(new Node("1", new Node("2", null)));
        LLStack example2 = empty_stack();
        example2.push("2");
        example2.push("1");
        LLStack example3 = new LLStack(new Node ("1", new Node ("2", null)));
        IO.println(example3.equals(example1));
        IO.println(example2.pop());
        IO.println(example2.peek());
        IO.println(example2.pop());
        LLStack example4 = empty_stack();
        IO.println(example4.equals(example2));
        IO.println(example2.is_empty());




    }
}