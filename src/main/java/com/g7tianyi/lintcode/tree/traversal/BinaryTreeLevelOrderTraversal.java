package com.g7tianyi.lintcode.tree.traversal;

import com.g7tianyi.common.Strings;
import com.g7tianyi.common.TreeNode;
import com.g7tianyi.util.Logger;
import lombok.AllArgsConstructor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

/**
 * Created by g7tianyi on Aug 24, 2019
 *
 * @link https://www.lintcode.com/problem/binary-tree-level-order-traversal/description
 */
public class BinaryTreeLevelOrderTraversal {

  private static final Logger log = Logger.getInstance();

  public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
      if (root == null) {
        return result;
      }

      Queue<TreeNode> myQueue = new LinkedList<>();
      myQueue.offer(root);
      myQueue.offer(null);

      List<Integer> level = new ArrayList<>();

      while (!myQueue.isEmpty()) {

        TreeNode node = myQueue.poll();

        if (node == null) {
          result.add(level);
          level = new ArrayList<>();
          if (!myQueue.isEmpty()) {
            myQueue.offer(null);
          }
        } else {
          level.add(node.val);

          if (node.left != null) {
            myQueue.offer(node.left);
          }
          if (node.right != null) {
            myQueue.offer(node.right);
          }
        }
      }

      return result;
    }
  }

  @AllArgsConstructor
  private static final class Input {

    private TreeNode root;
  }

  @Test
  public void test() {

    Solution s = new Solution();

    Consumer<Input> runner =
        input -> {
          List<List<Integer>> listNodes = s.levelOrder(input.root);
          listNodes.forEach(list -> log.info(Strings.format(list)));
          log.info();
        };

    TreeNode root = new TreeNode(1);
    TreeNode node1 = new TreeNode(2);
    TreeNode node2 = new TreeNode(3);
    TreeNode node3 = new TreeNode(4);
    root.left = node1;
    root.right = node2;
    node1.left = node3;

    runner.accept(new Input(root));

    root.left = null;
    root.right = node1;
    node1.left = node2;
    runner.accept(new Input(root));
  }
}
