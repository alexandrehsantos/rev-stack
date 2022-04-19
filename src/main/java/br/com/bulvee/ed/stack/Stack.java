package br.com.bulvee.ed.stack;

import br.com.bulvee.dlinkedlist.LinkedList;

public class Stack<T> {

    private LinkedList<T> names = new LinkedList<T>();

    public void push(T t) {
        names.add(t);
    }

    public void pop() {
        names.remove(names.size()-1);
    }

    public boolean empty() {
        return names.isEmpty();
    }

    @Override
    public String toString() {
        return names.toString();
    }

    public T peak() {
          return names.get(names.size()-1);
    }
}
