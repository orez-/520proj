/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import java.util.*;
import joosc.analysis.*;

public final class ATmpForStmNoShortIf extends PStmNoShortIf
{
    private TFor _for_;
    private TLPar _lPar_;
    private PStmExp _initializer_;
    private TSemicolon _semicolon1_;
    private PExp _exp_;
    private TSemicolon _semicolon2_;
    private PStmExp _updater_;
    private TRPar _rPar_;
    private PStmNoShortIf _stmNoShortIf_;

    public ATmpForStmNoShortIf()
    {
    }

    public ATmpForStmNoShortIf(
        TFor _for_,
        TLPar _lPar_,
        PStmExp _initializer_,
        TSemicolon _semicolon1_,
        PExp _exp_,
        TSemicolon _semicolon2_,
        PStmExp _updater_,
        TRPar _rPar_,
        PStmNoShortIf _stmNoShortIf_)
    {
        setFor(_for_);

        setLPar(_lPar_);

        setInitializer(_initializer_);

        setSemicolon1(_semicolon1_);

        setExp(_exp_);

        setSemicolon2(_semicolon2_);

        setUpdater(_updater_);

        setRPar(_rPar_);

        setStmNoShortIf(_stmNoShortIf_);

    }
    public Object clone()
    {
        return new ATmpForStmNoShortIf(
            (TFor) cloneNode(_for_),
            (TLPar) cloneNode(_lPar_),
            (PStmExp) cloneNode(_initializer_),
            (TSemicolon) cloneNode(_semicolon1_),
            (PExp) cloneNode(_exp_),
            (TSemicolon) cloneNode(_semicolon2_),
            (PStmExp) cloneNode(_updater_),
            (TRPar) cloneNode(_rPar_),
            (PStmNoShortIf) cloneNode(_stmNoShortIf_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATmpForStmNoShortIf(this);
    }

    public TFor getFor()
    {
        return _for_;
    }

    public void setFor(TFor node)
    {
        if(_for_ != null)
        {
            _for_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _for_ = node;
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

    public PStmExp getInitializer()
    {
        return _initializer_;
    }

    public void setInitializer(PStmExp node)
    {
        if(_initializer_ != null)
        {
            _initializer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _initializer_ = node;
    }

    public TSemicolon getSemicolon1()
    {
        return _semicolon1_;
    }

    public void setSemicolon1(TSemicolon node)
    {
        if(_semicolon1_ != null)
        {
            _semicolon1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon1_ = node;
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

    public TSemicolon getSemicolon2()
    {
        return _semicolon2_;
    }

    public void setSemicolon2(TSemicolon node)
    {
        if(_semicolon2_ != null)
        {
            _semicolon2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon2_ = node;
    }

    public PStmExp getUpdater()
    {
        return _updater_;
    }

    public void setUpdater(PStmExp node)
    {
        if(_updater_ != null)
        {
            _updater_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _updater_ = node;
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

    public PStmNoShortIf getStmNoShortIf()
    {
        return _stmNoShortIf_;
    }

    public void setStmNoShortIf(PStmNoShortIf node)
    {
        if(_stmNoShortIf_ != null)
        {
            _stmNoShortIf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _stmNoShortIf_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_for_)
            + toString(_lPar_)
            + toString(_initializer_)
            + toString(_semicolon1_)
            + toString(_exp_)
            + toString(_semicolon2_)
            + toString(_updater_)
            + toString(_rPar_)
            + toString(_stmNoShortIf_);
    }

    void removeChild(Node child)
    {
        if(_for_ == child)
        {
            _for_ = null;
            return;
        }

        if(_lPar_ == child)
        {
            _lPar_ = null;
            return;
        }

        if(_initializer_ == child)
        {
            _initializer_ = null;
            return;
        }

        if(_semicolon1_ == child)
        {
            _semicolon1_ = null;
            return;
        }

        if(_exp_ == child)
        {
            _exp_ = null;
            return;
        }

        if(_semicolon2_ == child)
        {
            _semicolon2_ = null;
            return;
        }

        if(_updater_ == child)
        {
            _updater_ = null;
            return;
        }

        if(_rPar_ == child)
        {
            _rPar_ = null;
            return;
        }

        if(_stmNoShortIf_ == child)
        {
            _stmNoShortIf_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_for_ == oldChild)
        {
            setFor((TFor) newChild);
            return;
        }

        if(_lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(_initializer_ == oldChild)
        {
            setInitializer((PStmExp) newChild);
            return;
        }

        if(_semicolon1_ == oldChild)
        {
            setSemicolon1((TSemicolon) newChild);
            return;
        }

        if(_exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(_semicolon2_ == oldChild)
        {
            setSemicolon2((TSemicolon) newChild);
            return;
        }

        if(_updater_ == oldChild)
        {
            setUpdater((PStmExp) newChild);
            return;
        }

        if(_rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(_stmNoShortIf_ == oldChild)
        {
            setStmNoShortIf((PStmNoShortIf) newChild);
            return;
        }

    }
}
