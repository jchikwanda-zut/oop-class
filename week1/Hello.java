class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World " + " " +args.length);

        // Loop through array
        for (String msg : args) {
            System.out.println(msg);
        }
    }
}