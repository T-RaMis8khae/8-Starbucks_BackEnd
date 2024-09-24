package TRaMis8khae.starbucks.auth.dto.in;

import TRaMis8khae.starbucks.auth.vo.in.UpdateMemberInfoRequestVo;
import TRaMis8khae.starbucks.member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class UpdateMemberInfoRequestDto {

    private String nickname;

    private String phoneNumber;

    @Builder
    public UpdateMemberInfoRequestDto(String nickname, String phoneNumber) {
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
    }

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