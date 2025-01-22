interface Board {
    public void exec();
}
class BoardInsert implements Board {
    @Override
    public void exec(){
        System.out.println("글쓰기");
    }
}
class BoardUpdate implements Board {
    @Override
    public void exec(){
        System.out.println("글수정");
    }
}
class BoardSelect implements Board {
    @Override
    public void exec(){
        System.out.println("글읽기");
    }
}
class BoardDelete implements Board {
    @Override
    public void exec(){
        System.out.println("글삭제");
    }
}




public class interface002 {
    public static void main(String[] args){

    }
}
