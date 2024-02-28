public class Main {

    public static void main(String[] args) {

//        CreditManager creditManager = new CreditManager();
//        creditManager.calculate();
//        creditManager.save();
//
//        Customer customer = new Customer();
//        customer.setId(1);
//        customer.setCity("Istanbul");
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.save();
//        customerManager.delete();
//
//        Company company = new Company();
//        company.setTaxNumber("123");
//        company.setCompanyName("Arçelik");
//        company.setId(100);
//
//        CustomerManager customerManager2 = new CustomerManager(company);
//
//        Person person = new Person();
//        person.setNationalIdentity("321");
//
//        Customer c1 = new Customer();
//        Customer c2 = new Company();
//        Customer c3 = new Person();

        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.giveCredit();
        customerManager.save();

    }
}
