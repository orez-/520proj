/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ASkipStm extends PStm
{

    public ASkipStm()
    {
    }
    public Object clone()
    {
        return new ASkipStm();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASkipStm(this);
    }

    public String toString()
    {
        return "";
    }

    void removeChild(Node child)
    {
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }
}
