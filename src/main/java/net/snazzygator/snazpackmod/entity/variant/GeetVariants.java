package net.snazzygator.snazpackmod.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum GeetVariants {
    SILVER(0),
    CHOCOLATE(1),
    COOKIE(2);

    private static final GeetVariants[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(GeetVariants::getId)).toArray(GeetVariants[]::new);
    private final int id;

    GeetVariants(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static GeetVariants byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
