import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class JfLeinwand extends JFrame {
	
	//test test

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    static JfLeinwand frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JfLeinwand();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JfLeinwand() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_malen = new JLabel(){
			@Override
			protected void paintComponent(Graphics g){
				super.paintComponent(g);
				
				//g.drawLine(0, 0, this.getWidth(), this.getHeight());
				
				//haus Malen
				drawRelativeLine(0.25f, 0.90f, 0.25f, 0.40f, g);
				drawRelativeLine(0.25f, 0.40f, 0.75f, 0.40f, g);
				drawRelativeLine(0.75f, 0.40f, 0.50f, 0.15f, g);
				drawRelativeLine(0.50f, 0.15f, 0.25f, 0.40f, g);
				drawRelativeLine(0.25f, 0.40f, 0.75f, 0.90f, g);
				drawRelativeLine(0.75f, 0.90f, 0.75f, 0.40f, g);
				drawRelativeLine(0.75f, 0.40f, 0.25f, 0.90f, g);
				drawRelativeLine(0.25f, 0.90f, 0.75f, 0.90f, g);
				
				this.setBounds(0, 0, contentPane.getWidth(), contentPane.getHeight());
			}
			
			private void drawRelativeLine(float x1,float y1,float x2,float y2,Graphics g){
				final int w = this.getWidth();
				final int h = this.getHeight();
				g.drawLine((int)(x1*w), (int)(y1*h), (int)(x2*w), (int)(y2*h));
			};
		};
		
		//lbl_malen.setBounds(0, 0, contentPane.getWidth(), contentPane.getHeight());
		lbl_malen.setBounds(0,0,1,1);

		
		
		
		
		contentPane.add(lbl_malen);
	}
	

}
