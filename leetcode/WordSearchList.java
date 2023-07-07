package com.parkinglot.design.ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordSearchList {
    List<WordSearchList> words=null;
    boolean isLeaf;
    WordSearchList()
    {
        words= new ArrayList<>(Collections.nCopies(26,null));
        isLeaf=false;
    }
    public void insert(String str)
    {
        WordSearchList root= this;
        for(Character c: str.toCharArray())
        {
            if(this.words.get(c-'a')==null)
                words.set(c-'a',new WordSearchList());
        }
    }
}
