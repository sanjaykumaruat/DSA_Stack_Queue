package com.tree;


import java.util.*;

public class LowestCommonAncestorBST {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Build tree from level order array
    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();

            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    // Find node by value
    public static TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;

        TreeNode left = findNode(root.left, val);
        if (left != null) return left;

        return findNode(root.right, val);
    }

    // LCA logic (Iterative)
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    // Main method
    public static void main(String[] args) {

        // Input
        Integer[] rootArr = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        int pVal = 2;
        int qVal = 8;

        // Build tree
        TreeNode root = buildTree(rootArr);

        // Find p and q nodes
        TreeNode p = findNode(root, pVal);
        TreeNode q = findNode(root, qVal);

        // Find LCA
        TreeNode lca = lowestCommonAncestor(root, p, q);

        // Output
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + pVal + " and " + qVal + " is: " + lca.val);
        } else {
            System.out.println("LCA not found");
        }
    }
}
