class Threading {
    public static void main(String[] args){
        Thread t = new Thread("This is my Thread String.");
        t.start();
        String s = t.getName();
        System.out.println(s);
        System.out.println(t.getState());
    }
}
