/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

public final class X2PExternClass extends XPExternClass
{
    private PExternClass _pExternClass_;

    public X2PExternClass()
    {
    }

    public X2PExternClass(
        PExternClass _pExternClass_)
    {
        setPExternClass(_pExternClass_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PExternClass getPExternClass()
    {
        return _pExternClass_;
    }

    public void setPExternClass(PExternClass node)
    {
        if(_pExternClass_ != null)
        {
            _pExternClass_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pExternClass_ = node;
    }

    void removeChild(Node child)
    {
        if(_pExternClass_ == child)
        {
            _pExternClass_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pExternClass_);
    }
}
