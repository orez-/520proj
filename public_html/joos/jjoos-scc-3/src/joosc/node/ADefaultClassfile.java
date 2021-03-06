/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ADefaultClassfile extends PClassfile
{
    private PClass _pClass_;

    public ADefaultClassfile()
    {
    }

    public ADefaultClassfile(
        PClass _pClass_)
    {
        setPClass(_pClass_);

    }
    public Object clone()
    {
        return new ADefaultClassfile(
            (PClass) cloneNode(_pClass_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefaultClassfile(this);
    }

    public PClass getPClass()
    {
        return _pClass_;
    }

    public void setPClass(PClass node)
    {
        if(_pClass_ != null)
        {
            _pClass_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pClass_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_pClass_);
    }

    void removeChild(Node child)
    {
        if(_pClass_ == child)
        {
            _pClass_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_pClass_ == oldChild)
        {
            setPClass((PClass) newChild);
            return;
        }

    }
}
