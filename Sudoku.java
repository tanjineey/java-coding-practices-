import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Sudoku extends JFrame {

	public static final int GRID_SIZE = 9;
	public static final int SUBGRID_SIZE = 3;
 
	public static final int CELL_SIZE = 60;
	public static final int CANVAS_WIDTH  = CELL_SIZE * GRID_SIZE;
	public static final int CANVAS_HEIGHT = CELL_SIZE * GRID_SIZE;

	public static final Color OPEN_CELL_BGCOLOR = Color.YELLOW;
	public static final Color OPEN_CELL_BGCOLOR_FILLED = new Color(175, 175, 175);
	public static final Color OPEN_CELL_TEXT_YES = new Color(0, 255, 0);
	public static final Color OPEN_CELL_TEXT_NO = Color.RED;
	public static final Color CLOSED_CELL_BGCOLOR = new Color(220, 220, 220);
	public static final Color CLOSED_CELL_TEXT = Color.BLACK;
	public static final Font FONT_NUMBERS = new Font("ARIALBD", Font.BOLD, 15);
 
	private JTextField[][] cells = new JTextField[GRID_SIZE][GRID_SIZE];
 
	private int[][] puzzle =
		{{5, 3, 4, 6, 7, 8, 9, 1, 2},
		{6, 7, 2, 1, 9, 5, 3, 4, 8},
		{1, 9, 8, 3, 4, 2, 5, 6, 7},
		{8, 5, 9, 7, 6, 1, 4, 2, 3},
		{4, 2, 6, 8, 5, 3, 7, 9, 1},
		{7, 1, 3, 9, 2, 4, 8, 5, 6},
		{9, 6, 1, 5, 3, 7, 2, 8, 4},
		{2, 8, 7, 4, 1, 9, 6, 3, 5},
		{3, 4, 5, 2, 8, 6, 1, 7, 9}};

	private boolean[][] masks =
		{{false, false, false, false, false, true, false, false, false},
		{false, false, false, false, false, false, false, false, true},
		{false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false},
		{false, false, false, false, false, false, false, false, false}};
 

	public Sudoku() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmInstructions = new JMenuItem("Instructions");
		mntmInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "The grid is divided into nine blocks, each containing nine squares.\n"
					+ "The rules of the game are simple: each of the nine blocks has to contain all the numbers 1-9 within its squares. "
					+ "Each number can only appear once in a row, column or box.",
				            "Instructions", JOptionPane.PLAIN_MESSAGE);
			}
		});
		mnNewMenu.add(mntmInstructions);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		mnNewMenu.add(mntmExit);
		
		JMenu mnNewAbout = new JMenu("About");
		mnNewAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sudoku Project done by"
					+ "Jeral Tan, Goh Jun Bin & Wayne Leo\n",
				            "About", JOptionPane.PLAIN_MESSAGE);
			}
		});
		menuBar.add(mnNewAbout);

		Container cp = getContentPane();
		cp.setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));  // 9x9 GridLayout
 
		InputListener listener = new InputListener();
 
     
		for (int row = 0; row < GRID_SIZE; ++row) {
			for (int col = 0; col < GRID_SIZE; ++col) {
				cells[row][col] = new JTextField(); // Allocate element of array
				cp.add(cells[row][col]);            // ContentPane adds JTextField
				if (masks[row][col]) {
					cells[row][col].setText("");     // set to empty string
					cells[row][col].setEditable(true);
					cells[row][col].setBackground(OPEN_CELL_BGCOLOR);
					cells[row][col].addActionListener(listener);
				} else {
					cells[row][col].setText(puzzle[row][col] + "");
					cells[row][col].setEditable(false);
					cells[row][col].setBackground(CLOSED_CELL_BGCOLOR);
					cells[row][col].setForeground(CLOSED_CELL_TEXT);
				}
            
				cells[row][col].setHorizontalAlignment(JTextField.CENTER);
				cells[row][col].setFont(FONT_NUMBERS);
			}
		}
		
		cp.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
		pack();
 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sudoku");
		setVisible(true);
		
	}
 

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
	    	  @Override
	    	  public void run() {
	    		  Sudoku app = new Sudoku();
	    	  }
	      }
		);
	}

	private class InputListener implements ActionListener {
		 
		@Override
	    public void actionPerformed(ActionEvent e) {
	         
			int rowSelected = -1;
			int colSelected = -1;
	       
	        JTextField source = (JTextField)e.getSource();
	        
	        boolean found = false;
	        for (int row = 0; row < GRID_SIZE && !found; ++row) {
	        	for (int col = 0; col < GRID_SIZE && !found; ++col) {
	        		if (cells[row][col] == source) {
	        			rowSelected = row;
	        			colSelected = col;
	        			found = true;
	        		}
	            }
	         }
	       

	 
	        String input = cells[rowSelected][colSelected].getText();
	        cells[rowSelected][colSelected].setBackground(OPEN_CELL_BGCOLOR_FILLED);
	        
	        
	        // check if input is numerical, show error message if anything that isn't a digit is entered
	        char inStr;
	        for(int i=0; i < input.length(); i++) {
	        	inStr = input.charAt(i);
	        	if(!Character.isDigit(inStr)) {
	        		JOptionPane.showMessageDialog(null, "Error - Enter a number from 1 to 9");
	        		cells[rowSelected][colSelected].setText("");
	        		if(cells[rowSelected][colSelected].getText().equals("")) {
	    	        	cells[rowSelected][colSelected].setBackground(OPEN_CELL_BGCOLOR);
	    	        }
	        	}
	        }
	        
	        
	        
	        int inputInt = Integer.parseInt(input);
	        
	        
	        // show error message if not 1-9 entered
	        switch(inputInt){
	        	case 1:
	        	case 2:
	        	case 3:
		        case 4:
		        case 5:
		        case 6:
		        case 7:
		        case 8:
		        case 9:
		        	break;
		        default:
		        	JOptionPane.showMessageDialog(null, "Error - Enter a number from 1 to 9");
		        	cells[rowSelected][colSelected].setText("");
		        	if(cells[rowSelected][colSelected].getText().equals("")) {
			        	cells[rowSelected][colSelected].setBackground(OPEN_CELL_BGCOLOR);
			        }
		        	break;
	        }
	        
	        
			for(int row = 0; row < GRID_SIZE && row != rowSelected; ++row) {
				if(cells[rowSelected][colSelected].getText().equals(cells[row][colSelected].getText())) {
					cells[rowSelected][colSelected].setBackground(OPEN_CELL_TEXT_NO);
					cells[row][colSelected].setBackground(OPEN_CELL_TEXT_NO);
				}
			}
			
			
			for(int col = 0; col < GRID_SIZE && col != colSelected; ++col) {
				if(cells[rowSelected][colSelected].getText().equals(cells[rowSelected][col].getText())) {
					cells[rowSelected][colSelected].setBackground(OPEN_CELL_TEXT_NO);
					cells[rowSelected][col].setBackground(OPEN_CELL_TEXT_NO);
				}
			}
			
	      	      	
	      	
	      	
			//update masks to false once correct number is entered
	        if(masks[rowSelected][colSelected] == true) {
	        	if(inputInt == puzzle[rowSelected][colSelected]) {
	        		masks[rowSelected][colSelected] = false;
	        	}else{
	        		masks[rowSelected][colSelected] = true;
	        	}
	        }
	        
	        //update masks if correct answer is removed or changed
	        if(masks[rowSelected][colSelected] == false) {
	        	if(inputInt == puzzle[rowSelected][colSelected]) {
	        		masks[rowSelected][colSelected] = false;
	        	}else{
	        		masks[rowSelected][colSelected] = true;
	        	}
	        }
	       
	        
	       //check if puzzle is finished, if it is show a message
	       if(isFinished()){
	    	   for(int row = 0; row < GRID_SIZE; ++row) {
	    		   for(int col = 0; col < GRID_SIZE; ++col) {
	    			   	cells[row][col].setBackground(OPEN_CELL_TEXT_YES);
	   	        		cells[row][col].setEditable(false);
	   				}
	   			}
	    	   JOptionPane.showMessageDialog(null, "GGWP");
	   		}
	      }
	   }
	
	public boolean isFinished() {
		for(int row = 0; row < GRID_SIZE; ++row) {
			for(int col = 0; col < GRID_SIZE; ++col) {
				if (masks[row][col] == true) {
					return false;
				}
			}
		}
		return true;
	}

	






















}