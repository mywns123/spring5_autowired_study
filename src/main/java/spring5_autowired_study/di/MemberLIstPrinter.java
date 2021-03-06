package spring5_autowired_study.di;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberLIstPrinter {
	
	private MemberDao memberDao;
	
	private MemberPrinter printer;

	public MemberLIstPrinter() {
	}

	public MemberLIstPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}

	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.Print(m));
	}
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	@Autowired
	
	public void setPrinter(MemberPrinter memberPrinter) {
		this.printer = memberPrinter;
	}

}
