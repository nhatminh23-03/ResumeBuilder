import java.util.ArrayList;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;


public class HomePage extends javax.swing.JFrame {
    //varibles
    public static String firstname;
    public static String lastname;
    public static String personalLink;
    public static String phonenumber;
    public static String email;
    public static String dob;
    public static String city;
    public static String state;
    public static String  postal;
    public static String school;
    public static String degree;
    public static String startDateSchool;
    public static String endDateSchool;
    public static String schoolcity;
    public static String schoolDescription;
    public static String postitle;
    public static String companyName;
    public static String workStart;
    public static String workEnd;
    public static String companyCity;
    public static String workexperience;
    public static ArrayList<String> skills = new ArrayList<>();
    public static String additionalSkillssss;

    //HOME PAGE
    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        slayLabel = new javax.swing.JLabel();
        groupNameLabel = new javax.swing.JLabel();
        createResumeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36));
        titleLabel.setText("Resume Builder");

        slayLabel.setFont(new java.awt.Font("Helvetica Neue", 2, 18));
        slayLabel.setText("Slay Your Resume");

        groupNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14));
        groupNameLabel.setText("JGroup");

        createResumeButton.setBackground(new java.awt.Color(51, 145, 255));
        createResumeButton.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        createResumeButton.setForeground(new java.awt.Color(255, 255, 255));
        createResumeButton.setText("Create Your Resume");
        createResumeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createResumeButton.setIconTextGap(2);

        createResumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createResumeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(183, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(titleLabel)
                                                .addGap(181, 181, 181))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(groupNameLabel)
                                                .addGap(290, 290, 290))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(createResumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(206, 206, 206))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(slayLabel)
                                                .addGap(241, 241, 241))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(titleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slayLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(groupNameLabel)
                                .addGap(77, 77, 77)
                                .addComponent(createResumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }

    private void createResumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createResumeButtonActionPerformed
        PersonalForm personalForm = new PersonalForm();
        personalForm.setVisible(true);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    //varibles
    private javax.swing.JButton createResumeButton;
    private javax.swing.JLabel groupNameLabel;
    private javax.swing.JLabel slayLabel;
    private javax.swing.JLabel titleLabel;

    //PERSONAL FRAME
    static class PersonalForm extends javax.swing.JFrame {

        public PersonalForm() {
            initComponents();
        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

            //conetent for personal frame
            personalLabel = new javax.swing.JLabel();
            personalSubLabel = new javax.swing.JLabel();
            firstNameLabel = new javax.swing.JLabel();
            firstNameTF = new javax.swing.JTextField();
            lastNameLB = new javax.swing.JLabel();
            lastNameTF = new javax.swing.JTextField();
            phoneLB = new javax.swing.JLabel();
            phoneTF = new javax.swing.JFormattedTextField();
            dobLB = new javax.swing.JLabel();
            dobTF = new javax.swing.JFormattedTextField();
            emailLB = new javax.swing.JLabel();
            emailTF = new javax.swing.JTextField();
            personalLinkLB = new javax.swing.JLabel();
            personalLinkTF = new javax.swing.JTextField();
            ciyLabel = new javax.swing.JLabel();
            cityTF = new javax.swing.JTextField();
            stateLB = new javax.swing.JLabel();
            stateTF = new javax.swing.JTextField();
            codeLB = new javax.swing.JLabel();
            codeTF = new javax.swing.JFormattedTextField();
            nextButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(255, 255, 255));

            //set labels
            personalLabel.setFont(new java.awt.Font("Inter", 1, 20));
            personalLabel.setText("Personal Information");

            personalSubLabel.setFont(new java.awt.Font("Baghdad", 2, 14));
            personalSubLabel.setForeground(new java.awt.Color(79, 74, 74));
            personalSubLabel.setText("Tell us about yourself");

            firstNameLabel.setFont(new java.awt.Font("Inter", 0, 15));
            firstNameLabel.setText("First Name");

            firstNameTF.setFont(new java.awt.Font("Inter", 0, 13));
            firstNameTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    firstNameTFActionPerformed(evt);
                }
            });

            lastNameLB.setFont(new java.awt.Font("Inter", 0, 15));
            lastNameLB.setText("Last Name");

            lastNameTF.setFont(new java.awt.Font("Inter", 0, 13));
            lastNameTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    lastNameTFActionPerformed(evt);
                }
            });
            phoneLB.setFont(new java.awt.Font("Inter", 0, 15));
            phoneLB.setText("Phone");

            try {
                MaskFormatter phoneMask = new MaskFormatter("+1 (###) ###-####");
                phoneTF = new javax.swing.JFormattedTextField(phoneMask);
            } catch (java.text.ParseException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }

            phoneTF.setFont(new java.awt.Font("Inter", 0, 13));

            phoneTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    phoneTFActionPerformed(evt);
                }
            });

            dobLB.setFont(new java.awt.Font("Inter", 0, 15));
            dobLB.setText("Date Of Birth");

            //formate date of birth
            try {
                MaskFormatter dobMask = new MaskFormatter("##/##/####");
                dobTF = new javax.swing.JFormattedTextField(dobMask);
                dobTF.setText("MM/DD/YYYY");
            } catch (ParseException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }

            dobTF.setFont(new java.awt.Font("Inter", 0, 13));
            dobTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    dobTFActionPerformed(evt);
                }
            });

            emailLB.setFont(new java.awt.Font("Inter", 0, 15));
            emailLB.setText("Email");

            emailTF.setFont(new java.awt.Font("Inter", 0, 13));
            emailTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    emailTFActionPerformed(evt);
                }
            });

            personalLinkLB.setFont(new java.awt.Font("Inter", 0, 15));
            personalLinkLB.setText("Personal Link");

            personalLinkTF.setFont(new java.awt.Font("Inter", 0, 13));
            personalLinkTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    personalLinkTFActionPerformed(evt);
                }
            });

            ciyLabel.setFont(new java.awt.Font("Inter", 0, 15));
            ciyLabel.setText("City");

            cityTF.setFont(new java.awt.Font("Inter", 0, 13));
            cityTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cityTFActionPerformed(evt);
                }
            });

            stateLB.setFont(new java.awt.Font("Inter", 0, 15));
            stateLB.setText("State");

            stateTF.setFont(new java.awt.Font("Inter", 0, 13));
            stateTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    stateTFActionPerformed(evt);
                }
            });

            codeLB.setFont(new java.awt.Font("Inter", 0, 15));
            codeLB.setText("Postal Code");

            //format postal code
            try {
                codeTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
            codeTF.setFont(new java.awt.Font("Inter", 0, 13));
            codeTF.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    codeTFActionPerformed(evt);
                }
            });

            //next button
            nextButton1.setBackground(new java.awt.Color(51, 145, 255));
            nextButton1.setFont(new java.awt.Font("Inter", 0, 14));
            nextButton1.setForeground(new java.awt.Color(255, 255, 255));
            nextButton1.setText("Next");
            nextButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nextButton1ActionPerformed(evt);
                }
            });

            //layout of personal frame
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(phoneLB)
                                                    .addContainerGap())
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(personalLinkLB)
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(emailLB)
                                                    .addContainerGap())
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(ciyLabel)
                                                            .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(16, 16, 16)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(stateLB)
                                                            .addComponent(stateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(codeLB)
                                                            .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(codeTF)
                                                                    .addGap(57, 57, 57))))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(emailTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(firstNameLabel)
                                                                            .addComponent(firstNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                                            .addComponent(phoneTF))
                                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                    .addGap(132, 132, 132)
                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                            .addComponent(lastNameLB)))
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                    .addGap(133, 133, 133)
                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                            .addComponent(dobLB)
                                                                                            .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                            .addComponent(personalLinkTF))
                                                    .addGap(57, 57, 57))))
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(15, 15, 15)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(personalLabel)
                                                            .addComponent(personalSubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(255, 255, 255)
                                                    .addComponent(nextButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(personalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(personalSubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lastNameLB)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(firstNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                                            .addComponent(lastNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(phoneLB)
                                            .addComponent(dobLB))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneTF))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emailLB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(personalLinkLB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(personalLinkTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ciyLabel)
                                            .addComponent(codeLB)
                                            .addComponent(stateLB))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(codeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nextButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(18, Short.MAX_VALUE))
            );

            pack();
        }

        private void lastNameTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = lastNameTF.getText();
            HomePage.lastname = val;
        }

        private void firstNameTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = firstNameTF.getText();
            HomePage.firstname = val;
        }

        private void personalLinkTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = personalLinkTF.getText();
            HomePage.personalLink = val;
        }

        private void stateTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = stateTF.getText();
            HomePage.state = val;
        }

        private void dobTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = dobTF.getText();
            HomePage.dob = val;
        }

        private void codeTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = codeTF.getText();
            HomePage.postal = val;
        }

        private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = emailTF.getText();
            HomePage.email = val;
        }

        private void phoneTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = phoneTF.getText();
            HomePage.phonenumber = val;
        }

        private void cityTFActionPerformed(java.awt.event.ActionEvent evt) {
            String val = cityTF.getText();
            HomePage.city = val;
        }
        private void nextButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            HomePage.firstname = firstNameTF.getText();
            HomePage.lastname = lastNameTF.getText();
            HomePage.personalLink = personalLinkTF.getText();
            HomePage.state = stateTF.getText();
            HomePage.postal = codeTF.getText();
            HomePage.phonenumber = phoneTF.getText();
            HomePage.dob = dobTF.getText();
            HomePage.city = cityTF.getText();
            HomePage.email = emailTF.getText();

            EducationForm educationForm = new EducationForm();
            educationForm.setVisible(true);
            this.dispose();
        }
        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {

            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(PersonalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(PersonalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(PersonalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(PersonalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }


            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new PersonalForm().setVisible(true);
                }
            });
        }

        //varibles
        private javax.swing.JTextField cityTF;
        private javax.swing.JLabel ciyLabel;
        private javax.swing.JLabel codeLB;
        private javax.swing.JFormattedTextField codeTF;
        private javax.swing.JLabel dobLB;
        private javax.swing.JFormattedTextField dobTF;
        private javax.swing.JLabel emailLB;
        private javax.swing.JTextField emailTF;
        private javax.swing.JLabel firstNameLabel;
        private javax.swing.JTextField firstNameTF;
        private javax.swing.JLabel lastNameLB;
        private javax.swing.JTextField lastNameTF;
        private javax.swing.JButton nextButton1;
        private javax.swing.JLabel personalLabel;
        private javax.swing.JLabel personalLinkLB;
        private javax.swing.JTextField personalLinkTF;
        private javax.swing.JLabel personalSubLabel;
        private javax.swing.JLabel phoneLB;
        private javax.swing.JFormattedTextField phoneTF;
        private javax.swing.JLabel stateLB;
        private javax.swing.JTextField stateTF;

        //EDUCATION FRAME
        class EducationForm extends javax.swing.JFrame {


            public EducationForm() {
                initComponents();
            }

            @SuppressWarnings("unchecked")

            private void initComponents() {

                //content for education frame
                educationLB = new javax.swing.JLabel();
                educationSubLB = new javax.swing.JLabel();
                schoolLB = new javax.swing.JLabel();
                schoolTF = new javax.swing.JTextField();
                degreeLB = new javax.swing.JLabel();
                degreeTF = new javax.swing.JTextField();
                startAndEndLBEdu = new javax.swing.JLabel();
                startTFEdu = new javax.swing.JFormattedTextField();
                endTFEdu = new javax.swing.JFormattedTextField();
                cityLBEdu = new javax.swing.JLabel();
                cityTFEdu = new javax.swing.JTextField();
                eduCheckBoc = new javax.swing.JCheckBox();
                descriptionLBEdu = new javax.swing.JLabel();
                descriptionTextPaneEdu = new javax.swing.JScrollPane();
                jTextPane1 = new javax.swing.JTextPane();
                nextButton3 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));

                //set labels for education frame
                educationLB.setFont(new java.awt.Font("Inter", 1, 20));
                educationLB.setText("Education");

                educationSubLB.setFont(new java.awt.Font("Baghdad", 2, 14));
                educationSubLB.setForeground(new java.awt.Color(89, 83, 83));
                educationSubLB.setText("Add your education and any other relevant programs");

                schoolLB.setFont(new java.awt.Font("Inter", 0, 15));
                schoolLB.setText("School");

                schoolTF.setFont(new java.awt.Font("Inter", 0, 13));
                schoolTF.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        schoolTFActionPerformed(evt);
                    }
                });

                degreeLB.setFont(new java.awt.Font("Inter", 0, 15));
                degreeLB.setText("Degree");

                degreeTF.setFont(new java.awt.Font("Inter", 0, 13));
                degreeTF.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        degreeTFActionPerformed(evt);
                    }
                });

                startAndEndLBEdu.setFont(new java.awt.Font("Inter", 0, 15));
                startAndEndLBEdu.setText("Start Date & End Date");

                //format the dates
                try {
                    MaskFormatter startTFEduMask = new MaskFormatter("##/####");
                    startTFEdu = new javax.swing.JFormattedTextField(startTFEduMask);
                    startTFEdu.setText("MM/YYYY");
                } catch (ParseException e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }

                startTFEdu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                startTFEdu.setFont(new java.awt.Font("Inter", 0, 13));
                startTFEdu.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        startTFEduActionPerformed(evt);
                    }
                });

                //format date
                try {
                    MaskFormatter endTFEduMask = new MaskFormatter("##/####");
                    endTFEdu = new javax.swing.JFormattedTextField(endTFEduMask);
                    endTFEdu.setText("MM/YYYY");
                } catch (ParseException e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }

                endTFEdu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                endTFEdu.setFont(new java.awt.Font("Inter", 0, 13));
                endTFEdu.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        endTFEduActionPerformed(evt);
                    }
                });

                cityLBEdu.setFont(new java.awt.Font("Inter", 0, 15));
                cityLBEdu.setText("City");

                cityTFEdu.setFont(new java.awt.Font("Inter", 0, 13));
                cityTFEdu.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cityTFEduActionPerformed(evt);
                    }
                });

                eduCheckBoc.setFont(new java.awt.Font("Inter", 0, 13));
                eduCheckBoc.setForeground(new java.awt.Color(88, 82, 82));
                eduCheckBoc.setText("Currently Enrolled");
                eduCheckBoc.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        eduCheckBocActionPerformed(evt);
                    }
                });

                descriptionLBEdu.setFont(new java.awt.Font("Inter", 0, 15));
                descriptionLBEdu.setText("Description");

                jTextPane1.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
                descriptionTextPaneEdu.setViewportView(jTextPane1);
                HomePage.schoolDescription = jTextPane1.getText();

                nextButton3.setBackground(new java.awt.Color(51, 145, 255));
                nextButton3.setFont(new java.awt.Font("Inter", 0, 14));
                nextButton3.setForeground(new java.awt.Color(255, 255, 255));
                nextButton3.setText("Next");
                nextButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        nextButton3ActionPerformed(evt);
                    }
                });

                //layout for education frame
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(19, 19, 19)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(educationSubLB)
                                                                .addComponent(educationLB)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(81, 81, 81)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(startAndEndLBEdu)
                                                                                .addComponent(schoolLB))
                                                                        .addGap(134, 134, 134)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(cityLBEdu)
                                                                                .addComponent(degreeLB)))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(eduCheckBoc)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(startTFEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(endTFEdu))
                                                                                .addComponent(schoolTF, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(71, 71, 71)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(cityTFEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(degreeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addComponent(descriptionLBEdu, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(descriptionTextPaneEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGap(181, 181, 181)
                                                                                        .addComponent(nextButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGap(110, 110, 110)))))
                                        .addContainerGap(10, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(educationLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(educationSubLB)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(degreeLB, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(schoolLB))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(degreeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(schoolTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cityLBEdu, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(startAndEndLBEdu))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(startTFEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(endTFEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(cityTFEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eduCheckBoc)
                                        .addGap(18, 18, 18)
                                        .addComponent(descriptionLBEdu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(descriptionTextPaneEdu, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nextButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                );

                pack();
            }

            private void eduCheckBocActionPerformed(java.awt.event.ActionEvent evt) {
                if (eduCheckBoc.isSelected()){
                    endTFEdu.setEnabled(false);
                } else {
                    endTFEdu.setEnabled(true);
                }
            }

            private void nextButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                HomePage.school = schoolTF.getText();
                HomePage.degree = degreeTF.getText();
                HomePage.startDateSchool = startTFEdu.getText();
                HomePage.endDateSchool = endTFEdu.getText();
                HomePage.schoolcity = cityTFEdu.getText();
                HomePage.schoolDescription = jTextPane1.getText();
                JobFrame jobFrame = new JobFrame();
                jobFrame.setVisible(true);
                this.dispose();
            }

            private void schoolTFActionPerformed(java.awt.event.ActionEvent evt) {
                String val = schoolTF.getText();
                HomePage.school = val;
            }

            private void degreeTFActionPerformed(java.awt.event.ActionEvent evt) {
                String val = degreeTF.getText();
                HomePage.degree = val;
            }

            private void startTFEduActionPerformed(java.awt.event.ActionEvent evt) {
                String val = startTFEdu.getText();
                HomePage.startDateSchool = val;
            }

            private void endTFEduActionPerformed(java.awt.event.ActionEvent evt) {
                String val = endTFEdu.getText();
                HomePage.endDateSchool = val;
            }

            private void cityTFEduActionPerformed(java.awt.event.ActionEvent evt) {
                String val = cityTFEdu.getText();
                HomePage.schoolcity = val;
            }

            /**
             * @param args the command line arguments
             */
            public void main(String args[]) {
                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(EducationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(EducationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(EducationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(EducationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new EducationForm().setVisible(true);
                    }
                });
            }

            //varibles
            private javax.swing.JLabel cityLBEdu;
            private javax.swing.JTextField cityTFEdu;
            private javax.swing.JLabel degreeLB;
            private javax.swing.JTextField degreeTF;
            private javax.swing.JLabel descriptionLBEdu;
            private javax.swing.JScrollPane descriptionTextPaneEdu;
            private javax.swing.JCheckBox eduCheckBoc;
            private javax.swing.JLabel educationLB;
            private javax.swing.JLabel educationSubLB;
            private javax.swing.JFormattedTextField endTFEdu;
            private javax.swing.JTextPane jTextPane1;
            private javax.swing.JButton nextButton3;
            private javax.swing.JLabel schoolLB;
            private javax.swing.JTextField schoolTF;
            private javax.swing.JLabel startAndEndLBEdu;
            private javax.swing.JFormattedTextField startTFEdu;
        }

        //PROFESSIONAL EXPERIENCE FRAME
        class JobFrame extends javax.swing.JFrame {

            public JobFrame() {
                initComponents();
            }

            @SuppressWarnings("unchecked")

            private void initComponents() {

                //content for professional experience frame
                jobMainLabel = new javax.swing.JLabel();
                jobSubLabel = new javax.swing.JLabel();
                positionLB = new javax.swing.JLabel();
                positionTF = new javax.swing.JTextField();
                companyLB = new javax.swing.JLabel();
                companyTF = new javax.swing.JTextField();
                startAndEndLBPE = new javax.swing.JLabel();
                startTFPE = new javax.swing.JFormattedTextField();
                professionalCheckBox = new javax.swing.JCheckBox();
                cityLBPro = new javax.swing.JLabel();
                cityTFPro = new javax.swing.JTextField();
                workExperienceLB = new javax.swing.JLabel();
                workTextPane = new javax.swing.JScrollPane();
                jTextPane1 = new javax.swing.JTextPane();
                endTFPE = new javax.swing.JFormattedTextField();
                nextButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));

                //set labels
                jobMainLabel.setFont(new java.awt.Font("Inter", 1, 20));
                jobMainLabel.setText("Professional Experience");

                jobSubLabel.setFont(new java.awt.Font("Baghdad", 2, 14));
                jobSubLabel.setForeground(new java.awt.Color(79, 74, 74));
                jobSubLabel.setText("Tell us about your work experience");

                positionLB.setFont(new java.awt.Font("Inter", 0, 15));
                positionLB.setText("Position Title");

                positionTF.setFont(new java.awt.Font("Inter", 0, 13));
                positionTF.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        positionTFActionPerformed(evt);
                    }
                });

                companyLB.setFont(new java.awt.Font("Inter", 0, 15));
                companyLB.setText("Company Name");

                companyTF.setFont(new java.awt.Font("Inter", 0, 13));
                companyTF.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        companyTFActionPerformed(evt);
                    }
                });

                startAndEndLBPE.setFont(new java.awt.Font("Inter", 0, 15));
                startAndEndLBPE.setText("Start Date & End Date");


                startTFPE.setFont(new java.awt.Font("Inter", 0, 13));

                //format date
                try {
                    MaskFormatter startTFPEMask = new MaskFormatter("##/####");
                    startTFPE = new javax.swing.JFormattedTextField(startTFPEMask);
                    startTFPE.setText("MM/YYYY");
                } catch (ParseException e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }
                startTFPE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                startTFPE.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        startTFPEActionPerformed(evt);
                    }
                });

                //checkbox
                professionalCheckBox.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
                professionalCheckBox.setForeground(new java.awt.Color(72, 68, 68));
                professionalCheckBox.setText("Currently Enrolled");
                professionalCheckBox.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        professionalCheckBoxActionPerformed(evt);
                    }
                });

                cityLBPro.setFont(new java.awt.Font("Inter", 0, 15));
                cityLBPro.setText("City");

                cityTFPro.setFont(new java.awt.Font("Inter", 0, 13));
                cityTFPro.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cityTFProActionPerformed(evt);
                    }
                });

                workExperienceLB.setFont(new java.awt.Font("Inter", 0, 15));
                workExperienceLB.setText("Work Experience");

                jTextPane1.setFont(new java.awt.Font("Inter", 0, 13));
                workTextPane.setViewportView(jTextPane1);
                HomePage.workexperience = jTextPane1.getText();

                endTFPE.setFont(new java.awt.Font("Inter", 0, 13));

                //format date
                try {
                    MaskFormatter endTFPEMask = new MaskFormatter("##/####");
                    endTFPE = new javax.swing.JFormattedTextField(endTFPEMask);
                    endTFPE.setText("MM/YYYY");
                } catch (ParseException e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }
                endTFPE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                endTFPE.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        endTFPEActionPerformed(evt);
                    }
                });

                nextButton2.setBackground(new java.awt.Color(51, 145, 255));
                nextButton2.setFont(new java.awt.Font("Inter", 0, 14));
                nextButton2.setForeground(new java.awt.Color(255, 255, 255));
                nextButton2.setText("Next");
                nextButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        nextButton2ActionPerformed(evt);
                    }
                });

                //layout fot professional experience
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(workExperienceLB)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(workTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(positionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(positionLB)
                                                                                .addComponent(startAndEndLBPE)
                                                                                .addComponent(professionalCheckBox)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(startTFPE, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(endTFPE, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(cityLBPro)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(cityTFPro, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                                                        .addComponent(companyLB)
                                                                                        .addComponent(companyTF)))))
                                                        .addContainerGap(85, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(15, 15, 15)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jobMainLabel)
                                                                .addComponent(jobSubLabel)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(261, 261, 261)
                                                        .addComponent(nextButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jobMainLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jobSubLabel)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(positionLB)
                                                .addComponent(companyLB))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(positionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(companyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(startAndEndLBPE)
                                                .addComponent(cityLBPro))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(startTFPE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(endTFPE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cityTFPro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(professionalCheckBox)
                                        .addGap(18, 18, 18)
                                        .addComponent(workExperienceLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(workTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nextButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
            }

            private void companyTFActionPerformed(java.awt.event.ActionEvent evt) {
                String val = companyTF.getText();
                HomePage.companyName = val;
            }

            private void positionTFActionPerformed(java.awt.event.ActionEvent evt) {
                String val = positionTF.getText();
                HomePage.postitle = val;
            }

            private void startTFPEActionPerformed(java.awt.event.ActionEvent evt) {
                String val = startTFPE.getText();
                HomePage.workStart = val;
            }

            private void endTFPEActionPerformed(java.awt.event.ActionEvent evt) {
                String val = endTFPE.getText();
                HomePage.workEnd = val;
            }

            private void cityTFProActionPerformed(java.awt.event.ActionEvent evt) {
                String val = cityTFPro.getText();
                HomePage.companyCity = val;
            }

            private void professionalCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
                if (professionalCheckBox.isSelected()){
                    endTFPE.setEnabled(false);
                } else {
                    endTFPE.setEnabled(true);
                }
            }

            private void nextButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                HomePage.postitle = positionTF.getText();
                HomePage.companyName = companyTF.getText();
                HomePage.workStart = startTFPE.getText();
                HomePage.workEnd = endTFPE.getText();
                HomePage.companyCity = cityTFPro.getText();
                HomePage.workexperience = jTextPane1.getText();
                PersonalSkillForm personalSkillForm = new PersonalSkillForm();
                personalSkillForm.setVisible(true);
                this.dispose();
            }

            /**
             * @param args the command line arguments
             */
            public void main(String args[]) {

                try {
                    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    java.util.logging.Logger.getLogger(JobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(JobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(JobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(JobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new JobFrame().setVisible(true);
                    }
                });
            }

            //varibles
            private javax.swing.JLabel cityLBPro;
            private javax.swing.JTextField cityTFPro;
            private javax.swing.JLabel companyLB;
            private javax.swing.JTextField companyTF;
            private javax.swing.JFormattedTextField endTFPE;
            private javax.swing.JTextPane jTextPane1;
            private javax.swing.JLabel jobMainLabel;
            private javax.swing.JLabel jobSubLabel;
            private javax.swing.JButton nextButton2;
            private javax.swing.JLabel positionLB;
            private javax.swing.JTextField positionTF;
            private javax.swing.JCheckBox professionalCheckBox;
            private javax.swing.JLabel startAndEndLBPE;
            private javax.swing.JFormattedTextField startTFPE;
            private javax.swing.JLabel workExperienceLB;
            private javax.swing.JScrollPane workTextPane;

            //PERSONAL SKILLS FRAME
            class PersonalSkillForm extends javax.swing.JFrame {

                public PersonalSkillForm() {
                    initComponents();
                }

                @SuppressWarnings("unchecked")

                private void initComponents() {

                    //content for personal skill frame
                    presonalSkillLB = new javax.swing.JLabel();
                    personalSkillSubLB = new javax.swing.JLabel();
                    attentionDetails = new javax.swing.JCheckBox();
                    leadershipCB = new javax.swing.JCheckBox();
                    timeManagement = new javax.swing.JCheckBox();
                    criticalThinking = new javax.swing.JCheckBox();
                    conflictResolution = new javax.swing.JCheckBox();
                    hardWorking = new javax.swing.JCheckBox();
                    customerService = new javax.swing.JCheckBox();
                    organizationSkills = new javax.swing.JCheckBox();
                    creativeThinking = new javax.swing.JCheckBox();
                    projectManangement = new javax.swing.JCheckBox();
                    additionalSkillsLB = new javax.swing.JLabel();
                    additionalSkillsTextPane = new javax.swing.JScrollPane();
                    jTextPane1 = new javax.swing.JTextPane();
                    nextButton4 = new javax.swing.JButton();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setBackground(new java.awt.Color(255, 255, 255));

                    //set labels
                    presonalSkillLB.setFont(new java.awt.Font("Inter", 1, 20));
                    presonalSkillLB.setText("Personal Skills");

                    personalSkillSubLB.setFont(new java.awt.Font("Baghdad", 2, 14));
                    personalSkillSubLB.setForeground(new java.awt.Color(85, 80, 80));
                    personalSkillSubLB.setText("Add relevant skills and other achievements");

                    attentionDetails.setFont(new java.awt.Font("Inter", 0, 15));
                    attentionDetails.setText("Attention to Details");
                    attentionDetails.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            attentionDetailsActionPerformed(evt);
                        }
                    });

                    leadershipCB.setFont(new java.awt.Font("Inter", 0, 15));
                    leadershipCB.setText("Leadership");
                    leadershipCB.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            leadershipCBActionPerformed(evt);
                        }
                    });

                    timeManagement.setFont(new java.awt.Font("Inter", 0, 15));
                    timeManagement.setText("Time Management");
                    timeManagement.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            timeManagementActionPerformed(evt);
                        }
                    });

                    criticalThinking.setFont(new java.awt.Font("Inter", 0, 15));
                    criticalThinking.setText("Critical Thinking Skills");
                    criticalThinking.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            criticalThinkingActionPerformed(evt);
                        }
                    });

                    conflictResolution.setFont(new java.awt.Font("Inter", 0, 15));
                    conflictResolution.setText("Conflict Resolution");
                    conflictResolution.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            conflictResolutionActionPerformed(evt);
                        }
                    });

                    hardWorking.setFont(new java.awt.Font("Inter", 0, 15));
                    hardWorking.setText("Hard Working");
                    hardWorking.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            hardWorkingActionPerformed(evt);
                        }
                    });

                    customerService.setFont(new java.awt.Font("Inter", 0, 15));
                    customerService.setText("Customer Service");
                    customerService.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            customerServiceActionPerformed(evt);
                        }
                    });

                    organizationSkills.setFont(new java.awt.Font("Inter", 0, 15));
                    organizationSkills.setText("Organization Skills");
                    organizationSkills.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            organizationSkillsActionPerformed(evt);
                        }
                    });

                    creativeThinking.setFont(new java.awt.Font("Inter", 0, 15));
                    creativeThinking.setText("Creative Thinking");
                    creativeThinking.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            creativeThinkingActionPerformed(evt);
                        }
                    });

                    projectManangement.setFont(new java.awt.Font("Inter", 0, 15));
                    projectManangement.setText("Project Management Skills");
                    projectManangement.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            projectManangementActionPerformed(evt);
                        }
                    });

                    additionalSkillsLB.setFont(new java.awt.Font("Inter", 0, 15));
                    additionalSkillsLB.setText("Additional Skills");

                    additionalSkillsTextPane.setViewportView(jTextPane1);
                    HomePage.additionalSkillssss = jTextPane1.getText();

                    nextButton4.setBackground(new java.awt.Color(51, 145, 255));
                    nextButton4.setFont(new java.awt.Font("Inter", 0, 14));
                    nextButton4.setForeground(new java.awt.Color(255, 255, 255));
                    nextButton4.setText("Your Resume");
                    nextButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            nextButton4ActionPerformed(evt);
                        }
                    });

                    //layout for Personal skills frame
                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                            .addGap(18, 18, 18)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(presonalSkillLB)
                                                                    .addComponent(personalSkillSubLB)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                            .addGap(38, 38, 38)
                                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(projectManangement)
                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                                    .addComponent(customerService)
                                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                    .addComponent(organizationSkills)
                                                                                                    .addGap(18, 18, 18)
                                                                                                    .addComponent(creativeThinking))
                                                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                            .addComponent(criticalThinking)
                                                                                                            .addComponent(attentionDetails))
                                                                                                    .addGap(28, 28, 28)
                                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                            .addGroup(layout.createSequentialGroup()
                                                                                                                    .addComponent(leadershipCB)
                                                                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                    .addComponent(timeManagement))
                                                                                                            .addGroup(layout.createSequentialGroup()
                                                                                                                    .addComponent(conflictResolution)
                                                                                                                    .addGap(18, 18, 18)
                                                                                                                    .addComponent(hardWorking)))))
                                                                                    .addComponent(additionalSkillsTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(additionalSkillsLB)))))
                                                    .addGroup(layout.createSequentialGroup()
                                                            .addGap(249, 249, 249)
                                                            .addComponent(nextButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addContainerGap(71, Short.MAX_VALUE))
                    );
                    layout.setVerticalGroup(
                            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(presonalSkillLB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(personalSkillSubLB)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(attentionDetails)
                                                    .addComponent(leadershipCB)
                                                    .addComponent(timeManagement))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(criticalThinking)
                                                    .addComponent(conflictResolution)
                                                    .addComponent(hardWorking))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(customerService)
                                                    .addComponent(organizationSkills)
                                                    .addComponent(creativeThinking))
                                            .addGap(18, 18, 18)
                                            .addComponent(projectManangement)
                                            .addGap(19, 19, 19)
                                            .addComponent(additionalSkillsLB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(additionalSkillsTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(nextButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(17, Short.MAX_VALUE))
                    );

                    pack();
                }

                private void attentionDetailsActionPerformed(java.awt.event.ActionEvent evt) {
                    if (attentionDetails.isSelected()){
                        HomePage.skills.add(attentionDetails.getText());
                    }
                }

                private void leadershipCBActionPerformed(java.awt.event.ActionEvent evt) {
                    if (leadershipCB.isSelected()){
                        HomePage.skills.add(leadershipCB.getText());
                    }
                }

                private void timeManagementActionPerformed(java.awt.event.ActionEvent evt) {
                    if (timeManagement.isSelected()){
                        HomePage.skills.add(timeManagement.getText());
                    }
                }

                private void criticalThinkingActionPerformed(java.awt.event.ActionEvent evt) {
                    if (criticalThinking.isSelected()){
                        HomePage.skills.add(criticalThinking.getText());
                    }
                }

                private void conflictResolutionActionPerformed(java.awt.event.ActionEvent evt) {
                    if (conflictResolution.isSelected()){
                        HomePage.skills.add(conflictResolution.getText());
                    }
                }

                private void hardWorkingActionPerformed(java.awt.event.ActionEvent evt) {
                    if (hardWorking.isSelected()){
                        HomePage.skills.add(hardWorking.getText());
                    }
                }

                private void customerServiceActionPerformed(java.awt.event.ActionEvent evt) {
                    if (customerService.isSelected()){
                        HomePage.skills.add(customerService.getText());
                    }
                }

                private void organizationSkillsActionPerformed(java.awt.event.ActionEvent evt) {
                    if (organizationSkills.isSelected()){
                        HomePage.skills.add(organizationSkills.getText());
                    }
                }

                private void creativeThinkingActionPerformed(java.awt.event.ActionEvent evt) {
                    if (creativeThinking.isSelected()){
                        HomePage.skills.add(criticalThinking.getText());
                    }
                }

                private void projectManangementActionPerformed(java.awt.event.ActionEvent evt) {
                    if (projectManangement.isSelected()){
                        HomePage.skills.add(projectManangement.getText());
                    }
                }
                private void nextButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                    HomePage.additionalSkillssss = jTextPane1.getText();
                    FinalResume finalResume = new FinalResume();
                    finalResume.setVisible(true);
                    this.dispose();
                }

                /**
                 * @param args the command line arguments
                 */
                public void main(String args[]) {

                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(PersonalSkillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(PersonalSkillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(PersonalSkillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(PersonalSkillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }

                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new PersonalSkillForm().setVisible(true);
                        }
                    });
                }


                //varibles
                private javax.swing.JLabel additionalSkillsLB;
                private javax.swing.JScrollPane additionalSkillsTextPane;
                private javax.swing.JCheckBox attentionDetails;
                private javax.swing.JCheckBox conflictResolution;
                private javax.swing.JCheckBox creativeThinking;
                private javax.swing.JCheckBox criticalThinking;
                private javax.swing.JCheckBox customerService;
                private javax.swing.JCheckBox hardWorking;
                private javax.swing.JTextPane jTextPane1;
                private javax.swing.JCheckBox leadershipCB;
                private javax.swing.JButton nextButton4;
                private javax.swing.JCheckBox organizationSkills;
                private javax.swing.JLabel personalSkillSubLB;
                private javax.swing.JLabel presonalSkillLB;
                private javax.swing.JCheckBox projectManangement;
                private javax.swing.JCheckBox timeManagement;

                //RESUME FRAME
                static class FinalResume extends javax.swing.JFrame {


                    public FinalResume() {
                        initComponents();
                    }

                    @SuppressWarnings("unchecked")

                    private void initComponents() {

                        //content for resume frame
                        jTextField1 = new javax.swing.JTextField();
                        yourResumeLabel = new javax.swing.JLabel();
                        yourNameLabel = new javax.swing.JLabel();
                        personalInfoLabel = new javax.swing.JLabel();
                        edutionLB = new javax.swing.JLabel();
                        jSeparator1 = new javax.swing.JSeparator();
                        schoolLabFinal = new javax.swing.JLabel();
                        citySchoolLabFinal = new javax.swing.JLabel();
                        degreeLabFinal = new javax.swing.JLabel();
                        schoolDateFinal = new javax.swing.JLabel();
                        schoolDescriptionFinal = new javax.swing.JLabel();
                        experienceLab = new javax.swing.JLabel();
                        jSeparator2 = new javax.swing.JSeparator();
                        companyNameLabFinal = new javax.swing.JLabel();
                        positionTitleLabFinal = new javax.swing.JLabel();
                        cityExperienceLabFinal = new javax.swing.JLabel();
                        dateExperienceLabFinal = new javax.swing.JLabel();
                        descriptionExperienceFinal = new javax.swing.JLabel();
                        additionalLab = new javax.swing.JLabel();
                        jSeparator3 = new javax.swing.JSeparator();
                        skillLabFinal = new javax.swing.JLabel();
                        addtionalSkillFinal = new javax.swing.JLabel();
                        printButton = new javax.swing.JButton();
                        doneButton = new javax.swing.JButton();

                        jTextField1.setText("jTextField1");

                        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                        setBackground(new java.awt.Color(255, 255, 255));

                        //set labels
                        yourResumeLabel.setFont(new java.awt.Font("Inter", 1, 18));
                        yourResumeLabel.setText("Your Resume");

                        yourNameLabel.setFont(new java.awt.Font("Inter", 1, 18));
                        yourNameLabel.setText(HomePage.firstname + " " + HomePage.lastname);

                        //format personal info into layout
                        personalInfoLabel.setFont(new java.awt.Font("Inter", 0, 14));
                        personalInfoLabel.setText(String.format("%s, %s, %s | %s | %s | %s",
                                HomePage.city, HomePage.state, HomePage.postal, HomePage.phonenumber, HomePage.email, HomePage.personalLink));

                        edutionLB.setFont(new java.awt.Font("Inter", 1, 15));
                        edutionLB.setText("EDUCATION");

                        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

                        schoolLabFinal.setFont(new java.awt.Font("Inter", 1, 14));
                        schoolLabFinal.setText(HomePage.school);

                        citySchoolLabFinal.setFont(new java.awt.Font("Inter", 2, 14));
                        citySchoolLabFinal.setText(HomePage.schoolcity);

                        citySchoolLabFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

                        degreeLabFinal.setFont(new java.awt.Font("Inter", 2, 14));
                        degreeLabFinal.setText(HomePage.degree);

                        schoolDateFinal.setFont(new java.awt.Font("Inter", 2, 14));

                        schoolDateFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

                        if (HomePage.endDateSchool != null) {
                            // User has an end date, display both start and end dates
                            schoolDateFinal.setText(HomePage.startDateSchool + " - " + HomePage.endDateSchool);
                        } else {
                            // User is currently enrolled, display only the start date
                            schoolDateFinal.setText(HomePage.startDateSchool + " - Present");
                        }

                        schoolDescriptionFinal.setFont(new java.awt.Font("Inter", 0, 14));
                        schoolDescriptionFinal.setText(HomePage.schoolDescription);

                        experienceLab.setFont(new java.awt.Font("Inter", 1, 15));
                        experienceLab.setText("EXPERIENCE");

                        cityExperienceLabFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

                        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

                        companyNameLabFinal.setFont(new java.awt.Font("Inter", 1, 14));
                        companyNameLabFinal.setText(HomePage.companyName);

                        positionTitleLabFinal.setFont(new java.awt.Font("Inter", 2, 14));
                        positionTitleLabFinal.setText(HomePage.postitle);

                        cityExperienceLabFinal.setFont(new java.awt.Font("Inter", 2, 14));
                        cityExperienceLabFinal.setText(HomePage.companyCity);

                        dateExperienceLabFinal.setFont(new java.awt.Font("Inter", 2, 14));
                        if (HomePage.workEnd != null) {
                            // User has an end date, display both start and end dates
                            dateExperienceLabFinal.setText(HomePage.workStart + " - " + HomePage.workEnd);
                        } else {
                            // User is currently enrolled, display only the start date
                            dateExperienceLabFinal.setText(HomePage.workStart + " - Present");
                        }

                        dateExperienceLabFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

                        descriptionExperienceFinal.setFont(new java.awt.Font("Inter", 0, 14));
                        descriptionExperienceFinal.setText(HomePage.workexperience);

                        additionalLab.setFont(new java.awt.Font("Inter", 1, 15));
                        additionalLab.setText("ADDITIONAL");

                        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

                        skillLabFinal.setFont(new java.awt.Font("Inter", 0, 14));
                        String skill = String.join(", ", HomePage.skills);
                        skillLabFinal.setText("Skills: " +  skill);

                        addtionalSkillFinal.setFont(new java.awt.Font("Inter", 0, 14));
                        addtionalSkillFinal.setText("Additional Skills:" + HomePage.additionalSkillssss);

                        //print button
                        printButton.setBackground(new java.awt.Color(0, 204, 204));
                        printButton.setFont(new java.awt.Font("Inter", 0, 15));
                        printButton.setForeground(new java.awt.Color(255, 255, 255));
                        printButton.setText("Print");
                        printButton.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                printButtonActionPerformed(evt);
                            }
                        });

                        doneButton.setBackground(new java.awt.Color(51, 145, 255));
                        doneButton.setFont(new java.awt.Font("Inter", 0, 15));
                        doneButton.setForeground(new java.awt.Color(255, 255, 255));
                        doneButton.setText("Done");
                        doneButton.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                doneButtonActionPerformed(evt);
                            }
                        });

                        //layout for final resume frame
                        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                        getContentPane().setLayout(layout);
                        layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(212, 212, 212)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(65, 65, 65)
                                                                .addComponent(yourNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(261, 261, 261))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(personalInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(196, 196, 196))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(yourResumeLabel))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGap(67, 67, 67)
                                                                                .addComponent(descriptionExperienceFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(1, 1, 1))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGap(71, 71, 71)
                                                                                .addComponent(schoolDescriptionFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                .addGap(226, 226, 226))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(positionTitleLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(318, 318, 318)
                                                                                .addComponent(dateExperienceLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addComponent(jSeparator1)
                                                                        .addComponent(jSeparator2)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(companyNameLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(424, 424, 424)
                                                                                .addComponent(cityExperienceLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addComponent(jSeparator3)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(schoolLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(440, 440, 440)
                                                                                .addComponent(citySchoolLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(16, 16, 16)
                                                                                .addComponent(degreeLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGap(337, 337, 337)
                                                                                .addComponent(schoolDateFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(skillLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addGap(66, 66, 66))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(additionalLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addGap(14, 14, 14))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(edutionLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addGap(17, 17, 17))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(experienceLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addGap(14, 14, 14))
                                                                                        .addComponent(addtionalSkillFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGap(450, 450, 450))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(printButton)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(doneButton)))))
                                                .addGap(40, 40, 40))
                        );
                        layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(yourResumeLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(yourNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(personalInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(edutionLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(schoolLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(citySchoolLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(degreeLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(schoolDateFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(schoolDescriptionFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(experienceLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(companyNameLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cityExperienceLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(positionTitleLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(dateExperienceLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(descriptionExperienceFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(additionalLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(skillLabFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addtionalSkillFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(80, 80, 80)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(printButton)
                                                        .addComponent(doneButton))
                                                .addGap(15, 15, 15))
                        );

                        pack();
                    }

                    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {
                        PrinterJob job = PrinterJob.getPrinterJob();
                        job.setPrintable((graphics, pageFormat, pageIndex) -> {
                            if (pageIndex > 0) {
                                return Printable.NO_SUCH_PAGE;
                            } else {
                                graphics.drawString("Hello, this is your resume!", 100, 100);
                                return Printable.PAGE_EXISTS;
                            }
                        });

                        boolean doPrint = job.printDialog();
                        if (doPrint) {
                            try {
                                job.print();
                            } catch (PrinterException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {
                        this.dispose(); // Close the current JFrame
                    }



                    /**
                     * @param args the command line arguments
                     */
                    public static void main(String args[]) {

                        try {
                            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                    break;
                                }
                            }
                        } catch (ClassNotFoundException ex) {
                            java.util.logging.Logger.getLogger(FinalResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            java.util.logging.Logger.getLogger(FinalResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            java.util.logging.Logger.getLogger(FinalResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                            java.util.logging.Logger.getLogger(FinalResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        }

                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new FinalResume().setVisible(true);
                            }
                        });
                    }

                    //varibles
                    private javax.swing.JLabel additionalLab;
                    private javax.swing.JLabel addtionalSkillFinal;
                    private javax.swing.JLabel cityExperienceLabFinal;
                    private javax.swing.JLabel citySchoolLabFinal;
                    private javax.swing.JLabel companyNameLabFinal;
                    private javax.swing.JLabel dateExperienceLabFinal;
                    private javax.swing.JLabel degreeLabFinal;
                    private javax.swing.JLabel descriptionExperienceFinal;
                    private javax.swing.JButton doneButton;
                    private javax.swing.JLabel edutionLB;
                    private javax.swing.JLabel experienceLab;
                    private javax.swing.JSeparator jSeparator1;
                    private javax.swing.JSeparator jSeparator2;
                    private javax.swing.JSeparator jSeparator3;
                    private javax.swing.JTextField jTextField1;
                    private javax.swing.JLabel personalInfoLabel;
                    private javax.swing.JLabel positionTitleLabFinal;
                    private javax.swing.JButton printButton;
                    private javax.swing.JLabel schoolDateFinal;
                    private javax.swing.JLabel schoolDescriptionFinal;
                    private javax.swing.JLabel schoolLabFinal;
                    private javax.swing.JLabel skillLabFinal;
                    private javax.swing.JLabel yourNameLabel;
                    private javax.swing.JLabel yourResumeLabel;
                }
            }
        }
    }}
