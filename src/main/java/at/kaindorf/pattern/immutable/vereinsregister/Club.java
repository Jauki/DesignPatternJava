package at.kaindorf.pattern.immutable.vereinsregister;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Club {
    private String name;
    private int secretNumber;

    private List<Member> members = new ArrayList<>();

    public Club(String name, int secretNumber, List<Member> members) {
        this.name = name;
        this.secretNumber = secretNumber;
        this.members = members;
    }

    public void addMember(Member member) {
        if(!members.contains(member)){
            members.add(member);
        }
    }
}
