package com.zipcodewilmington.arrayutility;


import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    ArrayList<T> array = new ArrayList<>();
    T[] resultArray;

    public ArrayUtility(T[] inputArray){
        this.array.addAll(Arrays.asList(inputArray));
        this.resultArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate){
        this.array.addAll(Arrays.asList(arrayToMerge));
        int counter = 0;
        for(T value : array){
            if (value == valueToEvaluate){
                counter++;
            }

        }
        return counter;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge){
        this.array.addAll((Arrays.asList(arrayToMerge)));

        int counter = 0;
        int highest = 0;
        T result = null;
        for(T checkMe : array){
            counter = 0;
            for (T checkAgainstMe : array){
                if (checkMe.equals(checkAgainstMe)){
                    counter++;
                    if (counter > highest){
                        highest = counter;
                        result = checkAgainstMe;
                    }
                }
            }
        }
        return result;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate){
        Integer counter = 0;
        for (T value : array){
            if (value == valueToEvaluate){
                counter++;
            }
        }
        return counter;
    }

    public T[] removeValue(T valueToBeRemoved){
        int removalCounter = 0;
        for(int i = 0;i<array.size();i++){
            if (array.get(i).equals(valueToBeRemoved)) {
                array.remove(i);
                i--;
                removalCounter++;
            }
        }

        return array.toArray(Arrays.copyOf(resultArray, array.size()));
    }

}
