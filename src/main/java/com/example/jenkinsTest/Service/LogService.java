package com.example.jenkinsTest.Service;

import com.example.jenkinsTest.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogService {
    private final MyLogger myLogger;

    public String log(String id){
        return myLogger.log(id);
    }
}
