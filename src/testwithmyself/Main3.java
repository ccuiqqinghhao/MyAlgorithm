package testwithmyself;

public class Main3 {
	public static void main(String[] args) {  
        int[] n = {34,32,35,47,23,35,41,14,12,15,7,10,8,5,12,7,3,6};  
        Node root = new Node(n[0]);  
        root.s =root.e+"-|";   
        for (int i = 1; i < n.length; i++) {  
            Node node = new Node(n[i]);  
            if(node.e>root.e){  
                //子节点比父节点大  
                addRight(node,root,0);  
            }else{  
                //子节点比父节点小  
                addLeft(node,root,0);  
            }  
        }  
        print(root);  
    }  
    //总是先输出右节点，然后输出他，最后输出左节点  
    private static void print(Node root) {  
        if(root.right!=null){  
            print(root.right);  
        }  
        //如果他没有子节点，那么就去掉尾部的"-|"  
        if(root.left==null&&root.right==null){  
            System.out.println(root.s.substring(0,root.s.length()-2));  
        }else{  
            System.out.println(root.s);   
        }  
          
        if(root.left!=null){  
            print(root.left);  
        }  
    }  
  
    private static void addRight(Node node, Node root,int n) {  
        //如果父节点的右节点为空，则直接添加到右节点上  
        if(root.right==null){  
            //将父节点的数字和“-”，换成"."，然后再接上子节点  
            //node.s = root.s.replaceAll("[0-9]", ".").replaceAll("-", ".")+"-"+node.e+"-|";  
            if(n==0){  
                //node.s = root.s.replaceAll("[0-9]", ".").replaceAll("-", ".").substring(0, root.s.length()-1).replace('|', '.')+"|-"+node.e+"-|";  
                node.s = root.s.replaceAll("[0-9]", ".").replaceAll("-", ".").substring(0, root.s.length()-1);  
                int index = node.s.lastIndexOf('|');  
                if(index!=-1){  
                    node.s = node.s.substring(0,index)+"."+node.s.substring(index+1);  
                }  
                node.s = node.s+"|-"+node.e+"-|";  
            }else{  
                node.s = root.s.replaceAll("[0-9]", ".").replaceAll("-", ".")+"-"+node.e+"-|";    
            }  
              
            root.right = node;  
            return;  
        }  
        if(node.e>root.right.e){  
            addRight(node, root.right,0);  
        }else{  
            addLeft(node, root.right,1);  
        }  
          
    }  
  
    private static void addLeft(Node node, Node root,int n) {  
        //如果父节点的左节点为空，则直接添加到左节点上  
        if(root.left==null){  
            //将父节点的数字和“-”，换成"."，然后再接上子节点  
            //node.s = root.s.replaceAll("[0-9]", ".").replaceAll("-", ".")+"-"+node.e+"-|";  
            if(n==0){  
                node.s = root.s.replaceAll("[0-9]", ".").replaceAll("-", ".").substring(0, root.s.length()-1);  
                int index = node.s.lastIndexOf('|');  
                if(index!=-1){  
                    node.s = node.s.substring(0,index)+"."+node.s.substring(index+1);  
                }  
                node.s = node.s+"|-"+node.e+"-|";  
            }else{  
                node.s = root.s.replaceAll("[0-9]", ".").replaceAll("-", ".")+"-"+node.e+"-|";    
            }  
            root.left = node;  
            return;  
        }  
        if(node.e>root.left.e){  
            addRight(node, root.left,1);  
        }else{  
            addLeft(node, root.left,0);  
        }  
    }  
}  
class Node{  
    int e;  
    Node left;  
    Node right;  
    String s;  
    public Node(int e) {  
        this.e = e;  
    }  
}
