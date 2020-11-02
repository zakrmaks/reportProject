package com.maks.service;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorImplTest {
    IdGenerator id = new IdGeneratorImpl();
   @Test
    void id(){
       assertEquals("4",id.generateId());
   }
   @BeforeEach
   void generateId(){
       id.generateId();
       id.generateId();
       id.generateId();
       id.generateId();
    }
}