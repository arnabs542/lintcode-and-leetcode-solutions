package com.g7tianyi.lintcode.list;

import com.g7tianyi.common.ListNode;
import com.g7tianyi.util.Logger;
import lombok.AllArgsConstructor;
import org.junit.Test;

import java.util.function.Consumer;

/**
 * Created by g7tianyi on Aug 24, 2019
 *
 * @link https://www.lintcode.com/problem/remove-nth-node-from-end-of-list/description
 */
public class RemoveNthNodeFromEndOfList {

  private static final Logger log = Logger.getInstance();

  public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

      if (head == null || n <= 0) {
        return head;
      }

      ListNode fast = head;
      for (int i = 0; i < n; i++) {
        fast = fast.next;
      }

      ListNode prev = null;
      ListNode curr = head;
      while (fast != null) {
        prev = curr;
        curr = curr.next;
        fast = fast.next;
      }

      if (prev == null) {
        head = head.next;
      } else {
        prev.next = curr.next;
      }

      return head;
    }
  }

  @AllArgsConstructor
  private static class Input {

    private ListNode head;

    private int n;
  }

  @Test
  public void test() {

    Solution s = new Solution();

    Consumer<Input> runner =
        input -> {
          log.info(input.head);
          log.info(s.removeNthFromEnd(input.head, input.n));
          log.info("");
        };

    runner.accept(new Input(null, 2));
    runner.accept(new Input(null, 0));
    runner.accept(new Input(ListNode.sortedListOf(5), -1));
    runner.accept(new Input(ListNode.from(1, 2, 3, 4, 5), 2));
    runner.accept(new Input(ListNode.from(5, 4, 3, 2, 1), 2));
    runner.accept(new Input(ListNode.sortedListOf(5), 5));
    runner.accept(new Input(ListNode.sortedListOf(5), 4));
    runner.accept(new Input(ListNode.sortedListOf(5), 3));
    runner.accept(new Input(ListNode.sortedListOf(1), 1));
  }
}
