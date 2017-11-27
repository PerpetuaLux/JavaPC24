class Hour9Activity1 {
    public static void main(String[] args) {
        //initializing all the student scores
        int[][] grades = new int[6][6];
            grades[0][0] = 97; grades[0][1] = 86; grades[0][2] = 91;
            grades[0][3] = 96; grades[0][4] = 87; grades[0][5] = 66;
        
            grades[1][0] = 76; grades[1][1] = 79; grades[1][2] = 68;
            grades[1][3] = 66; grades[1][4] = 68; grades[1][5] = 73;
        
            grades[2][0] = 21; grades[2][1] = 54; grades[2][2] = 55;
            grades[2][3] = 51; grades[2][4] = 87; grades[2][5] = 58;
        
            grades[3][0] = 43; grades[3][1] = 77; grades[3][2] = 68;
            grades[3][3] = 00; grades[3][4] = 56; grades[3][5] = 55;
        
            grades[4][0] = 87; grades[4][1] = 78; grades[4][2] = 89;
            grades[4][3] = 85; grades[4][4] = 91; grades[4][5] = 84;
        
            grades[5][0] = 68; grades[5][1] = 62; grades[5][2] = 60;
            grades[5][3] = 67; grades[5][4] = 71; grades[5][5] = 93;
        //displaying average for each student
        System.out.println("Average Student Scores:");
        int overallAverage[] = new int[6];
        for (int length = 0; length < 6; length++) {
                int average = (grades[length][0] +
                        grades[length][1] +
                        grades[length][2] +
                        grades[length][3] +
                        grades[length][4] +
                        grades[length][5] ) / 6;
                overallAverage[length] = average;
            System.out.print("Student " + (length + 1 ) + ": " + average + "\n");
        }
        //displaying overall average
        System.out.print("Overall Average Score: ");
        int total = (overallAverage[0] +
                overallAverage[1] +
                overallAverage[2] +
                overallAverage[3] +
                overallAverage[4] +
                overallAverage[5] ) / 6;
        System.out.println(total);
    }
}