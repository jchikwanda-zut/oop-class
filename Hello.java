class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World" + " " +  args.length);
        for (String string : args) {
            System.out.println(string);
        }
    }
}