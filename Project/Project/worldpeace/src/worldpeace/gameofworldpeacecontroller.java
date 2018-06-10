/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldpeace;

import java.net.URL;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author Himson
 */
public class GameOfWorldPeaceController implements Initializable {
    
    ObservableList<String> mechanicalList = FXCollections.observableArrayList("Flag1","Flag2","Flag3",
            "ProtectField1","ProtectField2","name1","name2","name3","name4", "Army1","Army2","Army3","Army4");
    
    ObservableList<String> mechanicalList2 = FXCollections.observableArrayList("P2Flag1","P2Flag2","P2Flag3",
            "P2ProtectField1","P2ProtectField2","P2name1","P2name2","P2name3","P2name4", "P2Army1","P2Army2","P2Army3","P2Army4");
    
    ObservableList<String> AttackP2List = FXCollections.observableArrayList("AttackP2Flag1","AttackP2Flag2","AttackP2Flag3",
            "AttackP2ProtectField1","AttackP2ProtectField2","AttackP2name1","AttackP2name2","AttackP2name3","AttackP2name4",
            "AttackP2Army1","AttackP2Army2","AttackP2Army3","AttackP2Army4");
    ObservableList<String> AttackList = FXCollections.observableArrayList("AttackFlag1","AttackFlag2","AttackFlag3",
            "AttackProtectField1","AttackProtectField2","Attackname1","Attackname2","Attackname3","Attackname4", "AttackArmy1","AttackArmy2","AttackArmy3","AttackArmy4");
    
    
    @FXML
    private ComboBox Weapons;
    @FXML
    private ComboBox P2Weapons;
    @FXML
    private ComboBox Destroy;
    @FXML
    private ComboBox P2Destroy;
    @FXML
    private CubicCurve Flag1;
    @FXML
    private CubicCurve Flag2;
    @FXML
    private CubicCurve Flag3;
    @FXML
    private Rectangle ProtectField1;
    @FXML
    private Rectangle ProtectField2;
    @FXML
    private Button RandomButton;
    @FXML
    private Text name1;
    @FXML
    private Text name2;
    @FXML
    private Text name3;
    @FXML
    private Text name4;
    
    
    
    
    
    @FXML
    private ImageView Army1;
    @FXML
    private ImageView Army2;
    @FXML
    private ImageView Army3;
    @FXML
    private ImageView Army4;
    
    @FXML
    private CubicCurve P2Flag1;
    @FXML
    private CubicCurve P2Flag2;
    @FXML
    private CubicCurve P2Flag3;
    @FXML
    private Rectangle P2ProtectField1;
    @FXML
    private Rectangle P2ProtectField2;    
    
    @FXML
    private Text P2name1;
    @FXML
    private Text P2name2;
    @FXML
    private Text P2name3;
    @FXML
    private Text P2name4;
    
    @FXML
    private ImageView P2Army1;
    @FXML
    private ImageView P2Army2;
    @FXML
    private ImageView P2Army3;
    @FXML
    private ImageView P2Army4;
    private int die1;
    private int die2;
    
    
    
    public void doExit()
    {
       exit();
    }
    
    public void Rules()
    {
       Alert rulesalert = new Alert(AlertType.INFORMATION);
       rulesalert.setTitle("Rules");
       rulesalert.setHeaderText(null);
       rulesalert.setContentText
       (
               "This is the rules of World Peace Game:\n"
               +
               "\n"
               +
               "1.. The four square in each side mean your castle.\n"
               +
               "\n"
               +
               "2. Both side compare the numbers, which side number is larger,\n"
               +
               "\n"
               +        
               "   then that side can build your weapons and army on you field\n"
               +
               "\n"
               +
               "4. Win the game by destroy all the weapons and Armys including the names of castle.\n"
               +
               "\n"
               +
               "5. Enjoy your game!!!!"
       );
        
       rulesalert.showAndWait();
    }
    
