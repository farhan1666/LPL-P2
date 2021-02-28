package lpl.ast;

import java.util.List;
import java.util.Collections;

public class ExpCall extends Exp {

    public final String id;
    public final List<Exp> es;

    public ExpCall(String id, List<Exp> es) {
        this.id = id;
        this.es = Collections.unmodifiableList(es);
    }

    @Override
    public String toString() {
        return  id  + " " + es;
    }
    
}
