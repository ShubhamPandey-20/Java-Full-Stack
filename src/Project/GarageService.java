//package Project;
//
//import java.util.*;
//
//public class GarageService {
//    private Map<String, Customer> customers;
//    private List<Services> availableService;
//
//    public GarageService(Map<String, Customer> customers, List<Services> availableService) {
//        this.customers = new HashMap<>();
//        this.availableService = new ArrayList<>();
//
//    }
//    public void addCustomer(String name, String phone, String carNumber, String Model){
//        Car car = new  Car(carNumber, Model);
//        Customer customer = new Customer(name, phone, car);
//        customers.put(carNumber, customer);
//        System.out.println("Custmer added Succesfully");
//
//
//    }
//    public void createInvoice(String carNumber){
//        if(!customers.containsKey(carNumber)){
//            System.out.println("No car found with the car number with car number" +carNumber);
//            return;
//
//        }
//        Scanner sc = new Scanner(System.in);
//        Customer customer = customers.get(carNumber);
//        Invoice invoice = new Invoice(customer);
//
//
//        System.out.println("Available Services");
//        for(int i=0; i<availableService.size();i++){
//            System.out.println(i+1+ availableService.get(i).getName() + availableService.get(i).getPrice());
//        }
//        while(true){
//            System.out.println("Enter service Number to add");
//
//
//        }
//
//
//    }
//
//
//}
