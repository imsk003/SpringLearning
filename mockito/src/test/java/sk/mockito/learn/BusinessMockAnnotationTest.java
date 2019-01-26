package sk.mockito.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BusinessMockAnnotationTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    Business business;

    @Test
    public void findGreatestFromData() {

        when(dataServiceMock.retrieveData()).thenReturn(new int[] {3, 1, 6, 4, 8});
        int result = business.findGreatestFromData();
        assertEquals(8,result);
    }
}
