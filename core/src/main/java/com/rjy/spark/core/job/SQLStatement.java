package com.rjy.spark.core.job;

import com.rjy.spark.client.JobInstance;
import com.rjy.spark.common.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SQLStatement {

    ArrayList<String> beforeAllSQL = new ArrayList<>();

    ArrayList<String> realSQL = new ArrayList<>();

    ArrayList<String> afterAllSQL = new ArrayList<>();

    Iterator<String> beforeAllSQLItr;

    Iterator<String> realSQLItr;

    Iterator<String> afterAllSQLItr;

    /**
     * every class instance init the iterator.
     * */
    public SQLStatement(JobInstance jobInstance) {

        if (jobInstance.getAction().equals(Strings.DEFAULT_ACTION_VAR));

    }

//    public void initSQL

    public void initSQLStatementItr() {

        beforeAllSQLItr = beforeAllSQL.iterator();

        realSQLItr = realSQL.iterator();

        afterAllSQLItr = afterAllSQL.iterator();
    }

    public boolean hasNextBefAllSQL() {
        return beforeAllSQLItr.hasNext();
    }

    public String nextBefAllSQL() {
        return beforeAllSQLItr.next();
    }

    public boolean hasNextRealSQL() {
        return realSQLItr.hasNext();
    }

    public String nextRealSQL() {
        return realSQLItr.next();
    }

    public boolean hasNextAfterAllSQL() {
        return afterAllSQLItr.hasNext();
    }

    public String nextAfterAllSQL() {
        return afterAllSQLItr.next();
    }

    public static void main(String[] args) throws Exception{

        System.out.println("test");

        Class.forName("com.rjy.spark.core.job.Executor");


    }

}
