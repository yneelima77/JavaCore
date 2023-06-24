package com.perscholas.GLAB303_11_1_GenericMethods_Classes;

public class GMultipleDatatype<DatatypeOne, DatatypeTwo> {
    DatatypeOne value1;
    DatatypeTwo value2;

    public GMultipleDatatype(DatatypeOne v1, DatatypeTwo v2) {
        this.value1 = v1;
        this.value2 = v2;
    }

    public DatatypeOne getValue1() {
        return value1;
    }

    public void setVale1(DatatypeOne value1) {
        this.value1 = value1;
    }

    public void setValue2(DatatypeTwo value2) {
        this.value2 = value2;
    }

    public DatatypeTwo getValue2() {
        return value2;
    }

}
