class Return {
    public static void main(String[] args) {

        System.out.println("Before exit");
        System.exit(1000000000);
        System.out.println("After exit"); // never executed
        int x= 10;
        System.out.println(x);
    }
}
