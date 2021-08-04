package az.coders.ada_students.lessons.lesson_18.repition;

import java.math.BigDecimal;

public class MathExample {

    public BigDecimal add(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }

    public BigDecimal add(BigDecimal x, BigDecimal y, BigDecimal z) {
        return add(x, y).add(z);
    }

    public BigDecimal add(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal t) {
        return add(x, y, z).add(t);
    }
}