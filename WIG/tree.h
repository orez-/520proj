#ifndef TREE_H
#define TREE_H

typedef struct SERVICE {
    int lineno;
    struct HTML* html;
    struct SCHEMA* schema;
    struct VARIABLE* variable;
    struct FUNCTION* function;
    struct SESSION* session;
} SERVICE;

typedef struct HTML{
	int lineno;
	char* identifier;
	struct HTMLBODY* body;
	struct HTML* next;
} HTML;

typedef struct HTMLBODY {
	int lineno;
	enum{tagK, gapK, whateverK, metaK, inputK, selectK} kind;
	union{
		struct {
			struct ID* id;
			struct ATTRIBUTE* attribute;
		} tagE;

		struct ID* id;
		char* whatever;
		struct HTMLMETA* meta;
		struct INPUTATTR* inputattr;
		struct {
			struct INPUTATTR* inputattr;
			struct HTMLBODY* body;
		} selectE;
	} val;
	struct HTMLBODY* next;
} HTMLBODY;

typedef struct INPUTATTR{
	int lineno;
	enum{nameK, typeK, otheK}
	union{
		struct ATTR* attr;
		char* type;
		struct ATTRIBUTE* attribute;
	} val;

	struct INPUTATTR* next;
} INPUTATTR;


typedef struct ATTRIBUTE{
	int lineno;
	struct ATTR* right;
	struct ATTR* left;
	struct ATTRIBUTE* next;
} ATTRIBUTE;

typedef struct ATTR{
	int lineno;
	enum{attridK, attrstringconstK} kind;
	union{
		struct ID* id;
		char* stringconst;
	} val;
} ATTR;

typedef struct SCHEMA{
	int lineno;
	struct SCHEMA* next;
	struct ID* id;
	struct FIELD* field;
} SCHEMA;

typedef struct FIELD{
	int lineno;
	struct FIELD* next;
	struct ID* id;
	struct SIMPLETYPE* simpletype;
} FIELD;

typedef struct VARIABLE{
	int lineno;
	struct TYPE* type;
	struct ID* id;
	struct VARIABLE* next;
} VARIABLE;

type struct ID{
	int lineno;
	struct ID* identifier;
	struct ID* next;
} ID;

type struct TYPE{
	int lineno;
	enum{tupleidK, simpletypeK} kind;
	union{
		struct SIMPLETYPE* simpletype;
		struct ID* id;
	} val;
} TYPE;

type struct SIMPLETYPE{
	int lineno;
	enum{intK, boolK, stringK, voidK} kind;
} SIMPLETYPE;

type struct FUNCTION{
	int lineno;
	struct TYPE* type;
	struct ID* id;
	struct ARGUMENT* argument;
	struct COMPOUNDSTM* compoundstm;
	struct FUNCTION* next;
} FUNCTION;

type struct ARGUMENT{
	int lineno;
	struct TYPE* type;
	struct ID* id;
	struct ARGUMENT* next;
} ARGUMENT;

type struct SESSION{
	int lineno;
	struct ID* id;
	struct COMPOUNDSTM* compoundstm;
	struct SESSION* next;
} SESSION;

type struct STM{
	int lineno;
	enum{semicolonK, showK, exitK, returnexprK, ifK, 
		ifelseK, whileK, compoundK, exprK} kind;
	union{
		struct{
			struct DOCUMENT* doc;
			struct RECEIVE* rec;
		} showE;

		struct DOCUMENT* doc;
		struct EXP* expr;
		struct{
			struct EXP* expr;
			struct STM* stm;
		} ifE;

		struct{
			struct EXP* expr;
			struct STM* stm1;
			struct STM* stm2;
		} ifelseE;

		struct{
			struct EXP* expr;
			struct STM* stm;
		} whileE;

		struct COMPOUNDSTM* compoundstm;
		struct EXP* expr;
	} val;

	struct STM* next;

} STM;

type struct COMPOUNDSTM{
	int lineno;
	struct VARIABLE* variable;
	struct STM* stm;
} COMPOUNDSTM;

type struct DOCUMENT{
	int lineno;
	enum{idK, plugK}
	union{
		struct ID* id;
		struct {
			struct ID* id;
			struct PLUG* plug;
		} plugE;
	} val;
} DOCUMENT;

type struct RECEIVE{
	int lineno;
	struct INPUT* input;
} RECEIVE;

type struct PLUG{
	int lineno;
	struct ID* id;
	struct EXP* expr;
	struct PLUG* next;
} PLUG;

type struct INPUT{
	int lineno;
	struct LVALUE* lvalue;
	struct ID* id;
	struct INPUT* next;
} INPUT;

type struct LVALUE{
	int lineno;
	struct ID* id1;
	struct ID* id2;
} LVALUE;

type struct FIELDVALUE{
	int lineno;
	struct ID* id;
	struct EXP* expr;
	struct FIELDVALUE next;
} FIELDVALUE;

