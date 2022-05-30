/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.prak.pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Suyoto
 */
public class lihat_barang_controller {
    view_lihat_barang vlb;
    model_barang mb;

    public lihat_barang_controller (view_lihat_barang vlb, model_barang mb) {
        this.vlb = vlb;
        this.mb = mb;
        if (mb.getBanyakData()!=0) {
            String dataBarang[][] = mb.readBarang();
            vlb.tabel.setModel((new JTable(dataBarang, vlb.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        
        vlb.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                view_main_menu vmm=new view_main_menu();
                vlb.setVisible(false);
                main_menu_controller mmc=new main_menu_controller(vmm);
            }
        });
        
        vlb.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = vlb.tabel.getSelectedRow();                

                String dataterpilih = vlb.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);
                view_banyak_barang vbb=new view_banyak_barang();
                vlb.setVisible(false);
                banyak_barang_controller bbc=new banyak_barang_controller(vbb,dataterpilih,mb);
                
                                                                            
            }
        }
        );
    }

    
    
}
