import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calculator implements ActionListener 
{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ba,bm,bp,bd,be,bc,bper,bexit;
	float lv=0,nv=0,cnt=0,tot=0,temp=0;
	char ch;
	JFrame f1=new JFrame("Calculator");
	calculator()
	{
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		t1=new JTextField();
		t1.setBounds(10,10,235,30);
		
		b1=new JButton("1");
		b1.setBounds(10,50, 50,30);
		b2=new JButton("2");
		b2.setBounds(70,50, 50,30);
		b3=new JButton("3");
		b3.setBounds(130,50, 50,30);
		ba=new JButton("+");
		ba.setBounds(190,50, 50,30);
		b4=new JButton("4");
		b4.setBounds(10,90, 50,30);
		b5=new JButton("5");
		b5.setBounds(70,90, 50,30);
		b6=new JButton("6");
		b6.setBounds(130,90, 50,30);
		bm=new JButton("-");
		bm.setBounds(190,90, 50,30);
		b7=new JButton("7");
		b7.setBounds(10,130, 50,30);
		b8=new JButton("8");
		b8.setBounds(70,130, 50,30);
		b9=new JButton("9");
		b9.setBounds(130,130, 50,30);
		bp=new JButton("*");
		bp.setBounds(190,130, 50,30);
		bc=new JButton("C");
		bc.setBounds(10,170, 50,30);
		b0=new JButton("0");
		b0.setBounds(70,170, 50,30);
		be=new JButton("=");
		be.setBounds(130,170, 50,30);
		bd=new JButton("/");
		bd.setBounds(190,170, 50,30);
		bper=new JButton("%");
		bper.setBounds(190,210, 50,30);
		bexit=new JButton("Exit");
		bexit.setBounds(10,210, 150,30);
		b1.addActionListener(this);  
        		b2.addActionListener(this);
		b3.addActionListener(this);  
        		b4.addActionListener(this);    
		b5.addActionListener(this);  
        		b6.addActionListener(this);
		b7.addActionListener(this);  
        		b8.addActionListener(this);
		b9.addActionListener(this);  
        		b0.addActionListener(this);
		ba.addActionListener(this);  
        		bm.addActionListener(this);
		be.addActionListener(this);  
        		bd.addActionListener(this);
		bc.addActionListener(this);  
        		bp.addActionListener(this);
		bper.addActionListener(this); 
		bexit.addActionListener(this);

		f1.add(t1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(ba);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);
		f1.add(bm);
		f1.add(b7);
		f1.add(b8);
		f1.add(b9);
		f1.add(bp);
		f1.add(bc);
		f1.add(b0);
		f1.add(be);
		f1.add(bd);
		f1.add(bper);
		f1.add(bexit);

		f1.setSize(260,280);
		f1.setLayout(null);  
    		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
			
		if(ae.getActionCommand().equals("1"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=1;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=1;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=1;
			}
			
		}
		if(ae.getActionCommand().equals("2"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=2;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=2;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=2;
			}
			
		}
		if(ae.getActionCommand().equals("3"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=3;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=3;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=3;
			}
			
		}
		if(ae.getActionCommand().equals("4"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=4;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=4;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=4;
			}
			
		}
		if(ae.getActionCommand().equals("5"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=5;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=5;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=5;
			}
			
		}
		if(ae.getActionCommand().equals("6"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=6;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=6;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=6;
			}
			
		}
		if(ae.getActionCommand().equals("7"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=7;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=7;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=7;
			}
			
		}
		if(ae.getActionCommand().equals("8"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=8;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=8;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=8;
			}
			
		}
		if(ae.getActionCommand().equals("9"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=9;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=9;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=9;
			}
			
		}
		if(ae.getActionCommand().equals("0"))
		{
				cnt++;
			if(cnt==1)
			{
					nv=0;
				t1.setText(" "+nv);
				tot=nv;
			}
			else
			{
					lv=tot;
					nv=0;
					nv=checkcnt(lv,cnt,nv);
					t1.setText(" "+nv);
					tot=nv;
					nv=0;
			}
			
		}
		if(ae.getActionCommand().equals("+"))
		{
			cnt=0;
			temp=tot;
			tot=0;
			ch='+';
		}
		if(ae.getActionCommand().equals("-"))
		{
			cnt=0;
			temp=tot;
			tot=0;
			ch='-';
		}
		if(ae.getActionCommand().equals("*"))
		{
			cnt=0;
			temp=tot;
			tot=0;
			ch='*';
		}
		if(ae.getActionCommand().equals("/"))
		{
			cnt=0;
			temp=tot;
			tot=0;
			ch='/';
		}
		if(ae.getActionCommand().equals("%"))
		{
			cnt=0;
			temp=tot;
			tot=0;
			ch='%';
		}
		if(ae.getActionCommand().equals("C"))
		{
			temp=0;
			tot=0;
			ch='|';
			t1.setText(" "+tot);
		}
		if(ae.getActionCommand().equals("="))
		{
			if(ch=='+')
			{	

				temp=temp+tot;
				tot=temp;
				ch='|';
			}
			if(ch=='-')
			{	

				temp=temp-tot;
				tot=temp;
				ch='|';
			}
			if(ch=='*')
			{	

				temp=temp*tot;
				tot=temp;
				ch='|';
			}
			if(ch=='%')
			{	

				temp=temp*tot/100;
				tot=temp;
				ch='|';
			}
			if(ch=='/')
			{	

				temp=temp/tot;
				tot=temp;
				ch='|';
			}
			t1.setText(" "+tot);

		}
		if(ae.getActionCommand().equals("Exit"))
		{
			System.exit(0);	
		}

	}
	public float checkcnt(float lav,float count,float newval)
	{

			lav=lav*10+newval;			
		return lav;
	}
	public static void main(String args[])
	{
		new calculator();
	}
}