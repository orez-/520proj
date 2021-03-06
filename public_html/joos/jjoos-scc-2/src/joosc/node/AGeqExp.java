/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AGeqExp extends PExp
{
    private PExp _left_;
    private TGeq _geq_;
    private PExp _right_;

    public AGeqExp()
    {
    }

    public AGeqExp(
        PExp _left_,
        TGeq _geq_,
        PExp _right_)
    {
        setLeft(_left_);

        setGeq(_geq_);

        setRight(_right_);

    }
    public Object clone()
    {
        return new AGeqExp(
            (PExp) cloneNode(_left_),
            (TGeq) cloneNode(_geq_),
            (PExp) cloneNode(_right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGeqExp(this);
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

    public TGeq getGeq()
    {
        return _geq_;
    }

    public void setGeq(TGeq node)
    {
        if(_geq_ != null)
        {
            _geq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _geq_ = node;
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
            + toString(_geq_)
            + toString(_right_);
    }

    void removeChild(Node child)
    {
        if(_left_ == child)
        {
            _left_ = null;
            return;
        }

        if(_geq_ == child)
        {
            _geq_ = null;
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

        if(_geq_ == oldChild)
        {
            setGeq((TGeq) newChild);
            return;
        }

        if(_right_ == oldChild)
        {
            setRight((PExp) newChild);
            return;
        }

    }
}
