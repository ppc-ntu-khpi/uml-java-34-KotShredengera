package Bank;


/**
* @generated
*/
public class Bank {
    
    /**
    * @generated
    */
    private Integer BankID;
    
    /**
    * @generated
    */
    private String Name;
    
    /**
    * @generated
    */
    private String Location;
    
    
    /**
    * @generated
    */
    private Set<Customer> customer;
    
    /**
    * @generated
    */
    private Set<Employee> employee;
    
    
    /**
    * @generated
    */
    public Integer getBankID() {
        return this.BankID;
    }
    
    /**
    * @generated
    */
    public Integer setBankID(Integer BankID) {
        this.BankID = BankID;
    }
    
    /**
    * @generated
    */
    public String getName() {
        return this.Name;
    }
    
    /**
    * @generated
    */
    public String setName(String Name) {
        this.Name = Name;
    }
    
    /**
    * @generated
    */
    public String getLocation() {
        return this.Location;
    }
    
    /**
    * @generated
    */
    public String setLocation(String Location) {
        this.Location = Location;
    }
    
    
    /**
    * @generated
    */
    public Customer getCustomer() {
        return this.customer;
    }
    
    /**
    * @generated
    */
    public Customer setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    /**
    * @generated
    */
    public Employee getEmployee() {
        return this.employee;
    }
    
    /**
    * @generated
    */
    public Employee setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
