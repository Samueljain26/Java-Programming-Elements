class ProfitCalculator{
        public static void main (String[] args){
        double costPrice =129;
        double sellingPrice =191;
        double profit =sellingPrice - costPrice;
        double profitPercent = (profit/costPrice)*100;

        System.out.print("The Cost Price is INR" + costPrice + " and Selling Price is INR" + sellingPrice +"\n" + "The Profit is INR" + profit + " and the Profit Percentage is " + profitPercent + "%");
}
}
