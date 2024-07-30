package com.example.mockito_practice.business;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplStubTest {
    @Test
    void test(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);
        int result = business.findTheGreatestFromAllData();
        assertEquals(25,result);
    }
}
class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[] {25,15,5};
    }
}
