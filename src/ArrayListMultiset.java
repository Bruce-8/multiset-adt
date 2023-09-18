import java.util.ArrayList;

/**
 * ArrayListMultiset
 */
public class ArrayListMultiset extends MultiSet {
  private ArrayList<Object> _list;

  public ArrayListMultiset(ArrayList<Object> _list) { this._list = _list; }

  public boolean add(Object item) {
    this._list.add(item);
    return true;
  }

  public void remove(Object item) {
    if (this._list.contains(item)) {
      this._list.remove(item);
    }
  }

  public boolean contains(Object item) { return this._list.contains(item); }

  public boolean is_empty(Object item) { return this._list.isEmpty(); }

  public int count(Object item) {
    int count = 0;

    for (Object o : this._list) {
      if (o.equals(item)) {
        count++;
      }
    }

    return count;
  }

  public int size(Object item) { return this._list.size(); }

  public ArrayList<Object> get_list() { return _list; }

  public void set_list(ArrayList<Object> _list) { this._list = _list; }
}
