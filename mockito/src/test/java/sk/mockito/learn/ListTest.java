package sk.mockito.learn;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

	@Test
	public void list() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(5);
		assertEquals(5,listMock.size());
		assertEquals(5,listMock.size());
	}

	@Test
	public void listMultipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5,listMock.size());
		assertEquals(10,listMock.size());
	}
}

