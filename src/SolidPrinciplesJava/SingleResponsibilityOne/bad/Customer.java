package SolidPrinciplesJava.SingleResponsibilityOne.bad;


// BAD EX
public class Customer {
    private String name;


    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public void storeCst(String cstName) {
        //..
    }

    public void generateReport(String cstName) {
        //......
    }
}
