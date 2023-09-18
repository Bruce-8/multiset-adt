import java.lang.UnsupportedOperationException;
class MultiSet {
    /*
    An abstract class representing the MultiSet ADT, which supports the
    add, remove, is_empty, count, and contains operations.

    This class itself does not handle how the underlying data is stored,
    so it just inherits Object.__init__.
    */

    public boolean add(Object item) {
        throw new UnsupportedOperationException();
    }

    public void remove(Object item) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object item) {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    public int count(Object item) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        throw new UnsupportedOperationException();
    }
}