    @FXML
    private void AddingChoice()
    {
            if(Weapons.getValue().equals("Flag1") && Flag1.isVisible() == false)
            {
                showFlag1();
            } else if(Weapons.getValue().equals("Flag2") && Flag2.isVisible() == false)
            {
                showFlag2();
            } else if (Weapons.getValue().equals("Flag3") && Flag3.isVisible() == false)
            {
                showFlag3();
            } else if(Weapons.getValue().equals("ProtectField1") && ProtectField1.isVisible() == false)
            {
            showProtectField1();
            } else if(Weapons.getValue().equals("ProtectField2") && ProtectField2.isVisible() == false)
            {
                showProtectField2();
            } else if(Weapons.getValue().equals("name1") && name1.isVisible() == false)
            {
                    showname1();
            } else if(Weapons.getValue().equals("name2") && name2.isVisible() == false)
            {
                showname2();
            } else if(Weapons.getValue().equals("name3") && name3.isVisible() == false)
            {
                showname3();
            } else if(Weapons.getValue().equals("name4") && name4.isVisible() == false)
            {
                showname4();
            }else if(Weapons.getValue().equals("Army1") && Army1.isVisible() == false)
            {
                showArmy1();
            }else if(Weapons.getValue().equals("Army2") && Army2.isVisible() == false)
            {
                showArmy2();
            }else if(Weapons.getValue().equals("Army3") && Army3.isVisible() == false)
            {
                showArmy3();
            }else if(Weapons.getValue().equals("Army4") && Army4.isVisible() == false)
            {
                showArmy4();
            }
            else
            {
                Alert ErrorInput = new Alert(AlertType.INFORMATION);
                ErrorInput.setTitle("Error");
                ErrorInput.setHeaderText(null);
                ErrorInput.setContentText("Invalid Input!");

                ErrorInput.showAndWait();
            }
        }
    
    @FXML
    private void P2AddingChoice()
    {
            if(P2Weapons.getValue().equals("P2Flag1") && P2Flag1.isVisible() == false)
            {
                showP2Flag1();
            } else if(P2Weapons.getValue().equals("P2Flag2") && P2Flag2.isVisible() == false)
            {
                showP2Flag2();
            } else if (P2Weapons.getValue().equals("P2Flag3") && P2Flag3.isVisible() == false)
            {
                showP2Flag3();
            } else if(P2Weapons.getValue().equals("P2ProtectField1") && P2ProtectField1.isVisible() == false)
            {
                showP2ProtectField1();
            } else if(P2Weapons.getValue().equals("P2ProtectField2") && P2ProtectField2.isVisible() == false)
            {
                showP2ProtectField2();
            } else if(P2Weapons.getValue().equals("P2name1") && P2name1.isVisible() == false)
            {
                showP2name1();
            } else if(P2Weapons.getValue().equals("P2name2") && P2name2.isVisible() == false)
            {
                showP2name2();
            } else if(P2Weapons.getValue().equals("P2name3")&& P2name3.isVisible() == false)
            {
                showP2name3();
            } else if(P2Weapons.getValue().equals("P2name4")&& P2name4.isVisible() == false)
            {
                showP2name4();
            }else if(P2Weapons.getValue().equals("P2Army1") && P2Army1.isVisible() == false)
            {
                showP2Army1();
            }else if(P2Weapons.getValue().equals("P2Army2")&& P2Army2.isVisible() == false)
            {
                showP2Army2();
            }else if(P2Weapons.getValue().equals("P2Army3")&& P2Army3.isVisible() == false)
            {
                showP2Army3();
            }else if(P2Weapons.getValue().equals("P2Army4")&& P2Army4.isVisible() == false)
            {
                showP2Army4();
            }
            else
            {
                Alert ErrorInput = new Alert(AlertType.INFORMATION);
                ErrorInput.setTitle("Error");
                ErrorInput.setHeaderText(null);
                ErrorInput.setContentText("Invalid Input!");

                ErrorInput.showAndWait();
            }
        }
    
    
    @FXML
    public void Reset(ActionEvent e)
    {
        this.Flag1.setVisible(false);
        this.Flag2.setVisible(false);
        this.Flag3.setVisible(false);
        this.ProtectField1.setVisible(false);
        this.ProtectField2.setVisible(false);
        this.name1.setVisible(false);
        this.name2.setVisible(false);
        this.name3.setVisible(false);
        this.name4.setVisible(false);
        this.Army1.setVisible(false);
        this.Army1.setVisible(false);
        this.Army2.setVisible(false);
        this.Army3.setVisible(false);
        this.Army4.setVisible(false);
        
        this.P2Flag1.setVisible(false);
        this.P2Flag2.setVisible(false);
        this.P2Flag3.setVisible(false);
        this.P2ProtectField1.setVisible(false);
        this.P2ProtectField2.setVisible(false);
        this.P2name1.setVisible(false);
        this.P2name2.setVisible(false);
        this.P2name3.setVisible(false);
        this.P2name4.setVisible(false);
        this.P2Army1.setVisible(false);
        this.P2Army1.setVisible(false);
        this.P2Army2.setVisible(false);
        this.P2Army3.setVisible(false);
        this.P2Army4.setVisible(false);

    }
    
    
    public void showFlag1() 
    {
        this.Flag1.setVisible(true);
         this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
        
    }

