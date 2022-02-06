import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JToggleButton;
import java.awt.Dimension;
import java.util.Collections;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
Name: Elizabeth Wellford
UIN: 726003368
Date: 11/16/2020
Assignment: Final Project
*/

public class MemoryGame extends JFrame implements ActionListener {
  private int remainingCards = 16;
  private String descriptionIcon1 = "";
  private String descriptionIcon2 = "";
  private ImageIcon cardBack = new ImageIcon("resources/cardBack.png");
  private JToggleButton card1 = new JToggleButton(cardBack);
  private JToggleButton card2 = new JToggleButton(cardBack);
  private JToggleButton card3 = new JToggleButton(cardBack);
  private JToggleButton card4 = new JToggleButton(cardBack);
  private JToggleButton card5 = new JToggleButton(cardBack);
  private JToggleButton card6 = new JToggleButton(cardBack);
  private JToggleButton card7 = new JToggleButton(cardBack);
  private JToggleButton card8 = new JToggleButton(cardBack);
  private JToggleButton card9 = new JToggleButton(cardBack);
  private JToggleButton card10 = new JToggleButton(cardBack);
  private JToggleButton card11 = new JToggleButton(cardBack);
  private JToggleButton card12 = new JToggleButton(cardBack);
  private JToggleButton card13 = new JToggleButton(cardBack);
  private JToggleButton card14 = new JToggleButton(cardBack);
  private JToggleButton card15 = new JToggleButton(cardBack);
  private JToggleButton card16 = new JToggleButton(cardBack);
  private ImageIcon icon1;
  private ImageIcon icon2;
  private ImageIcon icon3;
  private ImageIcon icon4;
  private ImageIcon icon5;
  private ImageIcon icon6;
  private ImageIcon icon7;
  private ImageIcon icon8;
  private ImageIcon icon9;
  private ImageIcon icon10;
  private ImageIcon icon11;
  private ImageIcon icon12;
  private ImageIcon icon13;
  private ImageIcon icon14;
  private ImageIcon icon15;
  private ImageIcon icon16;
  private JToggleButton[] cardButtons = {card1, card2, card3, card4, card5, card6, card7,
    card8, card9, card10, card11, card12, card13, card14, card15, card16};
  private ArrayList<ImageIcon> pics = new ArrayList<ImageIcon>();

