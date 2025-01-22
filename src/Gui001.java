import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyView implements ActionListener{ //클릭이벤트
    JFrame jFrame; JButton jButton;

    public MyView(){
        this.jFrame = new JFrame("box");
        this.jButton = new JButton("btn");
    }
    public void create(){ //셋팅 set /가져올떄 get
        jFrame.add(jButton); // 부모는 자식을 담을수있다
        jFrame.setSize(300,300);  //사이즈 조점
        jFrame.setVisible(true); //보이는지 여부
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Click");
            }  //2.한번쓰고 버릴 못적으로  // 3. new 인터페이스 명 (){implements 구현 메서드 오버라이딩용}
        }); //이벤트를 걸기
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"click 했어요~!");
    }
}


public class Gui001 {
    public static void main(String[] args){
        new MyView().create();
    }
}
