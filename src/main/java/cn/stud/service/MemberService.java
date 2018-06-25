package cn.stud.service;

import cn.stud.entity.Member;
import cn.stud.entity.User;

import java.util.List;
import java.util.Map;

public interface MemberService {



    List<Member> finderMember(Map<String,Object> map);
    public Long getTotalMember(Map<String,Object> map);
    public int updateMember(Member member);
    public int addMember(Member member);
    public int deleteMember(Integer id);

}