    public void showFlag2() 
    {
        this.Flag2.setVisible(true);
         this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }

    public void showFlag3() 
    {
        this.Flag3.setVisible(true);
         this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }
    
    public void showProtectField1() 
    {
        this.ProtectField1.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }
    
    public void showProtectField2() 
    {
        this.ProtectField2.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }
    
    public void showname1() 
    {
        this.name1.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }

    public void showname2() 
    {
        this.name2.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }

    public void showname3() 
    {
        this.name3.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }
    
    public void showname4() 
    {
        this.name4.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }
    
     public void showArmy1() 
    {
        this.Army1.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }

    public void showArmy2() 
    {
        this.Army2.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }

    public void showArmy3() 
    {
        this.Army3.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }
    
    public void showArmy4() 
    {
        this.Army4.setVisible(true);
        this.Destroy.setVisible(false);
        this.Weapons.setVisible(false);
    }
    public void DFlag1() 
    {
        this.Flag1.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
        
    }

    public void DFlag2() 
    {
        this.Flag2.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }

    public void DFlag3() 
    {
        this.Flag3.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }
    
    public void DProtectField1() 
    {
        this.ProtectField1.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }
    
    public void DProtectField2() 
    {
        this.ProtectField2.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }
    
    public void Dname1() 
    {
        this.name1.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }

    public void Dname2() 
    {
        this.name2.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }

    public void Dname3() 
    {
        this.name3.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }
    
    public void Dname4() 
    {
        this.name4.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }
    
     public void DArmy1() 
    {
        this.Army1.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }

    public void DArmy2() 
    {
        this.Army2.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }

    public void DArmy3() 
    {
        this.Army3.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }
    
