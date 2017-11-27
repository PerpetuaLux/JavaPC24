class Hour9Activity2 {
    public static void main(String[] args) {
        int[] multiples = new int[400];
        for (int x = 0; x < 400; x++) {
        //store first 400 multiples of 13
        multiples[x] = (x * 13);
        //print first 400 multiples of 13
        System.out.print(multiples[x] + " ");
    }
        System.out.println();
    }
}