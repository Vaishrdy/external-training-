#Queue is used for level order traversal implementaation of trees
#The steps are
#1: first take root add to queue
#2: next come to left node and right node delete root from queue and print root node
#3: now again add left and right nodes of left node and delete left node and print it
#4: similarly print right node and add its child nodes and repeat the Procedure
'''class Node:
    def __init__(self,value):
        self.data=value
        self.left=None 
        self.right=None 

class Tree:
    def addvalue(self,root,value):
        new_node=Node(value)
        if value<root.data:
            if root.left==None:
                root.left=new_node
            else:
                self.addvalue(root.left,value)
        else:
            if root.right==None:
                root.right=new_node
            else:
                self.addvalue(root.right,value)
    def level(self,root):
        q=[root]
        while len(q)!=0:
            ele=q.pop(0) #s1
            print(ele.data) #s2
            if ele.left!=None: #s3
                q.append(ele.left)
            if ele.right!=None:
                q.append(ele.right)

ob=Tree()
root=Node(10)
ob.add_ele(root,5)
ob.add_ele(root,15)
ob.add_ele(root,2)
ob.add_ele(root,6)
ob.add_ele(root,12)
ob.add_ele(root,17)
ob.level(root)
print()'''#here some values are given wrong check them and run



#Print the sum of left subtree and sum of right subtree and print the multiplication of both
'''class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None
class Tree:
    def addvalue(self,root,value):
        new_node=Node(value)
        if value<root.data:
            if root.left==None:
                root.left=new_node
            else:
                self.addvalue(root.left,value)
        else:
            if root.right==None:
                root.right=new_node
            else:
                self.addvalue(root.right,value)
    def inorder(self,root):
        if root.left!=None:
            self.inorder(root.left)
        print(root.data,end=" ")
        if root.right!=None:
            self.inorder(root.right)
    def preorder(self,root):
        print(root.data,end=" ")
        if root.left!=None:
            self.preorder(root.left)
        if root.right!=None:
            self.preorder(root.right)
    def postorder(self,root):
        if root.left!=None:
            self.postorder(root.left)
        if root.right!=None:
            self.postorder(root.right)
        print(root.data,end=" ")
    def levelorder(self,root):
        q=[root]
        while len(q)!=0:
            ele=q.pop(0)
            print(ele.data,end=' ')
            if ele.left!=None:
                q.append(ele.left)
            if ele.right!=None:
                q.append(ele.right)
    def sum(self,root):
        res=root.data
        if root.left!=None:
            res+=self.sum(root.left)
        if root.right!=None:
            res+=self.sum(root.right)
        return res
ob=Tree()
root=Node(10)
#ob.addvalue(root,10)
ob.addvalue(root,5)
ob.addvalue(root,15)
ob.addvalue(root,2)
ob.addvalue(root,6)
ob.addvalue(root,12)
ob.addvalue(root,17)
ob.preorder(root)
print()
ob.postorder(root)
print()
ob.inorder(root)
print()
ob.levelorder(root)
print()
print(ob.sum(root.left)*ob.sum(root.right))
'''


#Height of tree we will take the longest path
#Height of a node which dont have a child node then it's height is zero 
#so to find the height in a program we write :
#Example for root we take 1+max(height(left),height(right))
#if left node then also same 1+max(height(left),height(right))
#Same for right node also....
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None
 
def height(root):
    if root==None:
        return -1
    left_height=height(root.left)
    right_height=height(root.right)
    return 1+max(left_height,right_height)
root = TreeNode(10)
root.left = TreeNode(5)
root.right = TreeNode(15)
root.left.left = TreeNode(2)
root.left.right=TreeNode(6)
root.right.left=TreeNode(12)
root.right.right=TreeNode(17)
print(height(root))
