/* Generated By:JJTree: Do not edit this line. If.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package br.unipe.compilador.analisador;

public
class If extends CustomNode {
  public If(int id) {
    super(id);
  }

  public If(Gramatica p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GramaticaVisitor visitor, Controlador data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1a4da3b90907bbc4c0e1d72ad19900c3 (do not edit this line) */
