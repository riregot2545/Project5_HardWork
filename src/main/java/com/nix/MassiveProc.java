package com.nix;

public class MassiveProc {

    /*3*/
    public int getFirstSign(int[] massive){
        for (int i = 0; i < massive.length; i++) {
            if(massive[0]!=0)
                return (int) Math.signum(massive[0]);
        }
       return 0;
    }


}
