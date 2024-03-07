package com.SpringBootRunner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConnection {
	@Value("${my.db.driver-class}")
	private String driver;
	@Value("${my.db.url}")
	private String url;
	@Override
	public String toString() {
		return "DbConnection [driver=" + driver + ", url=" + url + "]";
	}
}
