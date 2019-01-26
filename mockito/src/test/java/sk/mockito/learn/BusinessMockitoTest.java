package sk.mockito.learn;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessMockitoTest {

    @Test
    public void findGreatestFromData() {
        DataService dataServiceMock = mock(DataService.class);

        when(dataServiceMock.retrieveData()).thenReturn(new int[] {3, 1, 6, 4, 8});

        Business business = new Business(dataServiceMock);
        int result = business.findGreatestFromData();
        assertEquals(8,result);
    }
}
