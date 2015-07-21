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

    public int GetValue() {
        return _value;
    }

    public void AddValue(int value) {
        if (value > _value){
            if (_rightSubTree == null){
                _rightSubTree = new Tree(value);
            } else {
                _rightSubTree.AddValue(value);
            }
        } else if (value < _value){
            if (_leftSubTree == null){
                _leftSubTree = new Tree(value);
            } else {
                _leftSubTree.AddValue(value);
            }
        }
    }

    public Tree GetLeftSubTree() {
        return _leftSubTree;
    }

    public Tree GetRightSubTree(){
        return _rightSubTree;
    }
}
