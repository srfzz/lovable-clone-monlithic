package com.strucify.projects.Lovable_clone.service.projectmember;


import com.strucify.projects.Lovable_clone.dto.member.InviteMemberRequestDto;
import com.strucify.projects.Lovable_clone.dto.member.MemberResponseDto;
import com.strucify.projects.Lovable_clone.dto.member.MemberRoleUpdateRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponseDto> getAllProjectMembers(Long userId, Long projectid) {
        return List.of();
    }

    @Override
    public MemberResponseDto inviteMember(Long projectid, Long userId, InviteMemberRequestDto inviteMemberRequestDto) {
        return null;
    }

    @Override
    public MemberResponseDto updateMemberRole(Long projectid, Long memberid, Long userId, MemberRoleUpdateRequestDto memberRoleUpdateRequestDto) {
        return null;
    }

    @Override
    public void removeMember(Long projectid, Long userId, Long memberid) {

    }


}
