package com.example.springboot.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:05 2020/1/17
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        List<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        namesRepository.setList(list);
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
        /*java.util.Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println("Name : "+(String) iterator1.next());
        }*/
    }

}
