import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon Mar 28 13:43:03 ICT 2022
 */



/**
 * @author unknown
 */
public class XemSanPhamUI extends JFrame {
    public XemSanPhamUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Nguyen Nhat Minh
        name = new JLabel();

        //======== this ========
        setFont(new Font(Font.DIALOG, Font.PLAIN, 18));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- name ----
        name.setText("name");
        name.setFont(new Font("Raleway Thin", Font.PLAIN, 20));
        contentPane.add(name);
        name.setBounds(new Rectangle(new Point(60, 50), name.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Nguyen Nhat Minh
    private JLabel name;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