    public void DArmy4() 
    {
        this.Army4.setVisible(false);
        this.P2Destroy.setVisible(false);
        this.P2Weapons.setVisible(false);
    }
    @FXML
    private void P2AttackChoice() 
    {
        if(P2Army1.isVisible() == true ||P2Army2.isVisible() == true || P2Army3.isVisible() == true || P2Army4.isVisible() == true )
       {
        if(P2Destroy.getValue().equals("AttackFlag1"))
            {
                DFlag1();
            } else if(P2Destroy.getValue().equals("AttackFlag2"))
            {
                DFlag2();
            } else if (P2Destroy.getValue().equals("AttackFlag3"))
            {
                DFlag3();
            } else if(P2Destroy.getValue().equals("AttackProtectField1"))
            {
                DProtectField1();
            } else if(P2Destroy.getValue().equals("AttackProtectField2"))
            {
                DProtectField2();
            } else if(P2Destroy.getValue().equals("Attackname1"))
            {
                Dname1();
            } else if(P2Destroy.getValue().equals("Attackname2"))
            {
                Dname2();
            } else if(P2Destroy.getValue().equals("Attackname3"))
            {
                Dname3();
            } else if(P2Destroy.getValue().equals("Attackname4"))
            {
                Dname4();
            }else if(P2Destroy.getValue().equals("AttackArmy1"))
            {
                DArmy1();
            }else if(P2Destroy.getValue().equals("AttackArmy2"))
            {
                DArmy2();
            }else if(P2Destroy.getValue().equals("AttackArmy3"))
            {
                DArmy3();
            }else if(P2Destroy.getValue().equals("AttackArmy4"))
            {
                DP2Army4();
            }
       } else
            {
                Alert ErrorInput = new Alert(AlertType.INFORMATION);
                ErrorInput.setTitle("Error");
                ErrorInput.setHeaderText(null);
                ErrorInput.setContentText("Invalid Input!");

                ErrorInput.showAndWait();
            }
           
        
    }
    @FXML
    private void AttackChoice() 
    {
       if(Army1.isVisible() == true ||Army2.isVisible() == true || Army3.isVisible() == true || Army4.isVisible() == true )
       {
           
       
        if(Destroy.getValue().equals("AttackP2Flag1"))
            {
                DP2Flag1();
            } else if(Destroy.getValue().equals("AttackP2Flag2"))
            {
                DP2Flag2();
            } else if (Destroy.getValue().equals("AttackP2Flag3"))
            {
                DP2Flag3();
            } else if(Destroy.getValue().equals("AttackP2ProtectField1"))
            {
                DP2ProtectField1();
            } else if(Destroy.getValue().equals("AttackP2ProtectField2"))
            {
                DP2ProtectField2();
            } else if(Destroy.getValue().equals("AttackP2name1"))
            {
                DP2name1();
            } else if(Destroy.getValue().equals("AttackP2name2"))
            {
                DP2name2();
            } else if(Destroy.getValue().equals("AttackP2name3"))
            {
                DP2name3();
            } else if(Destroy.getValue().equals("AttackP2name4"))
            {
                DP2name4();
            }else if(Destroy.getValue().equals("AttackP2Army1"))
            {
                DP2Army1();
            }else if(Destroy.getValue().equals("AttackP2Army2"))
            {
                DP2Army2();
            }else if(Destroy.getValue().equals("AttackP2Army3"))
            {
                DP2Army3();
            }else if(Destroy.getValue().equals("AttackP2Army4"))
            {
                DP2Army4();
            }
            
       } else {
                Alert ErrorInput = new Alert(AlertType.INFORMATION);
                ErrorInput.setTitle("Error");
                ErrorInput.setHeaderText(null);
                ErrorInput.setContentText("Invalid Input!");

                ErrorInput.showAndWait();
            }
        
    }
    
    public void showP2Flag1() 
    {
        this.P2Flag1.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
        
    }

    public void showP2Flag2() 
    {
        this.P2Flag2.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }

    public void showP2Flag3() 
    {
        this.P2Flag3.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }
    
    public void showP2ProtectField1() 
    {
        this.P2ProtectField1.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
            
    }
    
    public void showP2ProtectField2() 
    {
        this.P2ProtectField2.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }
    
    public void showP2name1() 
    {
        this.P2name1.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }

    public void showP2name2() 
    {
        this.P2name2.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }

    public void showP2name3() 
    {
        this.P2name3.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }
    
    public void showP2name4() 
    {
        this.P2name4.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }
    
     public void showP2Army1() 
    {
        this.P2Army1.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }

    public void showP2Army2() 
    {
        this.P2Army2.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }

    public void showP2Army3() 
    {
        this.P2Army3.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }
    
    public void showP2Army4() 
    {
        this.P2Army4.setVisible(true);
        this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
    }
    
   public void DP2Army4()
   {
       this.P2Army4.setVisible(false);
       this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
   }
    public void DP2Flag1() 
    {
        this.P2Flag1.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
        
    }

    public void DP2Flag2() 
    {
        this.P2Flag2.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }

    public void DP2Flag3() 
    {
        this.P2Flag3.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }
    
    public void DP2ProtectField1() 
    {
        this.P2ProtectField1.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }
    
    public void DP2ProtectField2() 
    {
        this.P2ProtectField2.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }
    
    public void DP2name1() 
    {
        this.P2name1.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }

    public void DP2name2() 
    {
        this.P2name2.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }

    public void DP2name3() 
    {
        this.P2name3.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }
    
    public void DP2name4() 
    {
        this.P2name4.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }
    
     public void DP2Army1() 
    {
        this.P2Army1.setVisible(false);
       this.Destroy.setVisible(false);
            this.Weapons.setVisible(false); 
    }

    public void DP2Army2() 
    {
        this.P2Army2.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }

    public void DP2Army3() 
    {
        this.P2Army3.setVisible(false);
        this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
    }
    
