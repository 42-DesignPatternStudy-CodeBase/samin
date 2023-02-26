package bridgePattern.impl;

import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T> {
    
    LinkedList<T> list = new LinkedList<T>();
    
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
