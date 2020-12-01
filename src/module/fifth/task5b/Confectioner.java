package module.fifth.task5b;

import static module.fifth.task5b.TypesOfCandy.*;

public class Confectioner {
    public Present vipPresent(Builder builder) {
        builder.addPackaging(Packaging.BIG_PAPER_BOX);
        for (int i = 0; i < 100; i++) {
            builder.addCandy(CHOCOLATE);
        }
        for (int i = 0; i < 50; i++) {
            builder.addCandy(SOUFFLE);
        }
        builder.setWeight(5.5);
        return builder.build();
    }
    public Present presentForManagers(Builder builder) {
        builder.addPackaging(Packaging.BIG_PAPER_BOX);
        for (int i = 0; i < 50; i++) {
            builder.addCandy(CHOCOLATE);
            builder.addCandy(WAFFLE);
        }
        builder.setWeight(3);
        return builder.build();
    }

}
