/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import java.io.*;

import joosc.node.*;
import joosc.analysis.*;
import joosc.parser.*;
import joosc.lexer.*;


import java.io.File;
import java.io.FileReader;
import java.io.PushbackReader;

public class Testjoosc
{
  public static void main(String[] arguments)
  {
    File in;
    File dir;

    try 
    {
      in = new File(arguments[0]);

      FileReader temp = new FileReader(in);

      // Build the AST
      Start tree = new Parser(new Lexer(new PushbackReader(
                               temp = new FileReader(in)))).parse();

      temp.close();
    }
    catch(LexerException le)
    {
      System.out.println("Lexer : "+le.getMessage());
      le.printStackTrace();
    }
    catch(ParserException pe)
    {
      System.out.println("Parser : "+pe.getMessage());
      pe.printStackTrace();
    }
    catch(Exception e)
    {
      System.out.println("Other Exception : "+e.getMessage());
      e.printStackTrace();
    }
   }
}