package spring5_component_scan_study.spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class MemberDao {

	private static long nextId = 0;	
	//map이 db라고 생각
	private Map<String, Member> map = new HashMap<>();
	
	public Collection<Member> selectAll(){
		return map.values();
	}
//	맵으로 by 범건이형
//	public Map<String, Member> selectAll(){
//		return map;
//	}
//	
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
}
