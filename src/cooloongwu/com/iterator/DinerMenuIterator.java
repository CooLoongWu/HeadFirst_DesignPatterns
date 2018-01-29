package cooloongwu.com.iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int positon = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(positon >= items.length || items[positon] == null);
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[positon];
        positon++;
        return menuItem;
    }
}
