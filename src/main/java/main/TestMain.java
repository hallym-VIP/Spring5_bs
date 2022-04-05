package main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.TestAppCtx;
import spring5.Client;

public class TestMain {
	public static void main(String[] args) throws IOException {
		AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext(TestAppCtx.class);

		Client client = ctx.getBean(Client.class);
		client.send();

		ctx.close();
	}
}
