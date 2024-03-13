/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugastampilan;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
class HalamanLogin extends JFrame{
    JLabel header = new JLabel("Selamat Datang !");
    JLabel ket1 = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel ("Username");
    JLabel pw = new JLabel ("Password");
    JLabel gender = new JLabel ("Jenis Kelamin");
    
    JTextField inputUsername = new JTextField();
    JPasswordField inputPW = new JPasswordField();
    
    JRadioButton genLK = new JRadioButton("Laki-Laki");
    JRadioButton genPR = new JRadioButton("Perempuan");
    JButton login = new JButton("Login");
    
    
    HalamanLogin(){
        setVisible(true);
        setSize(750,740);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(header);
        header.setFont(new Font("arial", Font.BOLD, 21));
        header.setBounds(30, 30, 200, 40);
        
        add(ket1);
        ket1.setFont(new Font("arial", Font.BOLD, 15));
        ket1.setBounds(30, 60, 300, 40);
        
        add(username);
        username.setBounds(30, 92, 200, 40);
        
        add(pw);
        pw.setBounds(30, 152, 200, 40);
        
        add(gender);
        gender.setBounds(30, 220, 200, 40);
        
        add(inputUsername);
        inputUsername.setBounds(30, 122, 485, 35);
        
        add(inputPW);
        inputPW.setBounds(30, 182, 485, 35);
        
        ButtonGroup pilihGender = new ButtonGroup();
        pilihGender.add(genLK);
        pilihGender.add(genPR);
        
        add(genLK);
        genLK.setBounds(30, 255, 105, 30);
        
        add(genPR);
        genPR.setBounds(205, 255, 105, 30);
        
        add(login);
        login.setBounds(30, 300, 500, 40);
    }
}

class HalamanUtama extends JFrame{
    JLabel headerutama = new JLabel("Welcome, [Mr./Mrs.] [username]");
    JLabel ket2 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel luasPersegi = new JLabel("Luas Persegi");
    JLabel hasilLP = new JLabel("[Hasil Berupa Angka]");
    JLabel kelilingPersegi = new JLabel("Keliling Persegi");
    JLabel hasilKP = new JLabel("[Hasil Berupa Angka]");
    JLabel volumeBalok = new JLabel("Volume Balok");
    JLabel hasilVB = new JLabel("[Hasil Berupa Angka]");
    JLabel lpBalok = new JLabel("Luas Permukaan Balok");
    JLabel hasilLPB = new JLabel("[Hasil Berupa Angka]");
    
    JTextField Panjang = new JTextField();
    JTextField Lebar = new JTextField();
    JTextField Tinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    
    
    HalamanUtama(){
        setVisible(true);
        setSize(750, 740);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        add(headerutama);
        headerutama.setFont(new Font("arial", Font.BOLD, 21));
        headerutama.setBounds(30, 30, 360, 40);
        
        add(ket2);
        ket2.setFont(new Font("arial", Font.BOLD, 15));
        ket2.setBounds(30, 60, 450, 40);
        
        add(panjang);
        panjang.setBounds(30, 120, 100, 20);
        
        add(lebar);
        lebar.setBounds(30, 160, 150, 30);
        
        add(tinggi);
        tinggi.setBounds(30, 200, 200, 40);
        
        add(hasil);
        hasil.setBounds(296, 380, 100, 20);
        
        add(luasPersegi);
        luasPersegi.setBounds(30, 420, 150, 20);
        add(hasilLP);
        hasilLP.setBounds(200, 420, 200, 20);
        
        add(kelilingPersegi);
        kelilingPersegi.setBounds(30, 440, 150, 20);
        add(hasilKP);
        hasilKP.setBounds(200, 440, 200, 20);
        
        add(volumeBalok);
        volumeBalok.setBounds(30, 460, 150, 20);
        add(hasilVB);
        hasilVB.setBounds(200, 460, 200, 20);
        
        add(lpBalok);
        lpBalok.setBounds(30, 480, 200, 20);
        add(hasilLPB);
        hasilLPB.setBounds(200, 480, 200, 20);
        
        add(Panjang);
        Panjang.setBounds(155, 110, 385, 40);
        
        add(Lebar);
        Lebar.setBounds(155, 160, 385, 40);
        
        add(Tinggi);
        Tinggi.setBounds(155, 210, 385, 40);
        
        add(hitung);
        hitung.setBounds(30, 270, 560, 45);
        
        add(reset);
        reset.setBounds(30, 310, 560, 45);
    }
    
}

    

public class TugasTampilan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HalamanLogin halkesatu = new HalamanLogin();
        HalamanUtama halkedua = new HalamanUtama();
    }
    
}
