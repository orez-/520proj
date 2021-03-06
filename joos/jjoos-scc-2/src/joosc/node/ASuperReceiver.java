/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ASuperReceiver extends PReceiver
{
    private TSuper _super_;

    public ASuperReceiver()
    {
    }

    public ASuperReceiver(
        TSuper _super_)
    {
        setSuper(_super_);

    }
    public Object clone()
    {
        return new ASuperReceiver(
            (TSuper) cloneNode(_super_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASuperReceiver(this);
    }

    public TSuper getSuper()
    {
        return _super_;
    }

    public void setSuper(TSuper node)
    {
        if(_super_ != null)
        {
            _super_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _super_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_super_);
    }

    void removeChild(Node child)
    {
        if(_super_ == child)
        {
            _super_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_super_ == oldChild)
        {
            setSuper((TSuper) newChild);
            return;
        }

    }
}
