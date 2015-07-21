package bst;

/**
 * Created by duber on 21/07/15.
 */
public class Tree {
    private int _value;
    private Tree _leftSubTree;
    private Tree _rightSubTree;

    public Tree(int value) {
        _value = value;
    }

    public int getValue() {
        return _value;
    }

    public void addValue(int value) {
        if (value > _value){
            if (_rightSubTree == null){
                _rightSubTree = new Tree(value);
            } else {
                _rightSubTree.addValue(value);
            }
        } else if (value < _value){
            if (_leftSubTree == null){
                _leftSubTree = new Tree(value);
            } else {
                _leftSubTree.addValue(value);
            }
        }
    }

    public Tree getLeftSubTree() {
        return _leftSubTree;
    }

    public Tree getRightSubTree(){
        return _rightSubTree;
    }

    public int[] inOrder() {
        int[] result;
        int[] leftSubTree = new int[0];
        int[] rightSubTree = new int[0];

        if (_leftSubTree != null){
            leftSubTree = _leftSubTree.inOrder();
        }
        if (_rightSubTree != null){
            rightSubTree = _rightSubTree.inOrder();
        }

        result = new int[leftSubTree.length + rightSubTree.length + 1];

        for(int index = 0; index < leftSubTree.length; index++){
            result[index] = leftSubTree[index];
        }

        result[leftSubTree.length] = _value;

        for(int index=0; index < rightSubTree.length; index++){
            result[leftSubTree.length + 1 + index] = rightSubTree[index];
        }

        return result;
    }
}
