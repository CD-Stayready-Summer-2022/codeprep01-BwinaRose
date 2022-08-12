package com.codedifferently.problems;

import java.util.ArrayList;

public class Problem02 {
    public static Integer cousinTag(ArrayList<String> cousins, Integer startIndex, String targetName){
        int targetIndex = cousins.indexOf(targetName);
        int regularDistance = Math.abs(targetIndex-startIndex);
        int circularCompareIndex = cousins.size()-startIndex;
        int circularDistance = Math.abs(targetIndex-circularCompareIndex);
        return Math.min(regularDistance,circularDistance);
    }
}
