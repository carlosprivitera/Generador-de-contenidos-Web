package client;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Matriz {
    private int anchoXaltoY=0;
    private Icon icono = null;

    public void setAnchoXaltoY(int anchoXaltoY) {
        this.anchoXaltoY = anchoXaltoY;
    }

    private Imagenes imagenes = new Imagenes();
    private EvaluarExpresion ee = new EvaluarExpresion();
    private String[][] s = new String[7][7];
    private JLabel[][]jb = new JLabel[7][7];
    private GenerarSimbolo g = new GenerarSimbolo();
    
    public Matriz(JLabel[][] jb){
        for(int x=0;x<7;x++){
            for(int y=0;y<7;y++){
                s[x][y]="";
            }
        }
        this.jb=jb;
    }
    private int valorX = 0;
    private int valorY = 0;
    public void setS(boolean op1, boolean op2, boolean op3, boolean op4){
       // op3=false;
         int u=0;
        if(op2==true){
          valorX= Integer.parseInt(g.s(1));
          valorY= Integer.parseInt(g.s(1));
          u=4; //selecciona "123456789xy"
        }else{
          u=1; //selecciona "123456789"
        }
        int o = 2; //selecciona "+-*/"
        if(op1==false) {
            o=3; //selecciona "+-"
        }
        s[0][0]=g.s(u); s[0][1]=g.s(o);s[0][2]=g.s(u);s[0][3]=g.s(o);s[0][4]=g.s(u);s[0][5]="=";s[0][6]="0";
        s[1][0]=g.s(u); s[1][1]=g.s(o);s[1][2]=g.s(u);s[1][3]=g.s(o);s[1][4]=g.s(u);s[1][5]="=";s[1][6]="0";
        s[2][0]=g.s(u); s[2][1]=g.s(o);s[2][2]=g.s(u);s[2][3]=g.s(o);s[2][4]=g.s(u);s[2][5]="=";s[2][6]="0";  
        s[3][0]=g.s(u); s[3][1]=g.s(o);s[3][2]=g.s(u);s[3][3]=g.s(o);s[3][4]=g.s(u);s[3][5]="=";s[3][6]="0";
        s[4][0]=g.s(u); s[4][1]=g.s(o);s[4][2]=g.s(u);s[4][3]=g.s(o);s[4][4]=g.s(u);s[4][5]="=";s[4][6]="0";
        s[5][0]=    ""; s[5][1]=    "";s[5][2]=    "";s[5][3]=    "";s[5][4]=    "";s[5][5]="=";s[5][6]= "";  
        s[6][0]=   "0"; s[6][1]=    "";s[6][2]=   "0";s[6][3]=    "";s[6][4]=   "0";s[6][5]= "";s[6][6]="0"; 
        

        jb[5][1].setVisible(false);
        jb[6][1].setVisible(false);
        jb[5][3].setVisible(false);
        jb[6][3].setVisible(false);
        jb[6][5].setVisible(false);
        jb[5][6].setVisible(false);
        
        if(op4==true){
          s[0][6]=ee.getResultado(s[0][0]+s[0][1]+s[0][2]+s[0][3]+s[0][4], valorX, valorY);
          s[1][6]=ee.getResultado(s[1][0]+s[1][1]+s[1][2]+s[1][3]+s[1][4], valorX, valorY);
          s[2][6]=ee.getResultado(s[2][0]+s[2][1]+s[2][2]+s[2][3]+s[2][4], valorX, valorY);
          s[3][6]=ee.getResultado(s[3][0]+s[3][1]+s[3][2]+s[3][3]+s[3][4], valorX, valorY);
          s[4][6]=ee.getResultado(s[4][0]+s[4][1]+s[4][2]+s[4][3]+s[4][4], valorX, valorY);
        }else{ 
            for(int x=0;x<5;x=x+1){
                //jb[x][6].setText("");
                s[x][6]="";
            }            
        } 

        s[6][0]=ee.getResultado(s[0][0]+"+"+s[1][0]+"+"+s[2][0]+"+"+s[3][0]+"+"+s[4][0], valorX, valorY);
        s[6][2]=ee.getResultado(s[0][2]+"+"+s[1][2]+"+"+s[2][2]+"+"+s[3][2]+"+"+s[4][2], valorX, valorY);
        s[6][4]=ee.getResultado(s[0][4]+"+"+s[1][4]+"+"+s[2][4]+"+"+s[3][4]+"+"+s[4][4], valorX, valorY);

        s[6][6]=ee.getResultado(s[0][0]+s[1][1]+s[2][2]+s[3][3]+s[4][4], valorX, valorY);
        
        for(int x=0;x<7;x++){
            for(int y=0;y<7;y++){
                if(op3==false) {
                  jb[x][y].setText(s[x][y]);
                  jb[x][y].setIcon(null);
                }else{
                    String nn = s[x][y];
                    switch (nn){
                    case "1": jb[x][y].setIcon(imagenXY(imagenes.getImage01())); jb[x][y].setText(""); break;
                    case "2": jb[x][y].setIcon(imagenXY(imagenes.getImage02())); jb[x][y].setText(""); break;
                    case "3": jb[x][y].setIcon(imagenXY(imagenes.getImage03())); jb[x][y].setText(""); break;
                    case "4": jb[x][y].setIcon(imagenXY(imagenes.getImage04())); jb[x][y].setText(""); break;
                    case "5": jb[x][y].setIcon(imagenXY(imagenes.getImage05())); jb[x][y].setText(""); break;
                    case "6": jb[x][y].setIcon(imagenXY(imagenes.getImage06())); jb[x][y].setText(""); break;
                    case "7": jb[x][y].setIcon(imagenXY(imagenes.getImage07())); jb[x][y].setText(""); break;
                    case "8": jb[x][y].setIcon(imagenXY(imagenes.getImage08())); jb[x][y].setText(""); break;
                    case "9": jb[x][y].setIcon(imagenXY(imagenes.getImage09())); jb[x][y].setText(""); break;
                    case "x": jb[x][y].setIcon(imagenXY(imagenes.getImageX())); jb[x][y].setText(""); break; //x
                    case "y": jb[x][y].setIcon(imagenXY(imagenes.getImageY())); jb[x][y].setText(""); break; //y
                    default: jb[x][y].setText(nn);
                    }
                }
            }
        }
        jb[5][0].setIcon(imagenXY(imagenes.getImage()));
        jb[5][2].setIcon(imagenXY(imagenes.getImage()));
        jb[5][4].setIcon(imagenXY(imagenes.getImage()));        
    }
    
    private Icon imagenXY(Image imagenes){
        icono = new ImageIcon(imagenes.getScaledInstance(anchoXaltoY, anchoXaltoY, Image.SCALE_DEFAULT));
        return icono;
    }

    public int getValorX() {
        return valorX;
    }

    public int getValorY() {
        return valorY;
    }

}
