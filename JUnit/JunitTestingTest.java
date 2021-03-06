package io.javabrains;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	class JunitTestingTest {

		
			@BeforeAll
			static void setup(){
				System.out.println("@BeforeAll executed");
			}
		

			@BeforeEach
			void setupThis(){
				System.out.println("@BeforeEach executed");
			}

			@Test
		    void testCalcOne()
			{
				System.out.println("TEST ONE EXECUTED");
			
		    }

		    @Test
		    void testCalcTwo()
		   {
				System.out.println("TEST TWO EXECUTED");
				
		    }

			@AfterEach
			void tearThis(){
				System.out.println("@AfterEach executed");
			}

			@AfterAll
			static void tear(){
				System.out.println("@AfterAll executed");
			}
		}