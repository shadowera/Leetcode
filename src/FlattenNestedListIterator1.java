import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by Shadowera on 2016/4/28.
 */
public class FlattenNestedListIterator1 {
    public static void main(String[] args) {

    }

    /**
     * // This is the interface that allows for creating nested lists.
     * // You should not implement it, or speculate about its implementation
     * public interface NestedInteger {
     * <p>
     * // @return true if this NestedInteger holds a single integer, rather than a nested list.
     * public boolean isInteger();
     * <p>
     * // @return the single integer that this NestedInteger holds, if it holds a single integer
     * // Return null if this NestedInteger holds a nested list
     * public Integer getInteger();
     * <p>
     * // @return the nested list that this NestedInteger holds, if it holds a nested list
     * // Return null if this NestedInteger holds a single integer
     * public List<NestedInteger> getList();
     * }
     */
    public class NestedIterator implements Iterator<Integer> {

        private final List<NestedInteger> nestedList;
        private NestedInteger mNext = null;
        private int mListIndex = 0;
        private NestedIterator innerIterator = null;

        public NestedIterator(List<NestedInteger> nestedList) {
            this.nestedList = nestedList;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                if (innerIterator != null) {
                    if (innerIterator.hasNext()) {
                        return innerIterator.next();
                    } else {
                        innerIterator = null;
                    }
                }
                mNext = nestedList.get(mListIndex);
                mListIndex++;
                if (mNext.isInteger()) {
                    return mNext.getInteger();
                } else {
                    List<NestedInteger> list = mNext.getList();
                    innerIterator = new NestedIterator(list);
                    return innerIterator.next();

                }
            } else {
                throw new IndexOutOfBoundsException();
            }

        }

        @Override
        public boolean hasNext() {
            NestedInteger nestedInteger;
            try {
                nestedInteger = nestedList.get(mListIndex);
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
            if (nestedInteger.isInteger())
                return true;
            else {
                List<NestedInteger> list = nestedInteger.getList();
                NestedIterator nestedIterator = new NestedIterator(list);
                return nestedIterator.hasNext();
            }
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

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
