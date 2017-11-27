package Java24;

class Hour11Activity {
    public static void main(String[] args) {
        float fArgs = Float.parseFloat(args[0]);
        Float oFArgs = new Float(fArgs);
        int iOFArgs = oFArgs.intValue();
        System.out.println("The converted value is: " + iOFArgs);
    }
}