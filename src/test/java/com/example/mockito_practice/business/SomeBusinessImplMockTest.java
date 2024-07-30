package com.example.mockito_practice.business;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
    @Mock
    private DataService dataServiceMock;
    @InjectMocks
    private SomeBusinessImpl business;

    @Test
    void test(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25,15,5});
        assertEquals(25,business.findTheGreatestFromAllData());
    }
}

