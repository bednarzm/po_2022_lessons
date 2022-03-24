package com.company.obiekty_kopalniane.pomocnicze;

public interface MineryObjectEvaluator {
    default double getModifiedMarketValue() {
        return 0;
    }
}
