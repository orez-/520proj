SERVICE* makeSERVICE(HTML* html, SCHEMA* schema, VARIABLE* variable, FUNCTION* function, SESSION* session)
{
	SERVICE* s;
	s = NEW(SERVICE);
	s->lineno = lineno;
	s->html = html;
	s->schema = schema;
	s->variable = variable;
	s->function = function;
	s->session = session;
	return s;
}
// html : "const" "html" identifier "=" "<html>" htmlbodies "</html>" ";"
// nextbody can be null, or it can be "nehtmlbodies" which is 1 or more htmlbody
HTML* makeHTML(char* identifier, HTMLBODY* body, HTML* nextbody)
{
	HTML* h;
	h = NEW(HTML);
	h->lineno = lineno;
	h->identifier = identifier;
	h->body = body;
	h->nextbody = nextbody;
	return h;
}

HTMLBODY* makeHTMLBODYtag(ID* id, ATTRIBUTE* attribute)
{
	HTMLBODY* h;
	h = NEW(HTMLBODY);
	h->lineno = lineno;
	h->val.tagE.id = id;
	h->val.tagE.attribute = attribute;
	h->kind = tagK;
	h->next = NULL;
	return h;
}

HTMLBODY* makeHTMLBODYgap(ID* id)
{
	HTMLBODY* h;
	h = NEW(HTMLBODY);
	h->lineno = lineno;
	h->val.gap = gap;
	h->kind = gapK;
	h->next = NULL;
	return h;
}

HTMLBODY* makeHTMLBODYwhatever(char* whatever)
{
	HTMLBODY* h;
	h = NEW(HTMLBODY);
	h->lineno = lineno;
	h->val.whatever = whatever;
	h->kind = whateverK;
	h->next = NULL;
	return h;
}

HTMLBODY* makeHTMLBODYmeta(HTMLMETA* meta)
{
	HTMLBODY* h;
	h = NEW(HTMLBODY);
	h->lineno = lineno;
	h->val.meta = meta;
	h->kind = metaK;
	hh->next = NULL;
	return h;
}

HTMLBODY* makeHTMLBODYinput(INPUTATTR* inputattr)
{
	HTMLBODY* h;
	h = NEW(HTMLBODY);
	h->lineno = lineno;
	h->inputattr = inputattr;
	h->next = NULL;
	return h;
}

HTMLBODY* makeHTMLBODYselect(INPUTATTR* inputattr, HTMLBODY* body)
{
	HTMLBODY* h;
	h = NEW(HTMLBODY);
	h->lineno = lineno;
	h->val.selectE.inputattr = inputattr;
	h->val.selectE.body = body;
	h->kind = selectK;
	h->next = NULL;
	return h;
}

// ========================== ATTRs ==========================================
INPUTATTR* makeINPUTATTRname(ATTR* attr)
{
	INPUTATTR* i;
	i = NEW(INPUTATTR);
	i->lineno = lineno;
	i->kind = nameK;
	i->attr = attr;
	i->next = NULL;

	return i;
}

INPUTATTR* makeINPUTATTRtype(char* type)
{
	INPUTATTR* i;
	i = NEW(INPUTATTR);
	i->lineno = lineno;
	i->kind = typeK;
	i->val.type = inputtype;
	i->next = NULL;

	return i;
}

INPUTATTR* makeINPUTATTRattribute(ATTRIBUTE* attribute)
{
	INPUTATTR* i;
	i = NEW(INPUTATTR);
	i->lineno = lineno;
	i->kind = otherK;
	i->attribute = attribute;
	i->next = NULL;

	return i;
}

// ATTRIBUTE* makeATTRIBUTEattr(ATTR* attr)
// {
// 	ATTRIBUTE* a;
// 	a = NEW(ATTRIBUTE);
// 	a->lineno = lineno;
// 	a->kind = attributeK;
// 	a->attr = attr;
// 	a->next = NULL;

// 	return a;
// }

