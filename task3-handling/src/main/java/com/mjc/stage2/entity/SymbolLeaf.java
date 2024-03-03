package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {
    private char value;

    public SymbolLeaf(char value, TextComponentType componentType ) {
        super(componentType);
        this.value=value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Cannot add to a SymbolLeaf");
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Cannot remove from a SymbolLeaf");
    }

    @Override
    public int getSize() {
        return 1;
        //throw new UnsupportedOperationException();

    }



}
