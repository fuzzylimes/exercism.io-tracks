import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account joe;

    @Before
    public void setup() {
        joe = new Account(1234, "Joe", "Cartoon");
    }

    @Test
    public void getAccountNumber() {
        int actNum = joe.getAccountNumber();
        assertEquals(actNum, 1234);
    }

    @Test
    public void getFname() {
        assertEquals(joe.getFname(), "Joe");
    }

    @Test
    public void setFname() {
        joe.setFname("Joseph");
        assertEquals(joe.getFname(), "Joseph");
    }

    @Test
    public void getLname() {
        assertEquals(joe.getLname(), "Cartoon");
    }

    @Test
    public void setLname() {
        joe.setLname("Joseph");
        assertEquals(joe.getLname(), "Joseph");
    }

    @Test
    public void getTotal() {
        assertEquals(joe.getTotal(), 0.0, .001);
    }

    @Test
    public void setTotal() {
        joe.setTotal(1000.00);
        assertEquals(joe.getTotal(), 1000.00, .001);
    }
}