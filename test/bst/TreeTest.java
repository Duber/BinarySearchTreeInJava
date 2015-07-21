package bst;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by duber on 21/07/15.
 */
public class TreeTest {

    @Test
    public void createATreeWithAValue(){
        int value = 1;
        Tree tree = new Tree(value);

        Assert.assertEquals(value, tree.getValue());
    }

    @Test
    public void addAHigherValueToATree(){
        int firstValue = 1;
        int secondValue = 2;
        Tree tree = new Tree(firstValue);

        tree.addValue(secondValue);

        Assert.assertEquals(secondValue, tree.getRightSubTree().getValue());
    }

    @Test
    public void addALowerValueToATree(){
        int firstValue = 2;
        int secondValue = 1;
        Tree tree = new Tree(firstValue);

        tree.addValue(secondValue);

        Assert.assertEquals(secondValue, tree.getLeftSubTree().getValue());
    }

    @Test
    public void retrieveValuesOrdered(){
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
