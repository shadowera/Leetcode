import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shadowera on 2016/4/28.
 */
public class FlattenNestedListIterator {
    public class NestedIterator implements Iterator<Integer> {


        private final LinkedList<NestedInteger> nestedList;

        public NestedIterator(List<NestedInteger> nestedList) {
            this.nestedList = new LinkedList<NestedInteger>(nestedList);
        }


        @Override
        public boolean hasNext() {
            while (nestedList.size() > 0) {
                NestedInteger nestedInteger = nestedList.get(0);
                if (nestedInteger.isInteger()) {
                    return true;
                }
                nestedList.remove(0);

                List<NestedInteger> list = nestedInteger.getList();
                int n = 0;
                for (NestedInteger integer : list) {
                    nestedList.add(n, integer);
                    n++;
                }

            }
            return false;
        }

        @Override
        public Integer next() {
            return nestedList.remove(0).getInteger();
        }
    }

    public interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }
}
