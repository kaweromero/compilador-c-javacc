/* Generated By:JJTree: Do not edit this line. While.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package br.unipe.compilador.analisador;

public
class While extends CustomNode {
  public While(int id) {
    super(id);
  }

  public While(Gramatica p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GramaticaVisitor visitor, Controlador data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7879c20bbe8edcb0e3942079dffddc02 (do not edit this line) */
