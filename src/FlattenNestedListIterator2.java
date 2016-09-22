import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by Shadowera on 2016/4/28.
 */
public class FlattenNestedListIterator2 {
    public class NestedIterator implements Iterator<Integer> {

        private final Stack<NestedInteger> mStack;

        public NestedIterator(List<NestedInteger> nestedList) {
            mStack = new Stack<NestedInteger>();
            int n = nestedList.size() - 1;
            while (n >= 0) {
                mStack.push(nestedList.get(n));
                n--;
            }
        }

        @Override
        public boolean hasNext() {
            while (!mStack.empty()) {
                NestedInteger ni = mStack.peek();
                if (ni.isInteger())
                    return true;
                mStack.pop();
                List<NestedInteger> list = ni.getList();
                for (int i = list.size() - 1; i >= 0; i--) {
                    mStack.push(list.get(i));
                }
            }
            return false;
        }

        @Override
        public Integer next() {
            return mStack.pop().getInteger();
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
