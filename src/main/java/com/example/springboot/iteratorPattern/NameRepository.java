package com.example.springboot.iteratorPattern;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 14:01 2020/1/17
 */
public class NameRepository implements Container {


    //public String names[] = {"Robert","John","Julie","Lora"};

    private List<String> list = new ArrayList<>();

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < list.size()) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if (this.hasNext()) {
                return list.get(index++);
            }
            return null;
        }
    }
}
