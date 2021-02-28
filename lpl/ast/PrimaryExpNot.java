package lpl.ast;

public class PrimaryExpNot extends PrimaryExp {

    public final PrimaryExp e;

    public PrimaryExpNot(PrimaryExp e) {
        this.e = e;
    }

}
