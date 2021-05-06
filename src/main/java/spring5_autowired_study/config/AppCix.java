package spring5_autowired_study.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_autowired_study.di.ChangePasswordService;
import spring5_autowired_study.di.MemberDao;
import spring5_autowired_study.di.MemberInfoPrinter;
import spring5_autowired_study.di.MemberLIstPrinter;
import spring5_autowired_study.di.MemberPrinter;
import spring5_autowired_study.di.MemberPrn1;
import spring5_autowired_study.di.MemberPrn2;
import spring5_autowired_study.di.MemberRegisterService;
import spring5_autowired_study.di.VersionPrinter;

@Configuration
public class AppCix {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public ChangePasswordService changePwSvc() {
		ChangePasswordService PwSvc = new ChangePasswordService();
		return PwSvc;
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	@Qualifier("printer1")
	public MemberPrinter memberPrinter1() {
		return new MemberPrn1();
	}
	@Bean
	@Qualifier("printer2")
	public MemberPrinter memberPrinter2() {
		return new MemberPrn2();
	}
	@Bean
	public MemberLIstPrinter listPrinter() {
		return new MemberLIstPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		return infoPrinter;
	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		return versionPrinter;
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}

}
