package task2;

import java.time.LocalDate;

public class Customer {
    private long id;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Customer() {
    }

    public Customer(long id, String name, String email, String phoneNumber, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    // Create - create method (massivke jany kirgizebiz)
    // Read   - get all , getById methods (massivdin ichindegi dannyilardy alabyz)
    // Update  - update method (dannyi ozgortuu)
    // Delete - massivden dannyidy ochurobyz

//    TODO massiv ,bul bizdin BAZA(Maalymat saktoochu jer) bolup turat!!!!

    //    TODO Crud methods
    // create
    public Customer[] createCustomer(Customer[] customers, Customer customer) {
        // jany massiv tuzduk , anyn razmeri esli massivdin razmerine barabar jana
        // jany object koshkondo 1 koshulup turat
        Customer[] newCustomers = new Customer[customers.length + 1];

        // jany massivke eski massivdin dannyilaryn kochurup koiduk
        for (int i = 0; i < customers.length; i++) {
            newCustomers[i] = customers[i];
        }

        // jany customerdi bazaga kirgiztik
        newCustomers[customers.length] = customer;
        customers = newCustomers;

        return customers;
    }

    // read
    public Customer[] getAllCustomers(Customer[] customers) {
        return customers;
    }

    public Customer getById(long id, Customer[] customers) {
        for (Customer customer : customers) {
            if (customer != null && customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    // update
    public Customer[] updateCustomer(long id, Customer[] customers, Customer updateCustomer) { // azmar
        Customer customer = getById(id, customers); // fatima
        if (customer != null) {
            customer.setName(updateCustomer.getName());
            customer.setEmail(updateCustomer.getEmail());
        }
        return customers;
    }

    // delete
    public Customer[] deleteCustomer(long id,Customer[]customers){
        int indexx=0;

        for (int i = 0; i < customers.length; i++) {
            if(customers[i]!=null&&customers[i].getId()==id){
                indexx=i;
            }
        }

        Customer[]newArr1=new Customer[indexx];
        for (int i = 0; i < newArr1.length; i++) {
            newArr1[i]=customers[i];
        }
        Customer[]newArr2=new Customer[customers.length- (newArr1.length-1)];
        int indexContinue= newArr1.length;

        for (int i = 0; i < newArr2.length; i++) {
            newArr2[i]=customers[indexContinue];
            indexContinue++;
        }
        Customer []returnArr=new Customer[customers.length-1];

        int continue1=0;
        for (int i = 0; i < returnArr.length; i++) {
            returnArr[i]=newArr1[i];
            continue1=i;
        }
        for (int i = 0; i < returnArr.length; i++) {
            returnArr[continue1+1]=newArr2[i];
        }
        return returnArr;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


}
