/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ALtRelExp extends PRelExp
{
    private PRelExp _left_;
    private TLt _lt_;
    private PAddExp _right_;

    public ALtRelExp()
    {
    }

    public ALtRelExp(
        PRelExp _left_,
        TLt _lt_,
        PAddExp _right_)
    {
        setLeft(_left_);

        setLt(_lt_);

        setRight(_right_);

    }
    public Object clone()
    {
        return new ALtRelExp(
            (PRelExp) cloneNode(_left_),
            (TLt) cloneNode(_lt_),
            (PAddExp) cloneNode(_right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALtRelExp(this);
    }

    public PRelExp getLeft()
    {
        return _left_;
    }

    public void setLeft(PRelExp node)
    {
        if(_left_ != null)
        {
            _left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _left_ = node;
    }

    public TLt getLt()
    {
        return _lt_;
    }

    public void setLt(TLt node)
    {
        if(_lt_ != null)
        {
            _lt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lt_ = node;
    }

    public PAddExp getRight()
    {
        return _right_;
    }

    public void setRight(PAddExp node)
    {
        if(_right_ != null)
        {
            _right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _right_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_left_)
            + toString(_lt_)
            + toString(_right_);
    }

    void removeChild(Node child)
    {
        if(_left_ == child)
        {
            _left_ = null;
            return;
        }

        if(_lt_ == child)
        {
            _lt_ = null;
            return;
        }

        if(_right_ == child)
        {
            _right_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_left_ == oldChild)
        {
            setLeft((PRelExp) newChild);
            return;
        }

        if(_lt_ == oldChild)
        {
            setLt((TLt) newChild);
            return;
        }

        if(_right_ == oldChild)
        {
            setRight((PAddExp) newChild);
            return;
        }

    }
}