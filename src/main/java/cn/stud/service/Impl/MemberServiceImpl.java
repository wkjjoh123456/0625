package cn.stud.service.Impl;

import cn.stud.dao.MemberMapper;
import cn.stud.entity.Member;
import cn.stud.service.MemberService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberMapper memberMapper;
    @Override
    public List<Member> finderMember(Map<String, Object> map) {
        return  memberMapper.finderMember(map);
    }

    @Override
    public Long getTotalMember(Map<String, Object> map) {
        return memberMapper.getTotalMember(map);
    }

    @Override
    public int updateMember(Member member) {
        return memberMapper.updateMember(member);
    }

    @Override
    public int addMember(Member member) {
        return memberMapper.addMember(member);
    }

    @Override
    public int deleteMember(Integer id) {
        return memberMapper.deleteMember(id);
    }
}
