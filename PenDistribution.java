class PenDistribution{
        public static void main (String[] args){
        int totalNumberOfPens =14;
        int totalNumberOfStudents =3;
        int undistributedPens =totalNumberOfPens%totalNumberOfStudents;
        int distributedPens =totalNumberOfPens/totalNumberOfStudents;


        System.out.print("The Pen Per Student is " + distributedPens + " and the remaining pen not distributed is "+ undistributedPens);
}
}
