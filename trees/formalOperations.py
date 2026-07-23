class Node:
    def __init__(self,data):
        self.data=data
        self.left=None
        self.right=None
def pre_order(root):
    if root is None:
        return
    print(root.data,end=" ")
    pre_order(root.left)
    pre_order(root.right)
def in_order(root):
    if root is None:
        return
    in_order(root.left)
    print(root.data,end=" ")
    in_order(root.right)
def post_order(root):
    if root is None:
        return
    post_order(root.left)
    post_order(root.right)
    print(root.data,end=" ")
    
root=Node("A")
root.left=Node("B")
root.right=Node("C")
root.left.left=Node("D")
root.left.right=Node("E")
root.right.left=Node("F")
pre_order(root)
print()
in_order(root)
print()
post_order(root)
