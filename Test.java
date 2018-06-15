package test;
import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

 class TextEditor extends JFrame {
     public void loadfile(JTextArea input){
        JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File f = chooser.getSelectedFile();
                String filename =f.getAbsolutePath();
                try
                {
                    FileReader reader = new FileReader(filename);
                    BufferedReader br = new BufferedReader(reader);
                    try {
                        input.read(br, null);
                        br.close();
                        input.requestFocus();
                    } catch (IOException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                }
        
    }

   public void saveAs(JTextArea textArea) {
      FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Text File", "txt");
      final JFileChooser saveAsFileChooser = new JFileChooser();
      saveAsFileChooser.setApproveButtonText("Save");
      saveAsFileChooser.setFileFilter(extensionFilter);
      int actionDialog = saveAsFileChooser.showOpenDialog(this);
      if (actionDialog != JFileChooser.APPROVE_OPTION) {
         return;
      }

      // !! File fileName = new File(SaveAs.getSelectedFile() + ".txt");
      File file = saveAsFileChooser.getSelectedFile();
      if (!file.getName().endsWith(".txt")) {
         file = new File(file.getAbsolutePath() + ".txt");
      }

      BufferedWriter outFile = null;
      try {
         outFile = new BufferedWriter(new FileWriter(file));

         textArea.write(outFile);

      } catch (IOException ex) {
      } finally {
         if (outFile != null) {
            try {
               outFile.close();
            } catch (IOException e) {}
         }
      }
   }
}


public class Test extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame window = new JFrame("MY TOOLS");
        ImageIcon icon = new ImageIcon("kiit.jpg");
        window.setIconImage(icon.getImage());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JDesktopPane desktop = new JDesktopPane();
        JPanel top = new JPanel();
        //window.add(top);
        JMenuBar jmb=new JMenuBar();
        //top.add(jmb);
        JMenuItem Home = new JMenuItem("HOME");
        JMenu Texttools = new JMenu("    TEXT TOOLS");
        JMenuItem About = new JMenuItem("    ABOUT");
        JMenuItem Exit = new JMenuItem("    EXIT");
        
        
        JMenu BASIC_TEXT_TOOLS =new JMenu("BASIC TEXT TOOLS");
        JMenu FORMAT_TOOLS = new JMenu("FORMAT TOOLS");
        JMenu OBFUSCATION_TOOLS = new JMenu("OBFUSCATION TOOLS");
        JMenu RANDOMIZATION_TOOLS = new JMenu("RANDOMIZATION TOOLS");
        JMenu CANDP_TOOLS = new JMenu("COMBINATION/PERMUTATION TOOLS");
        JMenu NUMERATION_TOOLS = new JMenu("NUMERATION_TOOLS");
        JMenu ALL_IN_ONE_TOOL = new JMenu("ALL-IN-ONE TOOL");
        
        
        
        JMenuItem ADD_PREFIX_SUFFIX_INTO_LINE = new JMenuItem("ADD PREFIX/SUFFIX INTOLINE");
        JMenuItem ADD_REMOVE_LINE_BREAKS = new JMenuItem("ADD/REMOVE LINE BREAKS");
        JMenuItem COUNT_C_W_L = new JMenuItem("COUNT CHARACTERS,WORD,LINES");
        JMenuItem DELIMITED_COLUMN_EXTRACTOR = new JMenuItem("DELIMITED COLUMN EXTRACTOR");
        JMenuItem FAR_TEXT = new JMenuItem("FIND AND REPLACE TEXT");
        JMenuItem LETTER_CASE_CONVERTER = new JMenuItem("LETTER_CASE_CONVERTER");
        JMenuItem MERGE_TEXT = new JMenuItem("MERGE TEXT (LINE BY LINE)");
        JMenuItem REMOVE_DUPLICATE_LINES = new JMenuItem("REMOVE_DUPLICATE_LINES");
        JMenuItem REMOVE_EMPTY_LINES = new JMenuItem("REMOVE_EMPTY_LINES");
        JMenuItem REMOVE_EXTRA_SPACES = new JMenuItem("REMOVE_EXTRA_SPACES");
        JMenuItem REMOVE_LETTER_ACCENTS = new JMenuItem("REMOVE_LETTER_ACCENTS");
        JMenuItem REMOVE_LINES_CONTAINING = new JMenuItem("REMOVE_LINES_CONTAINING");
        JMenuItem SORT_TEXT_LINES =new JMenuItem("SORT_TEXT_LINES");
        
        JMenuItem ASCII_TO_UNICODE_CONVERTER =new JMenuItem("ASCII TO UNICODE CONVERTER");
        
        JMenuItem BINARY_CODE_TRANSLATER = new JMenuItem("BINARY_CODE_TRANSLATER");
        JMenuItem DISEMVOWEL_TOOL = new JMenuItem("DISEMVOWEL_TOOL");
        JMenuItem ENCRAYPTION_GENERATOR = new JMenuItem("ENCRAYPTION_GENERATOR");
        JMenuItem  REVERSE_TEXT_GENERATOR = new JMenuItem("REVERSE_TEXT_GENERATOR");
        JMenuItem  ROT13_CASAR_CIPHER = new JMenuItem("ROT13_CASAR_CIPHER");
        JMenuItem  WORD_SCRAMBLER_UNSCRAMBLER = new JMenuItem("WORD_SCRAMBLER_UNSCRAMBLER");
        
        JMenuItem  RANDOM_LINE_PICKER = new JMenuItem("RANDOM LINE PICKER");
        JMenuItem  RANDOM_NUMBER_GENERATOR = new JMenuItem("RANDOM NUMBER GENERATOR");
        JMenuItem  RANDOM_STRING_GENERATOR = new JMenuItem("RANDOM STRING GENERATOR");
        JMenuItem  STRING_RANDOMIZER= new JMenuItem("STRING RANDOMIZER");
        
        JMenuItem  COMBINATION_GENERATOR = new JMenuItem("COMBINATION GENERATOR");
        JMenuItem  LINE_COMBINATION_GENERATOR = new JMenuItem("LINE COMBINATION GENERATOR");
        JMenuItem  PERMUTATION_GENERATOR = new JMenuItem("PERMUTATION GENERATOR");
        
        JMenuItem  GENERATE_LIST_OF_NUMBERS = new JMenuItem("GENERATE_LIST_OF_NUMBERS");
        JMenuItem  NUMBER_EACH_LINE = new JMenuItem("NUMBER_EACH_LINE");
        JMenuItem  ONLINE_TALLY_COUNTER = new JMenuItem("ONLINE_TALLY_COUNTER");
        
        JMenuItem TEXT_MANIPULATION_NOTEPAD = new JMenuItem("TEXT_MANIPULATION_NOTEPAD");
        
        
        
        BASIC_TEXT_TOOLS.add(ADD_PREFIX_SUFFIX_INTO_LINE);
        BASIC_TEXT_TOOLS.add(ADD_REMOVE_LINE_BREAKS);
        //BASIC_TEXT_TOOLS.add(COUNT_C_W_L);
        BASIC_TEXT_TOOLS.add(DELIMITED_COLUMN_EXTRACTOR);
        BASIC_TEXT_TOOLS.add(FAR_TEXT);
        BASIC_TEXT_TOOLS.add(LETTER_CASE_CONVERTER);
        //BASIC_TEXT_TOOLS.add(MERGE_TEXT);
        BASIC_TEXT_TOOLS.add(REMOVE_DUPLICATE_LINES);
        BASIC_TEXT_TOOLS.add(REMOVE_EMPTY_LINES);
        BASIC_TEXT_TOOLS.add(REMOVE_EXTRA_SPACES);
        BASIC_TEXT_TOOLS.add(REMOVE_LETTER_ACCENTS);
        BASIC_TEXT_TOOLS.add(REMOVE_LINES_CONTAINING);
        //BASIC_TEXT_TOOLS.add(SORT_TEXT_LINES);
        
        //FORMAT_TOOLS.add(ASCII_TO_UNICODE_CONVERTER);
        
        OBFUSCATION_TOOLS.add(BINARY_CODE_TRANSLATER);
        OBFUSCATION_TOOLS.add(DISEMVOWEL_TOOL);
        //OBFUSCATION_TOOLS.add(ENCRAYPTION_GENERATOR);
        OBFUSCATION_TOOLS.add(REVERSE_TEXT_GENERATOR);
        OBFUSCATION_TOOLS.add(ROT13_CASAR_CIPHER);
        OBFUSCATION_TOOLS.add(WORD_SCRAMBLER_UNSCRAMBLER);
        
        RANDOMIZATION_TOOLS.add(RANDOM_LINE_PICKER);
        RANDOMIZATION_TOOLS.add(RANDOM_NUMBER_GENERATOR);
        RANDOMIZATION_TOOLS.add(RANDOM_STRING_GENERATOR);
        RANDOMIZATION_TOOLS.add(STRING_RANDOMIZER);
        
        CANDP_TOOLS.add(COMBINATION_GENERATOR);
        //CANDP_TOOLS.add(LINE_COMBINATION_GENERATOR);
        //CANDP_TOOLS.add(PERMUTATION_GENERATOR);
        
        NUMERATION_TOOLS.add(GENERATE_LIST_OF_NUMBERS);
        NUMERATION_TOOLS.add(NUMBER_EACH_LINE);
        //NUMERATION_TOOLS.add(ONLINE_TALLY_COUNTER);
        
        ALL_IN_ONE_TOOL.add(TEXT_MANIPULATION_NOTEPAD);
        
        
        Texttools.add(BASIC_TEXT_TOOLS);
        //Texttools.add(FORMAT_TOOLS);
        Texttools.add(OBFUSCATION_TOOLS);
        Texttools.add(RANDOMIZATION_TOOLS);
        Texttools.add(CANDP_TOOLS);
        Texttools.add(NUMERATION_TOOLS);
        //Texttools.add(ALL_IN_ONE_TOOL);
        jmb.add(Home);
        Cursor curHome = new Cursor(Cursor.HAND_CURSOR);
        Home.setCursor(curHome);
        jmb.add(Texttools);
        Cursor curTexttools = new Cursor(Cursor.HAND_CURSOR);
        Texttools.setCursor(curTexttools);
        jmb.add(About);
        Cursor curAbout = new Cursor(Cursor.HAND_CURSOR);
        About.setCursor(curAbout);
        jmb.add(Exit);
        top.add(jmb);
        Color c=new Color(7,12,27);
        top.setBackground(c);
        jmb.setBackground(c);
        Exit.setBackground(c);
        Home.setBackground(c);
        About.setBackground(c);
        c=new Color(255,255,255);
        Home.setForeground(c);
        Texttools.setForeground(c);
        About.setForeground(c);
        jmb.setForeground(c);
        Exit.setForeground(c);
        Cursor curExit = new Cursor(Cursor.HAND_CURSOR);
        Exit.setCursor(curExit);

        //*******************************************************************************************************************
         Homepage home;
        //************************************************************************
        Home.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Homepage home = new Homepage();
                //final JScrollPane scroll = new JScrollPane(home.AboutPanel);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(home.AboutPanel,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        About.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JPanel AboutPanel = new JPanel();
                AboutPanel.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font fb= new Font("Arial",Font.BOLD,20);
                gc.insets= new Insets(5, 5, 5, 5);
                JLabel label1 = new JLabel("The Text-Mechanic tool is a Simple, single task, Java based, text manipulation" );
                Font f= new Font("Arial",Font.PLAIN,20);
                label1.setFont(f);
                label1.setForeground(Color.BLACK);
                gc.gridy=0;
                gc.gridx=0;
                AboutPanel.add(label1,gc);
                JLabel label2 = new JLabel("tool capable to perform various desired manipulations on our String/Document." );
                label2.setFont(f);
                label2.setForeground(Color.BLACK);
                gc.gridy=1;
                gc.gridx=0;
                AboutPanel.add(label2,gc);
                JLabel label3 = new JLabel("Features - " );
                label3.setFont(fb);
                label3.setForeground(Color.BLACK);
                gc.gridy=2;
                gc.gridx=0;
                AboutPanel.add(label3,gc);
                JLabel label4 = new JLabel("Add Prefix/Suffix in each Line." );
                label4.setFont(f);
                label4.setForeground(Color.BLACK);
                gc.gridy=3;
                gc.gridx=0;
                AboutPanel.add(label4,gc);
                JLabel label5 = new JLabel("Add/Remove Line Breaks" );
                label5.setFont(f);
                label5.setForeground(Color.BLACK);
                gc.gridy=4;
                gc.gridx=0;
                AboutPanel.add(label5,gc);
                JLabel label6 = new JLabel("Delimited Column Extractor." );
                label6.setFont(f);
                label6.setForeground(Color.BLACK);
                gc.gridy=5;
                gc.gridx=0;
                AboutPanel.add(label6,gc);
                JLabel label7 = new JLabel("Find and Replace Text." );
                label7.setFont(f);
                label7.setForeground(Color.BLACK);
                gc.gridy=6;
                gc.gridx=0;
                AboutPanel.add(label7,gc);
                JLabel label8 = new JLabel("Letter Case Converter." );
                label8.setFont(f);
                label8.setForeground(Color.BLACK);
                gc.gridy=7;
                gc.gridx=0;
                AboutPanel.add(label8,gc);
                JLabel label9 = new JLabel("Remove Duplicate Lines." );
                label9.setFont(f);
                label9.setForeground(Color.BLACK);
                gc.gridy=8;
                gc.gridx=0;
                AboutPanel.add(label9,gc);
                JLabel label10 = new JLabel("Remove Empty Lines." );
                label10.setFont(f);
                label10.setForeground(Color.BLACK);
                gc.gridy=9;
                gc.gridx=0;
                AboutPanel.add(label10,gc);
                JLabel label11 = new JLabel("Remove Extra Spaces." );
                label11.setFont(f);
                label11.setForeground(Color.BLACK);
                gc.gridy=10;
                gc.gridx=0;
                AboutPanel.add(label11,gc);
                JLabel label12 = new JLabel("Remove Letter Ascents." );
                label12.setFont(f);
                label12.setForeground(Color.BLACK);
                gc.gridy=11;
                gc.gridx=0;
                AboutPanel.add(label12,gc);
                JLabel label13 = new JLabel("Remove Line Containing." );
                label13.setFont(f);
                label13.setForeground(Color.BLACK);
                gc.gridy=12;
                gc.gridx=0;
                AboutPanel.add(label13,gc);
                JLabel label14 = new JLabel("Binary Code Translator." );
                label14.setFont(f);
                label14.setForeground(Color.BLACK);
                gc.gridy=13;
                gc.gridx=0;
                AboutPanel.add(label14,gc);
                JLabel label15 = new JLabel("Dissemble Characters." );
                label15.setFont(f);
                label15.setForeground(Color.BLACK);
                gc.gridy=14;
                gc.gridx=0;
                AboutPanel.add(label15,gc);
                
                JLabel label16 = new JLabel("Reverse Text Generator." );
                label16.setFont(f);
                label16.setForeground(Color.BLACK);
                gc.gridy=15;
                gc.gridx=0;
                AboutPanel.add(label16,gc);
                JLabel label17 = new JLabel("ROOT13 Caesar Cypher." );
                label17.setFont(f);
                label17.setForeground(Color.BLACK);
                gc.gridy=16;
                gc.gridx=0;
                AboutPanel.add(label17,gc);
                JLabel label18 = new JLabel("Word Scrambler/Descrambler Tool." );
                label18.setFont(f);
                label18.setForeground(Color.BLACK);
                gc.gridy=17;
                gc.gridx=0;
                AboutPanel.add(label18,gc);
                JLabel label19 = new JLabel("Random Line Picker." );
                label19.setFont(f);
                label19.setForeground(Color.BLACK);
                gc.gridy=18;
                gc.gridx=0;
                AboutPanel.add(label19,gc);
                JLabel label20 = new JLabel("String Randomizer." );
                label20.setFont(f);
                label20.setForeground(Color.BLACK);
                gc.gridy=19;
                gc.gridx=0;
                AboutPanel.add(label20,gc);
                JLabel label21 = new JLabel("Combination Generator." );
                label21.setFont(f);
                label21.setForeground(Color.BLACK);
                gc.gridy=20;
                gc.gridx=0;
                AboutPanel.add(label21,gc);
                JLabel label22 = new JLabel("Number each Line in text." );
                label22.setFont(f);
                label22.setForeground(Color.BLACK);
                gc.gridy=21;
                gc.gridx=0;
                AboutPanel.add(label22,gc);
                JLabel label23 = new JLabel("Load Existing File and Save to desired Location with desired Filename." );
                label23.setFont(f);
                label23.setForeground(Color.BLACK);
                gc.gridy=22;
                gc.gridx=0;
                AboutPanel.add(label23,gc);
                final JScrollPane scroll = new JScrollPane(AboutPanel);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(scroll,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        
        //*****************************************Tool: Add Prefix and/or Suffix into Each Line*******************
                
        ADD_PREFIX_SUFFIX_INTO_LINE.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JPanel PrefixSuffixPanel = new JPanel();
                JLabel Add_Prefix_Suffix = new JLabel("Tool: Add Prefix and/or Suffix into Each Line");
                JTextArea input = new JTextArea("Input Box\n" +"Enter text for prefix and/or suffix insertion here.");
                JLabel addprefix = new JLabel("Add this prefix into the beginning of each line:");
                JTextField prefix = new JTextField("Enter prefix here.");
                JLabel addsufix = new JLabel("Add this suffix into the end of each line: ");
                addprefix.setFont(new Font("Add this suffix into the end of each line: ", Font.PLAIN, 20));
                //prefix.setUI("Enter prefix here.",Color.gray);
                JTextField suffix = new JTextField("Enter suffix here.");
                suffix.setFont(new Font("Enter suffix here.", Font.PLAIN, 20));
                JButton addpresuf = new JButton("Add prefix and/or Suffix");
                addpresuf.setFont(new Font("Add prefix and/or Suffix", Font.BOLD, 20));
                addpresuf.setBackground(Color.BLUE);
                addpresuf.setForeground(Color.WHITE);
                JButton clear = new JButton("Clear");
                clear.setFont(new Font("Enter suffix here.", Font.BOLD, 20));
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                Font f= new Font("Arial",Font.BOLD,17);
                Add_Prefix_Suffix.setFont(f);
                JTextArea output = new JTextArea("Output Box\n" +"Modified text will display here after entering the prefix and/or suffix into their appropriate field and clicking the \"Add Prefix and/or Suffix\" button above.\n" +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f= new Font("Arial",Font.PLAIN,17);
                output.setFont(f);
                JButton save = new JButton("Save As");
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                save.setFont(new Font("Save As", Font.BOLD, 20));
                //Dimension dim= getPreferredSize();
                PrefixSuffixPanel.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.gridwidth=2;
                //gc.fill=GridBagConstraints.NONE;
                gc.anchor=GridBagConstraints.LINE_START;
                PrefixSuffixPanel.add(Add_Prefix_Suffix,gc);
                
                gc.weightx=0;
                gc.weighty=2;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.BOTH;
                gc.gridwidth=2;
                //gc.anchor=GridBagConstraints.LINE_START;
                gc.insets=new Insets(5, 5, 5, 5);
                JScrollPane scrollableTextArea = new JScrollPane(input);
                scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                f= new Font("Arial",Font.PLAIN,15);
                input.setFont(f);
                PrefixSuffixPanel.add(scrollableTextArea,gc);
                
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.gridwidth=2;
                //gc.fill=GridBagConstraints.HORIZONTAL;
                //gc.anchor=GridBagConstraints.LINE_START;
                //gc.insets=new Insets(5, 5, 5, 5);
                f= new Font("Arial",Font.PLAIN,17);
                //gc.fill=GridBagConstraints.LINE_START;
                addprefix.setFont(f);
                PrefixSuffixPanel.add(addprefix,gc);
                
                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                gc.gridwidth=2;
                gc.ipady=17;
                //gc.fill=GridBagConstraints.NONE;
                //gc.anchor=GridBagConstraints.LINE_START;
                f= new Font("Arial",Font.PLAIN,15);
                prefix.setFont(f);
                PrefixSuffixPanel.add(prefix,gc);
                
                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 4;
                gc.gridwidth=2;
                gc.ipady=0;
                gc.fill=GridBagConstraints.HORIZONTAL;
                gc.anchor=GridBagConstraints.LINE_START;
                f= new Font("Arial",Font.PLAIN,15);
                addsufix.setFont(f);
                PrefixSuffixPanel.add(addsufix,gc);
                
                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 5;
                gc.gridwidth=2;
                gc.ipady=17;
                f= new Font("Arial",Font.PLAIN,15);
                suffix.setFont(f);
                PrefixSuffixPanel.add(suffix,gc);
                
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx = 0;
                gc.gridy = 6;
                gc.ipady=0;
                //gc.gridwidth=0;
                gc.fill=GridBagConstraints.NONE;
                gc.anchor=GridBagConstraints.LINE_START;
                Cursor cur1 = new Cursor(Cursor.HAND_CURSOR);
                addpresuf.setCursor(cur1);
                PrefixSuffixPanel.add(addpresuf,gc);
                
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx = 1;
                gc.gridy = 6;
                gc.fill=GridBagConstraints.NONE;
                gc.anchor=GridBagConstraints.LINE_END;
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                clear.setCursor(cur2);
                PrefixSuffixPanel.add(clear,gc);
                
                gc.weightx=1;
                gc.weighty=4;
                gc.gridx = 0;
                gc.gridy = 7;
                gc.fill=GridBagConstraints.BOTH;
                //gc.fill=GridBagConstraints.VERTICAL;
                
                gc.gridwidth=2;
                gc.anchor=GridBagConstraints.FIRST_LINE_START;
                gc.insets=new Insets(5, 5, 5, 5);
                JScrollPane scrollableTextArea1 = new JScrollPane(output);
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                PrefixSuffixPanel.add(scrollableTextArea1,gc);
                
                JButton loadfile = new JButton("Load File");
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx = 0;
                gc.gridy = 8;
                gc.ipady=0;
                gc.gridwidth=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                loadfile.setCursor(cur);
                loadfile.setBackground(Color.BLUE);
                loadfile.setForeground(Color.WHITE);
                f= new Font("Arial",Font.BOLD,20);
                loadfile.setFont(f);
                PrefixSuffixPanel.add(loadfile,gc);
                
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx = 1;
                gc.gridy = 8;
                gc.gridwidth=1;
                gc.ipady=0;
                save.setCursor(cur);
                PrefixSuffixPanel.add(save,gc);
                
                //add(toolbar,BorderLayout.NORTH);
                //add(addpresuf,BorderLayout.CENTER);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(PrefixSuffixPanel,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                addpresuf.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=input.getText();
                        String pre=prefix.getText();
                        String suf=suffix.getText();
                        String ret=function.generate(s,pre,suf);
                        output.setText(ret);
                    }
                });
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        input.setText(null);
                        prefix.setText(null);
                        suffix.setText(null);
                        output.setText(null);
                    }
                });
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);
                        
                    }
                });
                loadfile.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.loadfile(input);
                        
                    }
                });
                //newWindow.setVisible(true);
                //newWindow.setLocationRelativeTo(null);
                //newWindow.setMinimumSize(new Dimension(1200, 700));
                //desktop.add(newWindow);
                //newWindow.moveToFront();
            }
        });
        //****************************Tool: Add / Remove Line Breaks***********************
        ADD_REMOVE_LINE_BREAKS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel AddRemoveLineBreaks = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,17);
     
                Font fp= new Font("Arial",Font.PLAIN,17);

                AddRemoveLineBreaks.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                JLabel Add_Remove_Line_Breaks = new JLabel("Tool: Add / Remove Line Breaks");
                Add_Remove_Line_Breaks.setFont(fb);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets = new Insets(0, 5, 0, 0);
                AddRemoveLineBreaks.add(Add_Remove_Line_Breaks,gc);

                JTextArea input = new JTextArea(
                "Input Box\n"
                     +"Enter your input text here and click a text formatting function button below.\n"
                     +"CS = \"Case Sensitive\"\n"
                     +"RELB = \"Remove Existing Line Breaks\"\n"
                );
                input.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.4;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=0;
                gc.ipadx =0;
                //gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LAST_LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(input);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                AddRemoveLineBreaks.add(scrollableTextArea1,gc);

                JButton   remove_all_line_but = new JButton("Remove all line breaks");
                remove_all_line_but.setFont(new Font("AND", Font.BOLD, 15));
                remove_all_line_but.setBackground(Color.BLUE);
                remove_all_line_but.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                remove_all_line_but.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(remove_all_line_but,gc);

                /*JLabel and_replace_the_line_break = new JLabel("and replace the line break with this text:");
                and_replace_the_line_break.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 210, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(and_replace_the_line_break,gc);

                JTextField and_replace_the_line_break_text = new JTextField();
                        and_replace_the_line_break_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=16;
                gc.ipadx=200;
                gc.insets = new Insets(0, 500, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(and_replace_the_line_break_text,gc);

                JLabel Blank_for_nothing = new JLabel("Blank for nothing.");
                Blank_for_nothing.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 710, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(Blank_for_nothing,gc);*/

                JButton   make_new_line_breaks_u_but = new JButton("Make new line breaks");
                make_new_line_breaks_u_but.setFont(new Font("AND", Font.BOLD, 15));
                make_new_line_breaks_u_but.setBackground(Color.BLUE);
                make_new_line_breaks_u_but.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                make_new_line_breaks_u_but.setCursor(cur);
                AddRemoveLineBreaks.add(make_new_line_breaks_u_but,gc);

                JRadioButton before_radio = new JRadioButton("before");
                before_radio.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 200, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(before_radio,gc);

                JRadioButton after_each_occurrence_of_this_radio = new JRadioButton("after each occurrence of this text:");
                after_each_occurrence_of_this_radio.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 270, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                //after_each_occurrence_of_this_radio.setSelected(true);
                AddRemoveLineBreaks.add(after_each_occurrence_of_this_radio,gc);

                ButtonGroup bg = new ButtonGroup();
                    bg.add(before_radio);
                    bg.add(after_each_occurrence_of_this_radio);

                JTextField after_each_occurrence_of_this_text = new JTextField();
                        after_each_occurrence_of_this_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=16;
                gc.ipadx=200;
                gc.insets = new Insets(0, 542, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(after_each_occurrence_of_this_text,gc);

                /*JCheckBox cs_check = new JCheckBox("CS");
                cs_check.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 750, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(cs_check,gc);

                JCheckBox relb_check = new JCheckBox("RELB");
                relb_check.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 800, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(relb_check,gc);*/

                /*JButton   make_new_line_breaks_l_but = new JButton("Make new line breaks");
                make_new_line_breaks_l_but.setFont(new Font("AND", Font.BOLD, 15));
                make_new_line_breaks_l_but.setBackground(Color.BLUE);
                make_new_line_breaks_l_but.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                make_new_line_breaks_l_but.setCursor(cur);
                AddRemoveLineBreaks.add(make_new_line_breaks_l_but,gc);

                JLabel every = new JLabel("every");
                every.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 200, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(every,gc);

                JTextField every_text = new JTextField();
                        every_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=16;
                gc.ipadx=100;
                gc.insets = new Insets(0, 242, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(every_text,gc);

                JLabel characters = new JLabel("characters.");
                characters.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 350, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(characters,gc);

                JCheckBox Word_wrap_check = new JCheckBox("Word wrap.");
                Word_wrap_check.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 440, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(Word_wrap_check,gc);

                JCheckBox Escape_exisiting_line_breaks_check = new JCheckBox("Escape exisiting line breaks.");
                Escape_exisiting_line_breaks_check.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 560, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(Escape_exisiting_line_breaks_check,gc);*/

                JButton c_but = new JButton("Clear");
                c_but.setFont(new Font("Clear", Font.BOLD, 15));
                c_but.setBackground(Color.BLUE);
                c_but.setForeground(Color.WHITE);
                
                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                c_but.setCursor(cur);
                AddRemoveLineBreaks.add(c_but,gc);
                
                

                /*JButton load_but = new JButton(String.valueOf("\u25B2"));
                //load_but.setFont(new Font("U+25B2", Font.BOLD, 15));
                load_but.setBackground(Color.BLUE);
                load_but.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=5;
                gc.ipadx=0;
                gc.insets = new Insets(0, 880, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                load_but.setCursor(cur);
                AddRemoveLineBreaks.add(load_but,gc);*/

                     JTextArea output = new JTextArea(
                     "Output Box\n"
                     +"Modified text will display here.\n"
                     +"Click ▲ button to load output into input.\n"
                     +"Check \"Word wrap\" to break line between full words only.\n"
                     +"Privacy of Data: This tool is built-with and functions-in"
                     + " Client Side JavaScripting, so only your computer will see or process your data input/output.\n"   
                    );
                output.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.4;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=200;
                gc.ipadx =0;
                //gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LAST_LINE_START;
                JScrollPane scrollableTextArea2 = new JScrollPane(output);  
                scrollableTextArea2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                AddRemoveLineBreaks.add(scrollableTextArea2,gc);

                JButton load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 15));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=6;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                load.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(load,gc);

                JButton save = new JButton("Save As");
                save.setFont(new Font("Save As", Font.BOLD, 15));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=6;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 110, 0, 0);
                save.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                AddRemoveLineBreaks.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(AddRemoveLineBreaks,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                  c_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        input.setText(null);
                        output.setText(null);
                    }
                    });
                  
                 save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);
                        
                    }
                }); 
                 
                 load.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.loadfile(input);
                        
                    }
                });
                 
                 remove_all_line_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=input.getText();
                       Boolean remove_all_line = false, after_each_occurrence_of_this = false;
                       String ch = after_each_occurrence_of_this_text.getText();
                        if (before_radio.isSelected() == true)
                           remove_all_line = true;
                        if (after_each_occurrence_of_this_radio.isSelected() == true)
                           after_each_occurrence_of_this = true;
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        String ss = function.remove_breaks(s);
                        //String ret=function.generate(s,pre,suf);
                        output.setText(ss);
                    }
                });
                 
                 make_new_line_breaks_u_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=input.getText();
                       Boolean removeafter = false, removebefore = false;
                       String ch = after_each_occurrence_of_this_text.getText();
                        if (before_radio.isSelected() == true)
                           removebefore = true;
                        if (after_each_occurrence_of_this_radio.isSelected() == true)
                           removeafter = true;
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ss = function.remove_breaks(s);
                        //String ret=function.generate(s,pre,suf);
                        String replace = "\n" ;
                        String ret = function.add_remove_breaks(s,removeafter,removebefore,replace);
                        output.setText(ret);
                    }
                });
                 
                 
            }
        });
        //****************************Tool: Count Characters, Words, Sentences, Lines******
        COUNT_C_W_L.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                //indow.getContentPane().add(PrefixSuffixPanel,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        //****************************Tool: Delimited Column Extractor*********************
        DELIMITED_COLUMN_EXTRACTOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel DelimitedColumnExtractor = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,17);
                Font fp= new Font("Arial",Font.PLAIN,17);
                JLabel Delimited_Column_Extractor = new JLabel("Tool: Delimited Column Extractor");
                Delimited_Column_Extractor.setFont(fb);
                JLabel Columns_delimited = new JLabel("Columns delimited by this text:");
                Columns_delimited.setFont(fp);
                JLabel Extract_column = new JLabel("Extract column #");
                Extract_column.setFont(fp);
                JTextField Columns_text_field = new JTextField();
                Columns_text_field.setFont(fp);
                JTextField Extract_text_field = new JTextField("1");
                Extract_text_field.setFont(fp);
                JButton extract_column_btn = new JButton("Extract Column");
                extract_column_btn.setFont(new Font("Extract Column", Font.BOLD, 17));
                extract_column_btn.setBackground(Color.BLUE);
                extract_column_btn.setForeground(Color.WHITE);
                JButton clear = new JButton("Clear");
                clear.setFont(new Font("Clear", Font.BOLD, 17));
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                JButton load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 17));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);
                JButton save = new JButton("Save As");
                save.setFont(new Font("Save As", Font.BOLD, 17));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                JCheckBox monospace = new JCheckBox("Monospaced font.");
                monospace.setFont(fp);
                JTextArea input = new JTextArea(
                "Enter input text here.\n"
                        +"Enter column number to be extracted (1, 2, 3, etc.) and"
                        + " delimiter that seperates columns i.e character, word, segment of html code, etc.\n"
                        +"Click the \"Extract Column\" button and the specified"
                        + " cloumn of text will be loaded into the results box below.\n"
                        +"Test by clicking the \"Extract Column\" button to extract"
                        + " each line's first letter from this default text.\n"
                        +"To swap/rearrange columns, extract all columns and merge with Join/Merge Text (Line by Line) tool.\n"
                );
                JTextArea output = new JTextArea(
                "Output will display here.\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting,"
                        + " so only your computer will see or process your data input/output.\n"
                );
                input.setFont(fp);
                output.setFont(fp);
                DelimitedColumnExtractor.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                gc.insets = new Insets(5, 5, 5, 5);
                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(Delimited_Column_Extractor,gc);

                /*gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(Columns_delimited,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=17;
                gc.ipadx=200;
                gc.insets = new Insets(0, 230, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(Columns_text_field,gc);*/

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(Extract_column,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=17;
                gc.ipadx=100;
                gc.insets = new Insets(0, 130, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(Extract_text_field,gc);

                gc.weightx=1;
                gc.weighty=0.2;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx =100;
                gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LAST_LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(input);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                DelimitedColumnExtractor.add(scrollableTextArea1,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(5, 5, 5, 5);
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                extract_column_btn.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(extract_column_btn,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 170, 0, 0);
                clear.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(clear,gc);

                /*gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 260, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(monospace,gc);*/

                gc.weightx=1;
                gc.weighty=0.4;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=200;
                gc.ipadx =100;
                gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LAST_LINE_START;
                JScrollPane scrollableTextArea2 = new JScrollPane(output);  
                scrollableTextArea2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                DelimitedColumnExtractor.add(scrollableTextArea2,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                load.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(load,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(5, 120, 5, 5);
                save.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DelimitedColumnExtractor.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(DelimitedColumnExtractor,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                clear.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                    input.setText(null);
                }
                });
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);
                    
                }
                });
                extract_column_btn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        
                        String columnno_string = Extract_text_field.getText();
                        int columno = Integer.parseInt(columnno_string);	
                        String s=input.getText();
                        String ret=function.delimited_column_extractor(s , columno);
                        output.setText(ret);
                    }
                });
            }
        });
        
        //****************************Tool: Find and Replace Text**************************
        FAR_TEXT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel FindandReplaceText = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,17);
        
                Font fp= new Font("Arial",Font.PLAIN,17);

                FindandReplaceText.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                JLabel Find_and_Replace_Text = new JLabel("Tool: Find and Replace Text");
                Find_and_Replace_Text.setFont(fb);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets = new Insets(0, 5, 0, 0);
                FindandReplaceText.add(Find_and_Replace_Text,gc);

                JLabel Find_this = new JLabel("Find this:");
                Find_this.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets = new Insets(0, 5, 0, 0);
                FindandReplaceText.add(Find_this,gc);

                /*JCheckBox Enable_regular_expression = new JCheckBox("Enable regular expression.");
                Enable_regular_expression.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets = new Insets(0, 70, 0, 0);
                FindandReplaceText.add(Enable_regular_expression,gc);*/

                JTextArea Find_this_text = new JTextArea();
                Find_this_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.4;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx =0;
                //gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(Find_this_text);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                FindandReplaceText.add(scrollableTextArea1,gc);

                JLabel Replace_with = new JLabel("Replace with:");
                Replace_with.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx =0;
                //gc.gridwidth=10;
                gc.insets = new Insets(0, 5, 0, 0);
                //gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                FindandReplaceText.add(Replace_with,gc);

                JTextArea Replace_with_text = new JTextArea();
                Replace_with_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.4;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx =0;
                //gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea2 = new JScrollPane(Replace_with_text);  
                scrollableTextArea2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                FindandReplaceText.add(scrollableTextArea2,gc);

                JButton  Find_and_Replace_Text_but = new JButton("Find and Replace Text");
                Find_and_Replace_Text_but.setFont(fb);
                Find_and_Replace_Text_but.setBackground(Color.BLUE);
                Find_and_Replace_Text_but.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                Find_and_Replace_Text_but.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                FindandReplaceText.add(Find_and_Replace_Text_but,gc);

                JCheckBox show_index = new JCheckBox("Show Index");
                show_index.setFont(fp);
                show_index.setSelected(true);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 220, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                FindandReplaceText.add(show_index,gc);

                /*JCheckBox Case_sensitive = new JCheckBox("Case sensitive.");
                Case_sensitive.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 370, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                FindandReplaceText.add(Case_sensitive,gc);*/

                JButton  Clear = new JButton("Clear");
                Clear.setFont(fb);
                Clear.setBackground(Color.BLUE);
                Clear.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 370, 0, 0);
                Clear.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                FindandReplaceText.add(Clear,gc);

                JTextArea output = new JTextArea(
                "Enter your text to be found and replaced here.\n"
                        +"Enter text to be searched for in the \"Find this:\" text box above.\n"
                        +"Enter replacement text in the \"Replace with:\" text box above.\n"
                        +"Check \"Global matching.\" to replace all matches. Otherwise, only the first match will be replaced.\n"
                        +"Check \"Case sensitive.\" to make \"Find this:\" case sensitive.\n"
                        +"Check \"Enable regular expression\" to enable regular expressions* in both find and replace fields.\n"
                        +"*Regular expressions are user defined \"find and replace\" patterns such as find a or b to replace with c.\n"
                        +"Note: For files too large to successfully load into this text field, use the \"Big File Tool\" link below.\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting,"
                        + " so only your computer will see or process your data input/output.\n"
                );
                output.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.8;
                gc.gridx=0;
                gc.gridy=6;
                gc.ipady=100;
                gc.ipadx =0;
                //gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea3 = new JScrollPane(output);  
                scrollableTextArea3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                FindandReplaceText.add(scrollableTextArea3,gc);

                JButton  load = new JButton("Load File");
                load.setFont(fb);
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=7;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                load.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                FindandReplaceText.add(load,gc);

                JButton  save = new JButton("Save As");
                save.setFont(fb);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=7;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 120, 0, 0);
                save.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                FindandReplaceText.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(FindandReplaceText,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);   
                }
                });
                
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                
                Clear.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                }
                });
                
                Find_and_Replace_Text_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String find = Find_this_text.getText();
                        String replace = Replace_with_text.getText();
                        String out = output.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        //output.setText(ret);
                        boolean showindexes = show_index.isSelected() ;
                        String result = function.find_and_replace(out , find , replace);
                        output.setText(result);
                        //System.out.println(result);
                        if(showindexes==true)
                            function.showIndexes(out, find);
                        }
                    });
                }
            });
        
        //****************************Tool: Letter Case Converter**************************
        LETTER_CASE_CONVERTER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel LetterCaseConverter = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,20);
                Font fp= new Font("Arial",Font.PLAIN,17);
                JLabel Letter_Case_Converter = new JLabel("Tool: Letter Case Converter");
                Letter_Case_Converter.setFont(fb);
                JButton uppercase = new JButton("Uppercase");
                uppercase.setFont(new Font("Uppercase", Font.BOLD, 17));
                uppercase.setBackground(Color.BLUE);
                uppercase.setForeground(Color.WHITE);
                JRadioButton uppercase_radio = new JRadioButton("Uppercase");
                uppercase_radio.setFont(fp);
                JButton lowercase = new JButton("Lowercase");
                lowercase.setFont(new Font("Lowercase", Font.BOLD, 17));
                lowercase.setBackground(Color.BLUE);
                lowercase.setForeground(Color.WHITE);
                JButton result = new JButton("Result");
                result.setFont(new Font("Result", Font.BOLD, 17));
                result.setBackground(Color.BLUE);
                result.setForeground(Color.WHITE);
                JRadioButton lowercase_radio = new JRadioButton("Lowercase");
                lowercase_radio.setFont(fp);
                JButton randomcase = new JButton("Randomcase");
                randomcase.setFont(new Font("Randomcase", Font.BOLD, 17));
                randomcase.setBackground(Color.BLUE);
                randomcase.setForeground(Color.WHITE);
                JRadioButton randomcase_radio = new JRadioButton("Randomcase");
                randomcase_radio.setFont(fp);
                JButton first_letter_word_upper = new JButton("First letter each word uppercase.");
                first_letter_word_upper.setFont(new Font("First letter each word uppercase.", Font.BOLD, 17));
                first_letter_word_upper.setBackground(Color.BLUE);
                first_letter_word_upper.setForeground(Color.WHITE);
                JRadioButton first_letter_word_upper_radio = new JRadioButton("First letter each word uppercase.");
                first_letter_word_upper_radio.setFont(fp);
                JButton first_letter_sentence_upper = new JButton("First letter each sentence uppercase.");
                first_letter_sentence_upper.setFont(new Font("First letter each sentence uppercase.", Font.BOLD, 17));
                first_letter_sentence_upper.setBackground(Color.BLUE);
                first_letter_sentence_upper.setForeground(Color.WHITE);
                JButton clear = new JButton("Clear");
                clear.setFont(new Font("Clear", Font.BOLD, 17));
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                JButton load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 17));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);
                JButton save = new JButton("Save As");
                save.setFont(new Font("Clear", Font.BOLD, 17));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                JTextArea output = new JTextArea(
                        "Enter text and click a letter case conversion function button above.\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting,"
                                + " so only your computer will see or process your data input/output.\n"
                );
                output.setFont(fp);
                LetterCaseConverter.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 0;
                gc.gridwidth = 6;
                gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                LetterCaseConverter.add(Letter_Case_Converter,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 1;
                gc.gridwidth = 1;

                //gc.insets=new Insets(0, 20, 0, 0);
                //gc.fill = GridBagConstraints.BOTH;
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                uppercase.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                LetterCaseConverter.add(uppercase_radio,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 1;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                lowercase.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                LetterCaseConverter.add(lowercase_radio,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 2;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                randomcase.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                LetterCaseConverter.add(randomcase_radio,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 3;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                first_letter_word_upper.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                LetterCaseConverter.add(first_letter_word_upper_radio,gc);
                
                ButtonGroup bg = new ButtonGroup();
                bg.add(lowercase_radio);
                bg.add(uppercase_radio);
                bg.add(randomcase_radio);
                bg.add(first_letter_word_upper_radio);
                /*gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 4;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                first_letter_sentence_upper.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                LetterCaseConverter.add(first_letter_sentence_upper,gc);*/
                
                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 4;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                result.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                LetterCaseConverter.add(result,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 5;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                clear.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                LetterCaseConverter.add(clear,gc);

                gc.weightx = 0;
                gc.weighty = 4;
                gc.gridx = 0;
                gc.gridy = 2;
                gc.gridwidth = 6;
                gc.fill = GridBagConstraints.BOTH;
                //gc.insets=new Insets(5, 5, 5, 5);
                gc.insets=new Insets(10, 10, 10, 10);
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                LetterCaseConverter.add(scrollableTextArea1,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                //gc.gridwidth = 5;
                gc.insets=new Insets(5, 5, 5, 5);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                load.setCursor(cur);
                LetterCaseConverter.add(load,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                //gc.gridwidth = 5;
                gc.insets=new Insets(5, 180, 5, 5);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                save.setCursor(cur);
                LetterCaseConverter.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(LetterCaseConverter,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                clear.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                }
                });
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);
                    
                }
                });
                
                result.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        boolean upper = uppercase_radio.isSelected();
                        boolean lower = lowercase_radio.isSelected() ;
                        boolean rand = randomcase_radio.isSelected() ;
                        boolean first_letter_of_word = first_letter_word_upper_radio.isSelected() ;
                        String ret=function.change_case(s,upper,lower,rand,first_letter_of_word);
                        output.setText(ret);
                    }
                });
            }
        });
        
        //***************************Tool: Join/Merge Text (Line by Line)******************
        MERGE_TEXT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                //indow.getContentPane().add(PrefixSuffixPanel,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        //***************************Tool: Remove Duplicate Lines**************************
        REMOVE_DUPLICATE_LINES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel Remove_Duplicate_Line = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,20);
                Font fp= new Font("Arial",Font.PLAIN,17);
                JLabel Remove_Duplicate_Lines = new JLabel("Tool: Remove Duplicate Lines");
                Remove_Duplicate_Lines.setFont(fb);
                JButton Remove_Duplicate_but = new JButton("Remove Duplicate Lines");
                JCheckBox case_sensitive = new JCheckBox("Case sensitive.");
                case_sensitive.setFont(fp);
                Remove_Duplicate_but.setFont(new Font("Remove Empty Lines", Font.BOLD, 20));
                Remove_Duplicate_but.setBackground(Color.BLUE);
                Remove_Duplicate_but.setForeground(Color.WHITE);
                JButton c_but = new JButton("Clear");
                c_but.setFont(new Font("Clear", Font.BOLD, 20));
                c_but.setBackground(Color.BLUE);
                c_but.setForeground(Color.WHITE);
                JButton save = new JButton("Save As");
                save.setFont(new Font("Clear", Font.BOLD, 20));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                JButton load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 20));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);
                case_sensitive = new JCheckBox("Remove lines containing only whitespace.");
                case_sensitive.setFont(fp);
                JCheckBox remove_empty = new JCheckBox("Remove empty lines.");
                remove_empty.setFont(fp);
                JCheckBox display_removed = new JCheckBox("Display removed.");
                display_removed.setFont(fp);
                JTextArea output = new JTextArea(
               "Enter text here, select options and click the \"Remove Duplicate Lines\" button from above.\n"
                        +"Duplicate text removal is only between content on new lines"
                       + " and duplicate text within the same line will not be removed.\n"
                        +"The line order/sorting will not be affected other than subsequent duplicate lines being deleted.\n"
                        +"Check the \"Case sensitive.\" checkbox for case sensitive matching of duplicate line removal.\n"
                        +"Check the \"Remove empty lines.\" checkbox to remove/delete all blank/empty lines.\n"
                        +"Check the \"Display removed.\" checkbox to save removed lines."
                       + " Lines are prefixed with removal information for reference.\n\n"
                        +"Example:\n"
                        +"Click the \"Remove Duplicate Lines\" button and watch these duplicate lines become one.\n"
                        +"Click the \"Remove Duplicate Lines\" button and watch these duplicate lines become one.\n"
                        +"Click the \"Remove Duplicate Lines\" button and watch these duplicate lines become one.\n\n"
                        +"Note: For files too large to successfully load into this text field, use the "
                       + "\"Big File Tool\" link below.\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting,"
                       + " so only your computer will see or process your data input/output.\n"

                );
                output.setFont(fp);
                Remove_Duplicate_Line.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 0;
                gc.gridwidth = 5;
                gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                Remove_Duplicate_Line.add(Remove_Duplicate_Lines,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 1;
                gc.gridwidth = 1;
                gc.insets=new Insets(0, 30, 0, 0);
                //gc.fill = GridBagConstraints.BOTH;
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                Remove_Duplicate_but.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                Remove_Duplicate_Line.add(Remove_Duplicate_but,gc);

                /*gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 1;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;

                gc.anchor = GridBagConstraints.LINE_START;
                Remove_Duplicate_Line.add(case_sensitive,gc);*/

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 1;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                Remove_Duplicate_Line.add(remove_empty,gc);

                /*gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 2;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                Remove_Duplicate_Line.add(display_removed,gc);*/

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 2;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                c_but.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                Remove_Duplicate_Line.add(c_but,gc);

                gc.weightx = 1;
                gc.weighty = 4;
                gc.gridx = 0;
                gc.gridy = 2;
                gc.gridwidth = 5;
                gc.fill = GridBagConstraints.BOTH;
                //gc.insets=new Insets(5, 5, 5, 5);
                gc.insets=new Insets(5, 5, 5, 5);
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                Remove_Duplicate_Line.add(scrollableTextArea1,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                //gc.gridwidth = 5;
                gc.insets=new Insets(0, 30, 0, 0);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                load.setCursor(cur);
                Remove_Duplicate_Line.add(load,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                //gc.gridwidth = 5;
                gc.insets=new Insets(0, 180, 0, 0);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                save.setCursor(cur);
                Remove_Duplicate_Line.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(Remove_Duplicate_Line,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                c_but.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                }
                });
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);
                    
                }
                });
                Remove_Duplicate_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        boolean remove_empty_lines = false;
                        String s=output.getText();
                        if (remove_empty.isSelected() == true)
                           remove_empty_lines = true;
                        //boolean remove_empty_lines = remove_empty.isSelected();
                        String ret=function.remove_duplicate_lines(s,remove_empty_lines);
                        output.setText(ret);
                    }
                });
            }
        });
        //***************************Tool: Remove Empty Lines******************************
        REMOVE_EMPTY_LINES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel RemoveEmptyLines = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,20);
                Font fp= new Font("Arial",Font.PLAIN,17);
                JLabel Remove_Empty_Lines = new JLabel("Tool: Remove Empty Lines");
                Remove_Empty_Lines.setFont(fb);
                JButton Remove_Empty_but = new JButton("Remove Empty Lines");
                JCheckBox check = new JCheckBox("Remove lines containing only whitespace.");
                check.setFont(fp);
                Remove_Empty_but.setFont(new Font("Remove Empty Lines", Font.BOLD, 20));
                Remove_Empty_but.setBackground(Color.BLUE);
                Remove_Empty_but.setForeground(Color.WHITE);
                JButton c_but = new JButton("Clear");
                c_but.setFont(new Font("Clear", Font.BOLD, 20));
                c_but.setBackground(Color.BLUE);
                c_but.setForeground(Color.WHITE);
                JButton load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 20));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);
                JButton save = new JButton("Save As");
                save.setFont(new Font("Clear", Font.BOLD, 20));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                JTextArea output = new JTextArea(
                "Enter your text here and click the \"Remove Empty Lines\" button above.\n\n"
                        + "Test by click the \"Remove Empty Lines\" button and watch these blank lines between this"
                        + " text disappear.\n\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting,"
                        + " so only your computer will see or process your data input/output.\n\n"
                );
                output.setFont(fp);
                RemoveEmptyLines.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 0;
                gc.gridwidth = 3;
                gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                RemoveEmptyLines.add(Remove_Empty_Lines,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 1;
                gc.gridwidth = 1;
                gc.insets=new Insets(0, 10, 0, 0);
                //gc.fill = GridBagConstraints.BOTH;
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                Remove_Empty_but.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                RemoveEmptyLines.add(Remove_Empty_but,gc);

                /*gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 1;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;

                gc.anchor = GridBagConstraints.LINE_START;
                RemoveEmptyLines.add(check,gc);*/

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 1;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                c_but.setCursor(cur);
                RemoveEmptyLines.add(c_but,gc);

                gc.weightx = 1;
                gc.weighty = 4;
                gc.gridx = 0;
                gc.gridy = 2;
                gc.gridwidth = 3;
                gc.fill = GridBagConstraints.BOTH;
                //gc.insets=new Insets(5, 5, 5, 5);
                gc.insets=new Insets(5, 5, 5, 5);
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RemoveEmptyLines.add(scrollableTextArea1,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                //gc.gridwidth = 5;
                gc.insets=new Insets(0, 5, 0, 0);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                save.setCursor(cur);
                RemoveEmptyLines.add(load,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                //gc.gridwidth = 5;
                gc.insets=new Insets(0, 180, 0, 0);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                save.setCursor(cur);
                RemoveEmptyLines.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(RemoveEmptyLines,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                c_but.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                }
                });
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);
                    
                }
                });
                
                Remove_Empty_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s= output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String ret = function.remove_empty_lines(s);
                        output.setText(ret);
                    }
                });
            }
        });
        //***************************Tool: Remove Extra Spaces*****************************
        REMOVE_EXTRA_SPACES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel RemoveExtraSpaces = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,20);
                Font fp= new Font("Arial",Font.PLAIN,17);
                JLabel Remove_Extra_Spaces = new JLabel("Tool: Remove Extra Spaces");
                Remove_Extra_Spaces.setFont(fb);
                JButton Remove_but = new JButton("Remove");
                JRadioButton remove_extra = new JRadioButton("Remove extra spaces.");
                remove_extra.setFont(fp);
                JRadioButton remove_all = new JRadioButton("Remove all spaces.");
                remove_all.setFont(fp);
                ButtonGroup bg = new ButtonGroup();
                bg.add(remove_extra);
                bg.add(remove_all);
                JCheckBox check = new JCheckBox("Trim leading/trailing whitespaces from lines.");
                check.setFont(fp);
                Remove_but.setFont(new Font("Remove", Font.BOLD, 20));
                Remove_but.setBackground(Color.BLUE);
                Remove_but.setForeground(Color.WHITE);
                JButton c_but = new JButton("Clear");
                c_but.setFont(new Font("Clear", Font.BOLD, 20));
                c_but.setBackground(Color.BLUE);
                c_but.setForeground(Color.WHITE);
                JButton save = new JButton("Save As");
                save.setFont(new Font("Clear", Font.BOLD, 20));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                 JButton load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 20));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);
                JTextArea output = new JTextArea(
                " Enter your text here and click the      \"Remove\"      button above.\n"
                        +"    Test by click the \"Remove\" button and watch leading/"
                        + "trailing/extra/all spaces disappear from each line of default text.\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side "
                        + "JavaScripting, so only your computer will see or process your data input/output. \n"
                );
                output.setFont(fp);
                RemoveExtraSpaces.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 0;
                gc.gridwidth = 5;
                gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                RemoveExtraSpaces.add(Remove_Extra_Spaces,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                Remove_but.setCursor(cur);
                gc.anchor = GridBagConstraints.LINE_START;
                RemoveExtraSpaces.add(Remove_but,gc);

                /*gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 1;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;

                gc.anchor = GridBagConstraints.LINE_START;
                RemoveExtraSpaces.add(check,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 2;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                RemoveExtraSpaces.add(remove_extra,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 3;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                RemoveExtraSpaces.add(remove_all,gc);*/

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 4;
                gc.gridy = 1;
                gc.gridwidth = 1;
                //gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                c_but.setCursor(cur);
                RemoveExtraSpaces.add(c_but,gc);

                gc.weightx = 1;
                gc.weighty = 4;
                gc.gridx = 0;
                gc.gridy = 2;
                gc.gridwidth = 5;
                gc.fill = GridBagConstraints.BOTH;
                //gc.insets=new Insets(5, 5, 5, 5);
                gc.insets=new Insets(5, 5, 5, 5);
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RemoveExtraSpaces.add(scrollableTextArea1,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                //gc.gridwidth = 5;
                gc.insets=new Insets(0, 5, 0, 0);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                save.setCursor(cur);
                RemoveExtraSpaces.add(load,gc);

                gc.weightx = 0;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;
                //gc.gridwidth = 5;
                gc.insets=new Insets(0, 180, 0, 0);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                save.setCursor(cur);
                RemoveExtraSpaces.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(RemoveExtraSpaces,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                c_but.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                }
                });
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);
                    
                }
                });
                
                Remove_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //String s=input.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String text = output.getText();
                        String result = function.remove_extra_spaces(text);
                        output.setText(result);
                    }
                });
            }
        });
        //***************************Tool: Remove Letter Accents***************************
        REMOVE_LETTER_ACCENTS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel RemoveLetterAccents = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,20);
                Font fp= new Font("Arial",Font.PLAIN,17);
                JLabel Remove_Letter_Accents = new JLabel("Tool: Remove Letter Accents");
                Remove_Letter_Accents.setFont(fb);
                JButton Remove_Letter_but = new JButton("Remove Letter Accents");
                Remove_Letter_but.setFont(new Font("Remove Letter Accents", Font.BOLD, 20));
                Remove_Letter_but.setBackground(Color.BLUE);
                Remove_Letter_but.setForeground(Color.WHITE);
                JButton Clear = new JButton("Clear");
                Clear.setFont(new Font("Clear", Font.BOLD, 20));
                Clear.setBackground(Color.BLUE);
                Clear.setForeground(Color.WHITE);
                JButton load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 20));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);
                JButton save = new JButton("Save As");
                save.setFont(new Font("Save As", Font.BOLD, 20));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                JTextArea output = new JTextArea(
                "Enter your text here.\n"
                +"Click \"Remove Letter Accents\" for diacritic marks to be removed.\n"
                +"Supported letters/accents are:\n"
                        +"ÁáÀàÂâǍǎĂăÃãẢảẠạÄäÅåĀāĄąẤấẦầẪẫẨẩẬậẮắẰằẴẵẲẳẶặǺǻĆćĈĉČčĊċÇ"
                        + "çĎďĐđÐÉéÈèÊêĚěĔĕẼẽẺẻĖėËëĒēĘęẾếỀềỄễỂểẸẹỆệĞğĜĝĠġĢģĤĥĦħÍíÌìĬĭÎîǏǐÏïĨĩĮįĪīỈỉỊịĴĵĶķĹĺĽľĻļŁłĿŀŃ\n"
                        +"ńŇňÑñŅņÓóÒòŎŏÔôỐốỒồỖỗỔổǑǒÖöŐőÕõØøǾǿŌōỎỏƠơỚớỜờỠỡỞởỢợỌọỘộṔṕṖṗŔ"
                        + "ŕŘřŖŗŚśŜŝŠšŞşŤťŢţŦŧÚúÙùŬŭÛûǓǔŮůÜüǗǘǛǜǙǚǕǖŰűŨũŲųŪūỦủƯưỨứỪừỮữỬử\n"
                        +"ỰựỤụẂẃẀẁŴŵẄẅÝýỲỳŶŷŸÿỸỹỶỷỴỵŹźŽžŻż\n"
                        +"Test by clicking \"Remove Letter Accents\" for diacritic marks to disappear from letters above\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting,"
                        + " so only your computer will see or process your data input/output.\n"
                );
                output.setFont(fp);
                RemoveLetterAccents.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 0;
                gc.gridwidth = 2;
                gc.insets=new Insets(5, 5, 5, 5);
                //gc.fill = GridBagConstraints.BOTH;
                gc.anchor = GridBagConstraints.LINE_START;
                RemoveLetterAccents.add(Remove_Letter_Accents,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 1;
                gc.gridwidth = 1;

                //gc.fill = GridBagConstraints.BOTH;
                //gc.insets=new Insets(0, 5, 0, 0);
                gc.anchor = GridBagConstraints.LINE_START;
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                Remove_Letter_but.setCursor(cur);
                RemoveLetterAccents.add(Remove_Letter_but,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 1;
                gc.gridwidth = 1;

                //gc.fill = GridBagConstraints.BOTH;]
                gc.insets=new Insets(0, 300, 0, 0);
                gc.anchor = GridBagConstraints.LINE_START;
                Clear.setCursor(cur);
                RemoveLetterAccents.add(Clear,gc);

                gc.weightx=1;
                gc.weighty=4;
                gc.gridx = 0;
                gc.gridy = 2;
                gc.fill = GridBagConstraints.BOTH;
                gc.gridwidth = 2;
                gc.anchor = GridBagConstraints.LINE_START;


                gc.insets=new Insets(5, 5, 5, 5);
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RemoveLetterAccents.add(scrollableTextArea1,gc);

                 gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;

                //gc.gridwidth = 1;
                //gc.insets=new Insets(0, 30, 0, 0);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                save.setCursor(cur);
                RemoveLetterAccents.add(load,gc);

                gc.weightx = 1;
                gc.weighty = 0.1;
                gc.gridx = 0;
                gc.gridy = 3;

                //gc.gridwidth = 1;
                gc.insets=new Insets(0, 180, 0, 0);
                gc.fill = GridBagConstraints.NONE;
                gc.anchor = GridBagConstraints.LINE_START;
                save.setCursor(cur);
                RemoveLetterAccents.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(RemoveLetterAccents,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                Clear.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                }
                });
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);
                    
                }
                });
                Remove_Letter_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        String ret=function.remove_letter_accents(s);
                        output.setText(ret);
                    }
                });
                
            }
        });
        //***************************Tool: Remove Lines Containing...**********************
        REMOVE_LINES_CONTAINING.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel RemoveLinesContaining = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,17);
                Font fp= new Font("Arial",Font.PLAIN,17);
                JLabel Remove_Lines_Containing = new JLabel("Tool: Remove Lines Containing...");
                   Remove_Lines_Containing.setFont(fb);
                JLabel Search_lines_for = new JLabel("Search lines for:");
                   Search_lines_for.setFont(fp);
                JTextField Search_lines_for_text = new JTextField();
                           Search_lines_for_text.setFont(fp);
                JLabel Add = new JLabel("Add");
                   Add.setFont(fp);
                JButton   and_but = new JButton("AND");
                   and_but.setFont(new Font("AND", Font.BOLD, 15));
                   and_but.setBackground(Color.BLUE);
                   and_but.setForeground(Color.WHITE);
                JButton   or_but = new JButton("OR");
                   or_but.setFont(new Font("OR", Font.BOLD, 15));
                   or_but.setBackground(Color.BLUE);
                   or_but.setForeground(Color.WHITE);
                JLabel search_field = new JLabel("search field.");
                   search_field.setFont(fp);
                JButton   reset_but = new JButton("RESET");
                   reset_but.setFont(new Font("RESET", Font.BOLD, 15));
                   reset_but.setBackground(Color.BLUE);
                   reset_but.setForeground(Color.WHITE);
                JCheckBox Enable_regular_expression = new JCheckBox("Enable regular expression search.");
                   Enable_regular_expression.setFont(fp);
                JButton   Remove_Lines_Containing_but = new JButton("Remove Lines Containing...");
                   Remove_Lines_Containing_but.setFont(new Font("Remove Lines Containing...", Font.BOLD, 15));
                   Remove_Lines_Containing_but.setBackground(Color.BLUE);
                   Remove_Lines_Containing_but.setForeground(Color.WHITE);
                JButton   Not_Containing_but = new JButton("Not Containing...");
                   Not_Containing_but.setFont(new Font("Not Containing...", Font.BOLD, 15));
                   Not_Containing_but.setBackground(Color.BLUE);
                   Not_Containing_but.setForeground(Color.WHITE);
                JCheckBox Case_sensitive = new JCheckBox("Case sensitive.");
                   Case_sensitive.setFont(fp);
                JCheckBox Display_removed = new JCheckBox("Display_removed.");
                   Display_removed.setFont(fp);
                JButton   clear = new JButton("Clear");
                clear.setFont(new Font("Clear", Font.BOLD, 15));
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                JTextArea output = new JTextArea(
                "Input Box - Enter your line delimited text here.\n"
                        +"Enter your search text in the \"Search"
                        + " lines for\" field above. e.g. Enter the word \"text\" to remove lines containing the word \"text\".\n"
                        +"Click the \"Remove Lines Containing...\" button and all lines containing your"
                        + " specified search text will be removed.\n"
                        +"Click the \"Not Containing...\" button and all lines not containing your specified search "
                        + "text will be removed.\n"
                        +"To search for lines containing \"cats AND dogs\" or \"cats OR dogs\" click either"
                        + " the \"AND\" or \"OR\" button to add an AND/OR search field.\n"
                        +"You can add many AND/OR fields as required to search for lines"
                        + " containing (cats AND dogs AND birds), (cats OR dogs OR birds), etc.\n"
                        +"Click \"Reset\" to remove added search fields. Check \"Case sensitive\" for case sensitive results.\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only"
                        + " your computer will see or process your data input/output.\n"
                );
                output.setFont(fp);
                JButton  load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 15));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);
                 JButton  save = new JButton("Save As");
                save.setFont(new Font("Save As", Font.BOLD, 15));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);

                RemoveLinesContaining.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Remove_Lines_Containing,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Search_lines_for,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Search_lines_for_text,gc);

                /*gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Add,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=25;
                gc.insets = new Insets(0, 40, 0, 0);
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                and_but.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(and_but,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=25;
                gc.insets = new Insets(0, 140, 0, 0);
                or_but.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(or_but,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 230, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(search_field,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=25;
                gc.insets = new Insets(0, 330, 0, 0);
                reset_but.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(reset_but,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 450, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Enable_regular_expression,gc);*/

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=25;
                gc.insets = new Insets(0, 0, 0, 0);
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                Remove_Lines_Containing_but.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Remove_Lines_Containing_but,gc);

                /*gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=25;
                gc.insets = new Insets(0, 260, 0, 0);
                Not_Containing_but.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Not_Containing_but,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 450, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Case_sensitive,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 590, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(Display_removed,gc);*/

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=25;
                gc.insets = new Insets(0, 260, 0, 0);
                clear.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(clear,gc);

                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=100;
                gc.ipadx=0;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RemoveLinesContaining.add(scrollableTextArea1,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=25;
                gc.insets = new Insets(0, 5, 0, 0);
                load.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(load,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=25;
                gc.insets = new Insets(0, 140, 0, 0);
                save.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RemoveLinesContaining.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(RemoveLinesContaining,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                clear.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                }
                });
                
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);   
                }
                });
                
                Remove_Lines_Containing_but.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //String s=input.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String word = Search_lines_for_text.getText();
                        String out = output.getText();
                        String res = function.remove_lines_conntaining(out,word);
                        output.setText(res);
                    }
                });
            }
        });
        //***************************Tool: Sort Text Lines*********************************
        SORT_TEXT_LINES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel SortTextLine = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,17);
                Font fp= new Font("Arial",Font.PLAIN,17);
                JLabel Sort_Text_Lines = new JLabel("Tool: Sort Text Lines");
                Sort_Text_Lines.setFont(fb);
                JLabel Sort_by_delimiter = new JLabel("Sort by delimiter*");
                Sort_by_delimiter.setFont(fp);
                JTextField delimiter = new JTextField("Enter delimiter here.");
                delimiter.setFont(fp);
                JTextField column_number = new JTextField("1");
                column_number.setFont(fp);
                JLabel   at_column_number = new JLabel("at column number");
                at_column_number.setFont(fp);
                JLabel   Blank_for_letters_space_for_words_etc = new JLabel("*Blank for letters, space for words, etc.");
                Blank_for_letters_space_for_words_etc.setFont(fp);
                JButton   alphabetical = new JButton("Alphabetical");
                alphabetical.setFont(new Font("Alphabetical", Font.BOLD, 17));
                alphabetical.setBackground(Color.BLUE);
                alphabetical.setForeground(Color.WHITE);
                JButton   cs = new JButton("Cs");
                cs.setFont(new Font("Cs", Font.BOLD, 17));
                cs.setBackground(Color.BLUE);
                cs.setForeground(Color.WHITE);
                JButton  natural = new JButton("Natural");
                natural.setFont(new Font("Natural", Font.BOLD, 17));
                natural.setBackground(Color.BLUE);
                natural.setForeground(Color.WHITE);
                JButton length = new JButton("Length");
                length.setFont(new Font("Length", Font.BOLD, 17));
                length.setBackground(Color.BLUE);
                length.setForeground(Color.WHITE);
                JButton  random = new JButton("Random");
                random.setFont(new Font("Random", Font.BOLD, 17));
                random.setBackground(Color.BLUE);
                random.setForeground(Color.WHITE);
                JButton   reverse = new JButton("Reverse");
                reverse.setFont(new Font("Reverse", Font.BOLD, 17));
                reverse.setBackground(Color.BLUE);
                reverse.setForeground(Color.WHITE);
                JButton  clear = new JButton("Clear");
                clear.setFont(new Font("Clear", Font.BOLD, 17));
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                JButton  load = new JButton("Load File");
                load.setFont(new Font("Load File", Font.BOLD, 17));
                load.setBackground(Color.BLUE);
                load.setForeground(Color.WHITE);
                JButton  save = new JButton("Save As");
                save.setFont(new Font("Save As", Font.BOLD, 17));
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                JTextArea  output = new JTextArea("Enter your text/list for sorting here.\n"
                                                    + "Click \"Alphabetical\" for case insensitive, ascending, alphabetical sorting. "
                                                            + "Click attached \"Cs\" button for case sensitive results.\n"
                                                    + "Click \"Natural\" for case insensitive natural sorting of lines. "
                                                            + "Click attached \"Cs\" button for case sensitive results.\n"
                                                    + "\"Natural\" sorting is resource intensive. Large inputs are slow to process. "
                                                            + "Use \"Alphabetical\" sort for large inputs.\n"
                                                    + "\"Sort by delimiter\" can sort by first, second ... last character, first, second ... "
                                                            + "last word in \"Alphabetical\" and \"Natural\" mode only.\n"
                                                    + "Default sorting column will be the first character of each new line. "
                                                            + "Default setting will contain an empty delimiter and column number of 1.\n"
                                                    + "To sort via the second character enter a column number of 2. "
                                                            + "Sort via second word by entering a space as delimiter and column number of 2.\n"
                                                    + "Click \"Length\" to sort lines by character length. "
                                                            + "Pre-sort alphabetically for length sorted results to be in alphabetical order.\n"
                                                    + "Click \"Random\" to randomize line order.\n"
                                                    + "Click \"Reverse\" to reverse current line order. Use to create descending order from ascending sorted lists.\n"
                                                    + "Note: For files too large to successfully load into this text field, use the \"Big File Tool\" link below.\n"
                                                    + "Privacy of Data: This tool is built-with and functions-in Client Side "
                                                            + "JavaScripting, so only your computer will see or process your data input/output.\n");
                output.setFont(fp);
                SortTextLine.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                gc.insets = new Insets(5, 5, 5, 5);
                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                SortTextLine.add(Sort_Text_Lines,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                SortTextLine.add(Sort_by_delimiter,gc);


                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=17;
                gc.ipadx=100;
                gc.insets = new Insets(0, 140, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                SortTextLine.add(delimiter,gc);


                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 400, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                SortTextLine.add(at_column_number,gc);



                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=17;
                gc.ipadx=100;
                gc.insets = new Insets(0, 540, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                SortTextLine.add(column_number,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 660, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                SortTextLine.add(Blank_for_letters_space_for_words_etc,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                alphabetical.setCursor(cur);
                SortTextLine.add(alphabetical,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 140, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                cs.setCursor(cur);
                SortTextLine.add(cs,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 210, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                natural.setCursor(cur);
                SortTextLine.add(natural,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 310, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                length.setCursor(cur);
                SortTextLine.add(length,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 410, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                random.setCursor(cur);
                SortTextLine.add(random,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 520, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                reverse.setCursor(cur);
                SortTextLine.add(reverse,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 630, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                clear.setCursor(cur);
                SortTextLine.add(clear,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=100;
                gc.ipadx =100;
                gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LAST_LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                SortTextLine.add(scrollableTextArea1,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                load.setCursor(cur);
                SortTextLine.add(load,gc);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 120, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur);
                SortTextLine.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(SortTextLine,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                clear.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    output.setText(null);
                }
                });
                save.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.saveAs(output);
                    
                }
                });
                load.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    TextEditor te=new TextEditor();
                    te.loadfile(output);
                    
                }
                });
            }
        });
        //***************************Tool: ASCII to Unicode Converter**********************
        ASCII_TO_UNICODE_CONVERTER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                //window.getContentPane().add(PrefixSuffixPanel,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        //***************************Tool: Binary Code Translator**************************
        BINARY_CODE_TRANSLATER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel BinaryCodeTranslator = new JPanel();
                BinaryCodeTranslator.setLayout(new GridBagLayout());
                //setBackground(Color.WHITE);
                GridBagConstraints gc = new GridBagConstraints();
                gc.insets= new Insets(0, 5, 0, 5);
                JLabel toolname = new JLabel("Tool: Binary Code Translator");
                Font f= new Font("Arial",Font.BOLD,17);
                toolname.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                BinaryCodeTranslator.add(toolname,gc);

                JButton texttobinary = new JButton("Text to Binary");
                texttobinary.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                texttobinary.setCursor(cur2);
                texttobinary.setBackground(Color.BLUE);
                texttobinary.setForeground(Color.WHITE);
                BinaryCodeTranslator.add(texttobinary,gc);

                /*JButton binarytotext = new JButton("Binary to Text");
                binarytotext.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                binarytotext.setCursor(cur2);
                binarytotext.setBackground(Color.BLUE);
                binarytotext.setForeground(Color.WHITE);
                BinaryCodeTranslator.add(binarytotext,gc);*/

                JCheckBox spacebwbytes = new JCheckBox("Space between bytes.");
                f= new Font("Arial",Font.PLAIN,17);
                spacebwbytes.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                spacebwbytes.setSelected(true);
                BinaryCodeTranslator.add(spacebwbytes,gc);

                JButton clear = new JButton("Clear");
                f= new Font("Arial",Font.BOLD,17);
                clear.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=3;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                clear.setCursor(cur2);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                BinaryCodeTranslator.add(clear,gc);

                JTextArea output = new JTextArea("Enter your text to be obfuscated into binary code or decoded from binary code back into text.\n" +
                                                    "Test by click the \"Text to Binary\" button and watch this text be converted into binary code.\n" +
                                                    "Then click the \"Binary to Text\" button and watch the binary code be converted back into text.\n" +
                                                    "Checking \"Space between bytes.\" will separate binary bytes with a space. (e.g. \"01100101 00101110 01100111 00101110\" )\n" +
                                                    "The \"Space between bytes.\" mode will allow easier decoding since the first bit of each byte can be easily identified.\n" +
                                                    "Decoding must always start with the first bit of a complete byte or erroneous results will display.\n" +
                                                    "WARNING! For entertainment purposes only. (i.e. Geeky looking text obfuscation.)\n" +
                                                    "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f= new Font("Arial",Font.PLAIN,17);
                output.setFont(f);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=450;
                gc.gridwidth=4;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                BinaryCodeTranslator.add(scrollableTextArea1,gc);

                JButton loadfile = new JButton("Load File");
                f= new Font("Arial",Font.BOLD,17);
                loadfile.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                loadfile.setCursor(cur2);
                loadfile.setBackground(Color.BLUE);
                loadfile.setForeground(Color.WHITE);
                BinaryCodeTranslator.add(loadfile,gc);
                
                JButton save = new JButton("Save As");
                f= new Font("Arial",Font.BOLD,17);
                save.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur2);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                BinaryCodeTranslator.add(save,gc);
                
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(BinaryCodeTranslator,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                loadfile.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.loadfile(output);

                    }
                });
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        output.setText(null);
                    }
                });
                texttobinary.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        boolean space = spacebwbytes.isSelected();
                        String ret=function.tobinary(s,space);
                        output.setText(ret);
                    }
                });
                
            }
        });
        //***************************Tool: Disemvowel Tool*********************************
        DISEMVOWEL_TOOL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel DisemvowelTool = new JPanel();
                DisemvowelTool.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font f= new Font("Arial",Font.BOLD,17);
                JLabel toolname = new JLabel("Tool: Disemvowel Tool");
                toolname.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;  
                DisemvowelTool.add(toolname,gc);

                JLabel Removeletters = new JLabel("Remove letters:");
                f= new Font("Arial",Font.PLAIN,17);
                Removeletters.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                DisemvowelTool.add(Removeletters,gc);

                JTextField aeiou = new JTextField("aeiou");
                aeiou.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.ipadx=100;
                gc.ipady=16;
                DisemvowelTool.add(aeiou,gc);

                JButton Disemvowel = new JButton("Disemvowel");
                f= new Font("Arial",Font.BOLD,17);
                Disemvowel.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=2;
                gc.gridy=1;
                gc.ipadx=0;
                gc.ipady=0;
                Disemvowel.setBackground(Color.BLUE);
                Disemvowel.setForeground(Color.WHITE);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                Disemvowel.setCursor(cur2);
                DisemvowelTool.add(Disemvowel,gc);

                JButton Clear = new JButton("Clear");
                f= new Font("Arial",Font.BOLD,17);
                Clear.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=3;
                gc.gridy=1;
                Clear.setBackground(Color.BLUE);
                Clear.setForeground(Color.WHITE);
                Clear.setCursor(cur2);
                DisemvowelTool.add(Clear,gc);

                JTextArea input = new JTextArea("Enter text here and click \"Disemvowel\" button to remove vowels \"aeiou\" from text.\n" +
                                                "Any group of letters can be removed by entering them into the \"Remove letters\" field.\n" +
                                                "Disemvoweled word can be revowled by entering it into the \"Enter disemvoweled word\" field and clicking \"ReEmVowel\" button.\n" +
                                                "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f = new Font("Arial",Font.PLAIN,17);
                input.setFont(f);
                gc.weightx=1;
                gc.weighty=6;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=390;
                gc.gridwidth=4;
                gc.insets= new Insets(0, 5, 0, 5);
                gc.anchor=GridBagConstraints.LINE_START;
                gc.fill=GridBagConstraints.BOTH;
                JScrollPane scrollableTextArea1 = new JScrollPane(input);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                DisemvowelTool.add(scrollableTextArea1,gc);

                /*JLabel Enterdisemvoweledword = new JLabel("Enter disemvoweled word:");
                Enterdisemvoweledword.setFont(f);
                gc.weightx=0;
                gc.weighty=0;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;  
                DisemvowelTool.add(Enterdisemvoweledword,gc);

                JTextField disemvoweledword = new JTextField();
                gc.gridx=2;
                gc.gridy=3;
                gc.ipadx=200;
                gc.ipady=20;
                DisemvowelTool.add(disemvoweledword,gc);

                JButton remevowel = new JButton("ReMeVowel");
                f= new Font("Arial",Font.BOLD,17);
                remevowel.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=3;
                gc.gridy=3;
                gc.ipadx=0;
                gc.ipady=0;
                gc.insets= new Insets(5, 85, 5, 5);
                remevowel.setBackground(Color.BLUE);
                remevowel.setForeground(Color.WHITE);
                remevowel.setCursor(cur2);
                DisemvowelTool.add(remevowel,gc);

                JTextField ReEmVoweled = new JTextField("ReEmVoweled results will display here.");
                f= new Font("Arial",Font.PLAIN,17);
                ReEmVoweled.setFont(f);
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=20;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.gridwidth=6;
                DisemvowelTool.add(ReEmVoweled,gc);*/
                
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(DisemvowelTool,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                Clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        input.setText(null);
                        //prefix.setText(null);
                        //suffix.setText(null);
                        //output.setText(null);
                    }
                });
                
                Disemvowel.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //String s=input.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        //output.setText(ret);
                        String s = input.getText();
                        String remove = aeiou.getText()  ;
                        String res=function.disemble(s,remove);
                        input.setText(res);
                    }
                });
            }
        });
        //***************************Tool: Encryption Generator****************************
        ENCRAYPTION_GENERATOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel EncryptionGenerator = new JPanel();
                EncryptionGenerator.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font f= new Font("Arial",Font.BOLD,17);
                gc.insets= new Insets(0, 5, 0, 0);
                JLabel toolname = new JLabel("Tool: Encryption Generator");
                toolname.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;  
                EncryptionGenerator.add(toolname,gc);

                JButton EncryptText = new JButton("Encrypt Text");
                EncryptText.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                EncryptText.setBackground(Color.BLUE);
                EncryptText.setForeground(Color.WHITE);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                EncryptText.setCursor(cur2);
                EncryptionGenerator.add(EncryptText,gc);

                JButton DecryptText = new JButton("Decrypt Text");
                DecryptText.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                DecryptText.setBackground(Color.BLUE);
                DecryptText.setForeground(Color.WHITE);
                DecryptText.setCursor(cur2);
                EncryptionGenerator.add(DecryptText,gc);

                JLabel Password = new JLabel("Password:");
                f= new Font("Arial",Font.PLAIN,17);
                Password.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=1; 
                EncryptionGenerator.add(Password,gc);

                JTextField pass = new JTextField();
                pass.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=3;
                gc.gridy=1;
                gc.ipadx=200;
                gc.ipady=20; 
                EncryptionGenerator.add(pass,gc);


                JLabel pl = new JLabel("0");
                pl.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=4;
                gc.gridy=1;
                gc.ipadx=20;
                gc.ipady=20; 
                EncryptionGenerator.add(pl,gc);

                JButton GeneratePassword = new JButton("Generate Password");
                f= new Font("Arial",Font.BOLD,17);
                GeneratePassword.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=5;
                gc.gridy=1;
                gc.ipady=0;
                GeneratePassword.setBackground(Color.BLUE);
                GeneratePassword.setForeground(Color.WHITE);
                GeneratePassword.setCursor(cur2);
                EncryptionGenerator.add(GeneratePassword,gc);

                JButton clear = new JButton("Clear");
                f= new Font("Arial",Font.BOLD,17);
                clear.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=6;
                gc.gridy=1;
                gc.ipady=0;
                gc.insets= new Insets(0, 5, 0, 5);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                clear.setCursor(cur2);
                EncryptionGenerator.add(clear,gc);

                JTextArea output = new JTextArea("Enter text to be encrypted or decrypted here.\n" +
                                                "Enter encryption/decryption password (up to 16 characters) into the \"Password\" field above.\n" +
                                                "Text will be encrypted/decrypted using Tiny Encryption Algorithm (TEA) and base64.\n" +
                                                "Read more about TEA at: http://en.wikipedia.org/wiki/Tiny_Encryption_Algorithm\n" +
                                                "Test by entering a password and click \"Encrypt Text\" button to encrypt this default text. Then click \"Decrypt Text\" to decrypt.\n" +
                                                "\"Generate Password\" will generate a 16 character password. Remember to copy your newly generated password because it's unrecoverable!\n" +
                                                "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f= new Font("Arial",Font.PLAIN,17);
                output.setFont(f);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=2;
                gc.gridwidth=8;
                gc.ipady=450;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                EncryptionGenerator.add(scrollableTextArea1,gc);

                JButton loadfile = new JButton("Load File");
                f = new Font("Arial",Font.BOLD,17);
                loadfile.setFont(f);
                loadfile.setBackground(Color.BLUE);
                loadfile.setForeground(Color.WHITE);
                loadfile.setCursor(cur2);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=7;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                EncryptionGenerator.add(loadfile,gc);
                
                JButton saveas = new JButton("Save As");
                f = new Font("Arial",Font.BOLD,17);
                saveas.setFont(f);
                saveas.setBackground(Color.BLUE);
                saveas.setForeground(Color.WHITE);
                saveas.setCursor(cur2);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.ipady=7;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                EncryptionGenerator.add(saveas,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(EncryptionGenerator,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                saveas.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                loadfile.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.loadfile(output);

                    }
                });
            }
        });
        //***************************Tool: Reverse Text Generator**************************
        REVERSE_TEXT_GENERATOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel ReverseTextGenerator = new JPanel();
                ReverseTextGenerator.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font f= new Font("Arial",Font.BOLD,17);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                gc.insets= new Insets(0, 5, 0, 5);
                JLabel toolname = new JLabel("Tool: Reverse Text Generator");
                toolname.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                ReverseTextGenerator.add(toolname,gc);

                JButton reversetext = new JButton("Reverse Text");
                reversetext.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                reversetext.setCursor(cur2);
                reversetext.setBackground(Color.BLUE);
                reversetext.setForeground(Color.WHITE);
                ReverseTextGenerator.add(reversetext,gc);

                JButton fliptext = new JButton("Flip Text");
                fliptext.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                fliptext.setCursor(cur2);
                fliptext.setBackground(Color.BLUE);
                fliptext.setForeground(Color.WHITE);
                ReverseTextGenerator.add(fliptext,gc);

                JButton reversewording = new JButton("Reverse Wording");
                reversewording.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=2;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                reversewording.setCursor(cur2);
                reversewording.setBackground(Color.BLUE);
                reversewording.setForeground(Color.WHITE);
                ReverseTextGenerator.add(reversewording,gc);

                JButton flipwording = new JButton("Flip Wording");
                flipwording.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=3;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                flipwording.setCursor(cur2);
                flipwording.setBackground(Color.BLUE);
                flipwording.setForeground(Color.WHITE);
                ReverseTextGenerator.add(flipwording,gc);

                JButton reverseeachwordlettering = new JButton("Reverse Each Word's Lettering");
                reverseeachwordlettering.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=4;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                reverseeachwordlettering.setCursor(cur2);
                reverseeachwordlettering.setBackground(Color.BLUE);
                reverseeachwordlettering.setForeground(Color.WHITE);
                ReverseTextGenerator.add(reverseeachwordlettering,gc);

                /*JButton upsidedown = new JButton("Upside Down");
                upsidedown.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=5;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                upsidedown.setCursor(cur2);
                upsidedown.setBackground(Color.BLUE);
                upsidedown.setForeground(Color.WHITE);
                ReverseTextGenerator.add(upsidedown,gc);*/

                JButton clear = new JButton("Clear");
                clear.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=5;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                clear.setCursor(cur2);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                ReverseTextGenerator.add(clear,gc);

                JTextArea output = new JTextArea("Enter your text to be reversed or unreversed here.\n" +
                                                    "Test by click a reversing function button above to watch this text be reversed.\n" +
                                                    "Click the same function button again to watch the reversed text be unreversed.\n" +
                                                    "\"Reverse Text\" will reverse the entire text string.\n" +
                                                    "\"Flip Text\" will reverse each text line. Useful for reversing a list of words.\n" +
                                                    "\"Reverse Wording\" will reverse the entire word order without reversing the word lettering.\n" +
                                                    "\"Flip Wording\" will reverse the word order of each text line.\n" +
                                                    "\"Reverse Each Word's Lettering\" will reverse each word's lettering without changing the word order or punctuation.\n" +
                                                    "\"Upside Down\" will create the illusion of an upside down page/text via string reversal and character substitution for letters a to z.\n" +
                                                    "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f= new Font("Arial",Font.PLAIN,17);
                output.setFont(f);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=450;
                gc.gridwidth=7;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                ReverseTextGenerator.add(scrollableTextArea1,gc);

                JButton loadfile = new JButton("Load File");
                f= new Font("Arial",Font.BOLD,17);
                loadfile.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                loadfile.setCursor(cur2);
                loadfile.setBackground(Color.BLUE);
                loadfile.setForeground(Color.WHITE);
                ReverseTextGenerator.add(loadfile,gc);
                
                JButton save = new JButton("Save As");
                f= new Font("Arial",Font.BOLD,17);
                save.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur2);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                ReverseTextGenerator.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(ReverseTextGenerator,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                loadfile.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.loadfile(output);

                    }
                });
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        output.setText(null);
                    }
                });
                
                reversetext.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String res = function.reversetext(s);
                        output.setText(res);
                    }
                });
                
                fliptext.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String res = function.fliptext(s);
                        output.setText(res);
                    }
                });
                
                reversewording.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String res = function.reversewords(s);
                        output.setText(res);
                    }
                });
                
                flipwording.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String res = function.flipwords(s);
                        output.setText(res);
                    }
                });
                
                reverseeachwordlettering.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String res = function.reverselettering(s);
                        output.setText(res);
                    }
                });
            }
        });
        //***************************Tool: ROT13 Caesar Cipher*****************************
        ROT13_CASAR_CIPHER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel ROT13CaesarCipher = new JPanel();
                ROT13CaesarCipher.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font f= new Font("Arial",Font.BOLD,17);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                gc.insets= new Insets(0, 5, 0, 5);
                JLabel toolname = new JLabel("Tool: ROT13 Caesar Cipher");
                toolname.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                ROT13CaesarCipher.add(toolname,gc);

                JButton encodedecode = new JButton("Encode/Decode ROOT13");
                encodedecode.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                encodedecode.setCursor(cur2);
                encodedecode.setBackground(Color.BLUE);
                encodedecode.setForeground(Color.WHITE);
                ROT13CaesarCipher.add(encodedecode,gc);

                JButton clear = new JButton("Clear");
                clear.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                clear.setCursor(cur2);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                ROT13CaesarCipher.add(clear,gc);

                JTextArea output = new JTextArea("Enter your plaintext or ROT13 ciphertext here and click the \"ROT13 Encode/Decode\" button above.\n" +
                                                    "Each letter (A-Z, a-z) will be shifted upward by 13 places, thus \"a\" will become \"n\" and \"n\" will become \"a\".\n" +
                                                    "All other characters (i.e. numbers, punctuation and extended ascii characters) are not processed and will remain in their original positions.\n" +
                                                    "Test by clicking the \"Encode/Decode ROT13\" button above to encode this default text into ROT13 ciphertext.\n" +
                                                    "Then click the \"Encode/Decode ROT13\" button again to decode the ROT13 ciphertext back into the original plaintext.\n" +
                                                    "WARNING: ROT13 encryption is obfuscated but not secure, use for entertainment purposes only. (i.e. obfuscated webpage text, games, etc.)\n" +
                                                    "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f= new Font("Arial",Font.PLAIN,17);
                output.setFont(f);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=450;
                gc.gridwidth=3;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                ROT13CaesarCipher.add(scrollableTextArea1,gc);

                JButton loadfile = new JButton("Load File");
                f= new Font("Arial",Font.BOLD,17);
                loadfile.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                loadfile.setCursor(cur2);
                loadfile.setBackground(Color.BLUE);
                loadfile.setForeground(Color.WHITE);
                ROT13CaesarCipher.add(loadfile,gc);
                
                JButton save = new JButton("Save As");
                f= new Font("Arial",Font.BOLD,17);
                save.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur2);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                ROT13CaesarCipher.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(ROT13CaesarCipher,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                loadfile.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.loadfile(output);

                    }
                });
                
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //input.setText(null);
                        //prefix.setText(null);
                        //suffix.setText(null);
                        output.setText(null);
                    }
                });
                
                encodedecode.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s = output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String res = function.generaterot13(s);
                        output.setText(res);
                    }
                });
            }
        });
        //***************************Tool: Word Scrambler / Descrambler********************
        WORD_SCRAMBLER_UNSCRAMBLER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel WordScrambleDescrambler = new JPanel();
                WordScrambleDescrambler.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font fb= new Font("Arial",Font.BOLD,17);
                Font fp= new Font("Arial",Font.PLAIN,17);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                gc.insets= new Insets(5, 5, 5, 5);
                JLabel toolname = new JLabel("Tool: Word Scrambler / Descrambler");
                toolname.setFont(fb);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                WordScrambleDescrambler.add(toolname,gc);

                JButton Scramble = new JButton("Scramble each word's lettering.");
                Scramble.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                Scramble.setCursor(cur2);
                Scramble.setBackground(Color.BLUE);
                Scramble.setForeground(Color.WHITE);
                WordScrambleDescrambler.add(Scramble,gc);

                /*JButton Descramble = new JButton("Descramble words.");
                Descramble.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                Descramble.setCursor(cur2);
                Descramble.setBackground(Color.BLUE);
                Descramble.setForeground(Color.WHITE);
                WordScrambleDescrambler.add(Descramble,gc);*/

                JButton clear = new JButton("Clear");
                clear.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.insets= new Insets(5, 5, 5, 5);
                clear.setCursor(cur2);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                WordScrambleDescrambler.add(clear,gc);

                JTextArea output = new JTextArea("Enter text for word scrambling/descrambling here. Words must only contain letters a to z separated by a space, line break, symbol, number, etc.\n" +
                                                    "Click \"Scramble each word's lettering.\" to randomize each word's lettering without affecting capitalization of first letter, punctuation or formatting.\n" +
                                                    "Click \"Descramble words.\" to descramble commonly found words within this text box. Descrambled words will be all lower case.\n" +
                                                    "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                output.setFont(fp);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=450;
                gc.gridwidth=4;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea = new JScrollPane(output);  
                scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                WordScrambleDescrambler.add(scrollableTextArea,gc);

                JButton loadfile = new JButton("Load File");
                loadfile.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                loadfile.setCursor(cur2);
                loadfile.setBackground(Color.BLUE);
                loadfile.setForeground(Color.WHITE);
                WordScrambleDescrambler.add(loadfile,gc);

                JButton save = new JButton("Save As");
                save.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur2);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                WordScrambleDescrambler.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(WordScrambleDescrambler,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                loadfile.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.loadfile(output);

                    }
                });
                
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //input.setText(null);
                        //prefix.setText(null);
                        //suffix.setText(null);
                        output.setText(null);
                    }
                });
                
                Scramble.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String res = function.scramble(s);
                        output.setText(res);
                    }
                });
            }
        });
        //***************************Tool: Random Line Picker******************************
        RANDOM_LINE_PICKER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel RandomLinePicker = new JPanel();
                RandomLinePicker.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font f= new Font("Arial",Font.BOLD,17);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                gc.insets= new Insets(5, 5, 5, 5);
                JLabel toolname = new JLabel("Tool: Random Line Picker");
                toolname.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                RandomLinePicker.add(toolname,gc);

                /*JButton loadfile = new JButton("Load File");
                loadfile.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                loadfile.setCursor(cur2);
                loadfile.setBackground(Color.BLUE);
                loadfile.setForeground(Color.WHITE);
                RandomLinePicker.add(loadfile,gc);

                JButton shuffleinput = new JButton("Shuffle Input");
                shuffleinput.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                shuffleinput.setCursor(cur2);
                shuffleinput.setBackground(Color.BLUE);
                shuffleinput.setForeground(Color.WHITE);
                RandomLinePicker.add(shuffleinput,gc);

                JLabel noofline = new JLabel("6 lines remain.");
                noofline.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=2;
                gc.gridy=1;
                RandomLinePicker.add(noofline,gc);*/

                JTextArea input = new JTextArea("Input Box\n" +
                                                "Enter your list for random picking with each item/name on a new line.\n" +
                                                "Each click of the \"Pick Random Line\" button will randomly select a line and sequentially display it within the picked box below.\n" +
                                                "Picked lines will be automatically removed from this input box and current line count will display in the \"lines remain.\" box below.\n" +
                                                "Click \"Clear Current Picks\" to clear the current picks. Click \"Shuffle Input\" to randomly shuffle input box line order.\n" +
                                                "Text with items separated by commas, spaces, etc. can be converted into line breaks using the \"Add/Remove Line Breaks\" tool.");
                f= new Font("Arial",Font.PLAIN,17);
                input.setFont(f);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=150;
                gc.gridwidth=7;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(input);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RandomLinePicker.add(scrollableTextArea1,gc);

                JButton pickrandomline = new JButton("Pick Random Line");
                f= new Font("Arial",Font.BOLD,17);
                pickrandomline.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                pickrandomline.setCursor(cur2);
                pickrandomline.setBackground(Color.BLUE);
                pickrandomline.setForeground(Color.WHITE);
                RandomLinePicker.add(pickrandomline,gc);

                /*JButton clearcurrentpicks = new JButton("Clear Current Picks");
                clearcurrentpicks.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                clearcurrentpicks.setCursor(cur2);
                clearcurrentpicks.setBackground(Color.BLUE);
                clearcurrentpicks.setForeground(Color.WHITE);
                RandomLinePicker.add(clearcurrentpicks,gc);*/

                JButton clear = new JButton("Clear");
                clear.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.ipady=0;
                gc.insets= new Insets(5, 75, 5, 5);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                clear.setCursor(cur2);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                RandomLinePicker.add(clear,gc);

                /*JCheckBox numberpicks = new JCheckBox("Number Picks");
                numberpicks.setFont(f);
                numberpicks.setSelected(true);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=3;
                gc.gridy=3;
                gc.ipady=0;
                gc.insets= new Insets(5, 55, 5, 5);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RandomLinePicker.add(numberpicks,gc);*/

                JTextArea output = new JTextArea("Picked Box\n" +
                                                    "Your random picks will display here.\n" +
                                                    "Test picking a random line by clicking \"Pick Random Line\" and watch a line of default input text appear in this picked box.\n" +
                                                    "Picked items can be printed by clicking the \"Print Picks\" button above.\n" +
                                                    "NOTICE: Tool uses Javascript method Math.random() pseudorandom number generator to obtain pick. Do not use for critical random results.\n" +
                                                    "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f= new Font("Arial",Font.PLAIN,17);
                output.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=150;
                gc.gridwidth=7;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea = new JScrollPane(output);  
                scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RandomLinePicker.add(scrollableTextArea,gc);

                JButton save = new JButton("Save As");
                f= new Font("Arial",Font.BOLD,17);
                save.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=0;
                gc.gridy=5;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur2);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                RandomLinePicker.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(RandomLinePicker,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                /*loadfile.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.loadfile(input);

                    }
                });*/
                /*clearcurrentpicks.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        output.setText("");
                    }
                });*/
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        output.setText("");
                        input.setText("");
                    }
                });
                
                pickrandomline.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=input.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        int no = 2 ;
                        boolean numbered = true ;
                        String res = function.pick_random_line(s,no,numbered);
                        output.setText(res);
                    }
                });
            }
        });
        //***************************Tool: Random Number Generator*************************
        RANDOM_NUMBER_GENERATOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel RanddomNumberGenerator = new JPanel();
                RanddomNumberGenerator.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font f= new Font("Arial",Font.BOLD,17);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                gc.insets= new Insets(5, 5, 5, 5);
                JLabel toolname = new JLabel("Tool: Random Number Generator");
                toolname.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                RanddomNumberGenerator.add(toolname,gc);

                JLabel generate = new JLabel("Generate");
                f= new Font("Arial",Font.PLAIN,17);
                generate.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RanddomNumberGenerator.add(generate,gc);

                JTextField number = new JTextField("10");
                number.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=1;
                gc.ipadx=100;
                gc.ipady=18;
                RanddomNumberGenerator.add(number,gc);

                JLabel low = new JLabel("random numbers from low of");
                f= new Font("Arial",Font.PLAIN,17);
                low.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=1;
                gc.ipadx=0;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RanddomNumberGenerator.add(low,gc);

                JTextField lowno = new JTextField("1");
                lowno.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=3;
                gc.ipadx=100;
                gc.ipady=18;
                gc.gridy=1;
                RanddomNumberGenerator.add(lowno,gc);

                JLabel high = new JLabel("to high of");
                f= new Font("Arial",Font.PLAIN,17);
                high.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=4;
                gc.gridy=1;
                gc.ipadx=0;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RanddomNumberGenerator.add(high,gc);


                JTextField highno = new JTextField("10");
                highno.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=5;
                gc.gridy=1;
                gc.ipadx=100;
                gc.ipady=18;
                RanddomNumberGenerator.add(highno,gc);

                JLabel prefix = new JLabel("Prefix:");
                f= new Font("Arial",Font.PLAIN,17);
                prefix.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipadx=0;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RanddomNumberGenerator.add(prefix,gc);

                JTextField prefixn = new JTextField("");
                prefixn.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=2;
                gc.ipadx=100;
                gc.ipady=18;
                RanddomNumberGenerator.add(prefixn,gc);

                JLabel andorsuffix = new JLabel("and/or suffix: ");
                f= new Font("Arial",Font.PLAIN,17);
                andorsuffix.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=2;
                gc.ipadx=0;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RanddomNumberGenerator.add(andorsuffix,gc);

                JTextField suffix = new JTextField("");
                lowno.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=3;
                gc.ipadx=100;
                gc.ipady=18;
                gc.gridy=2;
                RanddomNumberGenerator.add(suffix,gc);

                JLabel enjw = new JLabel("each number. Join with:");
                f= new Font("Arial",Font.PLAIN,17);
                enjw.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=4;
                gc.gridy=2;
                gc.ipadx=0;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RanddomNumberGenerator.add(enjw,gc);


                JTextField joinwith = new JTextField("\\x");
                joinwith.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=5;
                gc.gridy=2;
                gc.ipadx=100;
                gc.ipady=18;
                RanddomNumberGenerator.add(joinwith,gc);

                JButton generaterandomnumber = new JButton("Generate Random Number");
                f= new Font("Arial",Font.BOLD,17);
                generaterandomnumber.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipadx=0;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                generaterandomnumber.setCursor(cur2);
                generaterandomnumber.setBackground(Color.BLUE);
                generaterandomnumber.setForeground(Color.WHITE);
                RanddomNumberGenerator.add(generaterandomnumber,gc);

                JCheckBox pad = new JCheckBox("Pad numbers.");
                f= new Font("Arial",Font.PLAIN,17);
                pad.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.ipadx=0;
                gc.ipady=0;
                RanddomNumberGenerator.add(pad,gc);

                /*JLabel wrapis = new JLabel("Wrap is");
                wrapis.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=3;
                gc.ipadx=0;
                gc.ipady=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RanddomNumberGenerator.add(wrapis,gc);

                JRadioButton on = new JRadioButton("on");
                f= new Font("Arial",Font.PLAIN,20);
                on.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=3;
                gc.insets= new Insets(5, 85, 5, 5);
                RanddomNumberGenerator.add(on,gc);
                JRadioButton off = new JRadioButton("off");
                off.setFont(f);
                off.setSelected(true);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=3;
                gc.insets= new Insets(5, 135, 5, 5);
                RanddomNumberGenerator.add(off,gc);
                ButtonGroup gr = new ButtonGroup();
                gr.add(on);
                gr.add(off);*/

                JButton clear = new JButton("Clear");
                f= new Font("Arial",Font.BOLD,17);
                clear.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=3;
                gc.insets= new Insets(5, 5, 5, 5);
                clear.setCursor(cur2);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                RanddomNumberGenerator.add(clear,gc);

                JTextArea output = new JTextArea("Output Box - Random number output will display here.\n" +
                                                    "Enter how many random number generations you require into the \"Generate\" box. (Default is 10.)\n" +
                                                    "Enter the your required low/high numeric range into the \"low\", \"high\" boxes. (Default range is 1 low to 1000 high.)\n" +
                                                    "Checking the \"Pad numbers.\" checkbox will pad all random numbers to the highest value. (e.g. 001 ... 010 ... 100)\n" +
                                                    "Entering \\x into prefix, suffix, join field will produce a line break.\n" +
                                                    "Test this tool by clicking the \"Generate Random Numbers\" button and watch 10 random numbers between 1 to 1000 appear in the output box.\n" +
                                                    "NOTICE: Tool uses Javascript method Math.random() pseudorandom generator to obtain random number. Do not use for critical random results.\n" +
                                                    "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f= new Font("Arial",Font.PLAIN,17);
                output.setFont(f);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=400;
                gc.gridwidth=6;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RanddomNumberGenerator.add(scrollableTextArea1,gc);

                JButton save = new JButton("Save As");
                f= new Font("Arial",Font.BOLD,17);
                save.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=0;
                gc.gridy=5;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur2);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                RanddomNumberGenerator.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(RanddomNumberGenerator,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        output.setText("");
                    }
                });
                generaterandomnumber.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String nn=number.getText();
                        String min=lowno.getText();
                        String max=highno.getText();
                        String pre=prefixn.getText();
                        String suf=suffix.getText();
                        String join= joinwith.getText();
                        boolean pading = pad.isSelected();
                        String s=function.generate_numbers(nn ,min ,max , pre ,suf , join , pading);
                        output.setText(s);


                    }
                });
            }
        });
        //***************************Tool: Random String Generator*************************
        RANDOM_STRING_GENERATOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel RandomStringGenerator = new JPanel();
                RandomStringGenerator.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font fp= new Font("Arial",Font.PLAIN,17);
                Font fb= new Font("Arial",Font.BOLD,17);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                gc.insets= new Insets(5, 5, 5, 5);

                JLabel toolname = new JLabel("Tool: Random String Generator");
                toolname.setFont(fb);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                RandomStringGenerator.add(toolname,gc);

                JLabel objectinputbox = new JLabel("Object Input Box:");
                objectinputbox.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RandomStringGenerator.add(objectinputbox,gc);

                /*JLabel delimited = new JLabel("Each input object is delimited by:");
                delimited.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                RandomStringGenerator.add(delimited,gc);

                JTextField delimitedby = new JTextField("");
                delimitedby.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=2;
                gc.gridy=1;
                gc.ipadx=100;
                gc.ipady=18;
                RandomStringGenerator.add(delimitedby,gc);

                JCheckBox linebreak = new JCheckBox("line break.");
                linebreak.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=3;
                gc.gridy=1;
                gc.ipadx=0;
                gc.ipady=0;
                RandomStringGenerator.add(linebreak,gc);*/

                JTextArea input = new JTextArea("abcefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
                input.setFont(fp);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=100;
                gc.gridwidth=6;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(input);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RandomStringGenerator.add(scrollableTextArea1,gc);

                JLabel Generate = new JLabel("Generate");
                Generate.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RandomStringGenerator.add(Generate ,gc);

                JTextField Generateno = new JTextField("10");
                Generateno.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=18;
                gc.ipadx=100;
                gc.insets= new Insets(5, 80, 5, 5);
                RandomStringGenerator.add(Generateno ,gc);

                JLabel randomstrings  = new JLabel("random strings ");
                randomstrings.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets= new Insets(5, 190, 5, 5);
                RandomStringGenerator.add(randomstrings ,gc);

                JTextField length = new JTextField("14");
                length.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=18;
                gc.ipadx=100;
                gc.insets= new Insets(5, 300, 5, 5);
                RandomStringGenerator.add(length ,gc);

                JLabel prefix  = new JLabel(" objects in length. Add this prefix: ");
                prefix.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets= new Insets(5, 400, 5, 5);
                RandomStringGenerator.add(prefix ,gc);

                JTextField prefixtext = new JTextField("");
                prefixtext.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=18;
                gc.ipadx=100;
                gc.insets= new Insets(5, 642, 5, 5);
                RandomStringGenerator.add(prefixtext ,gc);

                JLabel suffix  = new JLabel("and/or suffix: ");
                suffix.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets= new Insets(5, 752, 5, 5);
                RandomStringGenerator.add(suffix ,gc);

                JTextField suffixtext = new JTextField();
                suffixtext.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=18;
                gc.ipadx=100;
                gc.insets= new Insets(5, 850, 5, 5);
                RandomStringGenerator.add(suffixtext ,gc);

                JLabel toeachstring  = new JLabel("to each string.");
                toeachstring.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets= new Insets(5, 960, 5, 5);
                RandomStringGenerator.add(toeachstring ,gc);

                /*JLabel stringwith  = new JLabel("Delimit objects within random strings with:");
                stringwith.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets= new Insets(5, 5, 5, 5);
                RandomStringGenerator.add(stringwith ,gc);

                JTextField stringwithtext = new JTextField("");
                stringwithtext.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=4;
                gc.ipady=18;
                gc.ipadx=100;
                gc.insets= new Insets(5, 50, 5, 5);
                RandomStringGenerator.add(stringwithtext ,gc);

                JLabel anddelimiteachrandomstringwith = new JLabel("and delimit each random string with:");
                anddelimiteachrandomstringwith.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets= new Insets(5, 160, 5, 5);
                RandomStringGenerator.add(anddelimiteachrandomstringwith ,gc);

                JTextField delimit = new JTextField("");
                delimit.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=3;
                gc.gridy=4;
                gc.ipady=18;
                gc.ipadx=100;
                gc.insets= new Insets(5, 70, 5, 5);
                RandomStringGenerator.add(delimit ,gc);

                JCheckBox linebrea = new JCheckBox("line break.");
                linebrea.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=4;
                gc.gridy=4;
                linebrea.setSelected(true);
                gc.insets= new Insets(5, 70, 5, 5);
                RandomStringGenerator.add(linebrea ,gc);*/

                JButton generate = new JButton("Generate random strings.");
                generate.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets= new Insets(5, 5, 5, 5);
                generate.setCursor(cur2);
                generate.setBackground(Color.BLUE);
                generate.setForeground(Color.WHITE);
                RandomStringGenerator.add(generate,gc);

                /*JLabel Outputwrapis = new JLabel("Output wrap is ");
                Outputwrapis.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=4;
                gc.insets= new Insets(5, 5, 5, 5);
                RandomStringGenerator.add(Outputwrapis,gc);

                JRadioButton on = new JRadioButton("on");
                on.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=4;
                gc.insets= new Insets(5, 115, 5, 5);
                RandomStringGenerator.add(on,gc);
                JRadioButton off = new JRadioButton("off");
                off.setFont(fb);
                off.setSelected(true);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=5;
                gc.insets= new Insets(5, 165, 5, 5);
                RandomStringGenerator.add(off,gc);
                ButtonGroup gr = new ButtonGroup();
                gr.add(on);
                gr.add(off);*/

                JButton clear = new JButton("Clear");
                clear.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=4;
                gc.insets= new Insets(5, 5, 5, 5);
                clear.setCursor(cur2);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                RandomStringGenerator.add(clear,gc);

                JTextArea output = new JTextArea("Output Box - Random strings/passwords will display here.\n" +
                                                    "Load objects used for random string generation into the \"Object Input Box\" above. Objects above can be characters, words, sentences, etc.\n" +
                                                    "Test by clicking the \"Generate random strings\" button above to generate 10, 14 character, random strings from the default input objects.\n" +
                                                    "NOTICE: Tool uses Javascript method Math.random() pseudorandom generator to obtain random string. Do not use for critical random results.\n" +
                                                    "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                output.setFont(fp);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=200;
                gc.gridwidth=6;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea = new JScrollPane(output);  
                scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                RandomStringGenerator.add(scrollableTextArea,gc);

                JButton save = new JButton("Save As");
                save.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=0;
                gc.gridy=6;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur2);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                RandomStringGenerator.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(RandomStringGenerator,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        output.setText("");
                        input.setText("");
                    }
                });
            }
        });
        //***************************Tool: String Randomizer*******************************
        STRING_RANDOMIZER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel StringRandomizer = new JPanel();
                StringRandomizer.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font fb= new Font("Arial",Font.BOLD,17);
                Font fp= new Font("Arial",Font.PLAIN,17);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                gc.insets= new Insets(5, 5, 5, 5);
                JLabel toolname = new JLabel("Tool: String Randomizer");
                toolname.setFont(fb);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                StringRandomizer.add(toolname,gc);

                JButton RandomizeString = new JButton("Randomize String");
                RandomizeString.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=1;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                RandomizeString.setCursor(cur2);
                RandomizeString.setBackground(Color.BLUE);
                RandomizeString.setForeground(Color.WHITE);
                StringRandomizer.add(RandomizeString,gc);

                /*JLabel Delimiter = new JLabel("Delimiter:");
                Delimiter.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                StringRandomizer.add(Delimiter,gc);

                JTextField delimitedby = new JTextField("");
                delimitedby.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.ipadx=100;
                gc.ipady=18;
                gc.insets= new Insets(5, 100, 5, 5);
                StringRandomizer.add(delimitedby,gc);

                JLabel Outputwrapis = new JLabel("Wrap is ");
                Outputwrapis.setFont(fp);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.ipadx=0;
                gc.ipady=0;
                gc.insets= new Insets(5, 215, 5, 5);
                StringRandomizer.add(Outputwrapis,gc);

                JRadioButton on = new JRadioButton("on");
                on.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.insets= new Insets(5, 275, 5, 5);
                StringRandomizer.add(on,gc);

                JRadioButton off = new JRadioButton("off");
                off.setSelected(true);
                off.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.insets= new Insets(5, 325, 5, 5);
                StringRandomizer.add(off,gc);
                ButtonGroup gr = new ButtonGroup();
                gr.add(on);
                gr.add(off);*/

                JButton clear = new JButton("Clear");
                clear.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=2;
                gc.gridy=1;
                gc.insets= new Insets(5, 5, 5, 5);
                clear.setCursor(cur2);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                StringRandomizer.add(clear,gc);

                JTextArea output = new JTextArea("Enter your text string(s) for randomization here with each string on a new line.\n" +
                                                    "Click \"Randomize String\" to randomize text string(s).\n" +
                                                    "Enter a delimiter to randomize string as delimited blocks of text. e.g. space will randomize word order. Leave blank to randomize all characters.\n" +
                                                    "Test by clicking the \"Randomize String\" button and watch each line of this default text randomize.\n" +
                                                    "NOTICE: Tool uses Javascript method Math.random() pseudorandom generator to randomize string. Do not use for critical random results.\n" +
                                                    "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                output.setFont(fp);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=450;
                gc.gridwidth=4;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea = new JScrollPane(output);  
                scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                StringRandomizer.add(scrollableTextArea,gc);

                JButton save = new JButton("Save As");
                save.setFont(fb);
                gc.weightx=0;
                gc.weighty=1;
                gc.ipady=1;
                gc.gridx=0;
                gc.gridy=3;
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                save.setCursor(cur2);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                StringRandomizer.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(StringRandomizer,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        output.setText("");
                    }
                });
                
                RandomizeString.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String s=output.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        String res = function.randomize_strings(s);
                        output.setText(res);
                    }
                });
            }
        });
        //***************************Tool: Combination Generator***************************
        COMBINATION_GENERATOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel CombinationGenerator = new JPanel();
                Font fb= new Font("Arial",Font.BOLD,17);
        
                Font fp= new Font("Arial",Font.PLAIN,17);

                CombinationGenerator.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();

                JLabel Combination_Generator = new JLabel("Tool: Combination Generator");
                Combination_Generator.setFont(fb);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets = new Insets(0, 5, 0, 0);
                CombinationGenerator.add(Combination_Generator,gc);

                JLabel Object_Input_Box = new JLabel("Object Input Box");
                Object_Input_Box.setFont(fb);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets = new Insets(0, 5, 0, 0);
                CombinationGenerator.add(Object_Input_Box,gc);

                JLabel Enter_objects = new JLabel("- Enter objects to combine with each on a new line.");
                Enter_objects.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets = new Insets(0, 140, 0, 0);
                CombinationGenerator.add(Enter_objects,gc);

                JTextArea input = new JTextArea(
                "a\n"
                        +"b\n"
                        +"c\n"
                        +"d\n"
                );
                input.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.4;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=0;
                gc.ipadx =0;
                //gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea1 = new JScrollPane(input);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                CombinationGenerator.add(scrollableTextArea1,gc);

                JLabel Generate_objects_into_combinations = new JLabel("Generate objects into combinations of");
                Generate_objects_into_combinations.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Generate_objects_into_combinations,gc);

                JTextField Generate_objects_into_combinations_text = new JTextField("3");
                        Generate_objects_into_combinations_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=16;
                gc.ipadx=25;
                gc.insets = new Insets(0, 282, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Generate_objects_into_combinations_text,gc);

                /*JLabel which_will_produce = new JLabel("which will produce");
                which_will_produce.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 322, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(which_will_produce,gc);

                JTextField which_will_produce_text = new JTextField("64");
                        which_will_produce_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=16;
                gc.ipadx=50;
                gc.insets = new Insets(0, 460, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(which_will_produce_text,gc);

                JLabel sets_Repeat_objects = new JLabel("sets. Repeat objects:");
                sets_Repeat_objects.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 532, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(sets_Repeat_objects,gc);

                JRadioButton yes = new JRadioButton("yes");
                yes.setFont(fp);
                yes.setSelected(true);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 690, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(yes,gc);

                JRadioButton no = new JRadioButton("no");
                no.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 750, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(no,gc);

                ButtonGroup bg1 = new ButtonGroup();
                    bg1.add(yes);
                    bg1.add(no);

                */
                JLabel Prefix_sets_with = new JLabel("Prefix sets with:");
                Prefix_sets_with.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Prefix_sets_with,gc);

                JTextField Prefix_sets_with_text = new JTextField();
                        Prefix_sets_with_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=16;
                gc.ipadx=100;
                gc.insets = new Insets(0, 120, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Prefix_sets_with_text,gc);

                JLabel Suffix_sets_with = new JLabel("Suffix sets with:");
                Suffix_sets_with.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 230, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Suffix_sets_with,gc);

                JTextField Suffix_sets_with_text = new JTextField();
                        Suffix_sets_with_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=16;
                gc.ipadx=100;
                gc.insets = new Insets(0, 344, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Suffix_sets_with_text,gc);

                /*
                JLabel Delimit_objects_with = new JLabel("Delimit objects with:");
                Delimit_objects_with.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 450, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Delimit_objects_with,gc);

                JTextField Delimit_objects_with_text = new JTextField();
                        Delimit_objects_with_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=16;
                gc.ipadx=100;
                gc.insets = new Insets(0, 594, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Delimit_objects_with_text,gc);

                JLabel Join_sets_with = new JLabel("Join sets with:");
                Join_sets_with.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 700, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Join_sets_with,gc);

                JTextField Join_sets_with_text = new JTextField("\\x");
                        Join_sets_with_text.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=16;
                gc.ipadx=100;
                gc.insets = new Insets(0, 804, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Join_sets_with_text,gc);

                */
                JButton Generate_Combinations  = new JButton("Generate Combinations");
                Generate_Combinations.setFont(fb);
                Generate_Combinations.setBackground(Color.BLUE);
                Generate_Combinations.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                Cursor cur = new Cursor(Cursor.HAND_CURSOR);
                Generate_Combinations.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Generate_Combinations,gc);

                /*JCheckBox Direct_save = new JCheckBox("Direct save.");
                Direct_save.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 230, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Direct_save,gc);

                JLabel Output_wrap_is = new JLabel("Output wrap is");
                Output_wrap_is.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 350, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Output_wrap_is,gc);

                JRadioButton on = new JRadioButton("on");
                on.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 470, 0, 0);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(on,gc);

                JRadioButton off = new JRadioButton("off");
                off.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 520, 0, 0);
                off.setSelected(true);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(off,gc);

                ButtonGroup bg2 = new ButtonGroup();
                    bg2.add(on);
                    bg2.add(off);
                */
                JButton Clear  = new JButton("Clear");
                Clear.setFont(fb);
                Clear.setBackground(Color.BLUE);
                Clear.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 230, 0, 0);
                Clear.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(Clear,gc);

                JTextArea output = new JTextArea(
                "Output Box - Combinations will display here.\n"
                        +"Enter objects for combination into the \"Object Input Box\" above.\n"
                        +"Objects can be any text from a single letter to whole sentence.\n"
                        +"Combined sets can have a prefix and/or suffix added via the prefix/suffix fields.\n"
                        +"Delimit objects within each set via the delimit field.\n"
                        +"Join sets via join field. Sets can be joined with any text but enter \\x for new line.\n"
                        +"Test by clicking the \"Generate Combinations\" button above to watch the default objects combine.\n"
                        +"WARNING: 10 objects in combinations of 6 will produce 1000000 combinations! Many browsers"
                        + " will display a stop script message or lock-up.\n"
                        +"When generating large amounts of combinations check \"Direct save.\" to directly save"
                        + " results as a output file.\n"
                        +"This will prevent browser lock-up from trying to load large amounts of results into this browser field.\n"
                        +"Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only"
                        + " your computer will see or process your data input/output.\n"
                );
                output.setFont(fp);

                gc.weightx=1;
                gc.weighty=0.8;
                gc.gridx=0;
                gc.gridy=6;
                gc.ipady=80;
                gc.ipadx =0;
                //gc.gridwidth=10;
                gc.insets = new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                JScrollPane scrollableTextArea2 = new JScrollPane(output);  
                scrollableTextArea2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                CombinationGenerator.add(scrollableTextArea2,gc);

                JButton save  = new JButton("Save As");
                save.setFont(fb);
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);

                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=7;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets = new Insets(0, 5, 0, 0);
                save.setCursor(cur);
                gc.fill=GridBagConstraints.LINE_START;
                gc.anchor=GridBagConstraints.LINE_START;
                CombinationGenerator.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(CombinationGenerator,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                
                Clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //input.setText(null);
                        //prefix.setText(null);
                        //suffix.setText(null);
                        output.setText(null);
                    }
                });
                
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);   
                    }
                });
                
                Generate_Combinations.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //String s=input.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        //output.setText(ret);
                        String s = input.getText();
                        String prefix = Prefix_sets_with_text.getText() ;
                        String suffix = Suffix_sets_with_text.getText() ;
                        String combination = Generate_objects_into_combinations_text.getText() ;
                        String res = function.printCombination(s,prefix,suffix,combination);
                        output.setText(res);
                    }
                });
            }
        });
        //***************************Tool: Line Combination Generator**********************
        LINE_COMBINATION_GENERATOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JPanel CombinationGenerator = new JPanel();
                
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                //window.getContentPane().add(CombinationGenerator,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        //***************************Tool: Permutation Generator***************************
        PERMUTATION_GENERATOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                //window.getContentPane().add(PrefixSuffixPanel,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        //***************************Tool: Generate List of Sequential Numbers*************
        GENERATE_LIST_OF_NUMBERS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel GenerateListofSequentialNumbers = new JPanel();
                JLabel toolname = new JLabel("Tool: Generate List of Sequential Numbers");
                toolname.setFont(new Font("Tool: Generate List of Sequential Numbers", Font.BOLD, 17));
                GenerateListofSequentialNumbers.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.gridwidth=2;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets= new Insets(5, 5, 5, 5);
                GenerateListofSequentialNumbers.add(toolname,gc);

                JLabel makealistofnumberstartingat = new JLabel("Make a list of numbers starting at");
                makealistofnumberstartingat.setFont(new Font("Make a list of numbers starting at",Font.PLAIN,15));
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.ipady=17;
                gc.gridwidth=1;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets= new Insets(5, 5, 5, 5);
                GenerateListofSequentialNumbers.add(makealistofnumberstartingat,gc);

                JTextField one = new JTextField("1");
                Font f= new Font("Arial",Font.PLAIN,15);
                one.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=1;
                gc.ipadx=100;
                gc.ipady=17;
                gc.gridwidth=1;
                gc.fill=GridBagConstraints.NONE;
                //gc.anchor=GridBagConstraints.EAST;
                GenerateListofSequentialNumbers.add(one,gc);

                JLabel  endingat = new JLabel("ending at");
                endingat.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=1;
                gc.ipady=17;
                gc.gridwidth=1;
                //gc.anchor=GridBagConstraints.RELATIVE;
                GenerateListofSequentialNumbers.add(endingat,gc);

                JTextField hund = new JTextField("100");
                one.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=3;
                gc.gridy=1;
                gc.ipadx=100;
                gc.ipady=17;
                gc.gridwidth=1;
                //gc.anchor=GridBagConstraints.EAST;
                GenerateListofSequentialNumbers.add(hund,gc);

                JCheckBox pad = new JCheckBox("Pad (001...010...100)");
                pad.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=4;
                gc.gridy=1;
                gc.ipadx=100;
                gc.ipady=17;
                gc.gridwidth=1;
                GenerateListofSequentialNumbers.add(pad,gc);

                JLabel prefixno = new JLabel("Prefix numbers with:");
                f= new Font("Arial",Font.PLAIN,15);
                prefixno.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=2;
                gc.ipady=17;
                gc.gridwidth=1;
                GenerateListofSequentialNumbers.add(prefixno,gc);

                JTextField prefixnotextfil = new JTextField();
                pad.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=2;
                gc.ipadx=100;
                gc.ipady=17;
                gc.gridwidth=1;
                GenerateListofSequentialNumbers.add(prefixnotextfil,gc);

                JLabel suffix = new JLabel("and/or suffix with:");
                suffix.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=2;
                gc.ipady=17;
                GenerateListofSequentialNumbers.add(suffix,gc);

                JTextField suffixtext = new JTextField();
                suffixtext.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=3;
                gc.gridy=2;
                gc.ipady=17;
                gc.gridwidth=1;
                GenerateListofSequentialNumbers.add(suffixtext,gc);

                JLabel joinwith = new JLabel("Join with:");
                joinwith.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=4;
                gc.gridy=2;
                gc.ipady=17;
                gc.gridwidth=1;
                GenerateListofSequentialNumbers.add(joinwith,gc);

                JTextField jointextfill = new JTextField("\\x");
                jointextfill.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=5;
                gc.gridy=2;
                gc.ipadx=100;
                gc.ipady=17;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 5, 5, 5);
                GenerateListofSequentialNumbers.add(jointextfill,gc);

                JButton generateListofNumbers = new JButton("Generate List of Numbers");
                f = new Font("Arial",Font.BOLD,17);
                generateListofNumbers.setFont(f);
                generateListofNumbers.setBackground(Color.BLUE);
                generateListofNumbers.setForeground(Color.WHITE);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                generateListofNumbers.setCursor(cur2);
                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.ipady=0;
                gc.ipadx=0;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.NONE;
                GenerateListofSequentialNumbers.add(generateListofNumbers,gc);

                /*JButton RandomizeList = new JButton("Randomize List");
                RandomizeList.setFont(f);
                RandomizeList.setBackground(Color.BLUE);
                RandomizeList.setForeground(Color.WHITE);
                RandomizeList.setCursor(cur2);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=3;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.NONE;
                GenerateListofSequentialNumbers.add(RandomizeList,gc);

                JButton Reverselist = new JButton("Reverse List");
                Reverselist.setFont(f);
                Reverselist.setBackground(Color.BLUE);
                Reverselist.setForeground(Color.WHITE);
                Reverselist.setCursor(cur2);
                gc.weightx=1;
                gc.weighty=1;
                gc.gridx=2;
                gc.gridy=3;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.NONE;
                GenerateListofSequentialNumbers.add(Reverselist,gc);*/

                JButton clear = new JButton("Clear");
                clear.setFont(f);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                clear.setCursor(cur2);
                gc.weightx=1;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=3;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.NONE;
                gc.anchor=GridBagConstraints.LINE_END;
                GenerateListofSequentialNumbers.add(clear,gc);

                JTextArea output =new JTextArea("Click the \"Generate List of Numbers\" button above and results will display here.\n" +
                                        "To randomize list of generated numbers click the \"Randomize List\" button.\n" +
                                        "To reverse list of generated numbers click the \"Reverse List\" button.\n" +
                                        "Entering \\x into prefix, suffix, join field will produce a line break.\n" +
                                        "When generating a large amounts of numbers check \"Direct save.\" to directly save results as a output file.\n" +
                                        "This will prevent browser lock-up from trying to load large amounts of results into this browser field.\n" +
                                        "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f = new Font("Arial",Font.PLAIN,17);
                output.setFont(f);
                gc.weightx=1;
                gc.weighty=4;
                gc.gridx=0;
                gc.gridy=4;
                gc.gridwidth=14;
                gc.ipady=450;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.anchor=GridBagConstraints.FIRST_LINE_START;
                gc.fill=GridBagConstraints.BOTH;
                JScrollPane scrollableTextArea1 = new JScrollPane(output);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                GenerateListofSequentialNumbers.add(scrollableTextArea1,gc);

                JButton saveas = new JButton("Save As");
                f = new Font("Arial",Font.BOLD,17);
                saveas.setFont(f);
                saveas.setBackground(Color.BLUE);
                saveas.setForeground(Color.WHITE);
                saveas.setCursor(cur2);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=5;
                gc.ipady=0;
                gc.ipadx=0;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.NONE;
                gc.anchor=GridBagConstraints.LAST_LINE_START;
                GenerateListofSequentialNumbers.add(saveas,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(GenerateListofSequentialNumbers,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                saveas.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(output);

                    }
                });
                
                clear.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //input.setText(null);
                        //prefix.setText(null);
                        //suffix.setText(null);
                        output.setText(null);
                    }
                });
                
                generateListofNumbers.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //String s=input.getText();
                        //String pre=prefix.getText();
                        //String suf=suffix.getText();
                        //String ret=function.generate(s,pre,suf);
                        //output.setText(ret);
                        String min = one.getText() ;
                        String max = hund.getText() ;
                        String prefix = prefixnotextfil.getText() ;
                        String suffix = suffixtext.getText() ;
                        boolean pa ;
                        pa = pad.isSelected();
                        String join = jointextfill.getText();
                        String res = function.sequential_numbers(min,max,prefix,suffix,join , pa );
                        output.setText(res);
                    }
                });
            }
        });
        //***************************Tool: Number Each Line********************************
        NUMBER_EACH_LINE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel NumbersEachLine = new JPanel();
                NumbersEachLine.setLayout(new GridBagLayout());
                GridBagConstraints gc = new GridBagConstraints();
                Font f= new Font("Arial",Font.BOLD,17);
                JLabel toolname = new JLabel("Tool: Number Each Line");
                toolname.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=0;
                gc.gridwidth=3;
                gc.insets= new Insets(5, 5, 5, 5);
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;  
                NumbersEachLine.add(toolname,gc);

                JLabel Startthelinecountat = new JLabel("Start the line count at");
                f= new Font("Arial",Font.PLAIN,17);
                Startthelinecountat.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=1;
                gc.gridwidth=1;
                gc.fill=GridBagConstraints.BOTH;
                gc.anchor=GridBagConstraints.LINE_START;
                gc.insets= new Insets(5, 5, 5, 5);
                NumbersEachLine.add(Startthelinecountat,gc);

                JTextField linecontat = new JTextField("1");
                linecontat.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=1;
                gc.gridwidth=1;
                gc.ipadx=100;
                gc.ipady=20;
                gc.fill=GridBagConstraints.LINE_START;
                gc.insets= new Insets(5, 5, 5, 5);
                NumbersEachLine.add(linecontat,gc);

                /*JLabel and = new JLabel("and");
                and.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=1;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 120, 5, 5);
                NumbersEachLine.add(and,gc);

                JCheckBox andcheck = new JCheckBox("pad* numbers. *i.e. 0001...0010...0100...1000");
                andcheck.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=2;
                gc.gridy=1;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 10, 5, 50);
                NumbersEachLine.add(andcheck,gc);
                 */
                
                JLabel prefixlabel = new JLabel("Prefix line number with:");
                prefixlabel.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=2;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 5, 5, 5);
                NumbersEachLine.add(prefixlabel,gc);

                JTextField prefix = new JTextField();
                prefix.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=2;
                gc.gridwidth=1;
                gc.ipadx=100;
                gc.ipady=20;
                gc.insets= new Insets(5, 5, 5, 5);
                NumbersEachLine.add(prefix,gc);

                JLabel prehelp = new JLabel(" e.g. enter \"#\" for \"#001\"");
                prehelp.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=2;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 120, 5, 5);
                NumbersEachLine.add(prehelp,gc);

                JLabel suffixlable = new JLabel("Suffix line number with:");
                suffixlable.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=3;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 5, 5, 5);
                NumbersEachLine.add(suffixlable,gc);

                JTextField suffixtext = new JTextField();
                suffixtext.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=3;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 5, 5, 5);
                NumbersEachLine.add(suffixtext,gc);


                JLabel suffixhelp = new JLabel("e.g. enter \".\" for \"001.\"");
                suffixhelp.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=3;
                gc.gridwidth=1;
                gc.insets= new Insets(5, 120, 5, 5);
                NumbersEachLine.add(suffixhelp,gc);

                JButton Generate = new JButton("Generate");
                f = new Font("Arial",Font.BOLD,17);
                Generate.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=0;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                //gc.gridwidth=1;
                gc.insets= new Insets(5, 5, 5, 5);
                Generate.setBackground(Color.BLUE);
                Generate.setForeground(Color.WHITE);
                Cursor cur2 = new Cursor(Cursor.HAND_CURSOR);
                Generate.setCursor(cur2);
                NumbersEachLine.add(Generate,gc);

                /*JButton NumberEachlineRight = new JButton("Number Each Line Right");
                NumberEachlineRight.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                //gc.gridwidth=1;
                NumberEachlineRight.setBackground(Color.BLUE);
                NumberEachlineRight.setForeground(Color.WHITE);
                NumberEachlineLeft.setCursor(cur2);
                gc.insets= new Insets(0, 5, 5, 5);

                NumbersEachLine.add(NumberEachlineRight,gc);*/

                JButton clear = new JButton("Clear");
                clear.setFont(f);
                gc.weightx=0;
                gc.weighty=0.1;
                gc.gridx=1;
                gc.gridy=4;
                gc.ipady=0;
                gc.ipadx=0;
                gc.gridwidth=1;
                gc.insets= new Insets(0, 5, 5, 5);
                clear.setBackground(Color.BLUE);
                clear.setForeground(Color.WHITE);
                clear.setCursor(cur2);
                NumbersEachLine.add(clear,gc);

                JTextArea input = new JTextArea("Enter your text/list here.\n" +
                                                "This tool will number (enumerate) a list of items such as words, names, etc.\n" +
                                                "Test by clicking \"Number Each Line Left\" to number each line of this default text on it's left side.\n" +
                                                "Privacy of Data: This tool is built-with and functions-in Client Side JavaScripting, so only your computer will see or process your data input/output.");
                f = new Font("Arial",Font.PLAIN,17);
                input.setFont(f);
                gc.weightx=1;
                gc.weighty=5;
                gc.gridx=0;
                gc.gridy=5;
                gc.gridwidth=5;
                gc.ipady=400;
                //gc.ipadx=800;
                gc.fill=GridBagConstraints.BOTH;
                //gc.anchor=GridBagConstraints.FIRST_LINE_START;
                gc.insets= new Insets(5, 5, 5, 5);
                JScrollPane scrollableTextArea1 = new JScrollPane(input);  
                scrollableTextArea1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
                scrollableTextArea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                scrollableTextArea1.setForeground(new Color(175, 155, 155));
                scrollableTextArea1.setForeground(new Color(175, 155, 155));
                NumbersEachLine.add(scrollableTextArea1,gc);

                JButton loadfile = new JButton("Load File");
                f = new Font("Arial",Font.BOLD,17);
                loadfile.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=0;
                gc.gridy=6;
                gc.gridwidth=1;
                gc.ipady=0;
                gc.fill=GridBagConstraints.NONE;
                loadfile.setBackground(Color.BLUE);
                loadfile.setForeground(Color.WHITE);
                loadfile.setCursor(cur2);
                NumbersEachLine.add(loadfile,gc);
                
                JButton save = new JButton("Save As");
                f = new Font("Arial",Font.BOLD,17);
                save.setFont(f);
                gc.weightx=0;
                gc.weighty=1;
                gc.gridx=1;
                gc.gridy=6;
                gc.gridwidth=1;
                gc.ipady=0;
                gc.fill=GridBagConstraints.NONE;
                save.setBackground(Color.BLUE);
                save.setForeground(Color.WHITE);
                save.setCursor(cur2);
                NumbersEachLine.add(save,gc);
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                window.getContentPane().add(NumbersEachLine,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
                save.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        TextEditor te=new TextEditor();
                        te.saveAs(input);

                    }
                });
                loadfile.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e1) {
                        TextEditor te=new TextEditor();
                        te.loadfile(input);
                    }
                });
            }
        });
        //***************************Tool: Online Tally Counter****************************
        ONLINE_TALLY_COUNTER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                //window.getContentPane().add(PrefixSuffixPanel,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        //***************************Tool: Text manipulation notepad***********************
        TEXT_MANIPULATION_NOTEPAD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                window.getContentPane().removeAll();
                window.getContentPane().add(top,BorderLayout.NORTH);
                //window.getContentPane().add(PrefixSuffixPanel,BorderLayout.CENTER);
                window.revalidate();
                window.repaint();
            }
        });
        
        //***********************************************************************************************************************************************************
        window.setResizable(false);
        window.add(BorderLayout.NORTH, top);
        Homepage home1 = new Homepage();
        window.getContentPane().add(home1.AboutPanel,BorderLayout.CENTER);
        window.setSize(1280,720);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        Exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
    }
}