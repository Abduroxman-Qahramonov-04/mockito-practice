package com.example.mockito_practice.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    void simpleTest(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3,listMock.size());
    }
    @Test
    void multipleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1,listMock.size());
        assertEquals(2,listMock.size());
    }
    @Test
    void parameters(){
        List listMock = mock(List.class);
        when(listMock.getFirst()).thenReturn("Some string back");
        assertEquals("Some string back",listMock.getFirst());
        assertEquals("Some string back",listMock.getFirst() );
    }
}
