import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] manager = {434,24,6,44,4};

        SalesManager salesManager= new SalesManager(manager);
        System.out.println(salesManager.average());
        System.out.println(salesManager.max());

    }
}

