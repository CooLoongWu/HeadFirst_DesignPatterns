package cooloongwu.com.iterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {//当客户想要取得下一个元素的时候，我们先确定下是否还有下一个。

            //如果有下一个元素，我们就从堆栈中取出目前的迭代器，然后取出他的下一个元素。
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();

            //如果元素是一个菜单，我们有了另一个需要被包含进遍历中的组合，所以我们将它丢进堆栈中。
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
