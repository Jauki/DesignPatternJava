package at.kaindorf.pattern.immutable.vereinsregister;

import java.util.List;

public class ImmutableTester {
    public static void main(String[] args) {
        Member m1 = new Member("asdf", "jklö");
        List<Member> members = List.of(m1);
        ImmutableClub club = new ImmutableClub( "club", 5, members);
        System.out.println(club.getMemberList());
        m1.setFirstname("changed");
        Member m2 = new Member("asdf", "jklö");
        club.getMemberList().add(m2);
        System.out.println(club.getMemberList());
        m2.setFirstname("changed2");
        System.out.println(club.getMemberList());
        Member m3 = new Member("asdf", "jkl3");
        club.addMember(m3);
        System.out.println(club.getMemberList());
        m3.setFirstname("changed3");
        System.out.println(club.getMemberList());
    }
}
