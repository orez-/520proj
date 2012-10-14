/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AAbstractMethod extends PMethod
{
    private PReturntype _returntype_;
    private TIdentifier _identifier_;
    private final LinkedList _formals_ = new TypedLinkedList(new Formals_Cast());

    public AAbstractMethod()
    {
    }

    public AAbstractMethod(
        PReturntype _returntype_,
        TIdentifier _identifier_,
        List _formals_)
    {
        setReturntype(_returntype_);

        setIdentifier(_identifier_);

        {
            this._formals_.clear();
            this._formals_.addAll(_formals_);
        }

    }
    public Object clone()
    {
        return new AAbstractMethod(
            (PReturntype) cloneNode(_returntype_),
            (TIdentifier) cloneNode(_identifier_),
            cloneList(_formals_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAbstractMethod(this);
    }

    public PReturntype getReturntype()
    {
        return _returntype_;
    }

    public void setReturntype(PReturntype node)
    {
        if(_returntype_ != null)
        {
            _returntype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _returntype_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return _identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(_identifier_ != null)
        {
            _identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _identifier_ = node;
    }

    public LinkedList getFormals()
    {
        return _formals_;
    }

    public void setFormals(List list)
    {
        _formals_.clear();
        _formals_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_returntype_)
            + toString(_identifier_)
            + toString(_formals_);
    }

    void removeChild(Node child)
    {
        if(_returntype_ == child)
        {
            _returntype_ = null;
            return;
        }

        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_formals_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_returntype_ == oldChild)
        {
            setReturntype((PReturntype) newChild);
            return;
        }

        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator i = _formals_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class Formals_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PFormal node = (PFormal) o;

            if((node.parent() != null) &&
                (node.parent() != AAbstractMethod.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AAbstractMethod.this))
            {
                node.parent(AAbstractMethod.this);
            }

            return node;
        }
    }
}
