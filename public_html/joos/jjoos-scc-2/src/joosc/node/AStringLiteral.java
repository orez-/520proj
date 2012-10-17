/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AStringLiteral extends PLiteral
{
    private TStringconst _stringconst_;

    public AStringLiteral()
    {
    }

    public AStringLiteral(
        TStringconst _stringconst_)
    {
        setStringconst(_stringconst_);

    }
    public Object clone()
    {
        return new AStringLiteral(
            (TStringconst) cloneNode(_stringconst_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringLiteral(this);
    }

    public TStringconst getStringconst()
    {
        return _stringconst_;
    }

    public void setStringconst(TStringconst node)
    {
        if(_stringconst_ != null)
        {
            _stringconst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _stringconst_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_stringconst_);
    }

    void removeChild(Node child)
    {
        if(_stringconst_ == child)
        {
            _stringconst_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_stringconst_ == oldChild)
        {
            setStringconst((TStringconst) newChild);
            return;
        }

    }
}