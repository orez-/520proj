/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

public final class TPackage extends Token
{
    public TPackage()
    {
        super.setText("package");
    }

    public TPackage(int line, int pos)
    {
        super.setText("package");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TPackage(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPackage(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TPackage text.");
    }
}