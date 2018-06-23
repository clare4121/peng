package bank;

public class Bank {
    private Customer[] customers;
    private  int numberOfCustomer;



    public Bank(){
        customers=new Customer[10];
    }
    public void addCustomer(String f,String l){
        Customer customer=new Customer(f,l);
        customers[numberOfCustomer]=customer;
        numberOfCustomer++;
    }
    public int getNumOfCustomers(){
        return numberOfCustomer;
    }
    public Customer getCustomers(int index) {
        return customers[index];
    }
}
