/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class APlusExp extends PExp
{
    private PExp _left_;
    private TPlus _plus_;
    private PExp _right_;

    public APlusExp()
    {
    }

    public APlusExp(
        PExp _left_,
        TPlus _plus_,
        PExp _right_)
    {
        setLeft(_left_);

        setPlus(_plus_);

        setRight(_right_);

    }
    public Object clone()
    {
        return new APlusExp(
            (PExp) cloneNode(_left_),
            (TPlus) cloneNode(_plus_),
            (PExp) cloneNode(_right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPlusExp(this);
    }

    public PExp getLeft()
    {
        return _left_;
    }

    public void setLeft(PExp node)
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

    public TPlus getPlus()
    {
        return _plus_;
    }

    public void setPlus(TPlus node)
    {
        if(_plus_ != null)
        {
            _plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _plus_ = node;
    }

    public PExp getRight()
    {
        return _right_;
    }

    public void setRight(PExp node)
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
            + toString(_plus_)
            + toString(_right_);
    }

    void removeChild(Node child)
    {
        if(_left_ == child)
        {
            _left_ = null;
            return;
        }

        if(_plus_ == child)
        {
            _plus_ = null;
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
            setLeft((PExp) newChild);
            return;
        }

        if(_plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(_right_ == oldChild)
        {
            setRight((PExp) newChild);
            return;
        }

    }
}