ATTRIBUTE* makeATTRIBUTEattr(ATTR* left, ATTR* right)
{
	ATTRIBUTE* a;
	a = NEW(ATTRIBUTE);
	a->lineno = lineno;
	a->left = left;
	a->right= right;
	a->next = NULL;
	return a;
}

ATTR* makeATTRid(ID* id)
{
	ATTR* a;
	a = NEW(ATTR);
	a->lineno = lineno;
	a->kind = attridK;
	a->val.id = id
	return a;
}

ATTR* makeATTRstringconst(char* stringconst)
{
	ATTR* a;
	a = NEW(ATTR);
	a->lineno = lineno;
	a->kind = attrstringconstK;
	a->val.stringconst = stringconst
	return a;
}

// ================================== SCHEMAS =============================

SCHEMA* makeSCHEMA(ID* id, FIELD* field)
{
	SCHEMA* s;
	s = NEW(SCHEMA);
	s->lineno = lineno;
	s->kind= schemaK;
	s->id = id;
	s->field = field;
	s->next = NULL;
	return s;
}

FIELD* makeFIELD(SIMPLETYPE* simpletype, ID* id)
{
	FIELD* f;
	f = NEW(FIELD);
	f->lineno = lineno;
	f->kind= fieldK;
	f->id = id;
	f->simpletype = simpletype;
	f->next = NULL;
	return f;
}

VARIABLE* makeVARIABLE(TYPE* type, ID* id)
{
	VARIABLE* v;
	v = NEW(VARIABLE);
	v->lineno = lineno;
	v->id = id;
	v->type = type;
	v->next = NULL;
	return v;
}

ID* makeID(char* identifier)
{
	ID* i;
	i = NEW(ID);
	i->lineno = lineno;
	i->identifier = identifier;
	i->next = NULL;
	return i;
}

TYPE* makeTYPEsimpletype(SIMPLETYPE* simpletype)
{
	TYPE* t;
	t = NEW(TYPE);
	t->lineno = lineno;
	t->val.simpletype = simpletype;
	t->kind = simpletypeK;
	return t;
}

TYPE* makeTYPEtupleid(ID* id)
{
	TYPE* t;
	t = NEW(TYPE);
	t->lineno = lineno;
	t->val.id = id;
	t->kind = tupleidK;
	return t;
}

SIMPLETYPE* makeSIMPLETYPEint()
{
	SIMPLETYPE* s;
	s = NEW(SIMPLETYPE);
	s->lineno = lineno;
	s->kind = intK;
	return s;
}

SIMPLETYPE* makeSIMPLETYPEbool()
{
	SIMPLETYPE* s;
	s = NEW(SIMPLETYPE);
	s->lineno = lineno;
	s->kind = boolK;
	return s;
}

SIMPLETYPE* makeSIMPLETYPEstring()
{
	SIMPLETYPE* s;
	s = NEW(SIMPLETYPE);
	s->lineno = lineno;
	s->kind = stringK;
	return s;
}

SIMPLETYPE* makeSIMPLETYPEvoid()
{
	SIMPLETYPE* s;
	s = NEW(SIMPLETYPE);
	s->lineno = lineno;
	s->kind = voidK;
	return s;
}

FUNCTION* makeFUNCTION(TYPE* type, ID* id, ARGUMENT* argument, COMPOUNDSTM* compoundstm, FUNCTION* next)
{
	FUNCTION* f;
	f = NEW(FUNCTION);
	f->lineno = lineno;
	f->type = type;
	f->id = id;
	f->argument = argument;
	f->compoundstm = compoundstm;
	f->next = next;
	return f;
}

ARGUMENT* makeARGUMENT(TYPE* type, ID* id)
{	// TODO: GONNA NEED TO PUT A NEXT IN HERE
	ARGUMENT* a;
	a = NEW(ARGUMENT);
	a->lineno = lineno;
	a->type = type;
	a->id = id;
	a->next = NULL;
	return a;
}



SESSION* makeSESSION(ID* id, COMPOUNDSTM* compoundstm, SESSION* next)
{
	SESSION* s;
	s = NEW(SESSION);
	s->lineno = lineno;
	s->id = id;
	s->compoundstm = compoundstm
	s->next = next;
	return s;
}

