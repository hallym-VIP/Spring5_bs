package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5.MemberDao;
import spring5.MemberPrinter;

@Configuration
public class AppConf1 {
		
		@Bean
		public MemberDao memberDao() {
			return new MemberDao();
		}
		@Bean
		public MemberPrinter memberPrinter() {
			return new MemberPrinter();
		}
}