  MemoryGame(){
    GridBagConstraints layoutConst = null;

    card1.addActionListener(this);
    card2.addActionListener(this);
    card3.addActionListener(this);
    card4.addActionListener(this);
    card5.addActionListener(this);
    card6.addActionListener(this);
    card7.addActionListener(this);
    card8.addActionListener(this);
    card9.addActionListener(this);
    card10.addActionListener(this);
    card11.addActionListener(this);
    card12.addActionListener(this);
    card13.addActionListener(this);
    card14.addActionListener(this);
    card15.addActionListener(this);
    card16.addActionListener(this);

    ImageIcon turtle = new ImageIcon("resources/turtle.png", "turtle");
    ImageIcon crab = new ImageIcon("resources/crab.png", "crab");
    ImageIcon bird = new ImageIcon("resources/bird.png", "bird");
    ImageIcon fish = new ImageIcon("resources/fish.png", "fish");
    ImageIcon dog = new ImageIcon("resources/dog.png", "dog");
    ImageIcon donkey = new ImageIcon("resources/donkey.png", "donkey");
    ImageIcon horse = new ImageIcon("resources/horse.png", "horse");
    ImageIcon pig = new ImageIcon("resources/pig.png", "pig");

    ImageIcon[] pictures = {turtle, crab, bird, fish, dog, donkey, horse, pig};

    //Adds each picture to an ArrayList twice
    for (int j = 0; j < 8; ++j) {
      pics.add(pictures[j]);
      pics.add(pictures[j]);
    } //end for

    //Shuffles the ArrayList so that the pictures are in a random order
    Collections.shuffle(pics);

    /*
    The code below creates the layout of all of the cards (the JToggleButtons)
    on the frame
    */
    setLayout(new GridBagLayout());

    layoutConst = new GridBagConstraints();
    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 0;
    layoutConst.gridy = 0;
    card1.setPreferredSize(new Dimension(150, 150));
    add(card1, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 1;
    layoutConst.gridy = 0;
    card2.setPreferredSize(new Dimension(150, 150));
    add(card2, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 2;
    layoutConst.gridy = 0;
    card3.setPreferredSize(new Dimension(150, 150));
    add(card3, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 3;
    layoutConst.gridy = 0;
    card4.setPreferredSize(new Dimension(150, 150));
    add(card4, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 0;
    layoutConst.gridy = 1;
    card5.setPreferredSize(new Dimension(150, 150));
    add(card5, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 1;
    layoutConst.gridy = 1;
    card6.setPreferredSize(new Dimension(150, 150));
    add(card6, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 2;
    layoutConst.gridy = 1;
    card7.setPreferredSize(new Dimension(150, 150));
    add(card7, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 3;
    layoutConst.gridy = 1;
    card8.setPreferredSize(new Dimension(150, 150));
    add(card8, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 0;
    layoutConst.gridy = 2;
    card9.setPreferredSize(new Dimension(150, 150));
    add(card9, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 1;
    layoutConst.gridy = 2;
    card10.setPreferredSize(new Dimension(150, 150));
    add(card10, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 2;
    layoutConst.gridy = 2;
    card11.setPreferredSize(new Dimension(150, 150));
    add(card11, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 3;
    layoutConst.gridy = 2;
    card12.setPreferredSize(new Dimension(150, 150));
    add(card12, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 0;
    layoutConst.gridy = 3;
    card13.setPreferredSize(new Dimension(150, 150));
    add(card13, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 1;
    layoutConst.gridy = 3;
    card14.setPreferredSize(new Dimension(150, 150));
    add(card14, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 2;
    layoutConst.gridy = 3;
    card15.setPreferredSize(new Dimension(150, 150));
    add(card15, layoutConst);

    layoutConst.insets = new Insets(10, 10, 10, 10);
    layoutConst.anchor = GridBagConstraints.LINE_START;
    layoutConst.gridx = 3;
    layoutConst.gridy = 3;
    card16.setPreferredSize(new Dimension(150, 150));
    add(card16, layoutConst);
  } //end constructor


  @Override
  public void actionPerformed(ActionEvent event) {
    //Shows the image on the card when selected, when not selected shows the back of the card
    int numSelected = 0; //Keeps track of current number of selected cards
    for (int i = 0; i < 16; ++i) {
       if (cardButtons[i].isSelected()) {
         numSelected += 1;
         cardButtons[i].setIcon(pics.get(i)); //Shows the image for the card
       } //end if
       else {
         cardButtons[i].setIcon(cardBack); //Shows the back of the card
       } //end else
    } //end for

    int index = 0;
    int[] indexes = new int[2]; //Creates array to keep track of the indices of the selected cards

    if (numSelected == 2) {
      for (int i = 0; i < 16; ++i) {
        if (cardButtons[i].isSelected()) {
          indexes[index] = i;
          index += 1;
          cardButtons[i].setSelected(false);
        } //end if
      } //end for

      int index1 = indexes[0];
      int index2 = indexes[1];
      descriptionIcon1 = (pics.get(index1)).getDescription();
      descriptionIcon2 = (pics.get(index2)).getDescription();
      /*
      Compares the descriptions of the selected images to decide if the two cards
      are a match, if the cards are a match then the JToggleButtons are disabled
      */
      if (descriptionIcon1.equals(descriptionIcon2)) {
        cardButtons[index1].setEnabled(false);
        cardButtons[index2].setEnabled(false);
        remainingCards -= 2;
      } //end if
    } //end if

    //Shows a message and closes the frame once all of the cards have been matched
    if (remainingCards == 0) {
      JOptionPane.showMessageDialog(null, "You Won!");
      dispose();
    } //end if
  } //end actionPerformed

  public static void main(String[] args) {
    MemoryGame myFrame = new MemoryGame();
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.pack();
    myFrame.setLocationRelativeTo(null);
    myFrame.setVisible(true);
  } //end main

} //end class
