/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

public final class TVolatile extends Token
{
    public TVolatile()
    {
        super.setText("volatile");
    }

    public TVolatile(int line, int pos)
    {
        super.setText("volatile");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TVolatile(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVolatile(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TVolatile text.");
    }
}
