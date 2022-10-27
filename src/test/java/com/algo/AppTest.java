package com.algo;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void uuid(){
        for (int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            String uuid2=uuid.toString().replaceAll("-", "");
            System.out.println(uuid2);
    
        }
    }
    
    @Test
    public void tokenStr(){
        String token = "Ec3NK%2B549Ck9k97XcKW%2BEZap6sz5qxCDsQi6OVsV4pU=";
        System.out.println(token.replaceAll("%", ""));
    }
}
