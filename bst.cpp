/* A program to convert Binary Tree to Binary Search Tree */
#include<stdio.h>
#include<stdlib.h>
#include<iostream> 
using namespace std;
 
/* A binary tree node structure */
class BinarySearchTree{

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

public:
node* root;
	BinarySearchTree(){

root=NULL;	}

bool  isEmpty ();
void insert(int data);
void insert1(int data);
void inorder(node *p);
void inorder1(){
	inorder(root);
}

};
bool BinarySearchTree::isEmpty() { return root==NULL; }

void BinarySearchTree::insert1(int data)
{
	node *t = new node;
	t->data = data;
	t->right =NULL;
	t->left =NULL;
	node * parent = NULL;
	if(root == NULL)
	   root =t;
	 else
	 {
	  node *curr = root;
	  while(curr)
	  {
	  	parent = curr;
	  	if(curr->data > t->data)
	  	curr =curr->left;
	  	else
	  	curr =curr->right;
	  	
	  }
	    if(t->data < parent->data)
       parent->left = t;
       else
       parent->right = t;
	}
}

void BinarySearchTree::inorder(node *p)
{
	
 // if p is null return
 if( p == NULL )
  return;
 // left sub-tree
 inorder(p->left);
 // root
cout<< p->data;
 //right sub-tree
 inorder(p->right);

}
void BinarySearchTree::insert(int d)
{
    node* t = new node;
    node* parent;
    t->data = d;
    t->left = NULL;
    t->right = NULL;
    parent = NULL;
  // is this a new tree?
  if(isEmpty()) root = t;
  else
  {
    //Note: ALL insertions are as leaf nodes
    node* curr;
    curr = root;
    // Find the Node's parent
    while(curr)
    {
        parent = curr;
        if(t->data > curr->data) curr = curr->right;
        else curr = curr->left;
    }

    if(t->data < parent->data)
       parent->left = t;
    else
       parent->right = t;
  }
}



int main()
{
	int data ;
	BinarySearchTree bst;
	do
	{
		cin>>data;
		if(data!=-1)
		bst.insert1(data);
	}while(data != -1);
	
	bst.inorder1();
	
}


