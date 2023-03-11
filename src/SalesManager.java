public class SalesManager {
    protected int[] sales;


    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min (){
        int minValue = sales[0];
        for(int i=1;i<sales.length;i++){
            if(sales[i] < minValue){
                minValue = sales[i];
            }
        }
        return minValue;
    }

    public  int average() {
        int total = 0;
        int avg;
        for(int i=0; i<sales.length; i++){
            total = total + sales[i];
        }
        return avg = (total-max()-min()) / (sales.length-2);
    }

}
