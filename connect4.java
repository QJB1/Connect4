package jframe;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.WindowConstants;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
 
public class connect4 {
    private JFrame frame;
 
    public connect4() {
        frame = new JFrame("connect4");
        frame.setSize(700, 500);
        frame.add(new RealBoard(frame.getSize()));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static class RealBoard extends JPanel implements MouseListener {
        private int cellSize = 61;
        private String turn = "RED";
        private int rows = 6;
        private int cols = 7;
        private int r = 0;
        private int c = 0;
        private boolean winner=false;
        private String colors = "COLOR";
        Color[][] grid = new Color[rows][cols];
 
        public RealBoard(Dimension dimension) {
            addMouseListener(this);//setup mousepressed
            int var = 0;
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    if(var%2==0){
                        grid[row][col] = Color.WHITE; 
                    }else{
                        grid[row][col] = Color.WHITE;
                    }
                    var++;
                }
                
                }
        }
        public void paintComponent(Graphics g) {
            Graphics2D gr = (Graphics2D)g;
            Dimension d = getSize();
	        d.setSize(1000,1000);
            r = 0;
            c = 0;
            gr.setColor(new Color(114, 127,162)); //color of right
            gr.fillRect(0,0,d.width,d.height); 
            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[0].length; col++) {
                    gr.setColor(grid[row][col]);
                    gr.fillRect(r,c,cellSize,cellSize); 
                    gr.setColor(Color.black); //bordercolor
                    gr.drawRect(r,c,cellSize,cellSize); //border
                    r += cellSize;
                }
                c += cellSize;
                r = 0;
            }
            if(winner==false){
                if(turn.equals("RED")){
                    gr.drawString("TURN: RED",430,20);
                }
                else{
                    gr.drawString("TURN: YELLOW",430,20);
                }
            }
            else if(winner == true){
                gr.drawString("WINNER:"+ colors,430,20);
            }
        }
 
        public void mousePressed(MouseEvent e) {
            int x = e.getX();//method inherited, pixels size
            int y = e.getY();
            if(winner==false){
                if(x<(cellSize*grid[0].length) && y<(cellSize*grid.length)){
                    int fc = x/cellSize;
                    int fr = dpiece(fc);
                    if(fr!=-1){
                        if(turn.equals("RED")){
                            grid[fr][fc]= Color.red;
                            colors =  "RED";
                            turn = "YELLOW";
                        } 
                        else{
                            grid[fr][fc]= Color.yellow;
                            colors =  "YELLOW";
                            turn = "RED";
                        }
                        if(checkWin(fc,fr, grid[fr][fc])){
                            winner=true;
                        }
                    }
                }
                repaint();
            }
        }
 
        public int dpiece(int col){
            int row = grid.length-1;
            while(row>=0){ 
                if(grid[row][col].equals(Color.WHITE)){
                    return row;
                }
                row = row - 1;
            }
            return -1;
        }
 
 
        public boolean checkWin(int column,int row, Color c){
            //left
            int total = 0;
            int start = column;
            int gl = grid.length;
            int gc = grid[0].length;
            while(start>=0){
                if(grid[row][start].equals(c)){
                    total++;
                }
                else{
                    break;
                }
                if(total==4){
                    return true;
                }
                start--;
            }
            //right
            start = column+1;
            while(start<gc){
 
                if(grid[row][start].equals(c)){
 
                    total++;
                }else{
                    break;
                }
                if(total==4){
                    return true;
                }
                start++;
            }
            //up
            total = 0;
            int start1 = row;
            while(start1>0){
                if(grid[start1][column].equals(c)){
                    total++;
                }
                else{
                    break;
                }
                if(total==4){
                    return true;
                }
                start1--;
            }
            //down
            start1 = row+1;
            while(start1<gl){
                if(grid[start1][column].equals(c)){
 
                    total++;
                }
                else{
                    break;
                }
                if(total==4)
                    return true;
 
                start1++;
            }
        //up right
        total = 1;
        start = column-1;
        start1 = row+1;
        while(start>0 && start1<gl){
            if(grid[start1][start].equals(c)){
                total++;
                }
                else{
                    break;
                }
                if(total==4)
                    return true;
                start--;
                start1++;
        }
        //down left
        start = column+1;
        start1 = row-1;
        while(start1>0 && start<gl){
            if(grid[start1][start].equals(c)){
                total++;
                }
                else{
                    break;
                }
                if(total==4)
                    return true;
                start++;
                start1--;
        }
        //up left
        total = 1;
        start = column-1;
        start1 = row-1;
        while(start1>0 && start>=0){
            if(grid[start1][start].equals(c)){
                total++;
                }
                else{
                    break;
                }
                if(total==4)
                    return true;
                start--;
                start1--;
              
        }
        //down right
        start = column+1;
        start1 = row+1;
        while(start1<gl && start<gc){
            if(grid[start1][start].equals(c)){
                total++;
                }
                else{
                    break;
                }
                if(total==4)
                    return true;
                start++;
                start1++;
        }
 
 
 
        return false;
 
        }
 
        public void mouseReleased(MouseEvent e) {
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
        public void mouseClicked(MouseEvent e) {
        }
    
    }
    public static void main(String[] args) {
        new connect4();
    }
 
}