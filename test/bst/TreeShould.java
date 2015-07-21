package bst;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by duber on 21/07/15.
 */
public class TreeShould {

    @Test
    public void CreateATreeWithASingleValue(){
        int value = 1;
        Tree tree = new Tree(value);

        Assert.assertEquals(value, tree.GetValue());
    }

}
