/*
 * JOOSJ is Copyright (C) 2000 Othman Alaoui
 *
 * Reproduction of all or part of this software is permitted for
 * educational or research use on condition that this copyright notice is
 * included in any copy. This software comes with no warranty of any
 * kind. In no event will the author be liable for any damages resulting from
 * use of this software.
 *
 * email: oalaou@po-box.mcgill.ca
 */


package joosc.fixer;

import joosc.*;
import joosc.node.*;
import joosc.analysis.*;
import java.util.*;

/*
 * AstFixerSimplestm
 * 
 * This is a continuation of AstFixer that integrates the simplestm
 * production alternatives into the stm production.
 * Assuming this is run after the AstFixer pass, it eliminates all 
 * references to the simplestm production from the AST.
 * This is separate from AstFixer because doing this transformation
 * in the same tree walk as stm_no_short_if elimination is conflict-prone.
 *
 * History:
 *   4 May 2000 - created
 */
public class AstFixerSimplestm extends DepthFirstAdapter {
	protected String filename;

	public AstFixerSimplestm(String fn) { filename = fn; }
	
	public void outASimpleStm(ASimpleStm tmpNode) {
		PSimplestm simplestmP = tmpNode.getSimplestm();
		PStm node = null;
		
		if (simplestmP instanceof ASkipSimplestm) {
			ASkipSimplestm simplestm = (ASkipSimplestm)simplestmP;
			node = new ASkipStm(simplestm.getSemicolon());
		}
		else if (simplestmP instanceof ABlockSimplestm) {
			ABlockSimplestm simplestm = (ABlockSimplestm)simplestmP;
			node = new ABlockStm(simplestm.getLBrace(),
			                     simplestm.getStm(),
			                     simplestm.getRBrace());
		}
		else if (simplestmP instanceof AExpSimplestm) {
			AExpSimplestm simplestm = (AExpSimplestm)simplestmP;
			node = new AExpStm(simplestm.getStmExp(),
			                   simplestm.getSemicolon());
		}
		else if (simplestmP instanceof AReturnSimplestm) {
			AReturnSimplestm simplestm = (AReturnSimplestm)simplestmP;
			node = new AReturnStm(simplestm.getReturn(),
			                     simplestm.getExp(),
			                     simplestm.getSemicolon());
		}
		
		tmpNode.replaceBy(node);
	}
}