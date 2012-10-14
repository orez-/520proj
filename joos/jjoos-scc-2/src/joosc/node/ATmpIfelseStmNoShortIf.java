/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ATmpIfelseStmNoShortIf extends PStmNoShortIf
{
    private TIf _if_;
    private TLPar _lPar_;
    private PExp _exp_;
    private TRPar _rPar_;
    private PStmNoShortIf _thenStmNoShortIf_;
    private TElse _else_;
    private PStmNoShortIf _elseStmNoShortIf_;

    public ATmpIfelseStmNoShortIf()
    {
    }

    public ATmpIfelseStmNoShortIf(
        TIf _if_,
        TLPar _lPar_,
        PExp _exp_,
        TRPar _rPar_,
        PStmNoShortIf _thenStmNoShortIf_,
        TElse _else_,
        PStmNoShortIf _elseStmNoShortIf_)
    {
        setIf(_if_);

        setLPar(_lPar_);

        setExp(_exp_);

        setRPar(_rPar_);

        setThenStmNoShortIf(_thenStmNoShortIf_);

        setElse(_else_);

        setElseStmNoShortIf(_elseStmNoShortIf_);

    }
    public Object clone()
    {
        return new ATmpIfelseStmNoShortIf(
            (TIf) cloneNode(_if_),
            (TLPar) cloneNode(_lPar_),
            (PExp) cloneNode(_exp_),
            (TRPar) cloneNode(_rPar_),
            (PStmNoShortIf) cloneNode(_thenStmNoShortIf_),
            (TElse) cloneNode(_else_),
            (PStmNoShortIf) cloneNode(_elseStmNoShortIf_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATmpIfelseStmNoShortIf(this);
    }

    public TIf getIf()
    {
        return _if_;
    }

    public void setIf(TIf node)
    {
        if(_if_ != null)
        {
            _if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _if_ = node;
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

    public PStmNoShortIf getThenStmNoShortIf()
    {
        return _thenStmNoShortIf_;
    }

    public void setThenStmNoShortIf(PStmNoShortIf node)
    {
        if(_thenStmNoShortIf_ != null)
        {
            _thenStmNoShortIf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _thenStmNoShortIf_ = node;
    }

    public TElse getElse()
    {
        return _else_;
    }

    public void setElse(TElse node)
    {
        if(_else_ != null)
        {
            _else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _else_ = node;
    }

    public PStmNoShortIf getElseStmNoShortIf()
    {
        return _elseStmNoShortIf_;
    }

    public void setElseStmNoShortIf(PStmNoShortIf node)
    {
        if(_elseStmNoShortIf_ != null)
        {
            _elseStmNoShortIf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _elseStmNoShortIf_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_if_)
            + toString(_lPar_)
            + toString(_exp_)
            + toString(_rPar_)
            + toString(_thenStmNoShortIf_)
            + toString(_else_)
            + toString(_elseStmNoShortIf_);
    }

    void removeChild(Node child)
    {
        if(_if_ == child)
        {
            _if_ = null;
            return;
        }

        if(_lPar_ == child)
        {
            _lPar_ = null;
            return;
        }

        if(_exp_ == child)
        {
            _exp_ = null;
            return;
        }

        if(_rPar_ == child)
        {
            _rPar_ = null;
            return;
        }

        if(_thenStmNoShortIf_ == child)
        {
            _thenStmNoShortIf_ = null;
            return;
        }

        if(_else_ == child)
        {
            _else_ = null;
            return;
        }

        if(_elseStmNoShortIf_ == child)
        {
            _elseStmNoShortIf_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(_lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(_exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(_rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(_thenStmNoShortIf_ == oldChild)
        {
            setThenStmNoShortIf((PStmNoShortIf) newChild);
            return;
        }

        if(_else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(_elseStmNoShortIf_ == oldChild)
        {
            setElseStmNoShortIf((PStmNoShortIf) newChild);
            return;
        }

    }
}