STM* makeSTMsemicolon()
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmsemicolonK;
	a->next = NULL;
	return s;
}

STM* makeSTMshow(DOCUMENT* doc, RECEIVE* rec)
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmshowK;
	s->val.stmShow.doc = doc;
	s->val.stmShow.rec = rec;
	a->next = NULL;
	return s;
}

STM* makeSTMexit(DOCUMENT* doc)
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmexitK;
	s->val.doc = doc;
	a->next = NULL;
	return s;
}

STM* makeSTMreturn()
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmreturnK;
	a->next = NULL;
	return s;
}

STM* makeSTMreturnexpr(EXP* expr)
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmreturnexpK;
	s->expr = expr;
	a->next = NULL;
	return s;
}

STM* makeSTMif(EXP* expr, STM* stm)
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmifK;
	s->val.ifSTM.expr = expr;
	s->val.ifSTM.stm = stm;
	a->next = NULL;
	return s;
}

STM* makeSTMifelse(EXP* expr, STM* stm1, STM* stm2)
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmifelseK;
	s->val.ifelseSTM.expr = expr;
	s->val.ifelseSTM.stm1 = stm1;
	s->val.ifelseSTM.stm2 = stm2;
	a->next = NULL;
	return s;
}

STM* makeSTMwhile(EXP* expr, STM* stm)
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmwhileK;
	s->val.whileSTM.expr = expr;
	s->val.whileSTM.stm = stm;
	a->next = NULL;
	return s;
}

STM* makeSTMcompound(COMPOUNDSTM* compoundstm)
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = compoundstmK;
	s->next = NULL;
	s->compoundstm = compoundstm;
	return s;
}

STM* makeSTMexp(EXP* expr)
{
	STM* s;
	s = NEW(STM);
	s->lineno = lineno;
	s->kind = stmexprK;
	s->expr = expr;
	a->next = NULL;
	return s;
}

COMPOUNDSTM* makeCOMPOUNDSTM(VARIABLE* variable, STM* stm)
{
	COMPOUNDSTM* c;
	c = NEW(COMPOUNDSTM);
	c->lineno = lineno;
	c->variable = variable;
	c->stm = stm;
	return c;
}

DOCUMENT* makeDOCUMENTid(ID* id)
{
	DOCUMENT* d;
	d = NEW(DOCUMENT);
	d->lineno = lineno;
	d->val.id = id;
	d->kind = idK;
	return d;
}

DOCUMENT* makeDOCUMENTplug(ID* id, PLUG* plug)
{
	DOCUMENT* d;
	d = NEW(DOCUMENT);
	d->lineno = lineno;
	d->val.docPlug.id = id;
	d->val.docPlug.plug = plug;
	d->kind = docPlugK;
	return d;
}

RECEIVE* makeRECEIVE(INPUT* input)
{
	RECEIVE* r;
	r = NEW(RECEIVE);
	r->lineno = lineno;
	r->input = input;
	return r;
}

PLUG* makePLUG(ID* id, EXP* expr)
{
	PLUG* p;
	p = NEW(PLUG);
	p->lineno = lineno;
	p->id = id;
	p->expr = expr;
	p->next = NULL;
	return p;
}

INPUT* makeINPUT(LVALUE* lvalue, ID* id)
{
	INPUT* i;
	i = NEW(INPUT);
	i->lineno = lineno;
	i->id = id;
	i->lvalue = lvalue;
	i->next = NULL;
	return i;
}

// LVALUE* makeLVALUEsingle(ID* id)
// {
// 	LVALUE* l;
// 	l = NEW(LVALUE);
// 	l->lineno = lineno;
// 	l->id = id;
// 	return l;
// }

LVALUE* makeLVALUE(ID* id1, ID* id2)
{
	LVALUE* l;
	l = NEW(LVALUE);
	l->lineno = lineno;
	l->id1 = id1;
	l->id2 = id2;
	return l;
}

