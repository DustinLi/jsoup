package org.jsoup.select;

import org.jsoup.nodes.Node;

/**
 * Node visitor interface. Provide an implementing class to {@link NodeTraversor} to iterate through nodes.
 * <p/>
 * This interface provides two methods, {@code head} and {@code tail}. The head method is called when the node is first
 * seen, and the tail method when all of the node's children have been visited. As an example, head can be used to
 * create a start tag for a node, and tail to create the end tag.
 */
public interface NodeVisitor {

    //遍历到节点开始时，调用此方法
    public void head(Node node, int depth);

    //遍历到节点结束时(所有子节点都已遍历完)，调用此方法
    public void tail(Node node, int depth);
}
