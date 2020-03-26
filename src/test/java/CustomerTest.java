import org.junit.Before;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Terrence", 50000.00);
    }
}
