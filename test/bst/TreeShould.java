package bst;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by duber on 21/07/15.
 */
public class TreeShould {

    @Test
    public void CreateATreeWithAValue(){
        int value = 1;
        Tree tree = new Tree(value);

        Assert.assertEquals(value, tree.GetValue());
    }

    @Test
    public void AddAHigherValueToATree(){
        int firstValue = 1;
        int secondValue = 2;
        Tree tree = new Tree(firstValue);

        tree.AddValue(secondValue);

        Assert.assertEquals(secondValue, tree.GetRightSubTree().GetValue());
    }

    @Test
    public void AddALowerValueToATree(){
        int firstValue = 2;
        int secondValue = 1;
        Tree tree = new Tree(firstValue);

        tree.AddValue(secondValue);

        Assert.assertEquals(secondValue, tree.GetLeftSubTree().GetValue());
    }

}
