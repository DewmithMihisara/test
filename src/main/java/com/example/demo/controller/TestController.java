package com.example.demo.controller;

import com.example.demo.dto.TestDto;
import org.springframework.stereotype.Service;

/**
 * @author Dewmith Mihisara
 * @date 2025-02-07
 * @since 0.0.1
 */
@Service
public class TestController {;
    public void test() {
        TestDto testDto = new TestDto();
        testDto.setId(1L);
        testDto.setName("Dewmith Mihisara");
        testDto.setEmail("mihisra");
        testDto.setToken("token");
        testDto.setRole("role");


        printAll(testDto);
    }

    private void printAll(TestDto testDto) {
        System.out.println("id: " + testDto.getId());
        System.out.println("name: " + testDto.getName());
        System.out.println("email: " + testDto.getEmail());
        System.out.println("token: " + testDto.getToken());
        System.out.println("role: " + testDto.getRole());
    }
}
