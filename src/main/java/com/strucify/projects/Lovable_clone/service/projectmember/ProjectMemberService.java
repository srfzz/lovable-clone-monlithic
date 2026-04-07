package com.strucify.projects.Lovable_clone.service.projectmember;

import com.strucify.projects.Lovable_clone.dto.member.InviteMemberRequestDto;
import com.strucify.projects.Lovable_clone.dto.member.MemberResponseDto;
import com.strucify.projects.Lovable_clone.dto.member.MemberRoleUpdateRequestDto;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponseDto> getAllProjectMembers(Long userId, Long projectid);

    MemberResponseDto inviteMember(Long projectid, Long userId, InviteMemberRequestDto inviteMemberRequestDto);

    MemberResponseDto updateMemberRole(Long projectid,Long memberid, Long userId, MemberRoleUpdateRequestDto memberRoleUpdateRequestDto);

    void removeMember(Long projectid, Long userId, Long memberid);
}
