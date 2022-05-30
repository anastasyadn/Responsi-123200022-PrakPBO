/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi.prak.pbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Suyoto
 */
public class input_barang_controller {
    view_input_barang viewinputbarang;
    model_barang modelbarang;

    public input_barang_controller (view_input_barang viewinputbarang, model_barang modelbarang) {
        this.viewinputbarang = viewinputbarang;
        this.modelbarang = modelbarang;
        
        viewinputbarang.getBtnKembali().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                view_main_menu view_main_menu =new view_main_menu();
                viewinputbarang.setVisible(false);
                main_menu_controller Start=new main_menu_controller(view_main_menu);
            }
        });
        
        viewinputbarang.getBtnSubmit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(viewinputbarang.getTfnama().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTfharga()==0){
                    JOptionPane.showMessageDialog(null, "Harga Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTfmassa()==0){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTfharga()<0){
                    JOptionPane.showMessageDialog(null, "Harga Harus Positif");
                }
                else if(viewinputbarang.getTfmassa()<0){
                    JOptionPane.showMessageDialog(null, "Massa Harus Positif");
                }
                else{
                    modelbarang.insertData(viewinputbarang.getTfnama(), viewinputbarang.getTfmassa(), viewinputbarang.getTfharga());
                }
                
            }
        });
        
        viewinputbarang.getBtnReset().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                viewinputbarang.tfnama.setText("");
                viewinputbarang.tfmassa.setText("");
                viewinputbarang.tfharga.setText("");
            }
        });
    }
    
}