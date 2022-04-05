package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring5.MemberPrinter;
import spring5.MemberSummaryPrinter;
import spring5.VersionPrinter;

@Configuration
@ComponentScan(basePackages = {"spring5"})		//패키지 지정
public class ComAppCtx {
//ChangePasswordService
	//MemberRegisterService
	//MemberDTo
		@Bean
		@Qualifier("printer2")
		public MemberPrinter memberPrinter() {
			return new MemberPrinter();
		}
		
		@Bean
		@Qualifier
		public MemberSummaryPrinter memberPrinter2() {
			return new MemberSummaryPrinter();
		}
		
		@Bean
		public VersionPrinter versionPrinter() {
			VersionPrinter versionPrinter = new VersionPrinter();
			versionPrinter.setMajorVersion(5);
			versionPrinter.setMinorVersion(0);
			return versionPrinter;
		}
		
}
