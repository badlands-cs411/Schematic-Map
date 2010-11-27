package graphics;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JList;
import java.awt.Insets;
import javax.swing.JLabel;
public class GUInew {

	private JPanel jPanel = null;
	private JPanel northPanel = null;
	private JPanel chatPanel = null;
	private JEditorPane chatLog = null;
	private JTextField messageBox = null;
	private JButton sendButton = null;
	private JScrollPane canvasScrollPane = null;
	private JPanel rightControls = null;
	private JButton vertLine = null;
	private JButton horiButton = null;
	private JButton posButton = null;
	private JButton negButton = null;
	private JButton uniformButton = null;
	private JPanel leftControls = null;
	private JButton nodeButton = null;
	private JButton segmentButton = null;
	private JButton polyButton = null;
	private JButton deleteButton = null;
	private JButton editButton = null;
	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="-464,44"
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu fileMenu = null;
	private JMenu jMenu = null;
	private JFrame jFrame1 = null;  //  @jve:decl-index=0:visual-constraint="514,50"
	private JPanel jContentPane1 = null;
	private JList sessionList = null;
	private JButton createButton = null;
	private JButton joinButton = null;
	private JButton deleteSessionButton = null;
	private JLabel title = null;
	private JLabel usernameLabel = null;
	private JTextField userNameField = null;
	private JPanel buttonPanel = null;
	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridy = 3;
			gridBagConstraints5.gridwidth = 1;
			gridBagConstraints5.fill = GridBagConstraints.BOTH;
			gridBagConstraints5.gridx = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridheight = 1;
			gridBagConstraints4.gridy = 0;
			gridBagConstraints4.gridx = 1;
			jPanel = new JPanel();
			jPanel.setLayout(new GridBagLayout());
			jPanel.add(getChatPanel(), gridBagConstraints5);
			jPanel.add(getNorthPanel(), gridBagConstraints4);
		}
		return jPanel;
	}

	/**
	 * This method initializes northPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getNorthPanel() {
		if (northPanel == null) {
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.fill = GridBagConstraints.VERTICAL;
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 0;
			gridBagConstraints7.gridy = 1;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.gridy = 0;
			gridBagConstraints3.weighty = 1.0;
			gridBagConstraints3.ipady = 304;
			gridBagConstraints3.weightx = 1.0;
			northPanel = new JPanel();
			northPanel.setLayout(new GridBagLayout());
			northPanel.add(getCanvasScrollPane(), gridBagConstraints3);
			northPanel.add(getRightControls(), gridBagConstraints8);
			northPanel.add(getLeftControls(), gridBagConstraints7);
		}
		return northPanel;
	}

	/**
	 * This method initializes chatPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getChatPanel() {
		if (chatPanel == null) {
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.gridwidth = 2;
			gridBagConstraints1.weighty = 1.0;
			gridBagConstraints1.ipadx = 900;
			gridBagConstraints1.ipady = 100;
			gridBagConstraints1.gridx = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = -1;
			gridBagConstraints.gridy = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints2.weighty = 1.0;
			gridBagConstraints2.gridwidth = 2;
			gridBagConstraints2.gridy = 1;
			gridBagConstraints2.weightx = 1.0;
			chatPanel = new JPanel();
			chatPanel.setLayout(new GridBagLayout());
			chatPanel.add(getChatLog(), gridBagConstraints2);
			chatPanel.add(getSendButton(), gridBagConstraints);
			chatPanel.add(getMessageBox(), gridBagConstraints1);
		}
		return chatPanel;
	}

	/**
	 * This method initializes chatLog	
	 * 	
	 * @return javax.swing.JEditorPane	
	 */
	private JEditorPane getChatLog() {
		if (chatLog == null) {
			chatLog = new JEditorPane();
		}
		return chatLog;
	}

	/**
	 * This method initializes messageBox	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getMessageBox() {
		if (messageBox == null) {
			messageBox = new JTextField();
		}
		return messageBox;
	}

	/**
	 * This method initializes sendButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSendButton() {
		if (sendButton == null) {
			sendButton = new JButton();
			sendButton.setText("Send");
		}
		return sendButton;
	}

	/**
	 * This method initializes canvasScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getCanvasScrollPane() {
		if (canvasScrollPane == null) {
			canvasScrollPane = new JScrollPane();
			canvasScrollPane.setViewportView(getFileMenu());
		}
		return canvasScrollPane;
	}

	/**
	 * This method initializes rightControls	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getRightControls() {
		if (rightControls == null) {
			GridLayout gridLayout = new GridLayout(0,1);
			gridLayout.setRows(0);
			gridLayout.setColumns(1);
			rightControls = new JPanel();
			rightControls.setLayout(gridLayout);
			rightControls.add(getEditButton(), null);
			rightControls.add(getUniformButton(), null);
			rightControls.add(getHoriButton(), null);
			rightControls.add(getPosButton(), null);
			rightControls.add(getNegButton(), null);
			rightControls.add(getVertLine(), null);
		}
		return rightControls;
	}

	/**
	 * This method initializes vertLine	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getVertLine() {
		if (vertLine == null) {
			vertLine = new JButton();
			vertLine.setText("|");
		}
		return vertLine;
	}

	/**
	 * This method initializes horiButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getHoriButton() {
		if (horiButton == null) {
			horiButton = new JButton();
			horiButton.setText("---");
		}
		return horiButton;
	}

	/**
	 * This method initializes posButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getPosButton() {
		if (posButton == null) {
			posButton = new JButton();
			posButton.setText("/");
		}
		return posButton;
	}

	/**
	 * This method initializes negButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNegButton() {
		if (negButton == null) {
			negButton = new JButton();
			negButton.setText("\\");
		}
		return negButton;
	}

	/**
	 * This method initializes uniformButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getUniformButton() {
		if (uniformButton == null) {
			uniformButton = new JButton();
			uniformButton.setText("Make Uniform");
		}
		return uniformButton;
	}

	/**
	 * This method initializes leftControls	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getLeftControls() {
		if (leftControls == null) {
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 3;
			gridBagConstraints11.gridy = 0;
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.gridx = 2;
			gridBagConstraints10.gridy = 0;
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.gridx = 1;
			gridBagConstraints9.gridy = 0;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = -1;
			gridBagConstraints6.gridy = -1;
			leftControls = new JPanel();
			leftControls.setLayout(new GridBagLayout());
			leftControls.add(getNodeButton(), gridBagConstraints6);
			leftControls.add(getSegmentButton(), gridBagConstraints9);
			leftControls.add(getPolyButton(), gridBagConstraints10);
			leftControls.add(getDeleteButton(), gridBagConstraints11);
		}
		return leftControls;
	}

	/**
	 * This method initializes nodeButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNodeButton() {
		if (nodeButton == null) {
			nodeButton = new JButton();
			nodeButton.setText("Node");
		}
		return nodeButton;
	}

	/**
	 * This method initializes segmentButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSegmentButton() {
		if (segmentButton == null) {
			segmentButton = new JButton();
			segmentButton.setText("Segment");
		}
		return segmentButton;
	}

	/**
	 * This method initializes polyButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getPolyButton() {
		if (polyButton == null) {
			polyButton = new JButton();
			polyButton.setText("Polyline");
		}
		return polyButton;
	}

	/**
	 * This method initializes deleteButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getDeleteButton() {
		if (deleteButton == null) {
			deleteButton = new JButton();
			deleteButton.setText("Delete");
		}
		return deleteButton;
	}

	/**
	 * This method initializes editButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getEditButton() {
		if (editButton == null) {
			editButton = new JButton();
			editButton.setText("Edit");
		}
		return editButton;
	}

	/**
	 * This method initializes jFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setContentPane(getJContentPane());
			jFrame.setJMenuBar(getJJMenuBar());
		}
		return jFrame;
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel(), BorderLayout.NORTH);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes fileMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getFileMenu() {
		if (fileMenu == null) {
			fileMenu = new JMenu();
		}
		return fileMenu;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("File");
		}
		return jMenu;
	}

	/**
	 * This method initializes jFrame1	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrame1() {
		if (jFrame1 == null) {
			jFrame1 = new JFrame();
			jFrame1.setSize(new Dimension(531, 447));
			jFrame1.setContentPane(getJContentPane1());
		}
		return jFrame1;
	}

	/**
	 * This method initializes jContentPane1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane1() {
		if (jContentPane1 == null) {
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			gridBagConstraints19.gridx = 0;
			gridBagConstraints19.gridwidth = 2;
			gridBagConstraints19.gridy = 4;
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			gridBagConstraints18.fill = GridBagConstraints.BOTH;
			gridBagConstraints18.gridy = 1;
			gridBagConstraints18.weightx = 1.0;
			gridBagConstraints18.gridwidth = 1;
			gridBagConstraints18.insets = new Insets(0, 6, 0, 10);
			gridBagConstraints18.gridx = 1;
			GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
			gridBagConstraints17.gridx = 0;
			gridBagConstraints17.insets = new Insets(0, 10, 0, 0);
			gridBagConstraints17.gridy = 1;
			usernameLabel = new JLabel();
			usernameLabel.setText("Enter a username:");
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			gridBagConstraints16.gridx = 0;
			gridBagConstraints16.gridwidth = 2;
			gridBagConstraints16.insets = new Insets(10, 0, 10, 0);
			gridBagConstraints16.gridy = 0;
			title = new JLabel();
			title.setText("Session Manager");
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.fill = GridBagConstraints.BOTH;
			gridBagConstraints12.gridy = 2;
			gridBagConstraints12.weightx = 1.0;
			gridBagConstraints12.weighty = 1.0;
			gridBagConstraints12.gridwidth = 3;
			gridBagConstraints12.insets = new Insets(10, 10, 10, 10);
			gridBagConstraints12.gridx = 0;
			jContentPane1 = new JPanel();
			jContentPane1.setLayout(new GridBagLayout());
			jContentPane1.add(getSessionList(), gridBagConstraints12);
			jContentPane1.add(title, gridBagConstraints16);
			jContentPane1.add(usernameLabel, gridBagConstraints17);
			jContentPane1.add(getUserNameField(), gridBagConstraints18);
			jContentPane1.add(getButtonPanel(), gridBagConstraints19);
		}
		return jContentPane1;
	}

	/**
	 * This method initializes sessionList	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getSessionList() {
		if (sessionList == null) {
			sessionList = new JList();
		}
		return sessionList;
	}

	/**
	 * This method initializes createButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCreateButton() {
		if (createButton == null) {
			createButton = new JButton();
			createButton.setText("Create Session");
		}
		return createButton;
	}

	/**
	 * This method initializes joinButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJoinButton() {
		if (joinButton == null) {
			joinButton = new JButton();
			joinButton.setText("Join Session");
		}
		return joinButton;
	}

	/**
	 * This method initializes deleteSessionButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getDeleteSessionButton() {
		if (deleteSessionButton == null) {
			deleteSessionButton = new JButton();
			deleteSessionButton.setText("Delete Session");
		}
		return deleteSessionButton;
	}

	/**
	 * This method initializes userNameField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getUserNameField() {
		if (userNameField == null) {
			userNameField = new JTextField();
		}
		return userNameField;
	}

	/**
	 * This method initializes buttonPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getButtonPanel() {
		if (buttonPanel == null) {
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.gridx = 2;
			gridBagConstraints15.gridy = 0;
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.gridx = 1;
			gridBagConstraints14.gridy = 0;
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.gridx = -1;
			gridBagConstraints13.gridy = -1;
			buttonPanel = new JPanel();
			buttonPanel.setLayout(new GridBagLayout());
			buttonPanel.add(getCreateButton(), gridBagConstraints13);
			buttonPanel.add(getJoinButton(), gridBagConstraints14);
			buttonPanel.add(getDeleteSessionButton(), gridBagConstraints15);
		}
		return buttonPanel;
	}

}
