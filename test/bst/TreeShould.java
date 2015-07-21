package bst;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by duber on 21/07/15.
 */
public class TreeShould {

    @Test
    public void CreateATreeWithAValue(){
        int value = 1;
        Tree tree = new Tree(value);

        Assert.assertEquals(value, tree.getValue());
    }

    @Test
    public void AddAHigherValueToATree(){
        int firstValue = 1;
        int secondValue = 2;
        Tree tree = new Tree(firstValue);

        tree.addValue(secondValue);

        Assert.assertEquals(secondValue, tree.getRightSubTree().getValue());
    }

    @Test
    public void AddALowerValueToATree(){
        int firstValue = 2;
        int secondValue = 1;
        Tree tree = new Tree(firstValue);

        tree.addValue(secondValue);

        Assert.assertEquals(secondValue, tree.getLeftSubTree().getValue());
    }

    @Test
    public void RetrieveValuesOrdered(){
        int[] initialValues = new int[]{ 3, 4, 1, 2 };
        int[] orderedValues = new int[]{ 1, 2, 3, 4 };
        Tree tree = new Tree(initialValues[0]);
        tree.addValue(initialValues[1]);
        tree.addValue(initialValues[2]);
        tree.addValue(initialValues[3]);

        int[] orderedTree = tree.inOrder();
        Assert.assertTrue(Arrays.equals(orderedValues, orderedTree));
    }

}
