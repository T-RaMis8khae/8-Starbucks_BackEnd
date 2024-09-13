package TRaMis8khae.starbucks.auth.dto;

import TRaMis8khae.starbucks.auth.vo.FindMemberResponseVo;
import TRaMis8khae.starbucks.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindMemberResponseDto {

    private String loginId;

    public static FindMemberResponseDto toDto(Member member) {
        return FindMemberResponseDto.builder()
                .loginId(member.getLoginId())
                .build();
    }

    public FindMemberResponseVo toVo() {
        return FindMemberResponseVo.builder()
                .loginId(loginId)
                .build();
    }

}