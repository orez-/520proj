/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

public final class TGt extends Token
{
    public TGt()
    {
        super.setText(">");
    }

    public TGt(int line, int pos)
    {
        super.setText(">");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TGt(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGt(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TGt text.");
    }
}
