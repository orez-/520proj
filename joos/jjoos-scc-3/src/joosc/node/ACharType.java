/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ACharType extends PType
{
    private TChar _char_;

    public ACharType()
    {
    }

    public ACharType(
        TChar _char_)
    {
        setChar(_char_);

    }
    public Object clone()
    {
        return new ACharType(
            (TChar) cloneNode(_char_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACharType(this);
    }

    public TChar getChar()
    {
        return _char_;
    }

    public void setChar(TChar node)
    {
        if(_char_ != null)
        {
            _char_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _char_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_char_);
    }

    void removeChild(Node child)
    {
        if(_char_ == child)
        {
            _char_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_char_ == oldChild)
        {
            setChar((TChar) newChild);
            return;
        }

    }
}
