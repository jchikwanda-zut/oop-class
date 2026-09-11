package com;

import com.zut.Probe;

public class Auditor {
    public void inspect() {
        Probe p = new Probe();
        System.out.println("Public from Auditor class in package called (com): " + p._public);
        // System.out.println("Default or Package-Private: " + p._default);
        // System.out.println("Protected: " + p._protected);
    }
}
