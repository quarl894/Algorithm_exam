package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_11056 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= "占쏙이옙占쏙옙占쏙옙占쏙옙占쏙문옙占쏙옙占쏙옙占쏙옙占쏙제옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙는옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙예占쏙옙占제쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙를옙占쏙옙占쏙옙占쏙옙占쏙옙채占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙점占쏙옙占쏙옙占쏙옙占쏙옙占쏙하옙占지쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙않옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙습옙占쏙옙占쏙옙占쏙니옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙다占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙.\n" +
                "\n" +
                "占쏙옙데占쏙옙占쏙옙占쏙옙占쏙옙占쏙이옙占쏙옙占쏙터옙占쏙옙占는쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙한占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙개옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙입占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙니占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙다옙\n" +
                "\n" +
                "占쏙옙占쏙옙占쏙옙입占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙력占쏙옙占쏙옙占쏙옙占쏙옙을占쏙옙占쏙옙占쏙옙占쏙옙占쏙받옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占을쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙필占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙요占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙는옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙없占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙占다쏙옙占쏙옙";

        str = str.replaceAll("占","");
        str = str.replaceAll("쏙","");
        str = str.replaceAll("옙","");
        System.out.println(str);
    }
}
