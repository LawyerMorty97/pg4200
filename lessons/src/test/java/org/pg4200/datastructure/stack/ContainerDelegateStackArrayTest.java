package org.pg4200.datastructure.stack;

import org.pg4200.les02.stack.ContainerDelegateStack;
import org.pg4200.les02.stack.MyStack;

public class ContainerDelegateStackArrayTest extends MyStackTestTemplate{

    @Override
    protected <T> MyStack<T> getInstance(Class<T> klass) {
        return ContainerDelegateStack.backedByArray(klass);
    }
}