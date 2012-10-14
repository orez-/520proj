/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AField extends PField
{
    private final LinkedList _onefield_ = new TypedLinkedList(new Onefield_Cast());

    public AField()
    {
    }

    public AField(
        List _onefield_)
    {
        {
            this._onefield_.clear();
            this._onefield_.addAll(_onefield_);
        }

    }

    public AField(
        XPOnefield _onefield_)
    {
        if(_onefield_ != null)
        {
            while(_onefield_ instanceof X1POnefield)
            {
                this._onefield_.addFirst(((X1POnefield) _onefield_).getPOnefield());
                _onefield_ = ((X1POnefield) _onefield_).getXPOnefield();
            }
            this._onefield_.addFirst(((X2POnefield) _onefield_).getPOnefield());
        }

    }
    public Object clone()
    {
        return new AField(
            cloneList(_onefield_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAField(this);
    }

    public LinkedList getOnefield()
    {
        return _onefield_;
    }

    public void setOnefield(List list)
    {
        _onefield_.clear();
        _onefield_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_onefield_);
    }

    void removeChild(Node child)
    {
        if(_onefield_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _onefield_.listIterator(); i.hasNext();)
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

    private class Onefield_Cast implements Cast
    {
        public Object cast(Object o)
        {
            POnefield node = (POnefield) o;

            if((node.parent() != null) &&
                (node.parent() != AField.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AField.this))
            {
                node.parent(AField.this);
            }

            return node;
        }
    }
}
