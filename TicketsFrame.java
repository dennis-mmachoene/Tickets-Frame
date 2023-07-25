package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TicketsFrame extends JFrame {

    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel cellphonePnl;
    private JPanel customerDetailsPnl;
    private JPanel homeTeamPnl;
    private JPanel awayTeamPnl;
    private JPanel ticketCostPnl;
    private JPanel numTicketsPnl;
    private JPanel totAmtDuePnl;
    private JPanel ticketsPnl;
    private JPanel btnsPnl;
    private JPanel ticketsAndBtnsCombinedPnl;
    private JPanel mainPnl;

    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel cellphoneLbl;
    private JLabel homeTeamLbl;
    private JLabel awayTeamLbl;
    private JLabel ticketCostLbl;
    private JLabel numTicketsLbl;
    private JLabel totAmtDueLbl;

    private JTextField nameTxt;
    private JTextField surnameTxt;
    private JTextField cellphoneTxt;
    private JTextField homeTeamTxt;
    private JTextField awayTeamTxt;
    private JTextField ticketCostTxt;
    private JTextField totAmtDueTxt;

    private JSlider numTicketsSld;

    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public TicketsFrame() {
        setTitle("Ticket Sales");
        setSize(600, 600);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellphonePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));

        customerDetailsPnl = new JPanel(new GridLayout(3, 1, 1, 1));
        customerDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Customer Details"));

        homeTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ticketCostPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numTicketsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totAmtDuePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));

        ticketsPnl = new JPanel(new GridLayout(5, 1, 1, 1));
        ticketsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Tickets Details"));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ticketsAndBtnsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 40));
        headingLbl.setForeground(Color.CYAN);

        nameLbl = new JLabel("Name:      ");
        surnameLbl = new JLabel("Surname:      ");
        cellphoneLbl = new JLabel("Cellphone:     ");
        homeTeamLbl = new JLabel("Home team:    ");
        awayTeamLbl = new JLabel("Away team:       ");
        ticketCostLbl = new JLabel("Cost price:  R");
        numTicketsLbl = new JLabel("Number of tickets required:  ");
        totAmtDueLbl = new JLabel("Total amount due: R");
        
        nameTxt = new JTextField(10);
        nameTxt.setFocusable(true);
        
        surnameTxt = new JTextField(10);
        cellphoneTxt  = new JTextField(10);
        homeTeamTxt = new JTextField(10);
        awayTeamTxt = new JTextField(10);
        ticketCostTxt = new JTextField(10);
        
        totAmtDueTxt = new JTextField(20);
        totAmtDueTxt.setText("To be calculated soon");
        totAmtDueTxt.setEditable(false);
        
        numTicketsSld = new JSlider(1,20);
        
        buyBtn = new JButton("Buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxt);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxt);
        
        cellphonePnl.add(cellphoneLbl);
        cellphonePnl.add(cellphoneTxt);
        
        customerDetailsPnl.add(namePnl);
        customerDetailsPnl.add(surnamePnl);
        customerDetailsPnl.add(cellphonePnl);
        
        homeTeamPnl.add(homeTeamLbl);
        homeTeamPnl.add(homeTeamTxt);
        
        awayTeamPnl.add(awayTeamLbl);
        awayTeamPnl.add(awayTeamTxt);
        
        ticketCostPnl.add(ticketCostLbl);
        ticketCostPnl.add(ticketCostTxt);
        
        numTicketsPnl.add(numTicketsLbl);
        numTicketsPnl.add(numTicketsSld);
        
        totAmtDuePnl.add(totAmtDueLbl);
        totAmtDuePnl.add(totAmtDueTxt);
        
        ticketsPnl.add(homeTeamPnl);
        ticketsPnl.add(awayTeamPnl);
        ticketsPnl.add(ticketCostPnl);
        ticketsPnl.add(numTicketsPnl);
        ticketsPnl.add(totAmtDuePnl);
        
        btnsPnl.add(buyBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        ticketsAndBtnsCombinedPnl.add(ticketsPnl, BorderLayout.CENTER);
        ticketsAndBtnsCombinedPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(customerDetailsPnl, BorderLayout.CENTER);
        mainPnl.add(ticketsAndBtnsCombinedPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        
        setVisible(true);
        
    }
}