type struct EXP{
	int lineno;
	enum{lvalueK, assignK, equalsK, notequalsK, ltK, 
		gtK, lteK, gteK, notK, plusK, minusK, multK, 
		divK, modK, andK, orK, joinK, keepK, removeK, 
		callK, intconstK, trueK, falseK, stringconstK, 
		tupleK }kind;

	union{
		struct LVALUE* lvalue;
		struct{
			struct LVALUE* lvalue;
			struct EXP* expr;
		}assignE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}equalsE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}notequalsE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}ltE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}gtE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}lteE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}gteE;

		struct EXP* expr;

		struct{
			struct EXP* left;
			struct EXP* right;
		}plusE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}minusE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}multE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}divE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}modE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}andE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}orE;

		struct{
			struct EXP* left;
			struct EXP* right;
		}joinE;

		struct{
			struct EXP* left;
			struct ID* right;
		}keepE;

		struct{
			struct EXP* left;
			struct ID* right;
		}removeE;

		struct{
			struct EXP* right
			struct ID* left;
		}callE;

		int intconst;
		char* stringconst;
		struct FIELDVALUE* fieldvalue;


	}val;

	struct EXP* next;
} EXP;

SERVICE* makeSERVICE(HTML* html, SCHEMA* schema, VARIABLE* variable, 
	FUNCTION functions, SESSION session);
HTML* makeHTML(char* identifier, HTMLBODY* body);
HTMLBODY* makeHTMLBODYtag(ID* id, ATTRIBUTE* attribute);
HTMLBODY* makeHTMLBODYgap(ID* id);
HTMLBODY* makeHTMLBODYwhatever(char* whatever);
HTMLBODY* makeHTMLBODYinput(INPUTATTR* inputattr);
HTMLBODY* makeHTMLBODYselect(INPUTATTR* inputattr, HTMLBODY* body);
INPUTATTR* makeINPUTATTRname(ATTR* attr);
INPUTATTR* makeINPUTATTRtype(char* type);
INPUTATTR* makeINPUTATTRattribute(ATTRIBUTE* attribute);
ATTRIBUTE* makeATTRIBUTEattr(ATTR* left, ATTR* right);
ATTR* makeATTRid(ID* id);
ATTR* makeATTRstringconst(char* stringconst);
SCHEMA* makeSCHEMA(ID* id, FIELD* field);
FIELD* makeFIELD(SIMPLETYPE* simpletype, ID* id);
VARIABLE* makeVARIABLE(TYPE* type, ID* id);
ID* makeID(char* identifier);
TYPE* makeTYPEsimpletype(SIMPLETYPE* simpletype);
TYPE* makeTYPEtupleid(ID* id);
SIMPLETYPE* makeSIMPLETYPEint();
SIMPLETYPE* makeSIMPLETYPEbool();
SIMPLETYPE* makeSIMPLETYPEstring();
SIMPLETYPE* makeSIMPLETYPEvoid();
FUNCTION* makeFUNCTION(TYPE* type, ID* id, ARGUMENT* argument, 
	COMPOUNDSTM* compoundstm, FUNCTION* next);
ARGUMENT* makeARGUMENT(TYPE* type, ID* id);
SESSION* makeSESSION(ID* id, COMPOUNDSTM* compoundstm, SESSION* next);
STM* makeSTMsemicolon();
STM* makeSTMshow(DOCUMENT* doc, RECEIVE* rec);
STM* makeSTMexit(DOCUMENT* doc);
STM* makeSTMreturn();
STM* makeSTMreturnexpr(EXP* expr);
STM* makeSTMif(EXP* expr, STM* stm);
STM* makeSTMifelse(EXP* expr, STM* stm1, STM* stm2);
STM* makeSTMwhile(EXP* expr, STM* stm);
STM* makeSTMcompound(COMPOUNDSTM* compoundstm);
STM* makeSTMexp(EXP* expr);
COMPOUNDSTM* makeCOMPOUNDSTM(VARIABLE* variable, STM* stm);
DOCUMENT* makeDOCUMENTid(ID* id);
DOCUMENT* makeDOCUMENTplug(ID* id, PLUG* plug);
RECEIVE* makeRECEIVE(INPUT* input);
PLUG* makePLUG(ID* id, EXP* expr);
INPUT* makeINPUT(LVALUE* lvalue, ID* id);
LVALUE* makeLVALUE(ID* id1, ID* id2);
FIELDVALUE* makeFIELDVALUE(ID* id, EXP* expr);
EXP* makeEXPlvalue(LVALUE* lvalue);
EXP* makeEXPassign(LVALUE* lvalue, EXP* expr);
EXP* makeEXPequals(EXP* left, EXP* right);
EXP* makeEXPnotequals(EXP* left, EXP* right);
EXP* makeEXPlt(EXP* left, EXP* right);
EXP* makeEXPgt(EXP* left, EXP* right);
EXP* makeEXPlte(EXP* left, EXP* right);
EXP* makeEXPgte(EXP* left, EXP* right);
EXP* makeEXPnot(EXP* right);
EXP* makeEXPplus(EXP* left, EXP* right);
EXP* makeEXPminus(EXP* left, EXP* right);    
EXP* makeEXPmult(EXP* left, EXP* right);
EXP* makeEXPdiv(EXP* left, EXP* right);
EXP* makeEXPmod(EXP* left, EXP* right);
EXP* makeEXPand(EXP* left, EXP* right);
EXP* makeEXPor(EXP* left, EXP* right);
EXP* makeEXPjoin(EXP* left, EXP* right);
EXP* makeEXPkeep(EXP* left, ID* right);
EXP* makeEXPremove(EXP* left, ID* right);
EXP* makeEXPcall(ID* left, EXP* right);
EXP* makeEXPintconst(int intconst);
EXP* makeEXPtrue();
EXP* makeEXPfalse();
EXP* makeEXPstringconst(char* stringconst);
EXP* makeEXPtuple(FIELDVALUE* fieldvalue);

#endif /* !TREE_H */