    public void Ramdom ()
    {
        Random ramdom = new Random();
        Alert TakeTurn = new Alert(AlertType.INFORMATION);
       TakeTurn.setTitle("Rules");
       TakeTurn.setHeaderText(null);
       checkVictory(); 
//       if((Army1.isVisible() == false && Army2.isVisible() == false &&Army3.isVisible() == false &&Army4.isVisible() == false &&
//                name1.isVisible() == false &&name2.isVisible() == false &&name3.isVisible() == false &&name4.isVisible() == false &&
//                ProtectField1.isVisible() == false &&ProtectField2.isVisible() == false && Flag1.isVisible() == false &&Flag2.isVisible() == false &&
//                Flag3.isVisible() == false) || (P2Army1.isVisible() == false && P2Army2.isVisible() == false &&P2Army3.isVisible() == false &&P2Army4.isVisible() == false &&
//                P2name1.isVisible() == false &&P2name2.isVisible() == false &&P2name3.isVisible() == false &&P2name4.isVisible() == false &&
//                P2ProtectField1.isVisible() == false &&P2ProtectField2.isVisible() == false && P2Flag1.isVisible() == false &&P2Flag2.isVisible() == false &&
//                P2Flag3.isVisible() == false))
//       {
//           this.RandomButton.setVisible(false);
//       }
       die1 =(int)(Math.random()*6 +1);
        die2 = (int)(Math.random()*6 + 1);
        if( die1 > die2)
        {
            
            TakeTurn.setContentText(" Player 1 turn");
            TakeTurn.showAndWait();
            this.P2Destroy.setVisible(false);
            this.P2Weapons.setVisible(false);
            this.Destroy.setVisible(true);
            this.Weapons.setVisible(true);
//            checkVictory();    
       
        }
        else
        {
            TakeTurn.setContentText("Player 2 turns");
            TakeTurn.showAndWait();
            this.Destroy.setVisible(false);
            this.Weapons.setVisible(false);
            this.P2Destroy.setVisible(true);
            this.P2Weapons.setVisible(true);
//            checkVictory();
                
        }
        checkVictory();
    }
    
    
    

   


    
    public Alert checkVictory() 
    {
        Alert WinStatement = new Alert(AlertType.INFORMATION);
       WinStatement.setTitle("Winner");
       WinStatement.setHeaderText(null);
        
        if(Army1.isVisible() == false && Army2.isVisible() == false &&Army3.isVisible() == false &&Army4.isVisible() == false &&
                name1.isVisible() == false &&name2.isVisible() == false &&name3.isVisible() == false &&name4.isVisible() == false &&
                ProtectField1.isVisible() == false &&ProtectField2.isVisible() == false && Flag1.isVisible() == false &&Flag2.isVisible() == false &&
                Flag3.isVisible() == false  )
        {  
            this.RandomButton.setVisible(false);
            WinStatement.setContentText(" Player 2 win");
       Optional <ButtonType> result = WinStatement.showAndWait();
            if(result.get() == ButtonType.OK)
            {
                doExit();
            }
            
        } else if(P2Army1.isVisible() == false && P2Army2.isVisible() == false &&P2Army3.isVisible() == false &&P2Army4.isVisible() == false &&
                P2name1.isVisible() == false &&P2name2.isVisible() == false &&P2name3.isVisible() == false &&P2name4.isVisible() == false &&
                P2ProtectField1.isVisible() == false &&P2ProtectField2.isVisible() == false && P2Flag1.isVisible() == false &&P2Flag2.isVisible() == false &&
                P2Flag3.isVisible() == false  ) 
        {
       this.RandomButton.setVisible(false);     
       WinStatement.setContentText(" Player 1 win");
       Optional <ButtonType> result = WinStatement.showAndWait();
       if(result.get() == ButtonType.OK)
            {
                doExit();
            }
       
        }
        return WinStatement;
    }
        
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Weapons.setItems(mechanicalList);
        Weapons.setValue("Add your Force");
        
        P2Weapons.setItems(mechanicalList2);
        P2Weapons.setValue("Add your Force");
        Destroy.setItems(AttackP2List);
        Destroy.setValue("Kill them all");
        P2Destroy.setItems(AttackList);
        P2Destroy.setValue("Kill them all");
    }    
    
}
