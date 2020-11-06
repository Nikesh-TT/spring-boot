package com.nikesh.springsecurity.config;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicSecurityConfigTest {

    TestRestTemplate restTemplate;
    URL base;
    @LocalServerPort
    int port;

    @Before
    public void setUp() throws MalformedURLException{
        restTemplate = new TestRestTemplate("admin", "admin123");
        base = new URL("http://localhost:" + port + "/api/items");
    }

    @Test
    public void whenLoggedAdminRequestsApi_ThenSuccess() throws IllegalStateException, IOException{
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(base.toString(), String.class);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertTrue(responseEntity.getBody().contains("Returned items"));
    }

    @Test
    public void whenUserWithWrongCredentials_thenUnauthorizedStatus() throws Exception{
        restTemplate = new TestRestTemplate("admin", "test123");
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(base.toString(), String.class);

        assertEquals(HttpStatus.UNAUTHORIZED, responseEntity.getStatusCode());
        assertTrue(responseEntity.getBody().contains("Unauthorized"));
    }

}
