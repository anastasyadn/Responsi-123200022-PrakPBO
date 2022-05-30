/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.prak.pbo;
import javax.swing.*;
/**
 *
 * @author anastasyadn
 */
public class view_main_menu extends JFrame{
    JLabel judul = new JLabel("Main Menu");
    JButton btnTambah = new JButton("Tambah Barang");
    JButton btnLihat = new JButton("Lihat Barang");

    public view_main_menu() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
        setLayout(null);
        setSize(200,200);
        add(judul);
        judul.setBounds(60, 20, 100, 30);
        
        add(btnTambah);
        btnTambah.setBounds(20, 50, 130, 30);
        
        add(btnLihat);
        btnLihat.setBounds(20, 90, 130,30);
}
}
