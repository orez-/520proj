/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AFinalClassmods extends PClassmods
{
    private TFinal _final_;

    public AFinalClassmods()
    {
    }

    public AFinalClassmods(
        TFinal _final_)
    {
        setFinal(_final_);

    }
    public Object clone()
    {
        return new AFinalClassmods(
            (TFinal) cloneNode(_final_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFinalClassmods(this);
    }

    public TFinal getFinal()
    {
        return _final_;
    }

    public void setFinal(TFinal node)
    {
        if(_final_ != null)
        {
            _final_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _final_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_final_);
    }

    void removeChild(Node child)
    {
        if(_final_ == child)
        {
            _final_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_final_ == oldChild)
        {
            setFinal((TFinal) newChild);
            return;
        }

    }
}