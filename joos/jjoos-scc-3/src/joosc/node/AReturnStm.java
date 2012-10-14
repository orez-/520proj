/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AReturnStm extends PStm
{
    private PExp _exp_;

    public AReturnStm()
    {
    }

    public AReturnStm(
        PExp _exp_)
    {
        setExp(_exp_);

    }
    public Object clone()
    {
        return new AReturnStm(
            (PExp) cloneNode(_exp_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReturnStm(this);
    }

    public PExp getExp()
    {
        return _exp_;
    }

    public void setExp(PExp node)
    {
        if(_exp_ != null)
        {
            _exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _exp_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_exp_);
    }

    void removeChild(Node child)
    {
        if(_exp_ == child)
        {
            _exp_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

    }
}
