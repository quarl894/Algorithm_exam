package Sort;

//�ڹٷ� ¥�� ����Ž��Ʈ�� ���α׷�

import java.util.Scanner;

//����Ž��Ʈ�� ��� Ŭ����
class BSTNode {
	BSTNode left, right;
	int data;

	// ������
	public BSTNode() {
		left = null;
		right = null;
		data = 0;
	}

	// ������
	public BSTNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	// ���ʳ�� set
	public void setLeft(BSTNode n) {
		left = n;
	}

	// ������ ��� set
	public void setRight(BSTNode n) {
		right = n;
	}

	// ���ʳ�� get
	public BSTNode getLeft() {
		return left;
	}

	// ������ ��� get
	public BSTNode getRight() {
		return right;
	}

	// �����͸� ���� set
	public void setData(int d) {
		data = d;
	}

	// ����� ������ get
	public int getData() {
		return data;
	}
}

//����Ž��Ʈ�� Ŭ����
class BST {
	private BSTNode root;

	// ������
	public BST() {
		root = null;
	}

	// Ʈ���� ����ִ��� �˻��ϴ� �Լ�
	public boolean isEmpty() {
		return root == null;
	}

	// ������ ����
	public void insert(int data) {
		root = insert(root, data);
	}

	// �ݺ��ؼ� ������ ����
	private BSTNode insert(BSTNode node, int data) {
		if (node == null)
			node = new BSTNode(data);
		else {
			if (data <= node.getData())
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		}
		return node;
	}

	// ������ ����
	public void delete(int k) {
		if (isEmpty())
			System.out.println("Tree Empty");
		else if (search(k) == false)
			System.out.println("Sorry " + k + " is not present");
		else {
			root = delete(root, k);
			System.out.println(k + " deleted from the tree");
		}
	}

	// �ݺ��ؼ� ������ ����
	private BSTNode delete(BSTNode root, int k) {
		BSTNode p, p2, n;
		if (root.getData() == k) {
			BSTNode lt, rt;
			lt = root.getLeft();
			rt = root.getRight();
			if (lt == null && rt == null)
				return null;
			else if (lt == null) {
				p = rt;
				return p;
			} else if (rt == null) {
				p = lt;
				return p;
			} else {
				p2 = rt;
				p = rt;
				while (p.getLeft() != null)
					p = p.getLeft();
				p.setLeft(lt);
				return p2;
			}
		}
		if (k < root.getData()) {
			n = delete(root.getLeft(), k);
			root.setLeft(n);
		} else {
			n = delete(root.getRight(), k);
			root.setRight(n);
		}
		return root;
	}

	// ��� ���� ��ȯ�ϴ� �Լ�
	public int countNodes() {
		return countNodes(root);
	}

	// ��� ���� �ݺ��ؼ� ��ȯ�ϴ� �Լ�
	private int countNodes(BSTNode r) {
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}

	// value Ž��
	public boolean search(int val) {
		return search(root, val);
	}

	// �ݺ��ؼ� value Ž��
	private boolean search(BSTNode r, int val) {
		boolean found = false;
		while ((r != null) && !found) {
			int rval = r.getData();
			if (val < rval)
				r = r.getLeft();
			else if (val > rval)
				r = r.getRight();
			else {
				found = true;
				break;
			}
			found = search(r, val);
		}
		return found;
	}

	// ������ȸ (inorder traversal)
	public void inorder() {
		inorder(root);
	}

	private void inorder(BSTNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	// ������ȸ (preorder traversal)
	public void preorder() {
		preorder(root);
	}

	private void preorder(BSTNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	// ������ȸ (postorder traversal)
	public void postorder() {
		postorder(root);
	}

	private void postorder(BSTNode r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		BST bst = new BST();
		System.out.println("����Ž��Ʈ�� (Binary Search Tree) �׽�Ʈ \n");
		char ch;

		do {
			System.out.println("����Ž��Ʈ�� (Binary Search Tree) ���\n");
			System.out.println("1. ���� ");
			System.out.println("2. ����");
			System.out.println("3. Ž��");
			System.out.println("4. ��� ����");
			System.out.println("5. ����ִ��� Ȯ��\n");
			System.out.print("-> ");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println();
				System.out.print("���� �� ������ (integer) : ");
				bst.insert(scan.nextInt());
				break;
			case 2:
				System.out.println();
				System.out.print("���� �� ������ (integer) : ");
				bst.delete(scan.nextInt());
				break;
			case 3:
				System.out.println();
				System.out.println("Ž�� �� ������ (integer) : ");
				System.out.println("Ž���� ����� : " + bst.search(scan.nextInt()));
				break;
			case 4:
				System.out.println();
				System.out.println("��� = " + bst.countNodes());
				break;
			case 5:
				System.out.println();
				System.out.println("���� ���� = " + bst.isEmpty());
				break;
			default:
				System.out.println();
				System.out.println("�߸��Է��ϼ̽��ϴ� \n ");
				break;
			}

			// Ʈ�� ��ȸ ����ϱ�
			System.out.print("\n������ȸ(Post order) : ");
			bst.postorder();
			System.out.print("\n������ȸ(Pre order) : ");
			bst.preorder();
			System.out.print("\n������ȸ(In order) : ");
			bst.inorder();

			System.out.println();
			System.out.print("\n����Ͻðڽ��ϱ�? (��: y or �ƴϿ�: n): ");
			ch = scan.next().charAt(0);
			System.out.println();
		} while (ch == 'Y' || ch == 'y');

	}

}
