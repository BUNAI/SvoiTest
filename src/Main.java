import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] manager = {2,3,4};

        SalesManager salesManager= new SalesManager(manager);
        System.out.println(salesManager.max());

    }
}

