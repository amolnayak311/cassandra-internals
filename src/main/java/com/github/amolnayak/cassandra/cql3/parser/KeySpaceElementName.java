package com.github.amolnayak.cassandra.cql3.parser;

import java.util.Locale;

/**
 * Copied from o.a.c.c.KeyspaceElementName
 */
abstract class KeyspaceElementName{
    /**
     * The keyspace name as stored internally.
     */
    private String ksName;

    /**
     * Sets the keyspace.
     *
     * @param ks the keyspace name
     * @param keepCase <code>true</code> if the case must be kept, <code>false</code> otherwise.
     */
    public final void setKeyspace(String ks, boolean keepCase)
    {
        ksName = toInternalName(ks, keepCase);
    }

    /**
     * Checks if the keyspace is specified.
     * @return <code>true</code> if the keyspace is specified, <code>false</code> otherwise.
     */
    public final boolean hasKeyspace()
    {
        return ksName != null;
    }

    public final String getKeyspace()
    {
        return ksName;
    }

    /**
     * Converts the specified name into the name used internally.
     *
     * @param name the name
     * @param keepCase <code>true</code> if the case must be kept, <code>false</code> otherwise.
     * @return the name used internally.
     */
    protected static String toInternalName(String name, boolean keepCase)
    {
        return keepCase ? name : name.toLowerCase(Locale.US);
    }

    @Override
    public String toString()
    {
        return hasKeyspace() ? (getKeyspace() + ".") : "";
    }
}
