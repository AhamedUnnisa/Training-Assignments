package com.springcore;
import java.beans.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

	public class Demo
	{

		public static void main(String[] args) throws Exception
		{
			ExpressionParser parser = new SpelExpressionParser();  
			  
			//arithmetic operator  
			System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue());  
			System.out.println(parser.parseExpression("10 * 10/2").getValue());  
			System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());  
			  
			//logical operator  
			System.out.println(parser.parseExpression("True and True").getValue());  
			  
			//Relational operator  
			System.out.println(parser.parseExpression("'unnisa'.length()==6").getValue());  


		}

	}


