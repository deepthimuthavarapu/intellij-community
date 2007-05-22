package org.jetbrains.plugins.groovy.lang.surroundWith.surrounders.surroundersImpl.blocks.open;

import com.intellij.lang.ASTNode;

/**
 * User: Dmitry.Krasilschikov
 * Date: 22.05.2007
 */
public class GroovyWithTryCatchSurrounder extends GroovyWithTrySurrounder {
  public String getTemplateDescription() {
    return super.getTemplateDescription() + "/ catch";
  }

  protected String getExpressionTemplateAsString(ASTNode node) {
    return super.getExpressionTemplateAsString(node) + " \n catch { \n }";
  }
}
