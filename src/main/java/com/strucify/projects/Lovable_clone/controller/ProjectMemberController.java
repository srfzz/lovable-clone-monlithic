package com.strucify.projects.Lovable_clone.controller;

import com.strucify.projects.Lovable_clone.dto.member.InviteMemberRequestDto;
import com.strucify.projects.Lovable_clone.dto.member.MemberResponseDto;
import com.strucify.projects.Lovable_clone.dto.member.MemberRoleUpdateRequestDto;
import com.strucify.projects.Lovable_clone.service.projectmember.ProjectMemberService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectid}/members")
@Slf4j
public class ProjectMemberController {


    private final ProjectMemberService projectMemberService;

    public ProjectMemberController(ProjectMemberService projectMemberService) {
        this.projectMemberService = projectMemberService;
    }


    @GetMapping()
    public ResponseEntity<List<MemberResponseDto>> getMembers(@PathVariable("projectid") Long projectid) {
        Long userId=1l;
        return ResponseEntity.ok().body(projectMemberService.getAllProjectMembers(userId,projectid));
    }

    @PostMapping()
    public ResponseEntity<MemberResponseDto> inviteMember(
            @PathVariable("projectid") Long projectid,
            @RequestBody InviteMemberRequestDto inviteMemberRequestDto
                                                          ){
        Long userId=1l;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteMember(projectid,userId,inviteMemberRequestDto));

    }

    @PatchMapping("{memberId}")
    public ResponseEntity<MemberResponseDto> updateMemberRole(@PathVariable("projectid") Long projectid,
                                                              @PathVariable("memberid") Long memberid, @RequestBody MemberRoleUpdateRequestDto memberRoleUpdateRequestDto)
    {
        Long userId=1l;
        return ResponseEntity.status(HttpStatus.OK).body(projectMemberService.updateMemberRole(projectid,memberid,userId,memberRoleUpdateRequestDto));
    }

    @DeleteMapping("/memberid")
    public ResponseEntity<Void> deleteMember(@PathVariable Long projectid, @PathVariable Long memberid){
        Long userId=1l;
        projectMemberService.removeMember(projectid,userId,memberid);
        return ResponseEntity.noContent().build();
    }
}
