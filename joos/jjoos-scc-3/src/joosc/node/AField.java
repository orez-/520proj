/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class AField extends PField
{
    private final LinkedList _fields_ = new TypedLinkedList(new Fields_Cast());

    public AField()
    {
    }

    public AField(
        List _fields_)
    {
        {
            this._fields_.clear();
            this._fields_.addAll(_fields_);
        }

    }
    public Object clone()
    {
        return new AField(
            cloneList(_fields_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAField(this);
    }

    public LinkedList getFields()
    {
        return _fields_;
    }

    public void setFields(List list)
    {
        _fields_.clear();
        _fields_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_fields_);
    }

    void removeChild(Node child)
    {
        if(_fields_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _fields_.listIterator(); i.hasNext();)
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

    private class Fields_Cast implements Cast
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
