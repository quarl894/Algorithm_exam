package Sort;

//자바로 짜본 이진탐색트리 프로그램

import java.util.Scanner;

//이진탐색트리 노드 클래스
class BSTNode {
	BSTNode left, right;
	int data;

	// 생성자
	public BSTNode() {
		left = null;
		right = null;
		data = 0;
	}

	// 생성자
	public BSTNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	// 왼쪽노드 set
	public void setLeft(BSTNode n) {
		left = n;
	}

	// 오른쪽 노드 set
	public void setRight(BSTNode n) {
		right = n;
	}

	// 왼쪽노드 get
	public BSTNode getLeft() {
		return left;
	}

	// 오른쪽 노드 get
	public BSTNode getRight() {
		return right;
	}

	// 데이터를 노드로 set
	public void setData(int d) {
		data = d;
	}

	// 노드의 데이터 get
	public int getData() {
		return data;
	}
}

//이진탐색트리 클래스
class BST {
	private BSTNode root;

	// 생성자
	public BST() {
		root = null;
	}

	// 트리가 비어있는지 검사하는 함수
	public boolean isEmpty() {
		return root == null;
	}

	// 데이터 삽입
	public void insert(int data) {
		root = insert(root, data);
	}

	// 반복해서 데이터 삽입
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

	// 데이터 삭제
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

	// 반복해서 데이터 삭제
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

	// 노드 갯수 반환하는 함수
	public int countNodes() {
		return countNodes(root);
	}

	// 노드 갯수 반복해서 반환하는 함수
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

	// value 탐색
	public boolean search(int val) {
		return search(root, val);
	}

	// 반복해서 value 탐색
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

	// 중위순회 (inorder traversal)
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

	// 전위순회 (preorder traversal)
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

	// 후위순회 (postorder traversal)
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
		System.out.println("이진탐색트리 (Binary Search Tree) 테스트 \n");
		char ch;

		do {
			System.out.println("이진탐색트리 (Binary Search Tree) 기능\n");
			System.out.println("1. 삽입 ");
			System.out.println("2. 삭제");
			System.out.println("3. 탐색");
			System.out.println("4. 노드 갯수");
			System.out.println("5. 비어있는지 확인\n");
			System.out.print("-> ");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println();
				System.out.print("삽입 할 데이터 (integer) : ");
				bst.insert(scan.nextInt());
				break;
			case 2:
				System.out.println();
				System.out.print("삭제 할 데이터 (integer) : ");
				bst.delete(scan.nextInt());
				break;
			case 3:
				System.out.println();
				System.out.println("탐색 할 데이터 (integer) : ");
				System.out.println("탐색한 결과값 : " + bst.search(scan.nextInt()));
				break;
			case 4:
				System.out.println();
				System.out.println("노드 = " + bst.countNodes());
				break;
			case 5:
				System.out.println();
				System.out.println("현재 상태 = " + bst.isEmpty());
				break;
			default:
				System.out.println();
				System.out.println("잘못입력하셨습니다 \n ");
				break;
			}

			// 트리 순회 출력하기
			System.out.print("\n후위순회(Post order) : ");
			bst.postorder();
			System.out.print("\n전위순회(Pre order) : ");
			bst.preorder();
			System.out.print("\n중위순회(In order) : ");
			bst.inorder();

			System.out.println();
			System.out.print("\n계속하시겠습니까? (예: y or 아니오: n): ");
			ch = scan.next().charAt(0);
			System.out.println();
		} while (ch == 'Y' || ch == 'y');

	}

}
