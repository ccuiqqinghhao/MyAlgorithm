package testwithmyself;

public class Main3 {
	public static void main(String[] args) {  
        int[] n = {34,32,35,47,23,35,41,14,12,15,7,10,8,5,12,7,3,6};  
        Node root = new Node(n[0]);  
        root.s =root.e+"-|";   
        for (int i = 1; i < n.length; i++) {  
            Node node = new Node(n[i]);  
            if(node.e>root.e){  
                //�ӽڵ�ȸ��ڵ��  
                addRight(node,root,0);  
            }else{  
                //�ӽڵ�ȸ��ڵ�С  
                addLeft(node,root,0);  
            }  
        }  
        print(root);  
    }  
    //����������ҽڵ㣬Ȼ�����������������ڵ�  
    private static void print(Node root) {  
        if(root.right!=null){  
            print(root.right);  
        }  
        //�����û���ӽڵ㣬��ô��ȥ��β����"-|"  
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
        //������ڵ���ҽڵ�Ϊ�գ���ֱ����ӵ��ҽڵ���  
        if(root.right==null){  
            //�����ڵ�����ֺ͡�-��������"."��Ȼ���ٽ����ӽڵ�  
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
        //������ڵ����ڵ�Ϊ�գ���ֱ����ӵ���ڵ���  
        if(root.left==null){  
            //�����ڵ�����ֺ͡�-��������"."��Ȼ���ٽ����ӽڵ�  
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
