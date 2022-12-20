package com.sourcecs.scsapi.model.parser;

public interface Parser<E, I> {

    I parse(E e);

}
