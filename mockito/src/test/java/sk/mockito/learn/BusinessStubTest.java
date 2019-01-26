package sk.mockito.learn;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessStubTest {

    @Test
    public void findGreatestFromData() {
        Business business = new Business(new DataServiceStub());
        int result = business.findGreatestFromData();
        assertEquals(8,result);
    }
}
class DataServiceStub implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] {3, 1, 6, 4, 8};
    }
}