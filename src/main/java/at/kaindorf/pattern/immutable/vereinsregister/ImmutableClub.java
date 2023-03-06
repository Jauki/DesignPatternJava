package at.kaindorf.pattern.immutable.vereinsregister;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class ImmutableClub {
    private final String name;
    private final int secretCode;

    private final List<Member> memberList;

    public ImmutableClub(String name, int secretCode, List<Member> memberList) {
        this.name = name;
        this.secretCode = secretCode;
        this.memberList = memberList
                .stream()
                .map(member -> new Member(member.getFirstname(), member.getLastname()))
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public List<Member> getMemberList() {
        return memberList
                .stream()
                .map(member -> new Member(member.getFirstname(), member.getLastname()))
                .collect(Collectors.toList());
    }

    public void addMember(Member member) {
        memberList.add(new Member(member.getFirstname(), member.getLastname()));
    }
}
