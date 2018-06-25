package cn.stud.dao;

import cn.stud.entity.Member;

import java.util.List;
import java.util.Map;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    List<Member> finderMember(Map<String,Object> map);
    public Long getTotalMember(Map<String,Object> map);
    public int updateMember(Member member);
    public int addMember(Member member);
    public int deleteMember(Integer id);
}