package com.github.amolnayak.cassandra.cql3.parser;

/**
 * 
 *Copied from o.a.c.c.CFName
 *
 */
public class CFName extends KeyspaceElementName {
    private String cfName;

    public void setColumnFamily(String cf, boolean keepCase)
    {
        cfName = toInternalName(cf, keepCase);
    }

    public String getColumnFamily()
    {
        return cfName;
    }

    @Override
    public String toString()
    {
        return super.toString() + cfName;
    }
}
