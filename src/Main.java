import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        long [] manager = {24,6,44,4,322};


        SalesManager salesManager= new SalesManager(manager);
        System.out.println(salesManager.average());
        System.out.println(salesManager.max());

    }
}

