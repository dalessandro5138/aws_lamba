package com.awsproject;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HelloTest {

    @Mock
    private Context aContext;

    @Test
    public void myHandler() throws Exception {
        Hello testobject = new Hello();
        int anInt = 1;
        String expected = "1";

        Mockito.when(aContext.getLogger()).thenReturn(new LambdaLogger() {
            public void log(String s) {}
        });

        assertEquals(expected, testobject.myHandler(anInt,aContext));
    }

}