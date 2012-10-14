/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ANonmodExternMethod extends PExternMethod
{
    private TPublic _public_;
    private PReturntype _returntype_;
    private TIdentifier _identifier_;
    private TLPar _lPar_;
    private PFormalList _formalList_;
    private TRPar _rPar_;
    private TSemicolon _semicolon_;

    public ANonmodExternMethod()
    {
    }

    public ANonmodExternMethod(
        TPublic _public_,
        PReturntype _returntype_,
        TIdentifier _identifier_,
        TLPar _lPar_,
        PFormalList _formalList_,
        TRPar _rPar_,
        TSemicolon _semicolon_)
    {
        setPublic(_public_);

        setReturntype(_returntype_);

        setIdentifier(_identifier_);

        setLPar(_lPar_);

        setFormalList(_formalList_);

        setRPar(_rPar_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new ANonmodExternMethod(
            (TPublic) cloneNode(_public_),
            (PReturntype) cloneNode(_returntype_),
            (TIdentifier) cloneNode(_identifier_),
            (TLPar) cloneNode(_lPar_),
            (PFormalList) cloneNode(_formalList_),
            (TRPar) cloneNode(_rPar_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANonmodExternMethod(this);
    }

    public TPublic getPublic()
    {
        return _public_;
    }

    public void setPublic(TPublic node)
    {
        if(_public_ != null)
        {
            _public_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _public_ = node;
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

    public TLPar getLPar()
    {
        return _lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(_lPar_ != null)
        {
            _lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lPar_ = node;
    }

    public PFormalList getFormalList()
    {
        return _formalList_;
    }

    public void setFormalList(PFormalList node)
    {
        if(_formalList_ != null)
        {
            _formalList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _formalList_ = node;
    }

    public TRPar getRPar()
    {
        return _rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(_rPar_ != null)
        {
            _rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rPar_ = node;
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
            + toString(_public_)
            + toString(_returntype_)
            + toString(_identifier_)
            + toString(_lPar_)
            + toString(_formalList_)
            + toString(_rPar_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_public_ == child)
        {
            _public_ = null;
            return;
        }

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

        if(_lPar_ == child)
        {
            _lPar_ = null;
            return;
        }

        if(_formalList_ == child)
        {
            _formalList_ = null;
            return;
        }

        if(_rPar_ == child)
        {
            _rPar_ = null;
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
        if(_public_ == oldChild)
        {
            setPublic((TPublic) newChild);
            return;
        }

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

        if(_lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(_formalList_ == oldChild)
        {
            setFormalList((PFormalList) newChild);
            return;
        }

        if(_rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
