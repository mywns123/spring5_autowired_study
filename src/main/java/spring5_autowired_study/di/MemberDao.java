package spring5_autowired_study.di;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {
	private static long nextId = 0;
	private Map<String, Member> map = new HashMap<>();

	public Member selectByEmail(String email) {
		return map.get(email);
	}

	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}

	public void update(Member member) {
		map.put(member.getEmail(), member);
	}

	public Collection<Member> selectAll() {
		return map.values();
	}

	public static void setNextId(long nextId) {
		MemberDao.nextId = nextId;
	}

	public void setMap(Map<String, Member> map) {
		this.map = map;
	}

	/*
	 * public void showList() { for(String key : map.keySet()) { Member value =
	 * map.get(key); System.out.println(key + " : " + value); } }
	 */

}
