/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AFalseExp extends PExp
{

    public AFalseExp()
    {
    }
    public Object clone()
    {
        return new AFalseExp();
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFalseExp(this);
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
