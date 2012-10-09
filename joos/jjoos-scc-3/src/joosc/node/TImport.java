/* This file was generated by SableCC (http://www.sablecc.org/). */

package joosc.node;

import joosc.analysis.*;

public final class TImport extends Token
{
    public TImport()
    {
        super.setText("import");
    }

    public TImport(int line, int pos)
    {
        super.setText("import");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TImport(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTImport(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TImport text.");
    }
}