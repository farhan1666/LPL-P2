package lpl.ast;

import java.util.List;
import java.util.Collections;

public class FunDef {

    public final Type t;
    public final String id;
    public final List<Formal> fs;
    public final List<VarDecl> lvs;
    public final List<Stm> ss;

    public FunDef(Type t, String id, List<Formal> fs, List<VarDecl> lvs, List<Stm> ss) {
        this.t = t;
        this.id = id;
        this.fs = Collections.unmodifiableList(fs);
        this.lvs = Collections.unmodifiableList(lvs);
        this.ss = Collections.unmodifiableList(ss);
    }

    @Override
    public String toString() {
       return "Type " + t  + "Id" + id + "fs" + fs + "lvs" + "ss" + ss;
    }
}
