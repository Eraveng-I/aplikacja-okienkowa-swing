package tb.soft;

import tb.soft.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;

public class Okno  {

    public Okno() {
        JFrame okienko = new JFrame();   //stworzenie ramki

        JLabel napis_login = new JLabel("login:");                      //zrobienie napisu login
        napis_login.setBounds(200,100, 40,20);

        JLabel napis_haslo = new JLabel("hasło:");                      //zrobienie napisu haslo
        napis_haslo.setBounds(200,150, 40,20);

        JTextField pole_login = new JTextField(20);                  //zrobienie pola login
        pole_login.setBounds(250,100,120, 20);

        JPasswordField pole_haslo = new JPasswordField(20);          //zrobienie pola haslo
        pole_haslo.setBounds(250,150,120, 20);

        //robienie toolbar
        {
            JToolBar toolBar = new JToolBar();
            JButton log = new JButton("Login");
            log.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    akcja_przycisku_login(pole_login,pole_haslo,okienko);
                }
            });
            JButton czysc = new JButton("Wyczyść");
            czysc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    akcja_przycisku_czyszczenie(pole_login,pole_haslo,okienko);
                }
            });
            toolBar.add(log);
            toolBar.add(czysc);
            okienko.add(toolBar, BorderLayout.NORTH);
            okienko.pack();
        }

        JButton przycisk_logowania = new JButton();
        przycisk_logowania.setBounds(150,400,100,50);      //ustawienie odległości i wymierów przycisku
        przycisk_logowania.setText("Zaloguj się");                           //ustawienie tekstu
        przycisk_logowania.setFocusable(false);                              //usuniecie ramki wokol tekstu
        przycisk_logowania.addActionListener(new ActionListener()           //dodanie akcji
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                akcja_przycisku_login(pole_login,pole_haslo,okienko);
            }
        });

        JButton przycisk_czyszczenia = new JButton();
        przycisk_czyszczenia.setBounds(350,400,100,50);     //ustawienie odległości i wymierów przycisku
        przycisk_czyszczenia.setText("Wyczyść");                              //ustawienie tekstu
        przycisk_czyszczenia.setFocusable(false);                             //usuniecie ramki wokol tekstu
        przycisk_czyszczenia.addActionListener(new ActionListener()           //dodanie akcji
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                akcja_przycisku_czyszczenie(pole_login,pole_haslo,okienko);
            }
        });

        okienko.setTitle("Logowanie");                          //ustawienie tytułu okna
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //wyjscie z aplikacji
        okienko.setLayout(null);                                //?
        okienko.setResizable(false);                            //zapobieganie zmiany rozmiaru okna
        okienko.setSize(600,600);                   //ustawienie rozmiaru okna
        okienko.setVisible(true);                               //ustawienie widocznosci okna
        okienko.add(przycisk_logowania);                        //dodanie przycisku logowania
        okienko.add(przycisk_czyszczenia);                      //dodanie przycisku czyszczenia
        okienko.add(napis_login);                               //dodanie napisu logowania
        okienko.add(napis_haslo);                               //dodanie napisu hasla
        okienko.add(pole_login);                                //dodanie pola logowania
        okienko.add(pole_haslo);                                //dodanie pola hasla

        List <String> tablica_hasel = new ArrayList<String>();
        System.out.println("Program konsolowy");
        //System.exit(0);
    }

    void akcja_przycisku_login (JTextField login, JPasswordField haslo, JFrame ramka)
    {
        String loginText = login.getText();
        String passwordText = new String(haslo.getPassword());
        DaneUżytkowników DaneLogowania = new DaneUżytkowników();

//        char[] passwordText2 = haslo.getPassword();
//        char[] faktycznehaslo = DaneLogowania.daneUżytkowników.get(loginText).toCharArray();
//
//        if (passwordText2.equals(faktycznehaslo))     //warunek sprawdzający czy jest sparowany login i hasło
//        {
//            ramka.getContentPane().setBackground(Color.GREEN);
//        }
//        else
//            {
//                ramka.getContentPane().setBackground(Color.RED);
//            }

        if (passwordText.equals(DaneLogowania.daneUżytkowników.get(loginText)))     //warunek sprawdzający czy jest sparowany login i hasło
        {
            ramka.getContentPane().setBackground(Color.GREEN);
        }
        else
        {
            ramka.getContentPane().setBackground(Color.RED);
        }
    }

    void akcja_przycisku_czyszczenie(JTextField login, JPasswordField haslo, JFrame ramka)
    {
        login.setText(null);
        haslo.setText(null);
        ramka.getContentPane().setBackground(Color.GRAY);
    }
}