package com.SpringBootRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootRunner.DbConnection;

@Component
public class MessageRunner implements CommandLineRunner {
	
	@Autowired
	DbConnection dbc;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WELCOME RUNNER!");
		System.out.println(dbc);
		//System.out.println(dbc.toString());
	}
}
