package bridgePattern.impl;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T>{
    ArrayList<T> list = new ArrayList<>(); 
    
    @Override
    public void addElement(T obj)
    {
        list.add(obj);
    }

    @Override
    public T deleteElement(int i)
    {
        return list.remove(i);
    }

    @Override
    public int insertElement(T obj, int i)
    {
        list.add(i, obj);
        return i; //PASS
    }

    @Override
    public T getElement(int i)
    {
        return list.get(i);
    }

    @Override
    public int getElementSize()
    {
        return list.size();
    }
    
}