FIELDVALUE* makeFIELDVALUE(ID* id, EXP* expr)
{
	FIELDVALUE* f;
	f = NEW(FIELDVALUE);
	f->lineno = lineno;
	f->id = id;
	f->expr = expr;
	f->next = NULL;
	return f;
}

EXP* makeEXPlvalue(LVALUE* lvalue)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.lvalueE = lvalue;
	e->kind = lvalueK;
	return e;
}

EXP* makeEXPassign(LVALUE* lvalue, EXP* expr)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.assignE.lvalue = lvalue;
	e->val.assignE.expr = expr;
	e->kind = assignK;
	return e;
}

EXP* makeEXPequals(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.equalsE.left = left;
	e->val.equalsE.right = right;
	e->kind = equalsK;
	return e;
}

EXP* makeEXPnotequals(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.notequalsE.left = left;
	e->val.notequalsE.right = right;
	e->kind = notequalsK;
	return e;
}

EXP* makeEXPlt(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.ltE.left = left;
	e->val.ltE.right = right;
	e->kind = ltK;
	return e;
}

EXP* makeEXPgt(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.gtE.left = left;
	e->val.gtE.right = right;
	e->kind = gtK;
	return e;
}

EXP* makeEXPlte(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.lteE.left = left;
	e->val.lteE.right = right;
	e->kind = lteK;
	return e;
}

EXP* makeEXPgte(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.gteE.left = left;
	e->val.gteE.right = right;
	e->kind = gteK;
	return e;
}

EXP* makeEXPnot(EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.notE = right
	e->kind = notK;
	return e;
}

// EXP* makeEXPneg()
// {
// 	EXP* e;
// 	e = NEW(EXP);
// 	e->lineno = lineno;
// 	e->val.negE = right
// 	e->kind = negK;
// 	return e;
// }

EXP* makeEXPplus(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.plusE.left = left;
	e->val.plusE.right = right;
	e->kind = plusK;
	return e;
}

EXP* makeEXPminus(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.minusE.left = left;
	e->val.minusE.right = right;
	e->kind = minusK;
	return e;
}	

EXP* makeEXPmult(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.multE.left = left;
	e->val.multE.right = right;
	e->kind = multK;
	return e;
}

EXP* makeEXPdiv(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.divE.left = left;
	e->val.divE.right = right;
	e->kind = divK;
	return e;
}

EXP* makeEXPmod(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.modE.left = left;
	e->val.modE.right = right;
	e->kind = modK;
	return e;
}

EXP* makeEXPand(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.andE.left = left;
	e->val.andE.right = right;
	e->kind = andK;
	return e;
}

EXP* makeEXPor(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.orE.left = left;
	e->val.orE.right = right;
	e->kind = orK;
	return e;
}

EXP* makeEXPjoin(EXP* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.joinE.left = left;
	e->val.joinE.right = right;
	e->kind = joinK;
	return e;
}

EXP* makeEXPkeep(EXP* left, ID* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.keepE.left = left;
	e->val.keepE.right = right;
	e->kind = keepK;
	return e;
}

EXP* makeEXPremove(EXP* left, ID* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.removeE.left = left;
	e->val.removeE.right = right;
	e->kind = removeK;
	return e;
}

EXP* makeEXPcall(ID* left, EXP* right)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.callE.left = left;
	e->val.callE.right = right;
	e->kind = callK;
	return e;
}

EXP* makeEXPintconst(int intconst)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.intconstE = intconst;
	e->kind = intconstK;
	return e;
}

EXP* makeEXPtrue()
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->kind = trueK;
	return e;
}

EXP* makeEXPfalse()
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->kind = falseK;
	return e;
}

EXP* makeEXPstringconst(char* stringconst)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.stringconstE = stringconst;
	e->kind = stringconstK;
	return e;
}

EXP* makeEXPtuple(FIELDVALUE* fieldvalue)
{
	EXP* e;
	e = NEW(EXP);
	e->lineno = lineno;
	e->val.tupleE = fieldvalue;
	e->kind = tupleK;
	return e;
}
