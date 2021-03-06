/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ADefaultUnaryExp extends PUnaryExp
{
    private PUnaryExpNotMinus _unaryExpNotMinus_;

    public ADefaultUnaryExp()
    {
    }

    public ADefaultUnaryExp(
        PUnaryExpNotMinus _unaryExpNotMinus_)
    {
        setUnaryExpNotMinus(_unaryExpNotMinus_);

    }
    public Object clone()
    {
        return new ADefaultUnaryExp(
            (PUnaryExpNotMinus) cloneNode(_unaryExpNotMinus_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefaultUnaryExp(this);
    }

    public PUnaryExpNotMinus getUnaryExpNotMinus()
    {
        return _unaryExpNotMinus_;
    }

    public void setUnaryExpNotMinus(PUnaryExpNotMinus node)
    {
        if(_unaryExpNotMinus_ != null)
        {
            _unaryExpNotMinus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unaryExpNotMinus_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unaryExpNotMinus_);
    }

    void removeChild(Node child)
    {
        if(_unaryExpNotMinus_ == child)
        {
            _unaryExpNotMinus_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unaryExpNotMinus_ == oldChild)
        {
            setUnaryExpNotMinus((PUnaryExpNotMinus) newChild);
            return;
        }

    }
}
