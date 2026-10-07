public record Node(String first, Node rest){
    public static int size(Node n){
        switch(n){
            case null:
                return 0;
            case Node(String f, Node r):
                return 1+size(r);
        }
    }
}
