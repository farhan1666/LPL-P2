package lpl.ast;

public class StmReturn extends Stm {

    public final Exp e;

    public StmReturn(Exp e) {
        this.e = e;
    }

}
