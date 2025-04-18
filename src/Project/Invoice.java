package Project;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Services> servicesList;
    private double totalAmount;

    public Invoice(Customer customer, List<Services> servicesList, double totalAmount) {
        this.customer = customer;
        this.servicesList = new ArrayList<>();
        this.totalAmount = totalAmount;
    }

   public void addservice(Services service)
   { servicesList.add(service);
       totalAmount+= service.getPrice();

    }
    public void printInvoice(){
        System.out.println("----------------Invoice---------------");
        System.out.println("Customer " + customer.getName() +"| Phone" +customer.getPhone());
        System.out.println("Car" + customer.getCar().getModel()+ "Number" + customer.getCar().getCarNumber());
        System.out.println("Services:");
        for(Services service: servicesList){
            System.out.println("#"+ service.getName()+"$"+ service.getPrice());

        }
        System.out.println("Price" +totalAmount);
        System.out.println("---------------------------------------");


    }
}
