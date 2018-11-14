import member.Member;
import member.MemberController;
import member.MemberList;

import java.util.ArrayList;

/**
 * @author Alfred Röttger Rydahl
 * @date 13-11-2018
 */
public class Main {

    public static void main(String[] args) {

        MemberController mc = new MemberController();
        mc.createMember("jens","jens@jensen.dk");
        mc.createMember("jens","jens@jensen2.dk");
        mc.createMember("jens","jens@jensen3.dk");
        MemberList ml = new MemberList();
        ArrayList members = ml.getMembers();

        Member lol = members<1>;


    }


}
