/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

public final class X1PFormalListTail extends XPFormalListTail
{
    private XPFormalListTail _xPFormalListTail_;
    private PFormalListTail _pFormalListTail_;

    public X1PFormalListTail()
    {
    }

    public X1PFormalListTail(
        XPFormalListTail _xPFormalListTail_,
        PFormalListTail _pFormalListTail_)
    {
        setXPFormalListTail(_xPFormalListTail_);
        setPFormalListTail(_pFormalListTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPFormalListTail getXPFormalListTail()
    {
        return _xPFormalListTail_;
    }

    public void setXPFormalListTail(XPFormalListTail node)
    {
        if(_xPFormalListTail_ != null)
        {
            _xPFormalListTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPFormalListTail_ = node;
    }

    public PFormalListTail getPFormalListTail()
    {
        return _pFormalListTail_;
    }

    public void setPFormalListTail(PFormalListTail node)
    {
        if(_pFormalListTail_ != null)
        {
            _pFormalListTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pFormalListTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPFormalListTail_ == child)
        {
            _xPFormalListTail_ = null;
        }

        if(_pFormalListTail_ == child)
        {
            _pFormalListTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPFormalListTail_) +
            toString(_pFormalListTail_);
    }
}