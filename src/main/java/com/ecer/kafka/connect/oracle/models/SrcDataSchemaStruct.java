package com.ecer.kafka.connect.oracle.models;

import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.Struct;

public class SrcDataSchemaStruct {

    private Schema srcRowSchema;
    private Struct srcDataStruct;

    public SrcDataSchemaStruct(Schema srcRowSchema, Struct srcDataStruct){
        super();
        this.srcRowSchema=srcRowSchema;
        this.srcDataStruct=srcDataStruct;
    }

    public Schema getRowSchema(){
        return srcRowSchema;
    }

    public Struct getDataStruct(){
        return srcDataStruct;
    }

    public void setRowSchema(Schema srcRowSchema){
        this.srcRowSchema=srcRowSchema;
    }

    public void setDataStruct(Struct srcDataStruct){
        this.srcDataStruct=srcDataStruct;
    }
}
