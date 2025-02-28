class CalculatingDiscount{
        public static void main (String[] args){
        int fees =125000;
        int discountPercent =10;
        int discount = (fees*discountPercent)/100;
        int discountedFees = fees-discount;


        System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " +discountedFees);
}
}
