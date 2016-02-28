package de.frankraiser.checkstyle;

import com.puppycrawl.tools.checkstyle.api.*;

/**
 * Logs any usages of the <code>null</code> literal.
 *
 * @author Frank Raiser <raiser.frank@gmail.com>
 */
public class NullLiteralCheck extends Check {

    @Override
    public int[] getDefaultTokens() {
        return new int[]{TokenTypes.LITERAL_NULL};
    }

    @Override
    public void visitToken(DetailAST ast) {
        log(ast.getLineNo(), ast.getColumnNo(), "null.literal.found");
    }
}
