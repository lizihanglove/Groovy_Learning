import javax.swing.*
import java.awt.event.ActionListener

/**
 * 添加
 * Created by lizihanglove on 2017/5/9.
 */

def createAndShowGUI() {
    // 确保一个漂亮的外观风格
    JFrame.setDefaultLookAndFeelDecorated(true)
    // 创建及设置窗口
    def frame = new JFrame("HelloWorldSwing")
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    def pane = frame.getContentPane()
    // 创建登录按钮
    def loginButton = new JButton("login")
    loginButton.setBounds(80, 80, 80, 80)
    loginButton.addActionListener({ println("you clicked me !") } as ActionListener)
    pane.add(loginButton)
    // 显示窗口
    frame.pack()
    frame.setVisible(true)
}

SwingUtilities.invokeLater(new Runnable() {
     void run() {
        createAndShowGUI()
    }
})