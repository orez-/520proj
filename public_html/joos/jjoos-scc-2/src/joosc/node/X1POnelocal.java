/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

public final class X1POnelocal extends XPOnelocal
{
    private XPOnelocal _xPOnelocal_;
    private POnelocal _pOnelocal_;

    public X1POnelocal()
    {
    }

    public X1POnelocal(
        XPOnelocal _xPOnelocal_,
        POnelocal _pOnelocal_)
    {
        setXPOnelocal(_xPOnelocal_);
        setPOnelocal(_pOnelocal_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPOnelocal getXPOnelocal()
    {
        return _xPOnelocal_;
    }

    public void setXPOnelocal(XPOnelocal node)
    {
        if(_xPOnelocal_ != null)
        {
            _xPOnelocal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPOnelocal_ = node;
    }

    public POnelocal getPOnelocal()
    {
        return _pOnelocal_;
    }

    public void setPOnelocal(POnelocal node)
    {
        if(_pOnelocal_ != null)
        {
            _pOnelocal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pOnelocal_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPOnelocal_ == child)
        {
            _xPOnelocal_ = null;
        }

        if(_pOnelocal_ == child)
        {
            _pOnelocal_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPOnelocal_) +
            toString(_pOnelocal_);
    }
}
