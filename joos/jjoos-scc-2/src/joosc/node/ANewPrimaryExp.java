/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ANewPrimaryExp extends PPrimaryExp
{
    private PClassinstancecreation _classinstancecreation_;

    public ANewPrimaryExp()
    {
    }

    public ANewPrimaryExp(
        PClassinstancecreation _classinstancecreation_)
    {
        setClassinstancecreation(_classinstancecreation_);

    }
    public Object clone()
    {
        return new ANewPrimaryExp(
            (PClassinstancecreation) cloneNode(_classinstancecreation_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANewPrimaryExp(this);
    }

    public PClassinstancecreation getClassinstancecreation()
    {
        return _classinstancecreation_;
    }

    public void setClassinstancecreation(PClassinstancecreation node)
    {
        if(_classinstancecreation_ != null)
        {
            _classinstancecreation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _classinstancecreation_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_classinstancecreation_);
    }

    void removeChild(Node child)
    {
        if(_classinstancecreation_ == child)
        {
            _classinstancecreation_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_classinstancecreation_ == oldChild)
        {
            setClassinstancecreation((PClassinstancecreation) newChild);
            return;
        }

    }
}