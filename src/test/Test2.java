package test;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
public class SWT{
	public static void main(String[] args){
	    Display display = new Display();
	    Shell shell = new Shell(display);  //shell为程序主窗体
	    //shell.setLayout(null);  //设置shell布局方式
	    shell.setText(“按钮”);   //设置主窗体标题
	    Button btn1 = new Button(shell, SWT.NULL);  //创建默认按钮
	    btn1.setText(“Button1”);  
	    btn1.setBounds(10, 10, 75, 30);
	    Button btn2 = new Button(shell, SWT.PUSH|SWT.BORDER);
	    btn2.setText(“Button2”);
	    btn2.setBounds(90, 10, 75, 30);
        // 为Button的时间定义监听器
       button.addSelectionListener(new SelectionAdapter(){
       public void widgetSelected(SelectionEventarg0) {
           MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_INFORMATION | SWT.APPLICATION_MODAL);
            messageBox.setMessage("按下了（" + button.getText() + "）按钮");
            messageBox.open();
        }
});
	    shell.pack();  //自动调整主窗体大小
	    shell.open();  //打开主窗体
	    while(!shell.isDisposed()){  //如果主窗体没有关闭
		    if(!display.readAndDispatch()){  //如果display不忙
		    display.sleep();  //休眠
            }
       //释放display对象
       display.dispose();
        }
     }
}
