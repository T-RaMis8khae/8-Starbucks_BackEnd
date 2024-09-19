package TRaMis8khae.starbucks.auth.dto;

import TRaMis8khae.starbucks.auth.vo.UpdateMemberInfoRequestVo;
import TRaMis8khae.starbucks.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMemberInfoRequestDto {

    private String nickname;

    private String phoneNumber;

    public static UpdateMemberInfoRequestDto toDto(UpdateMemberInfoRequestVo UpdateMemberInfoRequestVo) {
        return UpdateMemberInfoRequestDto.builder()
                .nickname(UpdateMemberInfoRequestVo.getNickname())
                .phoneNumber(UpdateMemberInfoRequestVo.getPhoneNumber())
                .build();
    }

    public Member toEntity(Member member) {
        return Member.builder()
                .id(member.getId())
                .email(member.getEmail())
                .name(member.getName())
                .memberStatus(member.getMemberStatus())
                .loginId(member.getLoginId())
                .password(member.getPassword())
                .memberUUID(member.getMemberUUID())
                .birth(member.getBirth())
                .address(member.getAddress())
                .paymentPassword(member.getPaymentPassword())
                .nickname(this.nickname)
                .phoneNumber(this.phoneNumber)
                .build();
    }

}