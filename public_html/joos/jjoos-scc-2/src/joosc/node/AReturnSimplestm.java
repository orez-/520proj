/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AReturnSimplestm extends PSimplestm
{
    private TReturn _return_;
    private PExp _exp_;
    private TSemicolon _semicolon_;

    public AReturnSimplestm()
    {
    }

    public AReturnSimplestm(
        TReturn _return_,
        PExp _exp_,
        TSemicolon _semicolon_)
    {
        setReturn(_return_);

        setExp(_exp_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AReturnSimplestm(
            (TReturn) cloneNode(_return_),
            (PExp) cloneNode(_exp_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReturnSimplestm(this);
    }

    public TReturn getReturn()
    {
        return _return_;
    }

    public void setReturn(TReturn node)
    {
        if(_return_ != null)
        {
            _return_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _return_ = node;
    }

    public PExp getExp()
    {
        return _exp_;
    }

    public void setExp(PExp node)
    {
        if(_exp_ != null)
        {
            _exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _exp_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_return_)
            + toString(_exp_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_return_ == child)
        {
            _return_ = null;
            return;
        }

        if(_exp_ == child)
        {
            _exp_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_return_ == oldChild)
        {
            setReturn((TReturn) newChild);
            return;
        }

        if(_exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
