package spring5_autowired_study.di;

public class MemberPrn2 extends MemberPrinter {

	@Override
	public void Print(Member member) {
		System.out.printf(
				"회원정보 : 이름 = %s, 등록일 = %tF %n",			
				member.getName(),
				member.getRegisterDateTime()				
				);
	}

}
